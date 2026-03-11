
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// 1~100까지의 합
		
		int sum = 0; //누적 합은 0부터 시작
		
		for(int i = 1; i <= 10000; i++)
		{
			//i는 지역변수로 {}을 벗어나면 사라진다
			//지역변수는 같은 블록에서 같은이름 사용불가
			//sum += i;
			sum = sum + i;
			System.out.println("i= " + i + ", sum= " +sum);
		}
		System.out.println("1~100사이의 총합: " + sum);
	}

}
