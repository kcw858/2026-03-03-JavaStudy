/*
 * 문자열 분리
 * 
 * split
 * 
 *  원형: String[] split(String regex);
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red,green,blue,yellow,black,magenta,pink";
		
		String[] colors = color.split(",");
		
		for(String c : colors)
		{
			System.out.println(c);
		}
		
		/*
		 * 정규식 기호 주의
		 * |
		 * .
		 * ?
		 * *
		 * +
		 * ----------- 이런 기호들은 앞에 \\가 붙어야한다
		 */
		color = "red|green|blue|yellow|black|magenta|pink";
		
		String[] colors2 = color.split("\\|"); 
		
		for(String c : colors2)
		{
			System.out.println(c);
		}
	}	

}
