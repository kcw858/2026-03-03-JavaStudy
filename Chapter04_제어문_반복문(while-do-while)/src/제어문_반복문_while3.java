
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// 1~100의 총합 / 짝수 합 / 홀수 합
		
		int sum = 0, even = 0, odd = 0;
		
		int i = 1;
		while(i <= 100)
		{
			sum += i;
			if(i%2 == 0)
				even += i;
			else
				odd += i;
			i++;
		}
		
		System.out.println("1~100 총합: " + sum);
		System.out.println("1~100 짝수합: " + even);
		System.out.println("1~100 홀수합: " + odd);
	}

}
