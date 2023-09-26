/*
 * File        : Attendance.java
 * Description : To print the Grade wrt the attendace
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 26/09/2023
 * 
 */

package javalab;
import java.util.Scanner;
public class Attendance {
	public static void main(String[] args) {
	float attendancepercentage;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the attendance percentage:");
	attendancepercentage=sc.nextInt();
	if(attendancepercentage>=90)
	{
		System.out.println("Grade is 10");
	}
	else
	{
		float newmark=attendancepercentage/10;
		System.out.println("The Grade is "+newmark);
	}
	}

}
