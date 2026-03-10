/*
 * 1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
 * 
 * int kor / int math / int eng / int sum / double avg / String rankType / int rank
 * 
 * 
 * */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int drink = 12;
//		
//		drink = drink - 5;
//		//drink -= 5; //보통 누적이나 차감
//		
//		System.out.println("남은 음료수: " + drink);
//		// 남은 음료수 : 7
		
		
		//샌드위치는 250, 사과는 100, 주스는 150 칼로리일 때, 샌드위치 1 사과 2 주스 1의 총 칼로리는?
		
//		int 샌드위치 = 250;
//		int 사과 = 100;
//		int 주스 = 150;
//		
//		System.out.println(샌드위치*1+사과*2+주스*1);
		
		
		//이름 홍길동 / 남자 / 20 / 180.5 / 카드는 없음
		//장바구니 안에는 1200원 우유2개, 1500원 빵 3개, 200원 달걀 10개가 있다
		
		String name = "홍길동";
		String gender = "남자";
		int age = 20;
		double height = 180.5;
		boolean isCard = false;
		
		int  milk = 1200;
		int  bread = 1500;
		int  egg = 200;
		
		int sum = milk*2 + bread*3 + egg*10;
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("카드 유무: " + isCard);
		
		System.out.println("장바구니 총합:" + sum);
		
		String msg = """	
(서울=연합뉴스) 임화섭 기자 = 이란 전쟁의 승패는 어느 쪽 무기가 먼저 바닥나느냐에 따라 결정될 것이라는 전문가 지적이 잇따르고 있다.

영국 일간 가디언은 이번 전쟁이 이란 측이 보유한 드론·미사일 재고와, 이스라엘과 다른 주변 미국 우방국들까지 포함한 미국 측이 보유한 방공미사일 재고 중 어느 쪽이 더 오래 버티느냐의 싸움이 됐다는 전문가 분석을 3일(현지시간) 전했다.

이스라엘과 미국의 이란 공격으로 전쟁이 개시된 지난달 28일 이래 이란과 그 대리 세력들은 미사일과 드론을 동원해 10여개 주변국에 있는 약 2천㎞ 범위의 목표물들에 1천여회 폭격을 가했다.

				""";
		
		System.out.println(msg);
	}

}
