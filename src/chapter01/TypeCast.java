package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//implicity(암시적) type casting
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		//explicity(명시적) type casting // 큰값을 작은곳으로 넣을때...
		long l2 =123456789L;
		int i2 = (int)l2;  //캐스팅 형변환

	}

}
