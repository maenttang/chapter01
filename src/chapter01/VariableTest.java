package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		//정수
		byte b = 1;
		short s = 10;
		int i = 2000;
		long l = 1234567;
		long i2 = 22323445566L;  //long타입숫자끝에 L을 넣어줘야함.

		
		//실수
		float f = 12.0f;
		double d = 1234.4;
		
		//문자
		char c = 'A';
				
		//불린 참, 거짓
		boolean bool = true;
		
		
		//문자열은 기본타입이 아니다.
		//문자열은 기본 타입 char가 모여있는 String클래스의 객체다.
		String ss  = "hello world";
				
//		String sss = new String("Hello World!!!");
//		System.out.println(sss);
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		System.out.println(ss);
		
		//(지역)변수는 초기화가 되어야 한다. 안되어 있는 상태로 사용하면 오류.
		int j;
		j = 20;
		System.out.println(j);
		
		i = 30;
		
		//상수...final을 쓴다. 오~~~ 자바에서는 이렇게 쓴다.
		final int NUMBER = 12345;  //일반적으로 상수이름은 대문자로 써준다.
		//오류 : 초기화시 final이 붙어 있는 변수는 다음에 값을 대입할 수 없다.
		//NUMBER = 12345;
		System.out.println(NUMBER);
		
		System.out.println(Math.PI);
		
		
		String str = "Hello";
		
		System.out.println(str.length());
		 
		
		
	}

}
