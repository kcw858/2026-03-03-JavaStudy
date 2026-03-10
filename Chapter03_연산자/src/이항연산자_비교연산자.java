/*
 *  결과값은 boolean (true/false)
 *  
 *  == 같다,  != 다르다,  < 작다,   > 크다,  <= 작거나 같다,  >= 크거나 같다
 *  
 *  	=> 정수 / 실수 / 문자  -> 전체사용가능
 *  
 *  논리는 == ,!= 사용	
 *  문자열은 사용하지 않는다 : 문자열은 equals()사용, compare()사용 
 *  문자열은 주소를 이용하기 때문에
 *  
 *  
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 6==7;
		System.out.println("b1=" + b1);
		
		b1 = 6!=7;
		System.out.println("b1=" + b1);
		
		b1 = 6<7;
		System.out.println("b1=" + b1);
		
		b1 = 6>7;
		System.out.println("b1=" + b1);
		
		b1 = 6<=7;
		System.out.println("b1=" + b1);
		
		b1 = 6>=7;
		System.out.println("b1=" + b1);
		System.out.println("======================");
		
		b1 = 'A'=='C';
		System.out.println("b1=" + b1);
		
		b1 = 'A'!='C';
		System.out.println("b1=" + b1);
		
		b1 = 'A'<'C';
		System.out.println("b1=" + b1);
		
		b1 = 'A'>'C';
		System.out.println("b1=" + b1);
		
		b1 = 'A'<='C';
		System.out.println("b1=" + b1);
		
		b1 = 'A'>='C';
		System.out.println("b1=" + b1);
		System.out.println("======================");
		
		boolean r1 = false;
		boolean r2 = true;
		
		b1 = r1 == r2;
		System.out.println("b1=" + b1);
		b1 = r1 != r2;
		System.out.println("b1=" + b1);
		//b1 = r1 < r2; boolean 크기 비교 불가
		System.out.println("======================");
		
		b1 = 'A' == 66;
		System.out.println("b1=" + b1);
		b1 = 'A' != 66;
		System.out.println("b1=" + b1);
		b1 = 'A' < 66;
		System.out.println("b1=" + b1);
		b1 = 'A' > 66;
		System.out.println("b1=" + b1);
		b1 = 'A' <= 66;
		System.out.println("b1=" + b1);
		b1 = 'A' >= 66;
		System.out.println("b1=" + b1);
		System.out.println("======================");
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
	}

}
