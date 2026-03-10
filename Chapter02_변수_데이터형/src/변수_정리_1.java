// 출력 형식
/*
 *  System.out.print()   : 가로로 출력
 *  System.out.println() : 세로 출력(한줄 차지)
 *  System.out.printf()  : 서식이 있는 경우
 *  
 * */
public class 변수_정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Hello ");
//		System.out.print("Java");
		
		
//		System.out.println("Hello ");
//		System.out.println("Java");
		
		System.out.printf("%-4d%-4d%-4d\n",90,90,90);   // %d: 정수 값  %s: 문자열  %c: 문자,  %f: 실수
		System.out.printf("%.2f",10/3.0);
	}

}
