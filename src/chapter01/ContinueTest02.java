package chapter01;

public class ContinueTest02 {

	public static void main(String[] args) {
//		int i = 0;
//		
//		while(i < 10)  //무한루프 걸림 6이 계속 됨.
//		{
//			if(i > 5)
//			{
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}

		
		for(int i = 0; i< 10; i++)
		{
			if(i > 5) {
				continue;
			}
			System.out.println(i);
		}
//			
	}

}
