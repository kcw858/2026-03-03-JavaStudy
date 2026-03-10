/*
 *  산술
 *  	단항연산자 : ++, --
 *  	+ , - , * , / , %
 *  	비트이동연산자 : >>, <<
 *  	비트연산자 : &, |, ^
 *  
 */
public class 이항연산자_산술연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 & 8);
		System.out.println(10 | 8);
		System.out.println(10 ^ 8);
		//1 0 1 0
		//1 0 0 0
		//&은 둘다 1이면 1
		//|은 하나라도 1이면 1
		//^은 둘다 다르면 1
		System.out.println(Integer.toBinaryString(13)); //2진법 확인
		System.out.println(0b111000); //2진법을 10진법으로
	}

}
