package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_7_max_min {

	public static void main(String[] args) {
		
		//������ ���� 7���� �Է¹޾Ƽ� ���� ū ���� �������� ����϶�.
		
		Scanner scan = new Scanner(System.in);
		
		int[] intArray = new int [7];
		
		for(int i=0;i<intArray.length;i++){
			System.out.println((i+1)+"��° ���� : ");
			intArray[i]=Integer.parseInt(scan.nextLine());
		}
		
		Arrays.sort(intArray);
		
		System.out.println("max num :" + intArray[intArray.length-1]);
		System.out.println("min num :" + intArray[0]);
	}

}
