package ch04_excercise;

public class EX04_9 {

	public static void main(String[] args) {
		
		
		String str = "12345";
		int sum =0;
		
		for(int i=0; i<str.length(); i++){ // i�� 0 �̶�� �� str�� ù��° �ڸ��� 0���� �����Ѵٴ� ��. 
			                               //�׸��� ������ 0���� �����̶� �ϳ� �����ϱ� ������ ���������.

			sum=sum+Integer.parseInt(""+str.charAt(i));
			//			System.out.println(str.charAt(i));
//			char ch=str.charAt(i);
	
			
		}
		
		System.out.println("sum="+sum);
		
	
		
		
		
//		boolean isNumber= true; //number is'�̴�'.
//		String msg="�ݰ����ϴ�.";
//		msg="12e45624";
//		for(int index=0; index<msg.length();index++){
//			System.out.println(msg.charAt(index)); // �� �� �� �� �� . �ѱ��ھ� �̾ƿ�.
//			char ch=msg.charAt(index);
// 
//			if(!(ch>=48 && ch<=57)){  //�ƽ�Ű������ �ٲ�ϱ� �̰� �������� �����ִ°���. 
//				//! �ٿ����Ƿ� ���ڰ� �ƴҶ�!!
//				isNumber=false;
//				}
//		} 
//		System.out.println(isNumber?"����":"���ڰ� �ƴ�");

	}

}
