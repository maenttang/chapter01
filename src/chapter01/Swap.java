package chapter01;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// swap 알고리즘 구현		
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int temp;
		
		temp = a; //10
		a = b; //20
		b = temp; //10		
		
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
