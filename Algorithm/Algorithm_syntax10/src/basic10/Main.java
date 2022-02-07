package basic10;

public class Main {

	public static void main(String[] args) {
		// 숫자 사각형(1) : 입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 구하시오 4면 4행 4열의 숫자들 차례대로
		// 1	2  	3 	4
		// 5	6  	7 	8
		// 9	10 	11 	12
		// 13 	14 	15 	16
		
		int n = 5;
		
		int num = 1;
		
		//행과 열이므로 중첩for문 필요
		
		for(int i = 0; i < n; i++) {//행
			for(int j = 0; j < n; j++) { //열
				System.out.print(num + " "); //println쓰면 안되지
				num++;
				//num 선언없이 풀려면 바로 print(i*n + j + 1 + " ") 해줘도 됨
				
			}
			System.out.println(); //열 끝난 뒤 계행 넣어줘야 사각형 형태로 출력되지
		}
	}	

}
