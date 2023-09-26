/*
 * File        : Dowhilesum.java
 * Description : Find the sum of nos till a negative no is inputed(do while)
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 26/09/2023
 * 
 */
package javalab;
import java.util.Scanner;
public class Dowhilesum {
	public static void main(String[] args) {
		int num=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nos");
		num=sc.nextInt();
		do 
		{
			sum=sum+num;
			num=sc.nextInt();
		}
		while(num>0);
	
	System.out.println("Sum is "+sum);

}
}
