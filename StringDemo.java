package java_new.lab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringDemo {
	public static void main(String[] args) {
		int sum=0,num;
		System.out.println("Enter an inter string:");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		StringTokenizer input=new StringTokenizer(data);
		while(input.hasMoreTokens()) {
			 num=Integer.parseInt(input.nextToken());
			 System.out.println(num);
				sum=sum+num;
			}
			System.out.println("Sum is:"+sum);
		}
}


