package HomeWork;

import java.util.Scanner;

public class Quiz_6 {

	public static void main(String[] args) {
		//학생 3명의 이름과 국,영,수 점수를 입력받아 각각의 학생의 
		//평균을 출력하는 프로그램을 작성하시오.
		//실행결과
		//1번학생
		//이름 : kim
		//국어 : 65
		//영어:
		//수학
		//2번학생.. 
		//1번 kim 평균 :ㅇㅇ
		//hint 
		
		String[][] studentArray = new String[3][4]; //사람3명, 받을 입력 4개니까 3행4열!
		Scanner scan = new Scanner(System.in);
		
		//입력
		for(int num=1;num<studentArray.length+1;num++){
			System.out.println(num+"번학생");
			
			System.out.println("이름 : ");
			studentArray[num-1][0]=scan.nextLine(); //입력받아서 0번째에 값을 넣어줌.
			
			System.out.println("국어 : ");
			studentArray[num-1][1]=scan.nextLine();
			
			System.out.println("영어 : ");
			studentArray[num-1][2]=scan.nextLine();
			
			System.out.println("수학 : ");
			studentArray[num-1][3]=scan.nextLine();
		}
		
		//출력
		int total=0;
		for(int num=1;num<studentArray.length+1;num++){
			total=Integer.parseInt(studentArray[num-1][1])
					+Integer.parseInt(studentArray[num-1][2])
					+Integer.parseInt(studentArray[num-1][3]);
					System.out.println(num+"번"+studentArray[num-1][0] + 
							"평균:"+(total*1f/(studentArray[num-1].length-1)));
		}


	}

}
