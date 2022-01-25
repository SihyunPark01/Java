package java_100;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//자바 문법 총정리
		
		int x = 30;
		System.out.println(35);
		System.out.println(35 + 30);
		System.out.println(x + 20);
		
		x = 40;
		System.out.println(x);
		
		final int y = 30;
		//y = 40; final 선언 시 상수이므로 변경 불가
		
		double dd = 30.0;
		float ff = 30.0f;
		boolean isMarried = true;
		isMarried = false;
		
		char c = '한';
		String str = "여러 글자";
		
		int i = (int) 30L; //큰 값을 작은 값에 넣을 땐 강제 형변환(캐스팅) 필요
		long ll = 30; //작은 값을 큰 값에 넣을 땐 자동 형변환됨
		dd = ff;
		ff = (float) dd; 
		
		// 2가지 방법
		System.out.printf("저는 %s입니다. 나이는 %d살 입니다.\n", "박시현",34); //\n 계행
		
		String str2 = String.format("저는 %s입니다. 나이는 %d살 입니다.", "박시현",34);
		System.out.println(str2);
	
		// Math
		System.out.println(Math.max(10,  30));
		System.out.println(Math.min(10,  30));
		System.out.println(Math.abs(-30));
		
		// 문자열/숫자 상호 변환
		String str3 = "100";
		System.out.println(str3 + 10);
		int i2 = Integer.parseInt(str3); //문자열을 숫자로
		System.out.println(i2 + 10);
		
		String str4 = String.valueOf(i2); //숫자를 문자열로
		System.out.println(str4);
	
		// Random
		Random random = new Random();
		int rand = random.nextInt(4) + 5; //원하는 범위 5 ~ 9 중 랜덤 숫자 출력
		System.out.println(rand);
		
		// 키보드 입력
		Scanner scanner = new Scanner(System.in);
		
		String str5 = scanner.next();
		int i3 = scanner.nextInt();
		long lll = scanner.nextLong();
		
		// if문
		int j = 4 ;
		if(j > 5) {
			System.out.println("참");
		} else if(i < 3){
			System.out.println("거짓");
		} else {
			System.out.println("나머지");
		}
		
		// 삼항연산자
		boolean isMarried2 = true;
		boolean isMan2 = false;
		String str6;
//		
		str6 = isMarried2 ? "결혼 했다" : "결혼 안 했다";
//		
		// switch문
		switch (str6) {
		case "결혼 했다":
			System.out.println("O");
			break;
		case "결혼 안 했다":
			System.out.println("X");
			break;
		default:
			System.out.println("?");
		}
		
		// 반복문 중 익숙하지 않은 while문, do~while문
		int i5 = 0;
		while (i5 < 10) {
			System.out.println(i5);
			i5++;
		}
		
		do {
			System.out.println(i5);
			i5++;
		} while(i5 < 10);
		
		// 반복문 6까지만 돌리고 싶을 때 break를 활용하라
		for(int k = 0; k < 10; k++) {
			System.out.println(k);
			if(k == 6) {
				break;
			}
		}
		
		// 반복문 6만 빼고 돌리고 싶을 때 continue를 활용하라
		for(int k = 0; k < 10; k++) {
			if(k == 6) {
				continue;
			}
			System.out.println(k);
		}
		
		// 배열
		int [] score; //배열 선언 후
		score = new int[5]; //초기화
		
		int[] score2 = new int[5]; // => 한번에!
		
		// 초기화 하면서 값 설정
		int[] score3 = new int[]  {10,20,30,40,50}; // 초기화와 동시에 값 생성 
		int[] score4 = {10,20,30,40,50}; // new int[]생략가능
		
			
		int count = score2.length; // 배열 길이 출력
		System.out.println("배열 길이는 " + count);

		score[0] = 10; //인덱스로 원하는 값 담을 수 있음
		System.out.println(score[0]);
		
		// 배열의 마지막 인덱스 값 출력
		System.out.println(score4[score4.length - 1]);
	
		// String[]은 초기화하지 않으면 null값이 뜸 오류가 잘 날수 있으므로 arraylist를 사용
		
		String[] names = new String[2];
		
		// arraylist 구조
		ArrayList<Integer> scoreList = new ArrayList<>();//arraylist는 기본타입 아닌 내장된 래퍼 클래스를 <>안에 선언해야 함
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		//원하는 곳에 값 추가 가능
		scoreList.add(2, 100);
		//원하는 곳에 값 삭제 가능
		scoreList.remove(2);
		System.out.println(scoreList);
	
	}

}
