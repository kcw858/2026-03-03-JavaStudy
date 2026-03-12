
public class 제어문_중첩반복문_3 {

	public static void main(String[] args) {
		// ★★★★★
		// ★★★★★
		// ★★★★★
		// ★★★★★
		// ★★★★★     
		
//		for(int i = 1; i <= 5 ; i++)       //5줄
//		{
//			for(int j = 1; j <= 5 ; j++)  //1줄당 5개 출력
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
		
		// ABCD
		// EFGH
		// IJKL
		// MNOP
		
//		char c = 'A';
//		
//		for(int i = 1; i <= 4 ; i++)       //4줄
//		{
//			for(int j = 1; j <= 4 ; j++)  //1줄당 4개 출력
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}

		//ABCD
		//ABCD
		//ABCD
		//ABCD
		
	
		
		for(int i = 1; i <= 4 ; i++)       //4줄
		{
			char c = 'A';
			for(int j = 1; j <= 4 ; j++)  //1줄당 4개 출력
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}

}
