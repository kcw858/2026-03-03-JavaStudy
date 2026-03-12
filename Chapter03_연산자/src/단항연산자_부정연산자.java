/* 
 *  ! -> boolean만 사용가능
 * 	!true -> false
 *  !false -> true
 * 
 * */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b =false;
		int i = 0;
		
		while(i<10) {
			b = !b;
			if(b == true) 
				System.out.println("사용자");
			else 
				System.out.println("컴퓨터");
			i++;
		}
	}

}
