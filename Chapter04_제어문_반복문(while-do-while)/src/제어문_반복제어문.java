/*
 * 	break : switch-case / 반복문 안에서 사용
 * 			해당 제어문을 종료할 때 사용
 * 	
 *  continue : 반복문안에서만 사용이 가능
 *  		   for: 특정부분제외
 *  		   while, do-while: 처음부터 다시
 *  ---------------------------------------
 *  자신의 제어문만 제어 가능		   
 */
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1 ; i <= 10 ; i++)
		{
			if(i  ==5)
			{
				break; //for문 종료
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		for(int i =1 ; i <= 10 ; i++)
		{
			if(i  ==5)
			{
				continue; //5를 제외 후 출력
			}
			System.out.print(i + " ");
		}
	}

}
