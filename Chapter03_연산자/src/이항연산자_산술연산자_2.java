
public class 이항연산자_산술연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =(int)(Math.random()*100)+1;
		int b =(int)(Math.random()*100)+1;
		int c =(int)(Math.random()*100)+1;
		int d =(int)(Math.random()*100)+1;
		int e =(int)(Math.random()*100)+1;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		
		double res = (a+b+c+d+e) / 5.0; //나누기는 가급적 실수로 나눈다
		
		System.out.println(res);
	}

}
