import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) throws Exception{
		// 로또번호 추출 => 1~45의 숫자 6개 중복x
		
		//6개 번호를 저장하는 배열
		int[] lotto = new int[6];
		
		for(int i = 0 ; i < lotto.length ; i++)
		{
			lotto[i] = (int)(Math.random()*45) + 1;
			
			//중복 제거
			for(int j = 0 ; j < i ; j++)
			{
				if(lotto[i] == lotto[j])
				{
					i--;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(lotto));
		Arrays.sort(lotto); //오름차순
		
		//내림차순
		for(int i = lotto.length-1 ; i >=0 ; i--)
		{
			Thread.sleep(1000);
			System.err.print(lotto[i]+" ");
		}
	}

}
