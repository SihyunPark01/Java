package basic3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] inputNum = new int[10];
		for (int i = 0; i < 10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int [] mode = new int [10];
		//index -> 출현한 수
		//index값 -> 출현한 수가 몇번 나왔는지 저장하는 용도
		
		for (int i = 0; i < 10; i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0;
		int modeCnt = 0;
		for (int i =0; i < 10; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수: "+modeNum+ " 카운트: "+modeCnt);
		
		
		
	}

}
