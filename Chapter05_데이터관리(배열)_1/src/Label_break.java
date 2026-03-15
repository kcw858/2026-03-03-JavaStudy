//label있는 break

public class Label_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		label:
		for(int i = 1 ; i <= 3 ; i++)
		{
			for(int k = 1 ; k <=3 ; k++)
			{
				System.out.println("i= "+ i + " k= " +k);
			}
			for(int j = 1 ; j <= 3 ; j++)
			{
				if(j == 2)
					break label; //j가 있는 for문만 종료하지만 label을 주면 label이 붙은 for문까지 종료
				System.out.println("i= "+ i + " j= " +j);
			}
		}
	}

}
