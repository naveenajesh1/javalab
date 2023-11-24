/*
 * File        : FileExceptionHandling.java
 * Description : Java program that copies contents of INPUT.txt and write it into OUTPUT.txt
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 24/11/2023
 * 
 */
package javalab;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExceptionHandling  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String write_data;
		String write_data_2 = "";
		
		try {
			FileWriter filenamewrite= new FileWriter("INPUT.txt");
			System.out.println("INPUT.txt created");
			System.out.print("Enter the data : ");
			write_data = sc.nextLine();
			filenamewrite.write(write_data);	
			filenamewrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader filenameread = new FileReader("INPUT.txt");
			int read_data = filenameread.read();
			while(read_data != -1) {
				write_data_2 += (char)read_data;
				read_data = filenameread.read();
			}
			System.out.println("Data : " + write_data_2);
			filenameread.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter filenamewrite2 = new FileWriter("OUTPUT.txt");
			System.out.println("The contents in INPUT.txt is copied to OUTPUT.txt succesfully");
			filenamewrite2.write(write_data_2);	
			filenamewrite2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}				
}
}

