package ch04_excercise;

public class EX04_13 {

	public static void main(String[] args) {
		
		String value = "12o34"; 
		char ch = ' ';
		boolean isNumber = true; //������ �� true
		
		for (int i =0; i<value.length(); i++){ 
			ch = value.charAt(i);
			if(ch>='0'&& ch<='9'){ //ch�� 0~9���� �����ϰ��
				isNumber=false;
				break;
			}
			
		}
		
		if(isNumber){
			System.out.println(value+"�� �����Դϴ�.");
			} else{
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
			}
		

	}

}
