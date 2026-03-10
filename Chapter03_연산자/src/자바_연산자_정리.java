/*
 *  chapter01 
 *  	1. 4p 자바구동
 *  	2. 29p 주석처리
 *  	3. 30p 명령문 종료
 *  
 *  chapter02
 *  	1. 36p 변수: 한개의 데이터 저장
 *  				------------
 *  				데이터형 변수명;
 *  				변수명 = 값;
 *  				-------------
 *  				데이터형 변수명 = 값;
 *  				-------------
 *  
 *  	2. 27p 지역변수 블록 => {}이 종료되면 자동삭제, 반드시 사용전에 초기화
			   변수 명칭 -> 캐멀 표기법 (변수는 소문자, 단어 두개 연결시 두번째 단어의 첫글자는 대문자) -문법 x 규칙 0
			   
		3. 38p 변수명의 길이 => 제한은 없지만 3~10이 적당
							어떤 용도인지 주석을 걸어주는게 좋다
							
		4. 41p 정수에 대한 설명
				byte / int / long
				  |		|	   |
			8bit(1byte)	|	   |
				32bit(2byte)   |
						 64bit(8byte)
						 
		5. 43p 정수표현법 
				10진법 : 1, 10
				2진법 : 0bxx
				8진법 : 0xxx
				16진법 : 0x..
				
		6. 45p 문자 => 문자당 2byte
					 char c = '한글자' (한글가능)
					 
		7.47p 실수 => float   - 10.5F => 4byte (사용빈도가 거의 없다), 소수점 6자리
					 double  - 10.5D => 뒤에 D 생략가능, 8byte, 소수점 15자리, 실수의 default
					 
		8.50p boolean => true/false만 저장가능, 1byte메모리  c,python은 0,1로 true/false 가능
		
		9.51P 문자열 => String
		
		10. 52p 특수문자 
		  		// => / 한개 출력
		  		/" => ""
		  		/n => 한줄 띄기
		  		/t => 탭만큼 간격
	
		11. 55p 자동형변환
		  		큰데이터 = 작은데이터
		  		int a = 'A' -> int로 변환 a=65
		  		double d =100 -> double로 변환 d=100.0
		  		
		12. 57p 강제형변환
		  		보통 실수를 정수로 변환할때 사용, 객체지향에서 주로 사용
		  		int a = (int)10.5 => 소수점을 제거한 10이 나옴
		  		
		13. 72p 입력 Scanner
		  
		14. 81p 연산자 : 증감연산자 
	 				int a = 10;
	 				int b = a++;
	 				 -> a를 b에 넣은 후 a +1 증가
	 				a = 11  b = 10 
	 				 
	 				int a = 10;
	 				int b = ++a;
	 				 -> a +1 증가 후 a를 b에 넣는다
	 				a = 11  b = 11
		
		 15. 83p 산술연산자 => +, -, *, /, %
		 		+ : 덧셈, 문자의 결합기능
		 		/ : 정수/정수 = 정수 , 정수/0.0 = Infinity(0으로 나누면 오류발생)
		 		% : 결과값은 왼쪽부호가 남는다. (-5 % -2 = -1, 5 % -2 = 1)
		 
		 16. 90p 비교연산자 => ==, !=, <, >, <=, >=
		 		결과값은 항상 boolean
		 		조건문에서 주로 사용
		 		정수 / 실수 / 문자에서 사용
		 		boolean은 ==,!=만 사용
		 		
		 17. 93p 논리연산자 => &&, ||
		 		&&: 둘다 true일때 true (앞 조건이 false면 뒷조건은 처리하지않는다)
		 		||: 둘중에 한개 이상 true일때 true (앞 조건이 true면 뒷조건은 처리하지않는다)
		 		
		 18. 104p 대입연산자 => =, +=, -=
		 			int a = 10;  
		 			a += 10; -> a = a+10이랑 같다
		 
		 19. 105p 삼항연산자 => (조건) ? 값1 : 값2
		 			조건에는 비교/논리/부정 연산자만 사용가능
		 			조건이 true면 값1 false면 값2
		  		
					
				
 */		
public class 자바_연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		{
			int b = 20;
			{
				int c = 30;
				System.out.println("a= " + a);
				System.out.println("b= " + b);
				System.out.println("c= " + c);
			}
			System.out.println("a= " + a);
			System.out.println("b= " + b);
			//System.out.println("c="+c); 오류
		}
		System.out.println("a =" + a);
		//System.out.println("b="+b); 오류
		//System.out.println("c="+c); 오류
		
	}

}
