package com.sist.customer;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerDataCollection {
	public static CustomerVO[] customers = new CustomerVO[100];
	
	// 고객 누구나 접근이 가능: 공유
	//초기화
	static
	{
		try 
		{
			FileReader in = new FileReader("C:\\JavaDev\\고객.txt");
			String data = "";
			int i = 0;
			while((i= in.read()) != -1)
			{
				data += (char)i;
			}
			in.close();
			//System.out.println(data);
			String[] datas = data.split("\n");
			int j = 0;
			for(String s : datas)
			{
				String[] cust = s.split(",");
				CustomerVO vo = new CustomerVO();
				vo.setCustomer_id(cust[0]);
				vo.setLogin_id(cust[1]);
				vo.setPwd(cust[2]);
				vo.setName(cust[3]);
				vo.setEmail(cust[4]);
				vo.setPhone(cust[5]);
				vo.setLoc(cust[6]);
				vo.setRegdate(cust[7]);
				vo.setGrade(cust[8]);
				customers[j] = vo;
				j++;
				
			}
		} catch (Exception ex) {}
	}
	
	  //기능
	 //1. 로그인 => equals 이용
	 public String isLogin(String id,String pwd)
	 {
		 String name ="";
		 String result = "";
		 int count = 0;
		 for(CustomerVO vo : customers)
		 {
			 if(vo.getLogin_id().equals(id))
			 {
				 count = 1; //아이디가 있으면 1
				 name = vo.getName();
				 break;
			 }
		 }
		 
		 if(count == 0) // 아이디가 존재 X
		 {
			 result = "NOID";
		 }
		 else //아이디가 존재 O
		 {
			 count = 0;
			 
			 login:
			 for(CustomerVO vo : customers)
			 {
				 if(vo.getLogin_id().equals(id))
				 {
					 if(vo.getPwd().equals(pwd))
					 {
						 count = 1;
						 break login;
					 }
				 }
			 }
			 
			 if(count == 0)
			 {
				 result = "NOPWD";
			 }
			 else
			 {
				 result = "OK|"+name; // OK면 세션에 저장
			 }
		 }
		 return result;
	 }
	 public static void main(String[] args) {
//		CustomerDataCollection cdc = new CustomerDataCollection();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("아이디 입력: ");
//		String id = scan.next();
//		
//		System.out.print("비밀번호 입력: ");
//		String pwd = scan.next();
//		
//		
//		String res = cdc.isLogin(id, pwd);
//		
//		if(res.equals("NOID"))
//		{
//			System.out.println("아이디가 존재하지 않습니다");
//		}
//		else if(res.equals("NOPWD"))
//		{
//			System.out.println("비밀번호가 틀립니다");
//		}
//		else
//		{
//			System.out.println("로그인 되었습니다!!");
//		}
		CustomerDataCollection cdc = new CustomerDataCollection();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("페이지 입력: ");
		int page = scan.nextInt();
		CustomerVO[] cust = cdc.customerListData(page);
		for(CustomerVO vo : cust)
		{
			System.out.println(
					vo.getCustomer_id() + " "
					+ vo.getLogin_id() + " "
					+ vo.getName() + " "
					+ vo.getEmail() + " "
					+ vo.getPhone() + " "
					+ vo.getLoc() + " "
					+ vo.getGrade()
					);
		}
	}
	 
	 // 2. 목록 => 페이지 나누기
	 public int customerTotalPage()
	 {
		 return (int)(Math.ceil(customers.length/10.0));
	 }
	 public CustomerVO[] customerListData(int page)
	 {
		 int totalpage = customerTotalPage();
		 int row = 10;
		
		 //마지막 페이지 설정
		 if(totalpage == page && customers.length % 10 > 0)
		 {
			 row = customers.length % 10;
		 }
		 
		 CustomerVO[] cust = new CustomerVO[row];
		 
		 //배열에 값을 채운다
		 int j = 0; //10개씩 나눠주는 변수
		 int pagecnt = (page*row) - row; //페이지 시작점
		 /*
		  *  1page = 0~9
		  *  2page = 10~19
		  *  3page = 20~29
		  */
		 // => 오라클 사용시 오라클에서 나눠서 저장 => 인라인뷰
		 for(int i = 0 ; i < customers.length ; i++)
		 {
			
			 if(j < 10 && i >= pagecnt)
			 {
				 cust[j] = customers[i];
				
				 j++;
			 }
		 }
		 return cust;
	 }
	 
	 // 3. 검색 => 지역별, 등급별, 등록일  (contains 이용, toUpperCase 이용)
	 
	 // 4. 등록 / 삭제 => Collection
	
}
