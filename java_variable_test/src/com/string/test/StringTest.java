package com.string.test;

public class StringTest {

	public static void main(String[] args) {
	
		String msg="반갑습니다.";
		
		System.out.println(msg);
		System.out.println("문자열길이:" +msg.length());
		System.out.println("문자열비교 :" +msg.equals("바바바"));
		//msg라는 위의 문자열에 입력된 글자와 지금쓴 글자가 똑같은지 확인.

		System.out.println("문자탐색 :" +msg.contains("반갑"));
		//msg라는 문자열에 반갑이 포함되어 있는지 T/F
		
		System.out.println("비교 인덱스 반환 :" +msg.indexOf("니다"));
		// 반(0) 갑(1) 습(2) 니(3) 다(4) '니'가 인덱스값 3이므로 3출력
		
		System.out.println("index의 글자 반환:"+msg.charAt(2));
		//습
		
		System.out.println("빈문자열 확인:"+msg.isEmpty());
		//빈문자열이면 true, 빈 것이 아니면 false
		
		System.out.println("문자열교체:" +msg.replace("반갑습", "감사합") );
		//감사합니다. 로 바뀜.
		
		System.out.println("문자열 잘라내기:"+msg.substring(0,3));
		//0부터 2까지 즉, 반,갑,습을 출력함.
		
		System.out.println("대문자변환:"+msg.toUpperCase());
		//대문자로
		
		System.out.println("소문자변환:"+msg.toLowerCase());
		
		
		
		////무슨얘긴지 모르겠. .
		boolean isNumber= true; //number is'이다'.
		
		msg="12e45624";
		for(int index=0; index<msg.length();index++){
			System.out.println(msg.charAt(index)); // 반 갑 습 니 다 . 한글자씩 뽑아옴.
			char ch=msg.charAt(index);
 
			if(!(ch>=48 && ch<=57)){  //아스키값으로 바뀌니까 이건 숫자인지 말해주는거임. 
				//! 붙였으므로 숫자가 아닐때!!
				isNumber=false;
				}
		} 
		System.out.println(isNumber?"숫자":"숫자가 아님");
		
	    ///이까지
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
