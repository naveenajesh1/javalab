/*
 * File        : Reverse.java
 * Description : Java program to reverse a given string
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 31/10/2023
 * 
 */
package javalab;
import java.util.Scanner;
public class Reverse {
	public static void main(String[]args) {
		String Character;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		Character=sc.next();
		char[]charArray=Character.toCharArray();
		int Strlength=Character.length();
		for( int i=Strlength-1;i>=0;i--)
		{
		System.out.println(charArray[i]);
		}

}
}
