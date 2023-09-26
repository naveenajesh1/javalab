/*
 * File        : Grades.java
 * Description : Print the grades of a student wrt the marks
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 26/09/2023
 * 
 */
package javalab;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		float mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		mark=sc.nextInt();
		if(mark>=90)
		{
			System.out.println("S grade");
		}
		else if(mark>=80&&mark<90)
		{
			System.out.println("A grade");
			
		}
		else if(mark>=70&&mark<80)
		{
			System.out.println("B grade");
			
		}
		else if(mark>=60&&mark<70)
		{
			System.out.println("C grade");
			
		}
		else if(mark>=50&&mark<60)
		{
			System.out.println("D grade");
			
		}
		else 
		{
			System.out.println("failed");
			
		}
	}
	

}
