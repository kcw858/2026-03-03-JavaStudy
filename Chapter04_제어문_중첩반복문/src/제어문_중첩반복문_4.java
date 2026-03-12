/*
 *  ★★☆★★
 *  ★★☆★★
 *  ★★☆★★
 *  ★★☆★★
 *  ★★☆★★
 * 
 */
public class 제어문_중첩반복문_4 {

	public static void main(String[] args) {
		
//		   ★★☆★★
//		   ★★☆★★
//		   ★★☆★★
//		   ★★☆★★
//		   ★★☆★★
		
//		for(int i = 1 ; i <= 5 ; i++)
//		{
//			for(int j = 1 ; j <= 5 ; j++)
//			{
//				if(j==3)
//				{
//					System.out.print("☆");
//				}
//				else
//				{
//					System.out.print("★");
//				}
//			}
//			System.out.println();
//		}
		
		
//		   ☆★★★★
//		   ★☆★★★
//		   ★★☆★★
//		   ★★★☆★
//		   ★★★★☆
		
//		for(int i = 1 ; i <= 5 ; i++)
//		{
//			
//			for(int j = 1 ; j <= 5 ; j++)
//			{
//				if(i==j)
//				{
//					System.out.print("☆");
//				}
//				else
//				{
//					System.out.print("★");
//				}
//			}
//			System.out.println();
//		}
		
		
//		   ☆★★★☆
//		   ★☆★☆★
//		   ★★☆★★
//		   ★☆★☆★
//		   ☆★★★☆
		
//		i    j
//		1    5  = 6
//		2    4  = 6
//		3    3  = 6
//		2    4  = 6
//		1    5  = 6
		
//		for(int i = 1 ; i <= 5 ; i++)
//		{
//			
//			for(int j = 1 ; j <= 5 ; j++)
//			{
//				if(i == j || i == 6 - j)
//				{
//					System.out.print("☆");
//				}
//				else
//				{
//					System.out.print("★");
//				}
//			}
//			System.out.println();
//		}	
		
		//가독성은 좋지만 수정에 용이해야한다
		System.out.println("☆★★★☆");
		System.out.println("★☆★☆★");
		System.out.println("★★☆★★");
		System.out.println("★☆★☆★");
		System.out.println("☆★★★☆");
	}

}
