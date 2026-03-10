
public class 선택조건문_1 {

	public static void main(String[] args) {
		
		String id = "admin";
		String pwd = "1234";
		
		if(id.equals("admin") && pwd.equals("1234"))
		{
			System.out.println("로그인 성공");
		}
		else
		{
			System.out.println("로그인 실패");
		}
	}

}
