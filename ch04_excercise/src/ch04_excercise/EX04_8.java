package ch04_excercise;

public class EX04_8 {

	public static void main(String[] args) {
		
		//2x+4y=10
		
		for(int x=0;x<11;x++){
			for(int y=0;y<11;y++){
				
				if( 2*x+4*y==10){ //이걸 충족시킬때 출력됨.
				System.out.print("x="+x+", ");
				System.out.println("y="+y);
				}
				
			}
		}


	}

}
