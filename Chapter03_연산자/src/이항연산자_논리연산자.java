/*
 *  논리연산자의 결과값은 boolean => 삼항연산자/조건문
 *  	최적화 연산자
 *  	연산기호 &&(포함, and, 직렬), ||(포함이 안된 경우, or, 병렬)
 *  
 * 		true && true	= true
 * 		true && false	= false
 * 		false && true	= false
 * 		false && false	= false
 * 
 * 		true || true	= true
 * 		true || false	= true
 * 		false || true	= true
 * 		false || false	= false
 * 
 * 	==최적 및 효율적 연산
 * 		||는 앞 내용이 true면 뒤는 계산하지 않는다 
 * 		&&는 앞 내용이 false면 뒤는 계산하지 않는다
 * 	
 * 	x>10 && ++y==x  => 앞이 false기 때문에 y값은 증가하지않고 종료
 * 
 * */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 9;
		
		boolean res = x > 10 && ++y == x;
		
		System.out.println("결과값:" + res);
		System.out.println("y:" + y);
		
		res = x > 10 || ++y == x;
		 
		System.out.println("결과값:" + res);
		System.out.println("y:" + y);
	}
}
