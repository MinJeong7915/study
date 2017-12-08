package ch04_excercise;

public class EX04_9 {

	public static void main(String[] args) {
		
		
		String str = "12345";
		int sum =0;
		
		for(int i=0; i<str.length(); i++){ // i가 0 이라는 건 str의 첫번째 자리를 0으로 지정한다는 뜻. 
			                               //그리고 개수는 0부터 시작이라서 하나 적으니까 범위가 저기까지임.

			sum=sum+Integer.parseInt(""+str.charAt(i));
			//			System.out.println(str.charAt(i));
//			char ch=str.charAt(i);
	
			
		}
		
		System.out.println("sum="+sum);
		
	
		
		
		
//		boolean isNumber= true; //number is'이다'.
//		String msg="반갑습니다.";
//		msg="12e45624";
//		for(int index=0; index<msg.length();index++){
//			System.out.println(msg.charAt(index)); // 반 갑 습 니 다 . 한글자씩 뽑아옴.
//			char ch=msg.charAt(index);
// 
//			if(!(ch>=48 && ch<=57)){  //아스키값으로 바뀌니까 이건 숫자인지 말해주는거임. 
//				//! 붙였으므로 숫자가 아닐때!!
//				isNumber=false;
//				}
//		} 
//		System.out.println(isNumber?"숫자":"숫자가 아님");

	}

}
