package com.test.statement;

public class ForstatementTest2 {

	public static void main(String[] args) {

		System.out.println("1~10���� ¦���� ���Ͻÿ�.");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("������ ������ : " + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

		System.out.println("2�� �������� �ۼ��Ͻÿ�");
		int ans = 0;
		for (int j = 1; j < 10; j++) {
			System.out.print("2x" + j + "=");
			ans = 2 * j;
			System.out.println(ans);
		}

		System.out.println("2�ܱ����� �������ڵ�");
		int dan = 2;
		for (int gop = 1; gop < 10; gop++) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
		}
		System.out.println();

		System.out.println("������");
		for (int dan1 = 2; dan1 < 10; dan1++) {
			for (int gop1 = 1; gop1 < 10; gop1++) {
				System.out.println(dan1 + "*" + gop1 + "=" + dan1 * gop1);
			}
		}

		System.out.println("�� ���");
		int s = 0;
		for (int star = 1; star < 11; star++) {
			for (s = 1; s < star + 1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		//���Ųٷ���� ���� �Ϸ����� �̻�. �ٽ�
		/*
		 * System.out.println("�� �Ųٷ� ���");
		 * 
		 * int s1=0; for ( int star1 = 1; star1<11; star1++) { for (s1 = 10;
		 * s1>10-s1+1; s1--){ System.out.print("*"); } System.out.println( ); }
		 */

		//�� �Ųٷ� ��� �����Բ�
		char symbol = '*';
		int rows = 10;
		for (int roww = 1; roww < rows + 1; roww++) {
			for (int numm = 1; numm < rows - roww + 2; numm++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

		
		//1���� ������� �ﰢ������ ��Ÿ���� �ϴ°� . 1, 23,456,78910 �̷���
		
		
		
		
		
		
		
		
		
		
	}

}
