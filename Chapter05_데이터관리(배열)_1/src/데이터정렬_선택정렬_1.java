import java.util.Arrays;

public class 데이터정렬_선택정렬_1 {

	public static void main(String[] args) {
		// 문자
		
		char[] alpha = new char[5];
		
		//초기화
		for(int i = 0 ; i < alpha.length ; i++)
		{
			alpha[i] = (char)((int)(Math.random()*26)+'A'); //A ~ Z
			for(int j =0; j < i; j++)
			{
				//현재 발생값과 이전에 저장된 값들과 비교
				if(alpha[i] == alpha[j])//중복제거
				{
					i--;//for문 증가를 -1
					break;
				}
			}
		}
		
		System.out.println("정렬 전: ");
		for(char c:alpha)
		{
			System.out.print(c + " ");
		}
		
		System.out.println("\n정렬 후: ");
		
		for(int i = 0; i < alpha.length-1 ; i++)
		{
			for(int j = i+1 ; j < alpha.length; j++)
			{
				if(alpha[i] > alpha[j])
				{
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
			System.out.println(Arrays.toString(alpha));
		}
		
		for(char c :alpha)
		{
			System.out.print(c+" ");
		}
		//char는 int와 동일하다
	}

}
