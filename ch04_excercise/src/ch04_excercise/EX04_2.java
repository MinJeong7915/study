package ch04_excercise;

public class EX04_2 {

	public static void main(String[] args) {
		//1부터 20까지의 정수 중 2또는 3의 배수가 아닌수의 총합?


		int sum=0;
		
		for(int i=1;i<21;i++){
			if((i%2!=0)&&(i%3!=0)){
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}

}
