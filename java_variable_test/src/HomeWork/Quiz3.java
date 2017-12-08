package HomeWork;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// Quiz(3)
		// 입력되는 값은 0~100사이의 정수만 가능
		// if 숫자가아니면 다시입력하십시오로 나오게.
		Scanner scan = new Scanner(System.in);

while(true){
	
		int kor; // 국어점수
		int eng; // 영어
		int math; // 수학	

		System.out.print("국어점수:");
		kor = Integer.parseInt(scan.nextLine());
		if(kor>=0 && kor<101){
		} else {
			System.out.println("잘못입력하였습니다. 0~100 사이의 수를 입력하세요");
			continue;	
		 }
			
		System.out.print("영어점수:");
		eng = Integer.parseInt(scan.nextLine());
		if(eng>=0 && eng<101){	
		} else {
			System.out.println("잘못입력하였습니다. 0~100 사이의 수를 입력하세요");
			continue;	
		 }
		
		System.out.print("수학점수:");
		math = Integer.parseInt(scan.nextLine());
		if(math>=0 && math<101){
		 } else{
			 System.out.println("잘못입력하였습니다. 0~100 사이의 수를 입력하세요");
			 continue;	 
		 }
		
		

		int total = kor + eng + math; // 총합 ( 국어 + 영어 + 수학 )
	
		float avg = total / 3; // 3 과목 평균
		
		System.out.println("총점 : " + total); // 3과목 총합 출력
		System.out.println("평균 : " + avg); // 3과목 평균 출력

		
		char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
		System.out.println("학점 : " + grade); // 평균이 90점이상이면 A, 80점 이상이면 B, 80점미만이면 F
		String gradeIf = "";
		if (avg >= 90) { //평균이 90이상이면
			gradeIf = "A"; //A
			if (avg >= 95) { //90이상인 중에서 95이상이면
				gradeIf = gradeIf + "+"; //A+
			}
		} else if (avg >= 80) { //90이상 아니고 80이상이면
			gradeIf = "B"; //B
			if (avg >= 85) { //그중 85이상이면
				gradeIf = gradeIf + "+"; //B+
			}
		} else {
			gradeIf = "F"; //다 아니면 F
		}

		System.out.println("학점 : " + gradeIf); // 출력
		
		
		System.out.println("다시 하시겠습니까?(y):");
		Scanner sc = new Scanner(System.in);
		String re = sc.nextLine();
		
		if(re.equals("y")){
			
		} else {
			System.out.println("프로그램을 종료합니다.");
			break;
		}

		
}
	}

}


