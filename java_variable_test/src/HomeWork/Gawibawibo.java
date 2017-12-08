package HomeWork;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		
		while(true){
			
			System.out.println("가위바위보 게임");
			System.out.println("[1]가위");
			System.out.println("[2]바위");
			System.out.println("[3]보");
			System.out.print(" 셋 중 하나를 입력하시오 : ");
			
			Scanner sc = new Scanner(System.in);
			int you = sc.nextInt();
			System.out.println("입력한 값은 : "+you);
			
			int com = (int)(Math.random()*3+1);
			System.out.println("컴퓨터가 낸 값은 :"+com);
			
			if (you==1){ //내가 가위를 낸 경우
				if (com ==1){
					System.out.println("Draw");
				} else if (com ==2) {
					System.out.println("Lose~");
				} else if (com ==3) {
					System.out.println("You win!");
				}
			} else if (you==2){ //내가 바위를 낸 경우
				if (com ==1){
					System.out.println("You win!");
				} else if (com ==2) {
					System.out.println("Draw");
				} else if (com ==3) {
					System.out.println("Lose~");
				}
			} else if (you==3){ //내가 보를 낸 경우
				if (com ==1){
					System.out.println("Lose~");
				} else if (com ==2) {
					System.out.println("You win!");
				} else if (com ==3) {
					System.out.println("Draw");
				}
			} else{
				
				System.out.println("잘못입력했습니다. 다시 실행 합니다.");
			continue;
			} 
			
			
			System.out.print("다시 하시겠습니까? (Y) : ");
			Scanner s = new Scanner(System.in);
			String replay = s.nextLine();
			
			if (replay.equals("y")){
				
			} else{
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
	}


}
