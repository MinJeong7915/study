package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		int sum=0; //sum 선언.
		for(int i=1; i<11; i++) { //i=1부터 10까지 1씩 키움.
			sum+=i;  // sum에다가 1씩 증가하는 값을 더해줌. 즉, 1+2+3+4+5+6+7+8+9+10
		}
		System.out.println(sum); //출력
		
		
		
		
		// 1+(1+2)+(1+2+3)+...(1+2+3+....+10)
		sum=0; //sum 초기화.
		int sumPlus=0; //변수선언
		for(int j=1; j<11; j++) { //j=1부터 10까지 1씩 키움
			sum+=j;
			sumPlus+=sum; 
			
			//1회시행 : (1,1), 2회시행 : (1+2,1+1+2), 3회시행 : (1+2+3, 1+1+2+1+2+3) ... 이렇게 수행됨.
		}
		System.out.println(sumPlus);
		
		
		
		//while
		Scanner scan=new Scanner(System.in);
		while(!scan.nextLine().equals("y")){  
			//입력한 글자가(nextline) y랑 같지(equals) 않으면(!) 반복한다.
			System.out.println("y를 누르기전까지 반복합니다.");
		}
		
	
	
	
	}

}
