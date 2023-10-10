/*
 * File        : Matrixmultiplication.java
 * Description : To perform matrix multiplication
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 10/10/2023
 * 
 */
import java.util.Scanner;
public class Matrixmultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row1,row2,col1,col2,i,j;
		System.out.println("Enter the order of first matrix:");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("Enter the order of second matrix:");
		row2=sc.nextInt();
		col2=sc.nextInt();
		int[][] mat1=new int[row1][col1];
		int[][] mat2=new int[row2][col2];
		int[][] mat3=new int[row1][col2];
		if(col1!=row2)
		{
			System.out.println("Matrix multiplication is not possible!");
		}
		else
		{
		System.out.println("Enter the elements in first matrix:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements in 2nd matrix:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("First matrix is");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
		System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
			
		}
		
		System.out.println("Second matrix is");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.println();
			}
		
		//MULTIPLICATION
		System.out.println("Multiplied matrix is:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
     {
	mat3[i][j]=0;
	for(int k=0;k<row2;k++)
	{
		mat3[i][j]+=mat1[i][k]*mat2[k][j];
	}
	System.out.print(mat3[i][j]+"\t");
}
System.out.println();
}
}
}
}

