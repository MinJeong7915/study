package ch04_excercise;

import java.util.Scanner;

public class EX04_6 {

	public static void main(String[] args) {
	
		//(1,5),(2,4),(3,3),(4,2),(5,1)
		
//		for(int i=1;i<7;i++){
//			for(int j=1;j<7;j++){
//				int sum = i+j;
//				if(sum==6){
//					System.out.println(i+j+sum);
//				}
//			} 
//	
//		}
		
		
		
//		int sum = 6;
//		for (int num1=1; num1<7; num1++){
//			if(num1+sum<7){
//				System.out.println("("+num1+","+(sum-num1)+")");
//		  }
//		}
				
		
// ´Ù½Ã

		
		
		
		
		Scanner scan = new Scanner(System.in);
		int sum = Integer.parseInt(scan.nextLine());
		
		sumResult(sum);
		
	
}

	private static void sumResult(int sum) {
	
		for(int i=1;i<7;i++){
			for(int j=1;j<7;j++){
				if(i+j==sum){
					System.out.println(i+"+"+j+"="+sum);
				}
			}
		}
		
	}
}
