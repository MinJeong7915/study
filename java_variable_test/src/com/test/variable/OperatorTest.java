package com.test.variable;

public class OperatorTest {

	public static void main(String[] args) {
		
		//���׿�����
		
		int i = 0; //i�� 0���� �ִ´�.
		i = i+1; //++i, i++ �� ���� ��.
		System.out.println("i+1="+(++i)); // �ϳ� ������ �Ŀ� �����ϱ� (1+1 = 2)
		System.out.println("i+1="+(i++)); // �� ������ ���� �����ϴϱ�
		                                  // ������ (2+1 = 3)������ �� �ȿö󰡰� ��. �̰� �� �Ⱦ�.
		
		i=i-1; // --i, i--
		System.out.println("i-1="+i);
		
		/* ��Ȯ�� ��� ���!
		int i=0; 
		i++;
		System.out.println("i="+i);
		*/
		
		// �տ� ++�ٴ°� ���� ������Ű�� �������. �ڿ� ++ ������ ��������� 1 ����.
		
		
		
		
		
		
		
		//���������
		int x=10, y=2; // ������. x�� 10 ����, y�� 2 ����.
		
		char ch='A'; //ch=65�� ��������! ������ char���̴ϱ� 65�� �ƽ�Ű�ڵ� ������ �ٲ㼭 A�� ��.
		
	
		int sum=x+y; // x+y ����� ���������� sum�� ����.
		int sub=x-y; // x-y ����� ���������� sub�� ����.
		int multi=x*y;// x*y ����� ���������� multi�� ����.
		float div = x/(y*1.0f); //y�� int���ε�, 1.0f�� �������ϱ� float�� ��. ���� x/y ���� float�� �̰�, �� ���� div�� ����.
		int mock = x/y; // x/y�� ���� �ǹ�!
		int namuji= x % y; // x/y�� �������� namuji�� ����.
		
		int chSumInt=ch+3; // 65+3
		char chSumInt2=(char)chSumInt; // A+3�̴ϱ� b,c,d �ؼ� D ��µ�
		
		
		System.out.println("x+y = " +sum); // sum ���� ���
		System.out.println("x-y = "+sub);  // sub�� ���
		System.out.println("x*y = "+multi);  // multi�� ���
		System.out.println("x/y = "+div);  // div�� ���
		System.out.println("��:x/y = "+mock);  //mock ���� ���
		System.out.println("������x%y = " +namuji); //������ ���� ���
		
		System.out.println("chSumInt = " +chSumInt); //chSumInt���� ���
		System.out.println("������ : char + int = " +chSumInt2); // chSumint2���� ���
		
		
		

	

		System.out.println("�ݿø�����");		// ���� 1234.56789�� ���� �Ҽ��� ��°�ڸ����� �ݿø��Ͻÿ�.
		
		//hint system.out.println((int)1.452654);
		
		float w=1234.56789f; //w=1234.56789 
		float q = w + 0.005f; // q = 1234.57289
		
		
		q = q*100; //123457.289
		q = (int)q; //123457
		q = q * 1/100; //1234.57
		
		/* double q= ((int)((w+0.005)*100))/100d;   ���ٷ� ���� */
		/* float roundNum = 1234.56789f;
		 roundNum= ((int)((roundNum+0.005f)*100f))/100f; ������Ǯ��
		 */
		
		
		
		System.out.println(w);
		System.out.println(" 1234.56789 �� �Ҽ��� ��°�ڸ����� �ݿø��ϸ� : "+q); // q�� ���
		
		
		
		
		
		
		//�񱳿����� True/False�� ����.
		System.out.println("x > y : "+ (x>y)); // x>y���� �� �� t/f ���
		System.out.println("x >= y : "+ (x>=y)); // x>=y���� �� �� t/f ���
		System.out.println("x < y : "+ (x<y)); // x<y���� �� �� t/f ���
		System.out.println("x <= y : "+ (x<=y)); // x<=y ���� �� �� t/f ���
		System.out.println("x == y : "+ (x==y)); //x�� y ������ �� �� t/f ���
		System.out.println("x != y : "+ (x != y)); // x�� y�� �ٸ��� t, ������ f ���
		
		
		
		
		
		
		//���׿�����
		// (���ǽ�) ? A(true) : B(false)
		//���� 90���̻� A, ������ ����
		
		int kor=92; // ���������� 92���϶�,
		
		System.out.println("������������ : " 
		                     + ((kor>=90)? "A" : "F"));  // ���������� 90�� �̻��̸� A, 90�̸��̸� F ���.
		
		
		
		
		
		
		
		//��������
		
		int k=9;  // k�� 9�Է�,
		int l=10;  // l�� 10 �Է�
		
		System.out.println(k>9 && (l=11)>10); // k>9�̸� false�̹Ƿ� �����κ��� �������� �ʱ� ������ l=11�� �ȵ�.
		System.out.println(l); // l = 10
		System.out.println(k>=9 && (l=11)>10); // k�� true�̹Ƿ� �����κ��� ������. ���� l���� 11���� ��.
		System.out.println(l); // l=11
		
		l=10; // l�� �ٽ� 10�� �ְ�,
		
		System.out.println(k>=9 || (l=11)>10); // k�κ��� true�̹Ƿ� �ڿ��� ������ϱ� ������ l=10
		System.out.println(l); //l = 10
		
		
		
		
		
		//�Ҵ翬����. ���Կ�����
		int m=0; // m=0 ����
		m=m+1;  // m���ٰ� m+1�� ����. ��, 0+1 = 1
		m=m+1;m=m+1;m=m+1; // 1+1=2, 2+1=3, 3+1=4. ��, 4�� ��µ�.
		
		System.out.println(m); //m=4
		
		m=0; //m=0���� �����ϰ�,
		m += 1; //1�� ���ϴ� ����. �ٵ� �̰� ������ �������� ���������ϱ� ������
		System.out.println(m); // m=1 ��µ�.
		
		

		
		
	

	}

}
