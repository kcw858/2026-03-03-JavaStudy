// 1 ~ 10 => for문 => 0~2 난수를 발생 => 나누기 
public class 예외처리_4 {

	public static void main(String[] args) {
		//try
		//{
			for(int i = 1; i <= 10 ; i++)
			{
				try 
				{
					int no = (int)(Math.random()*3);
					System.out.println(i+"."+(i/no));
				}catch(ArithmeticException e)
				{
					System.out.println(e.getMessage()); //종료하지 않고 i++로 넘어감
				}
			}
		//}catch(ArithmeticException e)
		//{
		//	System.out.println(e.getMessage());
		//}
	}

}
