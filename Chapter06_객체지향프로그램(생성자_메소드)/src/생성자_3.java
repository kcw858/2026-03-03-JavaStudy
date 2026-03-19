/*
 *  생성자 선언 => 모든 클래스에서 제작하는 것은 아니다
 *  			필요시 만든다
 *  => 없는 경우 자동 생성이 되어있다
 */
class Student
{
	int hakbun;
	String name;
	int kor,eng,math;	
	//=> 변수값을 다르게 저장 => 초기값을 다르게 생성
	Student(int h,String n,int k,int e,int m)
	{
		hakbun = h;
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	
	//매개변수가 지역변수명과 같으면 지역변수가 우선
	Student(int hakbun,String name)
	{
		System.out.println("this 주소: "+this);
		//지역변수 우선순위
		this.hakbun=hakbun;
		//this 자신의 객체명
		/*
		 *  객체 생성
		 *  => Student s = new Student(1,"심청이")
		 *  
		 *   1)
		 *  	----s----
		 *  
		 *  	---------	100---------hakbun
		 *  					   1
		 *  				   ---------name
		 *  				     "심청이"
		 *  				   ---------
		 *   2) this = s
		 *      - 모든 클래스는 this를 가지고 있다
		 *      - 실행시마다 this의 주소가 변경
		 *      - this는 static으로 되어있다
		 *      
		 *   3) static은 this가 존재하지 않는다
		 */
		this.name = name;
	}
	/*
	 *  변수 찾기
	 *  => 지역변수
	 *  => 인스턴스 변수 찾기
	 *  => 같은 변수명을 사용할 수 있는 이유는 메모리가 다르다
	 *  		- heap
	 *  		- stack
	 *  	
	 */
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student(1, "홍길동", 90,90,90);
		Student shim = new Student(2, "심청이", 80,80,80);
		Student park = new Student(3, "박문수", 70,70,70);
		
		System.out.println(hong.hakbun + " " 
							+ hong.name + " " 
							+ hong.kor + " " 
							+ hong.eng + " " 
							+ hong.math);
		
		System.out.println(shim.hakbun + " " 
							+ shim.name + " " 
							+ shim.kor + " " 
							+ shim.eng + " " 
							+ shim.math);
		
		System.out.println(park.hakbun + " " 
							+ park.name + " " 
							+ park.kor + " " 
							+ park.eng + " " 
							+ park.math);
		
		Student lee = new Student(4, "이순신");
		//lee => hakbun,name
		System.out.println("학번: "+ lee.hakbun);
		System.out.println("이름: "+ lee.name);
		System.out.println("lee주소: " + lee);
	}

}
