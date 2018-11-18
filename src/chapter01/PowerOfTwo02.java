package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {

		int power;
		
		int num;
		int result = 1;
		
		System.out.print("승수 입력: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();		
		power = scan.nextInt();
		
		
		//2의 power 승을 해서 출력
		
		for(int i = 0; i < power; i++)
		{
			result = result * num;
		
		}
		
		System.out.println(num+"의"+power+"승은"+ result +"입니다.");
				
		
		scan.close();
		

	}

}
