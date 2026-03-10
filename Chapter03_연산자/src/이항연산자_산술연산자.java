/*
 *  산술연산자 : + , - , *, /, %
 *  
 *  산술규칙 : int 이하 데이터형(byte,short,char)을 연산하면 int로 변경된다.
 *  		큰데이터형으로 결과값이 나온다 (int + long = long , int + double = double)
 *  
 *  / : 0으로 나누면 오류 발생
 *  	정수를 정수로 나누면 정수(10 / 3 = 3)
 *  
 *  % : 나머지값을 출력 (5 % 2 = 1)
 *  	결과값은 왼쪽 부호를 따라간다 (-5 % 2 = -1, -5 % -2 = -1, 5 % -2 = 1)
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5 % 2);
		System.out.println(-5 % 2);
		System.out.println(5 % -2);
		System.out.println(-5 % -2);
		
		
	}

}
