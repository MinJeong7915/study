package com.string.test;

public class StringTest {

	public static void main(String[] args) {
	
		String msg="�ݰ����ϴ�.";
		
		System.out.println(msg);
		System.out.println("���ڿ�����:" +msg.length());
		System.out.println("���ڿ��� :" +msg.equals("�ٹٹ�"));
		//msg��� ���� ���ڿ��� �Էµ� ���ڿ� ���ݾ� ���ڰ� �Ȱ����� Ȯ��.

		System.out.println("����Ž�� :" +msg.contains("�ݰ�"));
		//msg��� ���ڿ��� �ݰ��� ���ԵǾ� �ִ��� T/F
		
		System.out.println("�� �ε��� ��ȯ :" +msg.indexOf("�ϴ�"));
		// ��(0) ��(1) ��(2) ��(3) ��(4) '��'�� �ε����� 3�̹Ƿ� 3���
		
		System.out.println("index�� ���� ��ȯ:"+msg.charAt(2));
		//��
		
		System.out.println("���ڿ� Ȯ��:"+msg.isEmpty());
		//���ڿ��̸� true, �� ���� �ƴϸ� false
		
		System.out.println("���ڿ���ü:" +msg.replace("�ݰ���", "������") );
		//�����մϴ�. �� �ٲ�.
		
		System.out.println("���ڿ� �߶󳻱�:"+msg.substring(0,3));
		//0���� 2���� ��, ��,��,���� �����.
		
		System.out.println("�빮�ں�ȯ:"+msg.toUpperCase());
		//�빮�ڷ�
		
		System.out.println("�ҹ��ں�ȯ:"+msg.toLowerCase());
		
		
		
		////��������� �𸣰�. .
		boolean isNumber= true; //number is'�̴�'.
		
		msg="12e45624";
		for(int index=0; index<msg.length();index++){
			System.out.println(msg.charAt(index)); // �� �� �� �� �� . �ѱ��ھ� �̾ƿ�.
			char ch=msg.charAt(index);
 
			if(!(ch>=48 && ch<=57)){  //�ƽ�Ű������ �ٲ�ϱ� �̰� �������� �����ִ°���. 
				//! �ٿ����Ƿ� ���ڰ� �ƴҶ�!!
				isNumber=false;
				}
		} 
		System.out.println(isNumber?"����":"���ڰ� �ƴ�");
		
	    ///�̱���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
