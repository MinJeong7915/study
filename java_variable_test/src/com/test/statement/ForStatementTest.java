package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		int sum=0; //sum ����.
		for(int i=1; i<11; i++) { //i=1���� 10���� 1�� Ű��.
			sum+=i;  // sum���ٰ� 1�� �����ϴ� ���� ������. ��, 1+2+3+4+5+6+7+8+9+10
		}
		System.out.println(sum); //���
		
		
		
		
		// 1+(1+2)+(1+2+3)+...(1+2+3+....+10)
		sum=0; //sum �ʱ�ȭ.
		int sumPlus=0; //��������
		for(int j=1; j<11; j++) { //j=1���� 10���� 1�� Ű��
			sum+=j;
			sumPlus+=sum; 
			
			//1ȸ���� : (1,1), 2ȸ���� : (1+2,1+1+2), 3ȸ���� : (1+2+3, 1+1+2+1+2+3) ... �̷��� �����.
		}
		System.out.println(sumPlus);
		
		
		
		//while
		Scanner scan=new Scanner(System.in);
		while(!scan.nextLine().equals("y")){  
			//�Է��� ���ڰ�(nextline) y�� ����(equals) ������(!) �ݺ��Ѵ�.
			System.out.println("y�� ������������ �ݺ��մϴ�.");
		}
		
	
	
	
	}

}
