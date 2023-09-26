/*
 * File        : Attendance.java
 * Description : Print hello world
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 26/09/2023
 * 
 */

package javalab;
import java.util.Scanner;
public class Greatestof3nos {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no:");
		num1=sc.nextInt();
		System.out.println("Enter the second no:");
		num2=sc.nextInt();
		System.out.println("Enter the third no:");
		num3=sc.nextInt();
	if(num1==num2&&num1==num3)
		{
			System.out.println("Nos are equal");
		
		}
		
	else if(num1>num2&&num1>num3)
		{
			System.out.println("First no is Greater");
		}
	
	else if(num2>num1&&num2>num3)
		{
			System.out.println("Second no is Greater");
			
		}
	else
	{
		System.out.println("Third no is Greater");
	}
	}

}
