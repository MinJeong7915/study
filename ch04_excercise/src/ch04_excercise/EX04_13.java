package ch04_excercise;

public class EX04_13 {

	public static void main(String[] args) {
		
		String value = "12o34"; 
		char ch = ' ';
		boolean isNumber = true; //숫자일 때 true
		
		for (int i =0; i<value.length(); i++){ 
			ch = value.charAt(i);
			if(ch>='0'&& ch<='9'){ //ch가 0~9까지 숫자일경우
				isNumber=false;
				break;
			}
			
		}
		
		if(isNumber){
			System.out.println(value+"는 숫자입니다.");
			} else{
			System.out.println(value+"는 숫자가 아닙니다.");
			}
		

	}

}
