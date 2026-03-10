/*
 *  대입연산자 => 우선순위가 마지막 
 *  "="
 *  
 *  복합대입연산자
 *  	+=, -+, *=, /+, >>=, <<=, &=, |=, ^=
 *  
 *  1. 형변환
 *  	int a = 'A'	   => a = 65
 *  	double d = 10  => d = 10.0
 *  	왼쪽 >= 오른쪽
 *  2. 초기값 / 계산 결과값 저장
 *  
 *  
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c = (char)((Math.random()*26)+65);
//		System.out.println(c);
		
		int sum = 0;
		int even = 0, odd = 0;
		
		
		for(int i =0; i<= 100; i++)
		{
			if(i%2 ==0)
			{
				even += i;
			}else
			{
				odd += i;
			}
			sum += i;
		}
		System.out.println("짝수합: " + even);
		System.out.println("홀수합: " + odd);
		System.out.println("sum: " + sum);
		
		String alpha = "";
		
		for(char c ='A'; c <= 'Z'; c++ )
		{
			//alpha += c;
			alpha = alpha + c;
		}
		
		System.out.println("alpha: " + alpha);
	}

}
