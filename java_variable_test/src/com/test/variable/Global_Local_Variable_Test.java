package com.test.variable;

public class Global_Local_Variable_Test {

	static int x=10; //클래스에 x=10 선언
	
	public static void main(String[] args) {
		
		int x=10000; //x=10000 선언.
		
		System.out.println(x); //지역변수인 x=10000이 출력됨.
		//만약 지역변수가 없다면 전역변수가 나옴.
		

	}

}
