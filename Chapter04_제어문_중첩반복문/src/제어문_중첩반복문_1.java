/*
 *  중첩------
 *  
 *  if(조건문)       ====>  if(조건문&&조건문)
 *  {
 *  	if(조건문)
 *  	{
 *  	}
 *  }
 *  
 *  ---------
 *  	 1       2      7
 *  for(초기값 ; 조건식 ; 증가식)   =>세로 출력
 *  {
 *  		  3     4       6
 *  	for(초기값 ; 조건식 ; 증가식)	=>가로 출력
 *  	{
 *              5
 *  		반복 수행문장
 *  	}
 *  }
 *  
 *  
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		//구구단 
		for(int i = 1 ; i <= 9 ; i++) //9줄 만들기
		{
			for(int j = 2 ; j <= 9 ; j++) //8개 출력
			{
				System.out.printf("%d * %d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
