package com.sist.collection;

import java.util.*;
public class Collection_total_1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//순서가 없어서 어떤데이터가 먼저 출력할지 알 수 없다
		// for-aech보다는 Iterator   (List는 for-each가 편하다)
		// Set은 네트워크 / Cookie에서 주로 사용
		for(String s : set)
		{
			System.out.println(s);
		}
	}

}
