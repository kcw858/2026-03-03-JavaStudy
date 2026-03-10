/*
 * 
 *  String : 문자열 여러개를 한번에 저장할 수 있는 참조형 데이터형
 * 			 클래스형으로 사용이 가능
 * 
 *  문자열 결합
 *  	+ : 산숳, 문자열 결합
 *  	"HELLO " + "JAVA" : "HELLO JAVA"
 *  	7 + "7" + 7 : "777"
 *  	7 + "7" + 7 + 7 + 7 :"77777"
 *  	7 + 7 + "7" + 7 + 7 :"14777"
 *  
 *  
 *  boolean : 존재 여부(장바구니에 값이 있는지,로그인 여부, 중복 처리, 턴) true / false
 * */
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}

}
