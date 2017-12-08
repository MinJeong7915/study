package HomeWork;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
				
		       System.out.println("업다운게임");
		       int com = (int)(Math.random()*100+1);
				System.out.print("1~100까지의 숫자중에서 제가 어떤 수를 골랐는지 맞춰보세요. ");
		       
		       
		     	while(true){
	
				
				int min = 1;
				int max = 100;
				
				Scanner sc = new Scanner(System.in);
				int user = sc.nextInt();
				System.out.println("입력값 :"+user);
				
	
				    if(user<com){
						System.out.println("UP!");
						min = user+1;
						System.out.println(min+"~"+max+"까지의 수 중에 입력하세요.");
						
						}else if(user>com){
				    	System.out.println("Down!");
				    	max = user-1;
				    	System.out.println(min+"~"+max+"까지의 수 중에 입력하세요.");
				     } else{
								System.out.println("정답입니다!");
								
								System.out.println("다시하시겠습니까? (y) : ");
								Scanner s = new Scanner(System.in);
								String re =s.nextLine();
								
								if(re.equals("y")){
									com = (int)(Math.random()*100+1);
									System.out.print("1~100까지의 숫자중에서 제가 어떤 수를 골랐는지 맞춰보세요. ");
								} else{

									System.out.println("게임을 종료합니다.");
									break;
								}
								
							}
				}
		     	
		     	

					
					


	}

}
