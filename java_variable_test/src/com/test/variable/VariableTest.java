package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor; // ��������
		int eng; // ����
		int math; // ����

		String answer = "";
		
		boolean isNumber=false;
		
		// Quiz(3)
		// �ԷµǴ� ���� 0~100������ ������ ����
		// �� class ���� �������� '����Ͻðڽ��ϱ�?(y/n)' �޼����� ����ϰ�,
		// 'n'�϶����� �ݺ�. ��, n�� �ƴϸ� ��� �ݺ���.
		// if ���ڰ��ƴϸ� �ٽ��Է��Ͻʽÿ��� ������.

		while (!answer.equals("n")) {
			System.out.print("��������:");
			int i =0;
			String scoreStr=scan.nextLine();
			char ch = scoreStr.charAt(i);
			
			while(!isNumber){
				if(!(ch>='0' && ch<='9')){
					System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
				
				}
				
			}
			kor = Integer.parseInt(scan.nextLine()); // �Է��ѰŸ� ������ �ٲٴ� �ǵ�, ���� ���ڸ�
														// �Է��ϸ� �Է¾ȵǰ� ����.
			System.out.print("��������:");
			eng = Integer.parseInt(scan.nextLine());
			System.out.print("��������:");
			math = Integer.parseInt(scan.nextLine());

			int total = kor + eng + math; // ���� ( ���� + ���� + ���� )

			float avg = total / 3; // 3 ���� ���

			System.out.println("���� : " + total); // 3���� ���� ���
			System.out.println("��� : " + avg); // 3���� ��� ���

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("���� : " + grade); // ����� 90���̻��̸� A, 80�� �̻��̸� B,
													// 80���̸��̸� F
			String gradeIf = "";
			if (avg >= 90) { // ����� 90�̻��̸�
				gradeIf = "A"; // A
				if (avg >= 95) { // 90�̻��� �߿��� 95�̻��̸�
					gradeIf = gradeIf + "+"; // A+
				}
			} else if (avg >= 80) { // 90�̻� �ƴϰ� 80�̻��̸�
				gradeIf = "B"; // B
				if (avg >= 85) { // ���� 85�̻��̸�
					gradeIf = gradeIf + "+"; // B+
				}
			} else {
				gradeIf = "F"; // �� �ƴϸ� F
			}

			System.out.println("���� : " + gradeIf); // ���
			System.out.println("����Ͻðڽ��ϱ�?(y/n)");
			answer=scan.nextLine().toLowerCase();

		}

	}

}
