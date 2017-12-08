package com.test.variable;

public class OperatorTest {

	public static void main(String[] args) {
		
		//단항연산자
		
		int i = 0; //i에 0값을 넣는다.
		i = i+1; //++i, i++ 와 같은 뜻.
		System.out.println("i+1="+(++i)); // 하나 증가한 후에 찍으니까 (1+1 = 2)
		System.out.println("i+1="+(i++)); // 다 끝나고 나서 증가하니까
		                                  // 원래는 (2+1 = 3)이지만 값 안올라가게 뜸. 이건 잘 안씀.
		
		i=i-1; // --i, i--
		System.out.println("i-1="+i);
		
		/* 명확한 방법 사용!
		int i=0; 
		i++;
		System.out.println("i="+i);
		*/
		
		// 앞에 ++붙는건 먼저 증가시키고 문장실행. 뒤에 ++ 있으면 문장실행후 1 더함.
		
		
		
		
		
		
		
		//산술연산자
		int x=10, y=2; // 정수형. x는 10 대입, y는 2 대입.
		
		char ch='A'; //ch=65와 같은거임! 왼쪽이 char형이니까 65의 아스키코드 값으로 바꿔서 A가 됨.
		
	
		int sum=x+y; // x+y 결과를 정수형으로 sum에 저장.
		int sub=x-y; // x-y 결과를 정수형으로 sub에 저장.
		int multi=x*y;// x*y 결과를 정수형으로 multi에 저장.
		float div = x/(y*1.0f); //y는 int형인데, 1.0f를 곱햇으니까 float가 됨. 따라서 x/y 값은 float형 이고, 그 값을 div에 저장.
		int mock = x/y; // x/y의 몫을 의미!
		int namuji= x % y; // x/y의 나머지를 namuji에 저장.
		
		int chSumInt=ch+3; // 65+3
		char chSumInt2=(char)chSumInt; // A+3이니까 b,c,d 해서 D 출력됨
		
		
		System.out.println("x+y = " +sum); // sum 값을 출력
		System.out.println("x-y = "+sub);  // sub을 출력
		System.out.println("x*y = "+multi);  // multi를 출력
		System.out.println("x/y = "+div);  // div를 출력
		System.out.println("몫:x/y = "+mock);  //mock 값을 출력
		System.out.println("나머지x%y = " +namuji); //나머지 값을 출력
		
		System.out.println("chSumInt = " +chSumInt); //chSumInt값을 출력
		System.out.println("문자형 : char + int = " +chSumInt2); // chSumint2값을 출력
		
		
		

	

		System.out.println("반올림과제");		// 과제 1234.56789의 수에 소수점 셋째자리에서 반올림하시오.
		
		//hint system.out.println((int)1.452654);
		
		float w=1234.56789f; //w=1234.56789 
		float q = w + 0.005f; // q = 1234.57289
		
		
		q = q*100; //123457.289
		q = (int)q; //123457
		q = q * 1/100; //1234.57
		
		/* double q= ((int)((w+0.005)*100))/100d;   한줄로 쓴거 */
		/* float roundNum = 1234.56789f;
		 roundNum= ((int)((roundNum+0.005f)*100f))/100f; 선생님풀이
		 */
		
		
		
		System.out.println(w);
		System.out.println(" 1234.56789 를 소수점 셋째자리에서 반올림하면 : "+q); // q값 출력
		
		
		
		
		
		
		//비교연산자 True/False로 나옴.
		System.out.println("x > y : "+ (x>y)); // x>y인지 비교 후 t/f 출력
		System.out.println("x >= y : "+ (x>=y)); // x>=y인지 비교 후 t/f 출력
		System.out.println("x < y : "+ (x<y)); // x<y인지 비교 후 t/f 출력
		System.out.println("x <= y : "+ (x<=y)); // x<=y 인지 비교 후 t/f 출력
		System.out.println("x == y : "+ (x==y)); //x와 y 같은지 비교 후 t/f 출력
		System.out.println("x != y : "+ (x != y)); // x가 y와 다르면 t, 같으면 f 출력
		
		
		
		
		
		
		//삼항연산자
		// (조건식) ? A(true) : B(false)
		//국어 90점이상 A, 낮으면 과락
		
		int kor=92; // 국어점수가 92점일때,
		
		System.out.println("국어점수레벨 : " 
		                     + ((kor>=90)? "A" : "F"));  // 국어점수가 90점 이상이면 A, 90미만이면 F 출력.
		
		
		
		
		
		
		
		//논리연산자
		
		int k=9;  // k는 9입력,
		int l=10;  // l은 10 입력
		
		System.out.println(k>9 && (l=11)>10); // k>9이면 false이므로 다음부분을 실행하지 않기 때문에 l=11이 안됨.
		System.out.println(l); // l = 10
		System.out.println(k>=9 && (l=11)>10); // k가 true이므로 다음부분을 실행함. 따라서 l에는 11값이 들어감.
		System.out.println(l); // l=11
		
		l=10; // l에 다시 10을 주고,
		
		System.out.println(k>=9 || (l=11)>10); // k부분이 true이므로 뒤에를 실행안하기 때문에 l=10
		System.out.println(l); //l = 10
		
		
		
		
		
		//할당연산자. 대입연산자
		int m=0; // m=0 대입
		m=m+1;  // m에다가 m+1을 대입. 즉, 0+1 = 1
		m=m+1;m=m+1;m=m+1; // 1+1=2, 2+1=3, 3+1=4. 즉, 4가 출력됨.
		
		System.out.println(m); //m=4
		
		m=0; //m=0으로 설정하고,
		m += 1; //1씩 더하는 것임. 근데 이건 가독성 떨어지고 버그있으니까 쓰지마
		System.out.println(m); // m=1 출력됨.
		
		

		
		
	

	}

}
