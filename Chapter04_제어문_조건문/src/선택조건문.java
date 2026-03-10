/*
 *  가장많이 사용되는 조건문
 *  	단일조건문은 true일때 수행,false일때 건너뛴다
 *  	선택조건문은 true일때 true수행,false일때 false수행
 *  
 *  	if(조건)
 *  	{
 *  		조건 true
 *  	}
 *  	else
 *  	{
 *  		조건 false
 *  	}
 *  	
 */
import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// 1~100에서 짝수, 홀수
		Random r = new Random();
		
		int i = r.nextInt(100) + 1;
		
		System.out.println("정수값: " + i);
		
		if(i % 2 == 0)
			System.out.println(i + "는 짝수입니다.");	
		else
			System.out.println(i + "는 홀수입니다.");

		char c = 'H';
		
		if(c >= 'A' && c <= 'Z')
			System.out.println(c + "는 대문자입니다.");	
		else
			System.out.println(c + "는 소문자입니다.");
	}

}
