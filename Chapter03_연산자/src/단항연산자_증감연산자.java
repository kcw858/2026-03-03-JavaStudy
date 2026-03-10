/*
 * 피연산자 1개
 * 	증감연산자
 * 		전치연산자 : ++a (증가 먼저 후 나중에 다른 연산 수행)
 * 		후치연산자 : a++ (연산을 먼저 수행 후 나중에 증가)
 * 	- 정수와 문자만 가능
 * 		int a = 10;
		int b = a++;	
		a: 11 b: 10
		a를 b에 넣은 후 a 증가
		
		int a = 10;
		int b = ++a;
		a: 11 b: 11
		
		int a = 10;
		int b = a++ + a++;
		a: 12 b: 21
		
		int a = 10;
		int b = ++a + ++a;
		a: 12 b: 23
 * */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = ++a + ++a;
//		System.out.println("a:" + a);
//		System.out.println("b:" + b);
		
		int a = 10;
		int b = --a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		int c =10;
		c++;
		c++;
		c++;
		c--;
		--c;
		c--;
		
		System.out.println("c:" + c);
	}

}
