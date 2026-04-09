package com.sist.thread;

import java.util.concurrent.*;
public class Service_2 {
	//메모리 낭비 금지
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//ExecutorService ex = Executors.newFixedThreadPool(20);
		
//		ex.submit(() -> System.out.println("A"));
//		ex.submit(() -> System.out.println("B"));
//		ex.shutdown();
		
//		for(int i = 1; i <= 10 ; i++)
//		{
//			int n = i;
//			ex.submit(()->System.out.println("작업"+n));
//		}
//		ex.shutdown();
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> result = ex.submit(()->10+20);
		
		//쓰레드 실행값을 받는 경우
		System.out.println(result.get());
		ex.shutdown();
	}

}
