package com.test.statement;

import java.util.Scanner;

public class SwitchTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // system�ȿ� �Է°��� �����ϰ� �װ� scan���ٰ�
												// ����.

		 // �� scan�� menu�� �޴´�.
		String[] idArray = new String[100]; // id�� ������ְ� �Է��� id�� ������ �迭 ����
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";

		String[] pwArray = new String[100]; // pw�� ������ְ� �Է��� pw�� ������ �迭 ����
		pwArray[0] = "mimi";
		pwArray[1] = "mama";
		pwArray[2] = "mumu";
		

		while (true) {
			System.out.println("*** ���� ���� ���α׷� ***"); // �����������α׷� ���� ���
			System.out.println("[1]�α���"); // [1]�α��� ���
			System.out.println("[2]ȸ������"); // [2]ȸ������ ���
			System.out.println("[3]���̵�/�н�����ã��"); // [3]���̵�/�н�����ã�� ���
			System.out.println("[4]����"); // [4]���� ���
			System.out.print("�޴��� �����ϼ���._"); // �޴��� �����ϼ��� ���
			String menu = scan.nextLine();
			String msg = ""; // msg���� ����

			// 12��5�� ����
			// ���̵�/�н�����
			// mimi/mimi
			// mama/mama
			// mumu/mumu
			// switchtest class ���� ����!
			// 1�� ������ ���̵�, �н����� �Է��ϴ� â ��. �����ϰ� �ٽ� ùȭ������.
			// 2�� ������ ������ ���̵�, �н����� ����� �����̵ȴ�. �׸��� �ٽ� ùȭ������ . �װɷ� �α����ϸ� �α��ε�.
			// ����
			// ���̵� ���ġ�� �����ߴٰ� �ϰ� �ٽ� ùȭ������.
			// �迭�̿��ؼ� ���̵�� ���
			// ���̵� �����ϴ� 1���� �迭, ��������ϴ� 1���� �迭
			// string[] idArray = new String[100];
			// String[] pwdArray = new String[100];

			
			switch (menu) { // switch
			case "1": // 1����������

				System.out.println("�α����� �����ϼ̽��ϴ�.");

				System.out.println("���̵� �Է��ϼ���:");
				String id = scan.nextLine(); // ���̵� �Է¹���

				System.out.println("��й�ȣ�� �Է��ϼ���:");
				String pw = scan.nextLine(); // ��� �Է¹���

				for (int i = 0; i < 3; i++) {
					if ((idArray[i].equals(id)) && (pwArray[i].equals(pw))) {
						System.out.println("�α��ο� �����Ͽ����ϴ�.");
						break;
					} else {
						System.out.print("");
						if (i == 2) {
							System.out.println("�α��ο� �����Ͽ����ϴ�.");
						}
					}
				} // for�� ����
				break; // case 1 ����

			case "2": // 2����������
				System.out.println("ȸ�������� �����ϼ̽��ϴ�.");

				System.out.println("���̵�:");
				String id2 = scan.nextLine(); // ���̵� �Է�

				System.out.println("��й�ȣ:");
				String pw2 = scan.nextLine(); // ����Է�

				// �Է��� id�� pw�� �迭�ӿ� ����Ǿߵȴ�.
			
				for (int i = 0; i < 100; i++) { ///////////i=3���� ���ڱ����� �ٲ㼭 �ٽ��غ���.
					if(idArray[i].equals(id2)){ //�Է°��� �ȿ� ����ִ� ���� ������
						System.out.println("�ߺ��� ���̵��Դϴ�.");
						break;
					} else if (idArray[i].isEmpty()){//����ִٸ�
					} 
					idArray[i] = id2;
				}
				break; // ��������

			case "3": // 3 ���������
				msg = "���̵�/�н�����ã�⸦ �����ϼ̽��ϴ�.";
				break;// �޼����� msg�� ����
			case "4": // 4���������
				msg = "���α׷��� �����մϴ�.."; // �޼����� msg�� ����
				System.out.println(msg); // msg ���
				return;
			default: // �׿��� ���
				msg = "�޴������� �ùٸ��� �ʽ��ϴ�."; // msg���

			}
		} // while ����

	}

}
