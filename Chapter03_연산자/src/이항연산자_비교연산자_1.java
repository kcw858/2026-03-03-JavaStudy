/*
 * 3개의 정수인 난수를 발생 (1~100)
 * 
 * 최대값 죄소값 중간값
 * */
public class 이항연산자_비교연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100) + 1;
		int num2 = (int)(Math.random()*100) + 1;
		int num3 = (int)(Math.random()*100) + 1;
		
		System.out.println(num1+", "+num2+", "+num3);
		
		int max = num1 > num2 ? num1: num2;
		max = max > num3 ? max : num3;
		
		System.out.println("최대값: " + max);
		
		int min = num1 > num2 ? num2: num1;
		min = min > num3 ? num3: min;
		
		System.out.println("최소값: " + min);
		
		int mid = num1 + num2 + num3 - max - min;
		
		System.out.println("중간값: " + mid);
	}

}
