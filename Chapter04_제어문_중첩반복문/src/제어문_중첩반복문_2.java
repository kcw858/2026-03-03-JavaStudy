/*
 * 	1.몇줄출력 ->1차 for문
 * 	2.내용물	->2차 for문
 * 	3.1차가 종료되어야 for문 종료
 * 
 * 	Label
 * 	for()
 *  {
 *  	for()
 *  	{
 *  		if()
 *  		{
 *  			//break; ==>2차만 종료
 *  			//break Label; ==> Label전체 종료
 *  		}
 *  	}
 *  }
 *  
 *  
 *  	for(int i = 1 ; i <= 3 ; i++)
		{
			for(int j = 1 ; j <= 3 ; j++) 
			{
				출력물
			}
			줄만들기
		}
		
		i=1  i<=3  => j=1,j=2,j=3  => i++
		i=2  i<=3  => j=1,j=2,j=3  => i++
		i=3  i<=3  => j=1,j=2,j=3  => i++
		i=4 => 종료
		
 */
public class 제어문_중첩반복문_2 {

	public static void main(String[] args) {
		for(int i =1 ; i <= 3 ; i++)
		{
			for(int j = 1; j <= 3 ; j++)
			{
				System.out.println("i=" + i + " j=" + j);
			}
		}
	

	}

}
