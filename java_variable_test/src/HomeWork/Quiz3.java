package HomeWork;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// Quiz(3)
		// �ԷµǴ� ���� 0~100������ ������ ����
		// if ���ڰ��ƴϸ� �ٽ��Է��Ͻʽÿ��� ������.
		Scanner scan = new Scanner(System.in);

while(true){
	
		int kor; // ��������
		int eng; // ����
		int math; // ����	

		System.out.print("��������:");
		kor = Integer.parseInt(scan.nextLine());
		if(kor>=0 && kor<101){
		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�. 0~100 ������ ���� �Է��ϼ���");
			continue;	
		 }
			
		System.out.print("��������:");
		eng = Integer.parseInt(scan.nextLine());
		if(eng>=0 && eng<101){	
		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�. 0~100 ������ ���� �Է��ϼ���");
			continue;	
		 }
		
		System.out.print("��������:");
		math = Integer.parseInt(scan.nextLine());
		if(math>=0 && math<101){
		 } else{
			 System.out.println("�߸��Է��Ͽ����ϴ�. 0~100 ������ ���� �Է��ϼ���");
			 continue;	 
		 }
		
		

		int total = kor + eng + math; // ���� ( ���� + ���� + ���� )
	
		float avg = total / 3; // 3 ���� ���
		
		System.out.println("���� : " + total); // 3���� ���� ���
		System.out.println("��� : " + avg); // 3���� ��� ���

		
		char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
		System.out.println("���� : " + grade); // ����� 90���̻��̸� A, 80�� �̻��̸� B, 80���̸��̸� F
		String gradeIf = "";
		if (avg >= 90) { //����� 90�̻��̸�
			gradeIf = "A"; //A
			if (avg >= 95) { //90�̻��� �߿��� 95�̻��̸�
				gradeIf = gradeIf + "+"; //A+
			}
		} else if (avg >= 80) { //90�̻� �ƴϰ� 80�̻��̸�
			gradeIf = "B"; //B
			if (avg >= 85) { //���� 85�̻��̸�
				gradeIf = gradeIf + "+"; //B+
			}
		} else {
			gradeIf = "F"; //�� �ƴϸ� F
		}

		System.out.println("���� : " + gradeIf); // ���
		
		
		System.out.println("�ٽ� �Ͻðڽ��ϱ�?(y):");
		Scanner sc = new Scanner(System.in);
		String re = sc.nextLine();
		
		if(re.equals("y")){
			
		} else {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}

		
}
	}

}


