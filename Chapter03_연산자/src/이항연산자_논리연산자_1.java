/*
 * 조건 => 부정/ 논리 / 비교 => 사용이 가능
 */
import java.util.Scanner;
public class 이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수입력 (0~100):");
		
		int score = scan.nextInt();
		
		String res = score >= 0 && score <=100 ? "정상입니다." : "비정상입니다.";
		
		System.out.println("res: " + res);
	}

}
