/*
 *  배열은 메모리 주소를 이용하는 프로그램
 *  	- 주소에있는 데이터가 손상이 될 수 있다.
 *  	- 주소이용: 배열,클래스
 *  
 *  
 *  char[] op = {'+','-','*','/'};
 *	-----------------------------
 *     100     100  102  104  106
 *  -----------------------------
 *  => 첫번째 값이 있는 주소값
 *  op[0]
 *  구분자[인덱스]
 */
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[10];
		
		// 1.배열의 저장 갯수
		System.out.println("생성된 메모리 갯수"+alpha.length);
		
		// 2.배열의 초기값
		for(int i = 0 ; i < alpha.length ; i++)
		{
			alpha[i] = (char)((int)(Math.random()*26)+65);
		}
		
		// 3.출력 => for-eacch를 사용한다
		for(char c:alpha)
		{
			System.out.print(c + " ");
		}
		
		//변경
		alpha[0] = 'X';
		
		//한번에 변경
		int i = 0;
		for(char c = 'A' ; c <= 'J' ; c++)
		{
			alpha[i] = c;
			i++;
		}
		System.out.println("변경 후====");
		for(char c:alpha)
		{
			System.out.print(c + " ");
		}
		
		//다른 클래스에서 사용
		//	= 자체변경은 대입 
		//	= 새로운 메모리는 클론
	}

}
