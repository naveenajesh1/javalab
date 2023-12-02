/*
 * File        : MultiThreadingDemo.java
 * Description : Java program to Implement Multithread 
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 02/11/2023
 * 
 */
package javalab;
import java.util.Random;
public class MultiThreadingDemo {
    public static void main(String[] args) {

    	MultiThreadingDemo numberManager = new MultiThreadingDemo();

        NumberGenerator numberGenerator = new NumberGenerator(numberManager);
        Even even = new Even(numberManager);
        Odd odd = new Odd(numberManager);

        numberGenerator.start();
        even.start();
        odd.start();
    }
    
	private int generatedNumber;
    private boolean numberGenerated = false;
    public synchronized void generateNumber() {
        generatedNumber = new Random().nextInt(99) + 2;
        System.out.println("Random Number generated:" + generatedNumber);
        numberGenerated = true;
        notifyAll(); 
    }
    public synchronized void Square() {
        try {
            while (!numberGenerated || generatedNumber % 2 != 0) {
                wait();
            }
            System.out.println("The number is even and its square is " + generatedNumber * generatedNumber);
            numberGenerated = false;
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void Cube() {
        try {
            while (!numberGenerated || generatedNumber % 2 == 0) {
                wait();
            }
            System.out.println("The number is odd and its cube is " + generatedNumber * generatedNumber * generatedNumber);
            numberGenerated = false;

        } catch (InterruptedException e) {
            e.printStackTrace();
       }
    }
}

class NumberGenerator extends Thread {
    private MultiThreadingDemo MultiThreadingDemo;

    public NumberGenerator(MultiThreadingDemo numberManager) {
        this.MultiThreadingDemo = numberManager;
        this.setName("NumberGenerator");
    }
        public void run() {
        while (true) {
        	MultiThreadingDemo.generateNumber();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Even extends Thread {
    private MultiThreadingDemo Mtd;

    public Even(MultiThreadingDemo numManager) {
        this.Mtd = numManager;
        this.setName("Even");
    }

    public void run() {
        while (true) {
        	Mtd.Square();
        }
    }
}

class Odd extends Thread {
    private MultiThreadingDemo Mtd;

    public Odd(MultiThreadingDemo numManager) {
        this.Mtd = numManager;
        this.setName("Odd");
    }

    public void run() {
        while (true) {
        	Mtd.Cube();
        }
    }
}
