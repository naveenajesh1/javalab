/*
 * File        : ExceptionTryCatch.java
 * Description : Java program that shows the usage of try, catch and finally
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 10/11/2023
 * 
 */
package javalab;
import java.util.Scanner;
public class ExceptionTryCatch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ans = 'y';
	while(ans == 'y') {
		System.out.println("Program to Perform Division");
		System.out.print("Enter the Number-1:");
		int num1 = sc.nextInt();
		System.out.print("Enter the Number-2:");
		int num2 = sc.nextInt();
		try {
			int result = num1/num2;
			System.out.println("Resut="+result);
		}
		catch (Exception e) {
			System.out.println("/by zero");
			
		}
		finally {
			System.out.println("End of Operation");
		}
		System.out.println("Do you want to continue y or n");
		ans = sc.next().charAt(0);


		
	}
	
}

}