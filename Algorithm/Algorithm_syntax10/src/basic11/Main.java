package basic11;

public class Main {

	public static void main(String[] args) {
		// 숫자사각형(2) - 입력된 수(N)만큼 N행 N열의 형태의 숫자 사각형을 출력
		// 1  2  3  4  
		// 8  7  6  5
		// 9  10 11 12
		// 16 15 14 13     이런 형태로 나오도록!
		
		int n = 5;
		//배열 이용해서 풀기
		int arr[][] = new int[n][n];
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if ( i % 2 == 0) { //짝수행일때 열은 순서대로 올라감
				for (int j = 0; j < n; j++) {
					arr[i][j] = i*n+j+1;
				}
			}else { //홀수행일때 열은 거꾸로 내려감
				for (int j = n-1; j >=0; j--) {
					arr[i][j] = i*n+n-j;
				}
			}
		}
			
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.printf("%4d", arr[i][j]);
			}System.out.println();
		}
	}

}
