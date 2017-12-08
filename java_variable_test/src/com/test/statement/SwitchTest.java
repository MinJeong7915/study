package com.test.statement;

import java.util.Scanner;

public class SwitchTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // system안에 입력값을 저장하고 그걸 scan에다가
												// 넣음.

		 // 그 scan을 menu로 받는다.
		String[] idArray = new String[100]; // id가 저장되있고 입력한 id를 저장할 배열 선언
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";

		String[] pwArray = new String[100]; // pw가 저장되있고 입력한 pw를 저장할 배열 선언
		pwArray[0] = "mimi";
		pwArray[1] = "mama";
		pwArray[2] = "mumu";
		

		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***"); // 도서관리프로그램 문구 출력
			System.out.println("[1]로그인"); // [1]로그인 출력
			System.out.println("[2]회원가입"); // [2]회원가입 출력
			System.out.println("[3]아이디/패스워드찾기"); // [3]아이디/패스워드찾기 출력
			System.out.println("[4]종료"); // [4]종료 출력
			System.out.print("메뉴를 선택하세요._"); // 메뉴를 선택하세요 출력
			String menu = scan.nextLine();
			String msg = ""; // msg변수 선언

			// 12월5일 퀴즈
			// 아이디/패스워드
			// mimi/mimi
			// mama/mama
			// mumu/mumu
			// switchtest class 에서 진행!
			// 1번 누르면 아이디, 패스워드 입력하는 창 뜸. 성공하고 다시 첫화면으로.
			// 2번 가입을 누르면 아이디, 패스워드 물어보고 가입이된다. 그리고 다시 첫화면으로 . 그걸로 로그인하면 로그인됨.
			// 없는
			// 아이디 비번치면 실패했다고 하고 다시 첫화면으로.
			// 배열이용해서 아이디와 비번
			// 아이디 저장하는 1차원 배열, 비번저장하는 1차원 배열
			// string[] idArray = new String[100];
			// String[] pwdArray = new String[100];

			
			switch (menu) { // switch
			case "1": // 1선택했을때

				System.out.println("로그인을 선택하셨습니다.");

				System.out.println("아이디를 입력하세요:");
				String id = scan.nextLine(); // 아이디 입력받음

				System.out.println("비밀번호를 입력하세요:");
				String pw = scan.nextLine(); // 비번 입력받음

				for (int i = 0; i < 3; i++) {
					if ((idArray[i].equals(id)) && (pwArray[i].equals(pw))) {
						System.out.println("로그인에 성공하였습니다.");
						break;
					} else {
						System.out.print("");
						if (i == 2) {
							System.out.println("로그인에 실패하였습니다.");
						}
					}
				} // for문 종료
				break; // case 1 종료

			case "2": // 2선택했을때
				System.out.println("회원가입을 선택하셨습니다.");

				System.out.println("아이디:");
				String id2 = scan.nextLine(); // 아이디 입력

				System.out.println("비밀번호:");
				String pw2 = scan.nextLine(); // 비번입력

				// 입력한 id와 pw가 배열속에 저장되야된다.
			
				for (int i = 0; i < 100; i++) { ///////////i=3부터 숫자까지로 바꿔서 다시해볼것.
					if(idArray[i].equals(id2)){ //입력값이 안에 들어있는 값과 같으면
						System.out.println("중복된 아이디입니다.");
						break;
					} else if (idArray[i].isEmpty()){//비어있다면
					} 
					idArray[i] = id2;
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
		} // while 종료

	}

}
