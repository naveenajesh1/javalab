/*
 * File        : Whilesum.java
 * Description : Find the sum of nos till a negative no is inputed(while)
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 26/09/2023
 * 
 */
package javalab;
import java.util.Scanner;
public class Whilesum {
	public static void main(String[] args)
	{
		int num=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nos");
		num=sc.nextInt();
		while(num>0)
		{
			sum=sum+num;
			num=sc.nextInt();
			
		}
		System.out.println("Sum is "+sum);
	}

}
