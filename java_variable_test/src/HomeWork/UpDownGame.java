package HomeWork;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
				
		       System.out.println("���ٿ����");
		       int com = (int)(Math.random()*100+1);
				System.out.print("1~100������ �����߿��� ���� � ���� ������� ���纸����. ");
		       
		       
		     	while(true){
	
				
				int min = 1;
				int max = 100;
				
				Scanner sc = new Scanner(System.in);
				int user = sc.nextInt();
				System.out.println("�Է°� :"+user);
				
	
				    if(user<com){
						System.out.println("UP!");
						min = user+1;
						System.out.println(min+"~"+max+"������ �� �߿� �Է��ϼ���.");
						
						}else if(user>com){
				    	System.out.println("Down!");
				    	max = user-1;
				    	System.out.println(min+"~"+max+"������ �� �߿� �Է��ϼ���.");
				     } else{
								System.out.println("�����Դϴ�!");
								
								System.out.println("�ٽ��Ͻðڽ��ϱ�? (y) : ");
								Scanner s = new Scanner(System.in);
								String re =s.nextLine();
								
								if(re.equals("y")){
									com = (int)(Math.random()*100+1);
									System.out.print("1~100������ �����߿��� ���� � ���� ������� ���纸����. ");
								} else{

									System.out.println("������ �����մϴ�.");
									break;
								}
								
							}
				}
		     	
		     	

					
					


	}

}
