package chapter01;

public class WhileTest {

	public static void main(String[] args) {
		
		int a = 1;     //초기화
		while(a <= 10)  //조건
		{
			//System.out.println("출력"+a);  //수행
			a++;  //증감
		}
		
	//-----------------------------------------------
		
		for(int b = 0; b< 10; b++)
		{
			System.out.println("출력"+b);
		}
	}

}
