package ch04_excercise;

public class EX04_10 {

	public static void main(String[] args) {
		int num =12345;
		int sum = 0;
		
		while(num>0){
			sum += num%10; //ù��°���� ������ 5
			num = num/10; // �� 1234
		}
		
		
		System.out.println("sum="+sum);

	}

}
