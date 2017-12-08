package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor; // 국어점수
		int eng; // 영어
		int math; // 수학

		String answer = "";
		
		boolean isNumber=false;
		
		// Quiz(3)
		// 입력되는 값은 0~100사이의 정수만 가능
		// 이 class 에서 마지막에 '계속하시겠습니까?(y/n)' 메세지를 출력하고,
		// 'n'일때까지 반복. 즉, n이 아니면 계속 반복함.
		// if 숫자가아니면 다시입력하십시오로 나오게.

		while (!answer.equals("n")) {
			System.out.print("국어점수:");
			int i =0;
			String scoreStr=scan.nextLine();
			char ch = scoreStr.charAt(i);
			
			while(!isNumber){
				if(!(ch>='0' && ch<='9')){
					System.out.println("올바른 입력이 아닙니다.");
				
				}
				
			}
			kor = Integer.parseInt(scan.nextLine()); // 입력한거를 정수로 바꾸는 건데, 만약 문자를
														// 입력하면 입력안되게 설정.
			System.out.print("영어점수:");
			eng = Integer.parseInt(scan.nextLine());
			System.out.print("수학점수:");
			math = Integer.parseInt(scan.nextLine());

			int total = kor + eng + math; // 총합 ( 국어 + 영어 + 수학 )

			float avg = total / 3; // 3 과목 평균

			System.out.println("총점 : " + total); // 3과목 총합 출력
			System.out.println("평균 : " + avg); // 3과목 평균 출력

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("학점 : " + grade); // 평균이 90점이상이면 A, 80점 이상이면 B,
													// 80점미만이면 F
			String gradeIf = "";
			if (avg >= 90) { // 평균이 90이상이면
				gradeIf = "A"; // A
				if (avg >= 95) { // 90이상인 중에서 95이상이면
					gradeIf = gradeIf + "+"; // A+
				}
			} else if (avg >= 80) { // 90이상 아니고 80이상이면
				gradeIf = "B"; // B
				if (avg >= 85) { // 그중 85이상이면
					gradeIf = gradeIf + "+"; // B+
				}
			} else {
				gradeIf = "F"; // 다 아니면 F
			}

			System.out.println("학점 : " + gradeIf); // 출력
			System.out.println("계속하시겠습니까?(y/n)");
			answer=scan.nextLine().toLowerCase();

		}

	}

}
