package ch04_excercise;

public class EX04_2 {

	public static void main(String[] args) {
		//1���� 20������ ���� �� 2�Ǵ� 3�� ����� �ƴѼ��� ����?


		int sum=0;
		
		for(int i=1;i<21;i++){
			if((i%2!=0)&&(i%3!=0)){
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}

}
