package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		
	    int sum = 0;
		System.out.println("몇번 반복할까요?");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i<= num; i++)
		{
			//sum = i + sum;
			sum += i;
		}

		System.out.println(sum);
		scan.close();
	}

}
