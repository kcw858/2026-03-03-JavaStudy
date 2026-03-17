/*
 *  웹 개발
 *  ----- String / ArrayList / Integer
 *  	  ------ 자바에서 지원하는 메소드 => 리턴형 / 매개변수 / 어떤 값 읽기
 *  
 *  
 *  비교
 *  	equals / equalsIgnoreCase
 *  	------		-----------
 *  	id,pwd		  검색
 *  	------      -----------
 *  	대소문자 구분   대소문자 구분이 없다
 */
//157page
public class String_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong = "admin";
		String shim = "admin";
		String park = new String("admin"); //new는 새로운 메모리에 저장
		String lee = "Admin";
		
		if(hong == shim)
		{
			System.out.println("hong과 shim은 같다");
		}
		else
		{
			System.out.println("hong과 shim은 같지않다");
		}
		
		//hong 주소안에 있는 문자열과 park 주소안에 있는 문자열 비교
		if(hong.equals(park))
		{
			System.out.println("hong과 park은 같다");
		}
		else
		{
			System.out.println("hong과 park은 같지않다");
		}
		
		//가급적이면 문자열은 ==보다 equals를 쓴다
		//상세보기,아이디찾기,비밀번호찾기,로그인
		
		//equals는 대소문자 구문
		if(hong.equals(lee))
		{
			System.out.println("hong과 lee는 같다");
		}
		else
		{
			System.out.println("hong과 lee는 같지않다");
		}
		
		//대소문자 구분 없이 비교
		//검색시 많이 사용
		/*
		 * boolean equalsIgnoreCase(String s)
		 * boolean equals(String s)
		 * -----------------------------------
		 * 주로 조건문에서 사용
		 * 
		 */
		if(hong.equalsIgnoreCase(lee))
		{
			System.out.println("hong과 lee는 같다");
		}
		else
		{
			System.out.println("hong과 lee는 같지않다");
		}
	}

}
