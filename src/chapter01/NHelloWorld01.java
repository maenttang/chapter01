package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		int num;
		int i=0;
		
		System.out.println("몇번 반복할까요?");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();		
		
		while(i < num)
		{
			System.out.println("Hello world");
			i++;			
		}
		
		scan.close(); // 이걸 닫아줘야 scan 리소스낭비를 막아준다.

	}

}
