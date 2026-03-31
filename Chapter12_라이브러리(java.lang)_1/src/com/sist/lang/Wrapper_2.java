package com.sist.lang;
import java.lang.reflect.Method;
import java.util.*;
class Controoler
{
	@RequestMapping("1")
	public void aaa()
	{
		System.out.println("Controoler:aaa() Call...");
	}
	@RequestMapping("2")
	public void bbb()
	{
		System.out.println("Controoler:bbb() Call...");
	}
	@RequestMapping("3")
	public void ccc()
	{
		System.out.println("Controoler:ccc() Call...");
	}
	@RequestMapping("4")
	public void ddd()
	{
		System.out.println("Controoler:ddd() Call...");
	}
	@RequestMapping("5")
	public void eee()
	{
		System.out.println("Controoler:eee() Call...");
	}
}
public class Wrapper_2 {

	public static void main(String[] args) {
		
		//배열대신 사용하는 저장공간
		//여러 데이터형을 넣으면 조작이 힘들다
		//List list = new ArrayList();
		//<제네릭>으로 들어갈 데이터형 지정
		//List<Integer> list = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
//		Controoler c = new Controoler();
//		System.out.print("aaa(1),bbb(2),ccc(3),ddd(4),eee(5): ");
//		int no = scan.nextInt();
//		
//		if(no ==1)
//			c.aaa();
//		else if(no ==2)
//			c.bbb();
//		else if(no ==3)
//			c.ccc();
//		else if(no ==4)
//			c.ddd();
//		else if(no ==5)
//			c.eee();
		
		try {
			
				Class clsName = Class.forName("com.sist.lang.Controller");
				Object obj = clsName.getDeclaredConstructor().newInstance();
				
				Method[] methods = clsName.getDeclaredMethods();
				
				System.out.print("1~5: ");
				String no = scan.next();
			
			for(Method m : methods)
			{
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(no))
				{
					m.invoke(obj, null);
				}
			}
		}catch(Exception ex){}
	}

}
