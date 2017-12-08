package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

		String[] idArray = new String[100];
		String[] pwdArray = new String[100];

		idArray[0] = pwdArray[0] = "mimi";
		idArray[1] = pwdArray[1] = "mama";
		idArray[2] = pwdArray[2] = "mumu";

		String inputID = "";
		String inputPWD = "";

		int currentIndex = 3;

		Scanner scan = new Scanner(System.in); // system�ȿ� �Է°��� �����ϰ� �װ� scan���ٰ�
												// ����.

		while (true) {
			System.out.println("*** ���� ���� ���α׷� ***"); // �����������α׷� ���� ���
			System.out.println("[1]�α���"); // [1]�α��� ���
			System.out.println("[2]ȸ������"); // [2]ȸ������ ���
			System.out.println("[3]���̵�/�н�����ã��"); // [3]���̵�/�н�����ã�� ���
			System.out.println("[4]����"); // [4]���� ���
			System.out.print("�޴��� �����ϼ���._"); // �޴��� �����ϼ��� ���
			String menu = scan.nextLine();
			String msg = ""; // msg���� ����

			switch (menu) { // switch
			case "1": // 1����������
				System.out.println("�α����� �����ϼ̽��ϴ�.");
				System.out.println("���̵� �Է��ϼ���:");
				inputID = scan.nextLine();

				int findIndex = -1;
				for (int index = 0; index < currentIndex; index++) {
					if (inputID.equals(idArray[index])) {
						findIndex = index;
						break;
					}
				}
				if (findIndex > -1) {
					System.out.print("�н����� : ");
					inputPWD = scan.nextLine();
					if (inputPWD.equals(pwdArray[findIndex])) {
						System.out.println("�α��ο� �����ϼ̽��ϴ�.");
					} else { // �н����� ����ġ
						System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
					}
				} else {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
				}
				break; // case 1 ����

			case "2": // 2����������
				System.out.println("ȸ�������� �����ϼ̽��ϴ�.\n");

				System.out.print("���̵�:");
				inputID = scan.nextLine();

				if (currentIndex >= idArray.length) { // ������ �迭 ĭ�� �� ä�������
					String[] temp = new String[idArray.length + 20]; // ���� �迭����
																		// 20ĭ ��
																		// �մ°�
																		// ����.
					for (int i = 0; i < idArray.length; i++) {
						temp[i] = idArray[i];
					}

					idArray = temp;

				}

				boolean existID = false;

				for (int i = 0; i < idArray.length; i++) {
					if (idArray[i].equals(inputID)) {
						existID = true;
					}
				}

				if (!existID) {

					System.out.print("��й�ȣ:");
					String pw2 = scan.nextLine(); // ����Է�
					idArray[currentIndex] = inputID;
					pwdArray[currentIndex] = inputPWD;
					currentIndex++;

				} else {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
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
			System.out.println(msg);
		} // while ����

	}

}
