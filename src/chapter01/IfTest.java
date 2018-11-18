package chapter01;

public class IfTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c;
		
		if(a > b){
			c = a-b;
		}else{
			c = b-a;
		}
		System.out.println(c);
	}

}
