/*
 * 형변환 연산자
 * 
 * => 제외: boolean,String
 * 
 * 강제형변환: (데이터형)데이터 ex) (int)10.0
 * 
 * */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor  = 80;
		int eng  = 78;
		int math = 87;
		
		int count = 3;
		
		int total = kor+eng+math;
		double avg = total/(double)count;   // 정수 / 정수는 정수가 나오기 때문에
		
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ avg);
		
		char c = 'A';
		System.out.println((int)c);
		int i = 65;
		System.out.println((char)i);
		
		int a = 123456;
		double d = 123456.78f;
		
		int r = (int)((d-a)*100);
		
		System.out.println("r: " + r); //강제 형변환은 위험
	}

}
