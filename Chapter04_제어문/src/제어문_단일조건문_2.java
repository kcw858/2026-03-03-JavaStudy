
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// 숫자가 3의 배수,5의 배수, 7의 배수
		int num = 3242340;
		if(num % 3 == 0)
		{
			System.out.println(num + "는(은) 3의 배수입니다." );
		}
		if(num % 5 == 0)
		{
			System.out.println(num + "는(은) 5의 배수입니다." );
		}
		if(num % 7 == 0)
		{
			System.out.println(num + "는(은) 7의 배수입니다." );
		}
	}

}
