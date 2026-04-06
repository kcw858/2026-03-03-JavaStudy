package com.sist.lambda;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

/*
 *  많이 사용되는 함수형 인터페이스
 *  Function<T,R> T -> R리턴
 *   = Function(Integer,Integer> f = x -> x*2
 *  Consumer<T> => 입력을 받고 반환이 없음
 *  Supplier<T> => 반환만 있는 상태
 *  Predicate<T> => 조건검사 -> boolean 반환
 *   =  Predicate<Integer> p = x -> x >10
 *   
 *  스트림 (stream)
 *   => 데이터를 함수형 방식으로 처리하는 API
 *      -----
 *      List / Set
 *   => 컬렉션.stream() => 컬렉션에 있는 모든 데이터를 읽어온다
 *      .중간 연산()
 *      .최종 연산()
 *      
 *      중간 연산
 *      = filter()
 *      = map()
 *      = sorted()
 *      
 *      최종연산
 *      = forEach
 *      = collect
 *      = count
 *      
 *      사용법
 *       List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5));
 *       list.stream()
 *      	.filter(x -> x%2 == 0) // 짝수면
 *      	.forEach(x -> System.out.println(x));
 *      	----------------------------------
 *      	.forEach(x -> System.out::println);
 *      
 *       list.stream()
 *       	.filter(x -> x>3) //Predicate
 *       	.map(x -> x*2)	  // Function
 *       	.forEach(x -> System.out.println(x)); //Consumer
 *       
 *       ** x -> System.out.println(x)
 *       	x -> System.out::println;    둘다 동일
 *       
 *       람다 => 함수형 인터페이스 => 스트림 => 데이터 처리
 *        |		  | 람다의 타입     | 람다를 활용한 데이터 처리 도구
 *     함수처럼 사용
 */		
@Getter
@Setter
class Food
{
	private int no;
	private String name;
	private String type;
	private String phon;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
}

class FoodManager
{
	// 맛집 목록 전체의 데이터는 공유 => static
	// 오라클 데이터 => static (공유를 목적으로 한다)
	public static List<Food> fList = new ArrayList<Food>();
	
	//메모리 할당 없이 초기화
	static
	{
		//파일 => CheckedException 반드시 예외 처리
		try
		{
			FileReader fr = new FileReader("C:\\JavaDev\\food.txt");
			
			//BufferedReader -> 한줄씩 읽는다 IO
			// 글자수가 많아 StringBuffer 이용
			StringBuffer sb = new StringBuffer();
			int i = 0; //읽은 char
			while((i = fr.read()) != -1)
			{
				sb.append((char)i);
			}
			fr.close(); //원래 try-with-resource 이용이 편하다

			//맛집별로 나눠서 저장
			String[] datas = sb.toString().split("\n");
			for(String food : datas)
			{
				Food f = new Food();
				StringTokenizer st = new StringTokenizer(food,"|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhon(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
		}catch(Exception ex) {}
	}
	
	/*
	 * 1. 정적변수: static{}
	 * 2. 인스턴스 변수: 생성자를 통해 초기화
	 * 3. 사용자 정의 데이터형 -> 데이터를 모아서 한번에 브라우저로 전송할 목적 (DTO)
	 *    --------> 한개에 대한 정보  ex)학생 1명/ 맛집 1곳
	 */
}
public class Lambda_2 {

	public static void main(String[] args) {
		FoodManager fm = new FoodManager();
		
		//전체 평균 
//		double sum = 0.0;
//		int len = fm.fList.size();
//		
//		for(Food f : fm.fList)
//		{
//			sum += f.getScore();
//		}
//		System.out.printf("전체 평점 평균: %.2f\n",(sum/len));
		
		double avg = fm.fList.stream()
					.collect(Collectors.averagingDouble(food -> food.getScore()));
		System.out.printf("전체 평점 평균: %.2f\n", avg);
	}

}
