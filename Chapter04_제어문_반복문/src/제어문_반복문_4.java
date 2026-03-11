
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// 1~100까지 3의배수 / 5의배수 / 7의 배수 갯수
		// 단일 조건문 => 중복처리가 가능하도록
		
		int a3=0, a5=0, a7=0; //데이터형이 같은 변수
		
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i % 3 == 0)
				a3++;
			if(i % 5 == 0)
				a5++;
			if(i % 7 == 0)
				a7++;
		}
		
		System.out.println("1~100사이 3의 배수의 갯수: "+ a3);
		System.out.println("1~100사이 5의 배수의 갯수: "+ a5);
		System.out.println("1~100사이 7의 배수의 갯수: "+ a7);
		
		//1~100 사이 짝수의 합과 홀수의 합
		
		int even = 0, odd= 0;
		
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
			
		}
		
		System.out.println("짝수 합: "+ even);
		System.out.println("홀수 합 "+ odd);
	}

}
