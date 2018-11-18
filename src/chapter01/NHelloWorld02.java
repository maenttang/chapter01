package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		
		int num;
		
		
		System.out.println("몇번 반복할까요?");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();		
		
		for(int i=0; i < num; i++)
		{
			System.out.println("Hello world");		
		}
		
		scan.close();
	}

}
