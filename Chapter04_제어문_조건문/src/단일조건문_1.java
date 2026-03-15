/*
 *  if(조건문)
 *  {
 *  	실행문장;   //조건이 true일때
 *  }
 */ 
import java.util.Random;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// 난수 3개 발생 후 최대값/최소값 구하기
		
		Random r = new Random();
		// new: 동적 메모리 할당 => heap영역에 저장
		int num1 = r.nextInt(100)+1;
		int num2 = r.nextInt(100)+1;
		int num3 = r.nextInt(100)+1;
		
		System.out.println(num1 + ", " + num2 + ", " + num3);
		
		int max = num1;
		int min = num1;
	
		if(max < num2)
			max = num2;
		if(max < num3)
			max = num3;
		
		System.out.println("최대값: " + max);
		
		if(min > num2)
			min = num2;
		if(min > num3)
			min = num3;
		
		System.out.println("최소값: " + min);
		
		int mid = num1+num2+num3-max-min;
		
		System.out.println("중간값: " + mid);
		
		//최대값은 가장 작은값, 최소값은 가장 큰값을 넣고 비교
	}

}
