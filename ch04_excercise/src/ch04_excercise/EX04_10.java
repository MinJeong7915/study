package ch04_excercise;

public class EX04_10 {

	public static void main(String[] args) {
		int num =12345;
		int sum = 0;
		
		while(num>0){
			sum += num%10; //첫번째에는 나머지 5
			num = num/10; // 몫 1234
		}
		
		
		System.out.println("sum="+sum);

	}

}
