// 배열 : 일반 변수 여러개보다 이름 1개를 이용해서 데이터 관리가 쉽다.
//		순차적인 인덱스 번호를 가지고있어 반복문 수행이 편하다
//		고정적으로 한번 지정하면 변경이 불가능하다.
/*
 *  복사
 *  	= 얕은 복사
 *  	= 깊은 복사
 *  
 *  	= 라이브러리 이용
 */
import java.util.Arrays;
public class 배열_6 {

	public static void main(String[] args) {
		// 얕은복사  Call by reference
		// 복사본이 바뀌면 원본도 바뀐다
		// 같은 메모리 주소 사용
		int[] arr = {100,200,300,400,500};
		int[] copy = arr;
		
		copy[0] = 1000;
		System.out.println(arr[0]);
		System.out.println("arr= " + arr);
		System.out.println("copy= " + copy);
		
		// 깊은복사
		// 값을 복사해서 새로운 메모리 저장



		int[] copy2 = arr.clone();
		System.out.println("copy2= " + copy2);
		copy2[0] = 5000;
		
		System.out.println("========= arr값 ======");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("========= copy값 ======");
		System.out.println(Arrays.toString(copy));
		
		System.out.println("========= copy2값 ======");
		System.out.println(Arrays.toString(copy2));
	}

}
