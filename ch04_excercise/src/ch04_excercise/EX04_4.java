package ch04_excercise;

public class EX04_4 {

	public static void main(String[] args) {
	
		
		int i=0;
		int sum=0;
		
		while(sum<100){
			i++;
			sum = ((sum%2)==0)? i*(-1) : i;
		}
		
		System.out.println(sum);
	

		
	}

}
