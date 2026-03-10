/*
 *  3개의 점수를 받아서 평균 / 총점 / 학점
 * 
 * */
import java.util.Scanner;
import java.text.*;

public class 이항연산자_산술연산자_정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int kor = scan.nextInt();
		
		System.out.print("영어점수: ");
		int eng = scan.nextInt();
		
		System.out.print("수학점수: ");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		
		double avg = total / 3.0 ;
		
		//학점 
		double[] limits = {50,60,64,67,70,74,77,80,84,87,90,94,97};
		String[] score = {"F","D-","D0","D+","C-","C0","C+",
					"B-","B0","B+","A-","A0","A+"};
		ChoiceFormat cf = new ChoiceFormat(limits,score);
		
		System.out.println("국어: "+ kor);
		System.out.println("영어: "+ eng);
		System.out.println("수학: "+ math);
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ avg);
		System.out.println("학점: "+ cf.format(avg));
	}

}
