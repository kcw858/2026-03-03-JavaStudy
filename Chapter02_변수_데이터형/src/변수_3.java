/*long 큰 데이터
 금융권  학교   빅데이터   공기업

 int / long 구분
 
 100   / 100L
 
 
 데이터형은 기본형(자바 제공지원)/참조형(사용자 정의 class)
 
 큰 데이터에 작은 데이터 대입 가능
 작은 데이터에 큰 데이터 대입 불가능 
 
 byte < short < int < long < float < double
 수 표현이 많아서 float double이 크다고 본다
 
 
 실수 
 	float(4byte) : 10.5F
 	double(8byte): default 값이다. : 10.5
*/
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = Byte.MIN_VALUE;
		byte b2 = Byte.MAX_VALUE;
		//네트워크 전송 ( 웹 데이터 전송 ), 파일 입출력
		//1byte => 8bit
		
		System.out.println("byte 범위:" + b1 + " ~ " + b2);
		
		long l1 = Long.MIN_VALUE;
		long l2 = Long.MAX_VALUE;
		
		System.out.println("long 범위:" + l1 + " ~ " + l2);
		
		short s1 = Short.MIN_VALUE;
		short s2 = Short.MAX_VALUE;
		// 사용 빈도가 거의 없다
		
		System.out.println("short 범위:" + s1 + " ~ " + s2);
		
		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		
		System.out.println("int 범위:" + i1 + " ~ " + i2);
		
		
		double d = 10.5f;
		//float f = 10.5; 불가능, float f = (float)10.5 형 변환시 가능
		System.out.println(10+10.5);
	}

}
