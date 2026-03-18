// 액션 클래스 : 기능을 수행 (메소드 중심)
// MovieDAO  /  MovieManager  / MovieService
//		|DB연동		| 크롤링			|브라우저 전송,SpringAI
import java.io.FileReader;
public class MovieSystem {
	//데이터를 여러명이 동시에 접속했을 경우 같은 정보를 보여줘야한다 => 인스턴스x 
	static Movie[] movies = new Movie[1938];	//객체 배열
	
	//초기화 => 파일을 읽어서 데이터를 저장
	static
	{
		//자동으로 인식 => 파일은 예외처리
		try 
		{
			StringBuffer sb = new StringBuffer();
			//파일 전체의 문자 저장
			
			//1.파일 읽기
			FileReader in = new FileReader("c:\\JavaDev\\movie.txt");
			int i = 0; //한글자씩 읽기 => return형이 int라서 char로 변환
			while((i=in.read())!= -1)// -1: 파일의 끝 (EOF)
			{
				sb.append((char)i);
			}
			in.close();
			
			//문자열로 변환
			String strMovie = sb.toString();
			
			String[] datas = strMovie.split("\n"); //영화 1개씩 가져오기
			i = 0;
			for(String m:datas)
			{
				String[] mn =m.split("\\|");
				movies[i] = new Movie();
				movies[i].mno=Integer.parseInt(mn[0]); //문자열을 정수형으로 변환
				movies[i].title = mn[1];
				movies[i].genre = mn[2];
				movies[i].poster = mn[3];
				movies[i].actor = mn[4];
				movies[i].regdate = mn[5];
				movies[i].grade = mn[6];
				movies[i].director = mn[7];
				i++;
			}
			
		} catch (Exception ex) {}
	}
}
