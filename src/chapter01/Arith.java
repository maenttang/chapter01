package chapter01;

public class Arith{
	   public static void main(String[] args){
		int a = 7;
		int b = 3;
		//산술 연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//
		System.out.println(10 / 3);  //3
		
		System.out.println(10 / 3.0);  // 3.3333333333333335
		
		System.out.println((double) 10/3);  //3.3333333333333335
		
		System.out.println((double) (10/3));  //3.0
		
		
		
		//증감 연산자
		System.out.println(-a);
		System.out.println(b--);
		System.out.println(--b);
		
		a = 1;
		
		System.out.println(++a);
		// a = a+1;
		//System.out.println(a);
		
		
		System.out.println(a++); 
		//System.out.println(a);
		//a++
		
		System.out.println(a);
		
	   }
	}

