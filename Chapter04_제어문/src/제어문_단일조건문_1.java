import java.util.Scanner;
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		//알파벳 입력을 받아서 대문자인지 소문자인지 구분
		
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		//문자 입력은 불가능 (문자열로 받은 후 문자형으로 변환)
		String ch = scan.next();
		// nextInt()     =>정수
		// next()		 =>문자열
		// nextDouble()  =>실수
		
		char c = ch.charAt(0); //문자열에서 첫번째 문자를 가져온다
		System.out.println("입력된 알파벳: " + c);
		
		if(c >= 'A' && c <= 'Z')
			System.out.println(c + "는(은) 대문자입니다.");
		if(c >= 'a' && c <= 'z')
			System.out.println(c + "는(은) 소문자입니다.");
		if(c >= '0' && c <= '9')
			System.out.println(c + "는(은) 숫자입니다.");
	}

}
