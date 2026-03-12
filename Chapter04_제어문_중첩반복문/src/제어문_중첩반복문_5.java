/*
 *  	=>2차 for문의 조건
 *    *
 *    **
 *    ***
 *    ****
 *    i    j
 *    1    1
 *    2    2
 *    3    3
 *    4    4     j = i
 *    
 *    
 *    ****
 *    ***
 *    **
 *    *
 *    
 *    i   j
 *    1	  4
 *    2   3
 *    3   2
 *    4   1    i + j = 5
 *    
 *    
 *    
 */
public class 제어문_중첩반복문_5 {

	public static void main(String[] args) {
		
//		for(int i = 1 ; i <= 4 ; i++)
//		{
//			for(int j = 1 ; j <= i ; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
		for(int i = 1 ; i <= 4 ; i++)
		{
			for(int j = 1 ; j <= 5-i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
