/*
 *  범위가 있는 경우	=> 다중 조건문
 *  한개의 값을 선택하는 경우 => 선택문
 *  
 */
import java.util.*;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = scan.nextInt();
//		char op = ' ';
//		
//		switch(score / 10)
//		{
//			case 10: 
//			case 9:
//				op = 'A';
//				break;
//			case 8:
//				op = 'B';
//				break;
//			case 7:
//				op = 'C';
//				break;
//			case 6:
//				op = 'D';
//				break;
//			default:
//				op = 'F';
//		}
//		System.out.println("학점: " + op);
		
		//람다식 break가 없어도 가능 (반드시 default값이 있어야한다)
		//jdk 14이상  자바스크립트는 => 이중화살표
		String grade = switch(score/10){
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println("학점: " + grade);
	}

}
