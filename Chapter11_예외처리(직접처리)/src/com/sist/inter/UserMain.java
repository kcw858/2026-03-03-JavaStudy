package com.sist.inter;

public class UserMain {
	public static void main(String[] args) {
		Hello hello = new helloImpl();
		hello.sayHello("홍길동");
	}
}
