/*
 *  국어/영어/수학 점수 입력을 받아서 총점과 평균을 출력
 * */
import java.util.Scanner;

public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//System.in 키보드로 값을 받아 엔터시 메모리에 저장
		
		System.out.print("국어 입력:");
		int kor = scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng = scan.nextInt();
		
		System.out.print("수학 입력:");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		
		double avg = total / 0.0; // Infinity 무한대
		// 5%0 => NaN 값이 없음
		
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math + "\n");
		System.out.println("========최종결과=========\n");
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n",avg);
		System.out.println(5%0.0);
	}

}
