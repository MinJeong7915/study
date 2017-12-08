package com.test.statement;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int kor;
		int eng;
		int math;
		
		String scoreStr="";
		boolean isNumber = false;
		
		while (true){
		
			while(!isNumber){
				int score =0;
				String msg="";
				
				System.out.print("국어:");
				scoreStr = scan.nextLine();
				
				//숫자형 판단 
				char checkChar=' ';
				for(int i=0;i<scoreStr.length();i++){
					checkChar=scoreStr.charAt(i);
					if(checkChar>'0' && checkChar<='9'){
					  isNumber=false;
					  msg="입력값이 올바르지 않습니다.";
					  break;
					}
				}
				
				//0~100숫자
				
				if(isNumber){
					score=Integer.parseInt(scoreStr);
					if(!(score>=0 && score<=100))
					{
						isNumber=false;
						msg="0~100 사이의 점수를 입력하세요.";
					}			}
				
				if(!msg.isEmpty()) System.out.println(msg);

				}
			
			
		
		kor=Integer.parseInt(scan.nextLine());
		System.out.print("영어:");
		eng=Integer.parseInt(scan.nextLine());
		System.out.print("수학:");
		math = Integer.parseInt(scan.nextLine());
		
		float avg = (kor+eng+math)/3f; //3과목 평균
		
		String grade="";
		switch((int)(avg/10)){ //평균을 10으로 나누고 그걸 정수형으로. 만약 93점이면 10으로 나누면 9임.
		case 10: case 9: //case10과 case9의 결과가 같으므로 break없이 이어서 쓴다.
			grade="A"; // 결과가 9나 10이면 A 출력
			break; //빠져나온다
		case 8: // 결과가 8일경우
			grade="B"; //B출력
			break; //빠져나온다.
		case 7: //7일경우
			grade="C"; //C출력
			break;
		case 6:
			grade="D";
			break;
		default : //그외에는
			grade="F"; //F
		}
		System.out.println("평균 : "+avg);
		System.out.println("학점: " +grade);
		}
}
}