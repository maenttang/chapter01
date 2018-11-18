package chapter01;

public class Max {

	public static void main(String[] args) {

		int a1 = 80;
		int a2 = 100;
		int a3 = 90;

		int max = 0;
		
		if(a1 > a2){
			if(a1 > a3) {
				System.out.println("a1이 최대값입니다.");
			}else {
				System.out.println("a3이 최대값입니다.");
			}
		}else {
			if(a2 > a3) {
				System.out.println("a2이 최대값입니다.");
			}else {
				System.out.println("a3이 최대값입니다.");
			}
		}
		
		
		
//			max = a1;
//		}else{
//			max = a2;
		
		
		
//		if(a1 > a2){
//			max = a1;
//		}else{
//			max = a2;
//		}		
//		if(a1 < a3)
//		{
//		    max = a3;
//		}		
//		if(a2 > a3)
//		{
//			max = a2;
//		}		    
//		
//		System.out.println("최대값은 "+max+"입니다.");
		
	}

   }
