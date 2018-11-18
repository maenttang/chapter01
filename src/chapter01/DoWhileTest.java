package chapter01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DoWhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int value = 0;
		
		
		
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("숫자입력: ");
			
			value = scan.nextInt();
			
			sum = sum+value;
		}while(value != 0);
		
		System.out.println(sum);

	}

}
