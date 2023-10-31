/*
 * File        : Prime.java
 * Description : Java program to check whether a no is prime or not
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 31/10/2023
 * 
 */
package javalab;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {   
		int fact=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				fact++;
			}
		}
		if(fact==1)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}

}
