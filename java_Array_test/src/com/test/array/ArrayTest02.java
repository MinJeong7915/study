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

		Scanner scan = new Scanner(System.in); // system안에 입력값을 저장하고 그걸 scan에다가
												// 넣음.

		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***"); // 도서관리프로그램 문구 출력
			System.out.println("[1]로그인"); // [1]로그인 출력
			System.out.println("[2]회원가입"); // [2]회원가입 출력
			System.out.println("[3]아이디/패스워드찾기"); // [3]아이디/패스워드찾기 출력
			System.out.println("[4]종료"); // [4]종료 출력
			System.out.print("메뉴를 선택하세요._"); // 메뉴를 선택하세요 출력
			String menu = scan.nextLine();
			String msg = ""; // msg변수 선언

			switch (menu) { // switch
			case "1": // 1선택했을때
				System.out.println("로그인을 선택하셨습니다.");
				System.out.println("아이디를 입력하세요:");
				inputID = scan.nextLine();

				int findIndex = -1;
				for (int index = 0; index < currentIndex; index++) {
					if (inputID.equals(idArray[index])) {
						findIndex = index;
						break;
					}
				}
				if (findIndex > -1) {
					System.out.print("패스워드 : ");
					inputPWD = scan.nextLine();
					if (inputPWD.equals(pwdArray[findIndex])) {
						System.out.println("로그인에 성공하셨습니다.");
					} else { // 패스워드 불일치
						System.out.println("패스워드가 일치하지 않습니다.");
					}
				} else {
					System.out.println("아이디가 존재하지 않습니다.");
				}
				break; // case 1 종료

			case "2": // 2선택했을때
				System.out.println("회원가입을 선택하셨습니다.\n");

				System.out.print("아이디:");
				inputID = scan.nextLine();

				if (currentIndex >= idArray.length) { // 기존의 배열 칸을 다 채웠을경우
					String[] temp = new String[idArray.length + 20]; // 기존 배열보다
																		// 20칸 더
																		// 잇는거
																		// 만듬.
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

					System.out.print("비밀번호:");
					String pw2 = scan.nextLine(); // 비번입력
					idArray[currentIndex] = inputID;
					pwdArray[currentIndex] = inputPWD;
					currentIndex++;

				} else {
					System.out.println("중복된 아이디 입니다.");
				}

				break; // 빠져나옴

			case "3": // 3 출력햇을때
				msg = "아이디/패스워드찾기를 선택하셨습니다.";
				break;// 메세지를 msg에 대입
			case "4": // 4출력햇을때
				msg = "프로그램을 종료합니다.."; // 메세지를 msg에 대입
				System.out.println(msg); // msg 출력
				return;
			default: // 그외의 경우
				msg = "메뉴선택이 올바르지 않습니다."; // msg출력

			}
			System.out.println(msg);
		} // while 종료

	}

}
