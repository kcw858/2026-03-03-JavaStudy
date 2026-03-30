package com.sist.lang;
import static java.lang.Math.*;
import static java.lang.String.*;

// import static 선언시 클래스명 없이 사용이 가능
// Math는 static이라 사용이 편리하다
// ceil / random => 오라클에 존재
public class Math_2 {

	public static void main(String[] args) {
	
		System.out.println((int)ceil(10/3));
		System.out.println(random());
		System.out.println(valueOf(10));
	}

}
