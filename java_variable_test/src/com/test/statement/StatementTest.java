package com.test.statement;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int kor;
		int eng;
		int math;
		
		String scoreStr="";
		boolean isNumber = false;
		
		while (true){
		
			while(!isNumber){
				int score =0;
				String msg="";
				
				System.out.print("����:");
				scoreStr = scan.nextLine();
				
				//������ �Ǵ� 
				char checkChar=' ';
				for(int i=0;i<scoreStr.length();i++){
					checkChar=scoreStr.charAt(i);
					if(checkChar>'0' && checkChar<='9'){
					  isNumber=false;
					  msg="�Է°��� �ùٸ��� �ʽ��ϴ�.";
					  break;
					}
				}
				
				//0~100����
				
				if(isNumber){
					score=Integer.parseInt(scoreStr);
					if(!(score>=0 && score<=100))
					{
						isNumber=false;
						msg="0~100 ������ ������ �Է��ϼ���.";
					}			}
				
				if(!msg.isEmpty()) System.out.println(msg);

				}
			
			
		
		kor=Integer.parseInt(scan.nextLine());
		System.out.print("����:");
		eng=Integer.parseInt(scan.nextLine());
		System.out.print("����:");
		math = Integer.parseInt(scan.nextLine());
		
		float avg = (kor+eng+math)/3f; //3���� ���
		
		String grade="";
		switch((int)(avg/10)){ //����� 10���� ������ �װ� ����������. ���� 93���̸� 10���� ������ 9��.
		case 10: case 9: //case10�� case9�� ����� �����Ƿ� break���� �̾ ����.
			grade="A"; // ����� 9�� 10�̸� A ���
			break; //�������´�
		case 8: // ����� 8�ϰ��
			grade="B"; //B���
			break; //�������´�.
		case 7: //7�ϰ��
			grade="C"; //C���
			break;
		case 6:
			grade="D";
			break;
		default : //�׿ܿ���
			grade="F"; //F
		}
		System.out.println("��� : "+avg);
		System.out.println("����: " +grade);
		}
}
}