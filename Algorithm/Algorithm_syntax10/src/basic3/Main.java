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
		//index -> ������ ��
		//index�� -> ������ ���� ��� ���Դ��� �����ϴ� �뵵
		
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
		
		System.out.println("�ֺ��: "+modeNum+ " ī��Ʈ: "+modeCnt);
		
		
		
	}

}
