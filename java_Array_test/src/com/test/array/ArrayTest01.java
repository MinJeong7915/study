package com.test.array;

public class ArrayTest01 {

	int x=30;//Ŭ������ x ����
	
		{
			int x=10000000;
			//int x;
			System.out.println(x); // �������� x ���. ��, x=1000000
			 //���� �� �κп� x=1000000�� ���ٸ� ���������� 30�� ��µ�.
			{
				//int x; 
				int y; //y����
				{
				  //int x; �ߺ���	
				}
				
			}
			
			{
				int y; //���� �ٸ� ������ �ֱ⶧���� y���� ������ ���� ����.
			}
		}
		
		
		
		public static void main(String[] args) {
		
		
		
		int[] intArray = new int[5]; // ������ 5���� intArray��� �迭�� ����.
		intArray[0] = 1; //ù��° ������ 1����
		intArray[1] = 2; //�ι�° ������ 2����
		intArray[2] = 3; //����° ������ 3����
		intArray[3] = 4; //�׹�° ������ 4����
		intArray[4] = 5; //�ټ���° ������ 5����

		int[] intArray2 = { 1, 2, 3, 4, 5 }; //������ 5���� intArray2 �迭�� ����� �Ͱ� ���ÿ� �� �Ҵ�.

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };// �����ִ� intArray�� �ƴ϶� ���ο�迭�� �Ҵ�. (�� ����)

		int[] intArray4 = new int[100]; // 0~99������ �ε��� ������ ���� �迭.

		for (int index = 0; index < intArray4.length; index++) { //index���� 0���� 'intArray4�� ����'(100)���� 1�� ������Ų��.
			intArray4[index] = index + 1; 
			//intArray4[0] = 0+1 �� �����ؼ� index�� ���� 99�� �ɶ����� ���� +1�� �ؼ� ������. 
		}
		
		
		//1,2,3,4,5,6,7,8,9,10
		//11,12,.... �÷� ���
		for(int index=0;index<intArray4.length;index++){ //index���� 0���� 'intArray4�� ����'(100)���� 1�� ������Ų��.
		System.out.print(intArray4[index]); //�迭�� ���� �����ϸ鼭 ����Ѵ�.
		
		if (intArray4[index] % 10 != 0) { //���� �迭�� ����� ���� 10�� ����� �ƴ϶��
			System.out.print(","); //,�� ����ϰ�
		} else {
			System.out.println(); //10�� ������ ���� ����.
		}}
		
		
		//���� �ڵ��� ���׿����ڷ� �����ϰ� �ٿ�����
		for(int index=0;index<intArray4.length;index++){ //index���� 0���� 'intArray4�� ����'(100)���� 1�� ������Ų��.
			System.out.print(intArray4[index]); //�迭�� ���� �����ϸ鼭 ����Ѵ�.
			System.out.print(((intArray4[index]%10)!=0)? ",":"\n"); // �迭�� ����� ���� 10�� ����� �ƴϸ� �� �ڿ� ',' �� ���̰�,
			// 10�ǹ���̸� ���ٶ�� ����Ѵ�.
		}
		
		
		
		//2�����迭 ( �� * �� ) : �迭 �ȿ� �迭�� �ִ�.
		int[][] intArrays = new int[3][3]; //3�� 3�� - 3��¥�� �迭 �������� 3�� ��.
		
		int[][] intArrays2={ //3�� 3���� 2���� �迭�ȿ� ���� �������ش�.
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int[][] scoreTable={  //5�� 3���� 2���� �迭 �ȿ� ���� �������ش�.
				{100, 100, 100},
				{ 20,  20,  20},
				{ 30,  30,  30},
				{ 40,  40,  40},
				{ 50,  50,  50}
		};
		
		//���� scoretable �迭���� ������ avg�� ����϶�.
		//hint! (3,1) => scoreTable[3][1] 
		
		for(int i=0;i<5;i++){ // i(��)�� 0���� 4���� 1�� ������.
			int sum =0; //sum�̶�� ������ 0���� �ʱ�ȭ.
			for(int j=0;j<3;j++){ // j(��)�� 0���� 2���� 1�� ������.
				sum += scoreTable[i][j]; //��, (0,0),(0,1),(0,2)... �� ��µǴ� �迭���� sum�� �����ָ鼭 ����.
			}
			float avg = sum/3f; // sum�� 3���� ����� avg��հ��� ����.
			System.out.println(avg); //��� ���
		}
		
		//���� ��������. �������ڵ�
		int total=0; //total�̶�� ������ 0���� ����.
		for(int row=0; row<scoreTable.length; row++){ //row(��)�� 0���� scoretable�� ������ 4���� 1��������.
			total=0; //total 0���� �ʱ�ȭ
			for(int col=0;col<scoreTable[row].length;col++){ //col(��)�� 0���� '���� ���� ����'���� 1�� ������. ���⿡���� 2���� ����.
				total+=scoreTable[row][col]; //total = total+(�� �迭�� ����� ��)
			}
			System.out.println((row+1)+"�� �л����:"+(total*1f/scoreTable[row].length));
			//���� ���� '���ǿ��Ǳ���'�� ����.
		}
		

		
		//��������� ���غ���.

		int korTotal=0; //��������� ���� ��������
		int engTotal=0;//��������� ���� ��������
		int mathTotal=0;//���а����� ���� ��������
		for(int row=0; row<scoreTable.length; row++){ //row(��)�� 0���� ���̺��� ������ 4���� 1������.
			
				korTotal+=scoreTable[row][0]; //���������� ������ (0,0),(1,0),(2,0)...(4,0)������ �迭�� ���� �����ָ鼭 ����.
				engTotal+=scoreTable[row][1];//���������� ������ (0,1),(1,1),(2,1)...(4,1)������ �迭�� ���� �����ָ鼭 ����.
				mathTotal+=scoreTable[row][2];//���������� ������ (0,2),(1,2),(2,2)...(4,2)������ �迭�� ���� �����ָ鼭 ����.
			}

		System.out.println("���� ���:"+korTotal/5f); //���������� �� ���� 5�� ���� ��հ� ���.
		System.out.println("���� ���:"+engTotal/5f);//���������� �� ���� 5�� ���� ��հ� ���.
		System.out.println("���� ���:"+mathTotal/5f);//���������� �� ���� 5�� ���� ��հ� ���.
	
	
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	