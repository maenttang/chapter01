package chapter01;

import java.util.Scanner;

public class InfinitueLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		for (;;) {
			System.out.println("숫자입력: ");
			int value = scan.nextInt();
			
			if(value == 0)
			{
				break;
			}
			sum = sum + value;
			
		}
		System.out.println(sum);
	}

}
