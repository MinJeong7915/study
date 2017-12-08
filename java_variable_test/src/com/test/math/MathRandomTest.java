package com.test.math;

public class MathRandomTest {

	public static void main(String[] args) {

		 //0<=Math.random()<1 인 임의의 실수
		System.out.println(Math.random());

		
		//1~10사이의 임의의 정수
		int randomInt=(int)(Math.random()*10+1); //원래 0~10인데, 이거 하면 1~11 이니까 그 사이 값 나옴.
		System.out.println(randomInt);
		
		
		//이걸로 업다운게임 만들어 1~100사이 값,.
		/*
	   
		Scanner scan = new scanner(system.in)
		int 
		int 
		int max = 100;
		int min =1;
		int count =0;
		
		
		
		//////가위바위보게임
		 scanner scan 
		 string[]
		 
		 가위 , 바위, 보, 선택 1,2,3번중에서 .
		 종료 Q.
		 이상한거 누르면 잘못입력하셨다고 나와야됨.
		 
		 가위바위보를 stream으로 비교하겠다고 생각한순간 if문이 27개 나옴  이렇게 하지마
		 
	
		
		
		*/
		
	}

}
