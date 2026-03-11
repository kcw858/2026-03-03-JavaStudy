/*
 * 			초기값
 * 			do
 * 			{
 * 				실행문장	
 * 				증가값 	
 * 			}while(조건식); //실행문장 실행 후 조건 검색 	
 * 		한번은 반드시 실행
 * 
 * 
 * 		continue : 조건식으로 이동하기 때문에 while이나 do-while에서 사용시 무한루프에 빠진다
 */
import javax.swing.JOptionPane;

public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// 무한루프
//		int i = 1;
//		while(i <= 10)
//		{
//			
//			if(i==2)
//				continue;
//			System.out.println(i);
//			i++;
//		}
		
		//1~10까지 출력
		
		//while과 do-while문은 초기값이 밖에 있다.


int i = 1;
		
		do
		{
			System.out.print(i + " ");
			i++;
		}while(i <= 10);
		
		System.out.println();
		
		i = 1;
		char c = 'A';
		
		do
		{
			System.out.print(c + " ");
			c++;
		}while(c <= 'Z');
		
		System.out.println();
		
		c = '0';
		
		do
		{
			
			System.out.print(c + " ");
			c++;
		}while(c <= '9');
		
		System.out.println();
		
		String s = JOptionPane.showInputDialog("문자열입력");
		//글자수
		System.out.println("입력된 문자열: " + s);
		System.out.println("글자수: " + s.length());
		//A,a자가 몇개인지 확인
		
		int count = 0;
		i = 0;
		do
		{
			char d = s.charAt(i);
			if(d == 'A' || d == 'a')
				count++;
			
			i++;
		}while(i < s.length());
		
		System.out.println("A,a는 총갯수: " + count);
	}

}
