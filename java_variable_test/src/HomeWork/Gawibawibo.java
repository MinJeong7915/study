package HomeWork;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		
		while(true){
			
			System.out.println("���������� ����");
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]��");
			System.out.print(" �� �� �ϳ��� �Է��Ͻÿ� : ");
			
			Scanner sc = new Scanner(System.in);
			int you = sc.nextInt();
			System.out.println("�Է��� ���� : "+you);
			
			int com = (int)(Math.random()*3+1);
			System.out.println("��ǻ�Ͱ� �� ���� :"+com);
			
			if (you==1){ //���� ������ �� ���
				if (com ==1){
					System.out.println("Draw");
				} else if (com ==2) {
					System.out.println("Lose~");
				} else if (com ==3) {
					System.out.println("You win!");
				}
			} else if (you==2){ //���� ������ �� ���
				if (com ==1){
					System.out.println("You win!");
				} else if (com ==2) {
					System.out.println("Draw");
				} else if (com ==3) {
					System.out.println("Lose~");
				}
			} else if (you==3){ //���� ���� �� ���
				if (com ==1){
					System.out.println("Lose~");
				} else if (com ==2) {
					System.out.println("You win!");
				} else if (com ==3) {
					System.out.println("Draw");
				}
			} else{
				
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� ���� �մϴ�.");
			continue;
			} 
			
			
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (Y) : ");
			Scanner s = new Scanner(System.in);
			String replay = s.nextLine();
			
			if (replay.equals("y")){
				
			} else{
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		
	}


}
