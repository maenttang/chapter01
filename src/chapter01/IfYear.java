package chapter01;

public class IfYear {

	public static void main(String[] args) {

		int year = 2000;
		
		
		if(year%4 != 0 )
		{
			System.out.println("윤년이 아닙니다.");
			
		}else {  //4로 나누어 떨어지는 년도
			//2. 100으로 나누어 떨어지는 년도
			if(year % 100==0) {
				System.out.println("윤년입니다.");
			}else {
				//4로 나누어 떨어지는 년도
				//100으로 나누어 떠어지지 않는 년도
				// 3.  400dmfh
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
				}else {
					// 4로 나누어 떨어지는 년도
					// 100으로 나누어 떨어지지 않으면
					System.out.println("윤년이 아닙니다.");
				}
			}
		}
		
		
		//----------------------------------
		
		if(year%4 != 0 )
		{
			System.out.println("윤년이 아닙니다.");
			
		}else if(year % 100==0) {
				System.out.println("윤년입니다.");
        }else if(year % 400 == 0) {
				System.out.println("윤년입니다.");
		}else {
				System.out.println("윤년이 아닙니다.");
			  }
		}
		
		//------------------------------------
		
		
		
//		if(year%4 == 0 )  // 4로 나누어 떨어지면 윤년이나...그 중에 윤년이 아닌것도 있다.
//		{
//			
//			// 100으로 나누어 떨어지지 않는 년도			
//			if(year % 100 == 0)
//			{
//				System.out.println("윤년");
//			}
//			
//		}else {  // 4로 나누어 안떨어지면 윤년이 아니다.
//			System.out.println("윤년아님");
//		}

	}


