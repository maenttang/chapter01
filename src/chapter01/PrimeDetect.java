package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("판별할 수:");
		int num = scan.nextInt();
		
		//처리
		boolean isPrime = true;
		
		int i = 2;
		while( i < num)  //소수 알고리즘의 하나의 방법
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
			i++;
		}
		
		
		
		
//		if(num % 2 ==0)
//		{
//			isPrime = true;
//		}else {
//			isPrime = false;
//		}
		
		//출력
		if(isPrime)
		{
			System.out.println("소수가 아닙니다.");
		}else {
			System.out.println("소수입니다.");
		}
		
		scan.close();

	}

}
