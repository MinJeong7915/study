package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_max_min {

	public static void main(String[] args) {
		
		//임의의 숫자 7개를 입력받아서 가장 큰 수와 작은수를 출력하라.
		
		Scanner scan = new Scanner(System.in);
		
		int[] intArray = new int [7];
		
		for(int i=0;i<intArray.length;i++){
			System.out.println((i+1)+"번째 숫자 : ");
			intArray[i]=Integer.parseInt(scan.nextLine());
		}
		
		Arrays.sort(intArray);
		
		System.out.println("max num :" + intArray[intArray.length-1]);
		System.out.println("min num :" + intArray[0]);
	}

}
