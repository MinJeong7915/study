package com.test.array;

public class ArrayTest01 {

	int x=30;//클래스의 x 선언
	
		{
			int x=10000000;
			//int x;
			System.out.println(x); // 지역변수 x 출력. 즉, x=1000000
			 //만약 이 부분에 x=1000000이 없다면 전역변수인 30이 출력됨.
			{
				//int x; 
				int y; //y선언
				{
				  //int x; 중복됨	
				}
				
			}
			
			{
				int y; //서로 다른 영역에 있기때문에 y선언에 문제가 되지 않음.
			}
		}
		
		
		
		public static void main(String[] args) {
		
		
		
		int[] intArray = new int[5]; // 공간이 5개인 intArray라는 배열을 만듦.
		intArray[0] = 1; //첫번째 공간에 1저장
		intArray[1] = 2; //두번째 공간에 2저장
		intArray[2] = 3; //세번째 공간에 3저장
		intArray[3] = 4; //네번째 공간에 4저장
		intArray[4] = 5; //다섯번째 공간에 5저장

		int[] intArray2 = { 1, 2, 3, 4, 5 }; //공간이 5개인 intArray2 배열을 만드는 것과 동시에 값 할당.

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };// 위에있는 intArray가 아니라 새로운배열을 할당. (재 정의)

		int[] intArray4 = new int[100]; // 0~99까지의 인덱스 공간을 만든 배열.

		for (int index = 0; index < intArray4.length; index++) { //index값을 0부터 'intArray4의 길이'(100)까지 1씩 증가시킨다.
			intArray4[index] = index + 1; 
			//intArray4[0] = 0+1 로 시작해서 index의 값이 99가 될때까지 값을 +1을 해서 저장함. 
		}
		
		
		//1,2,3,4,5,6,7,8,9,10
		//11,12,.... 꼴로 출력
		for(int index=0;index<intArray4.length;index++){ //index값을 0부터 'intArray4의 길이'(100)까지 1씩 증가시킨다.
		System.out.print(intArray4[index]); //배열에 값을 저장하면서 출력한다.
		
		if (intArray4[index] % 10 != 0) { //만약 배열에 저장된 값이 10의 배수가 아니라면
			System.out.print(","); //,를 출력하고
		} else {
			System.out.println(); //10의 배수라면 한줄 띄운다.
		}}
		
		
		//위의 코딩을 삼항연산자로 간단하게 줄여보자
		for(int index=0;index<intArray4.length;index++){ //index값을 0부터 'intArray4의 길이'(100)까지 1씩 증가시킨다.
			System.out.print(intArray4[index]); //배열에 값을 저장하면서 출력한다.
			System.out.print(((intArray4[index]%10)!=0)? ",":"\n"); // 배열에 저장된 값이 10의 배수가 아니면 수 뒤에 ',' 를 붙이고,
			// 10의배수이면 한줄띄워 출력한다.
		}
		
		
		
		//2차원배열 ( 행 * 열 ) : 배열 안에 배열이 있다.
		int[][] intArrays = new int[3][3]; //3행 3열 - 3개짜리 배열 가진것이 3개 들어감.
		
		int[][] intArrays2={ //3행 3열인 2차원 배열안에 값을 지정해준다.
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int[][] scoreTable={  //5행 3열인 2차월 배열 안에 값을 지정해준다.
				{100, 100, 100},
				{ 20,  20,  20},
				{ 30,  30,  30},
				{ 40,  40,  40},
				{ 50,  50,  50}
		};
		
		//위의 scoretable 배열에서 개인의 avg를 출력하라.
		//hint! (3,1) => scoreTable[3][1] 
		
		for(int i=0;i<5;i++){ // i(행)은 0부터 4까지 1씩 증가함.
			int sum =0; //sum이라는 변수를 0으로 초기화.
			for(int j=0;j<3;j++){ // j(열)은 0부터 2까지 1씩 증가함.
				sum += scoreTable[i][j]; //즉, (0,0),(0,1),(0,2)... 로 출력되는 배열값을 sum에 더해주면서 저장.
			}
			float avg = sum/3f; // sum을 3으로 나누어서 avg평균값에 저장.
			System.out.println(avg); //평균 출력
		}
		
		//위와 같은문제. 선생님코딩
		int total=0; //total이라는 변수를 0으로 선언.
		for(int row=0; row<scoreTable.length; row++){ //row(행)은 0부터 scoretable의 길이인 4까지 1씩증가함.
			total=0; //total 0으로 초기화
			for(int col=0;col<scoreTable[row].length;col++){ //col(열)은 0부터 '행의 열의 길이'까지 1씩 증가함. 여기에서는 2까지 증가.
				total+=scoreTable[row][col]; //total = total+(각 배열에 저장된 값)
			}
			System.out.println((row+1)+"번 학생평균:"+(total*1f/scoreTable[row].length));
			//더한 값을 '행의열의길이'로 나눔.
		}
		

		
		//과목별평균을 구해보자.

		int korTotal=0; //국어과목의 총합 변수선언
		int engTotal=0;//영어과목의 총합 변수선언
		int mathTotal=0;//수학과목의 총합 변수선언
		for(int row=0; row<scoreTable.length; row++){ //row(행)은 0부터 테이블의 길이인 4까지 1씩증가.
			
				korTotal+=scoreTable[row][0]; //국어점수의 총합은 (0,0),(1,0),(2,0)...(4,0)까지의 배열의 합을 더해주면서 저장.
				engTotal+=scoreTable[row][1];//영어점수의 총합은 (0,1),(1,1),(2,1)...(4,1)까지의 배열의 합을 더해주면서 저장.
				mathTotal+=scoreTable[row][2];//수학점수의 총합은 (0,2),(1,2),(2,2)...(4,2)까지의 배열의 합을 더해주면서 저장.
			}

		System.out.println("국어 평균:"+korTotal/5f); //국어점수의 총 합을 5로 나눈 평균값 출력.
		System.out.println("영어 평균:"+engTotal/5f);//영어점수의 총 합을 5로 나눈 평균값 출력.
		System.out.println("수학 평균:"+mathTotal/5f);//수학점수의 총 합을 5로 나눈 평균값 출력.
	
	
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	