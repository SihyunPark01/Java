package java_100;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//�ڹ� ���� ������
		
		int x = 30;
		System.out.println(35);
		System.out.println(35 + 30);
		System.out.println(x + 20);
		
		x = 40;
		System.out.println(x);
		
		final int y = 30;
		//y = 40; final ���� �� ����̹Ƿ� ���� �Ұ�
		
		double dd = 30.0;
		float ff = 30.0f;
		boolean isMarried = true;
		isMarried = false;
		
		char c = '��';
		String str = "���� ����";
		
		int i = (int) 30L; //ū ���� ���� ���� ���� �� ���� ����ȯ(ĳ����) �ʿ�
		long ll = 30; //���� ���� ū ���� ���� �� �ڵ� ����ȯ��
		dd = ff;
		ff = (float) dd; 
		
		// 2���� ���
		System.out.printf("���� %s�Դϴ�. ���̴� %d�� �Դϴ�.\n", "�ڽ���",34); //\n ����
		
		String str2 = String.format("���� %s�Դϴ�. ���̴� %d�� �Դϴ�.", "�ڽ���",34);
		System.out.println(str2);
	
		// Math
		System.out.println(Math.max(10,  30));
		System.out.println(Math.min(10,  30));
		System.out.println(Math.abs(-30));
		
		// ���ڿ�/���� ��ȣ ��ȯ
		String str3 = "100";
		System.out.println(str3 + 10);
		int i2 = Integer.parseInt(str3); //���ڿ��� ���ڷ�
		System.out.println(i2 + 10);
		
		String str4 = String.valueOf(i2); //���ڸ� ���ڿ���
		System.out.println(str4);
	
		// Random
		Random random = new Random();
		int rand = random.nextInt(4) + 5; //���ϴ� ���� 5 ~ 9 �� ���� ���� ���
		System.out.println(rand);
		
		// Ű���� �Է�
		Scanner scanner = new Scanner(System.in);
		
		String str5 = scanner.next();
		int i3 = scanner.nextInt();
		long lll = scanner.nextLong();
		
		// if��
		int j = 4 ;
		if(j > 5) {
			System.out.println("��");
		} else if(i < 3){
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		
		// ���׿�����
		boolean isMarried2 = true;
		boolean isMan2 = false;
		String str6;
//		
		str6 = isMarried2 ? "��ȥ �ߴ�" : "��ȥ �� �ߴ�";
//		
		// switch��
		switch (str6) {
		case "��ȥ �ߴ�":
			System.out.println("O");
			break;
		case "��ȥ �� �ߴ�":
			System.out.println("X");
			break;
		default:
			System.out.println("?");
		}
		
		// �ݺ��� �� �ͼ����� ���� while��, do~while��
		int i5 = 0;
		while (i5 < 10) {
			System.out.println(i5);
			i5++;
		}
		
		do {
			System.out.println(i5);
			i5++;
		} while(i5 < 10);
		
		// �ݺ��� 6������ ������ ���� �� break�� Ȱ���϶�
		for(int k = 0; k < 10; k++) {
			System.out.println(k);
			if(k == 6) {
				break;
			}
		}
		
		// �ݺ��� 6�� ���� ������ ���� �� continue�� Ȱ���϶�
		for(int k = 0; k < 10; k++) {
			if(k == 6) {
				continue;
			}
			System.out.println(k);
		}
		
		// �迭
		int [] score; //�迭 ���� ��
		score = new int[5]; //�ʱ�ȭ
		
		int[] score2 = new int[5]; // => �ѹ���!
		
		// �ʱ�ȭ �ϸ鼭 �� ����
		int[] score3 = new int[]  {10,20,30,40,50}; // �ʱ�ȭ�� ���ÿ� �� ���� 
		int[] score4 = {10,20,30,40,50}; // new int[]��������
		
			
		int count = score2.length; // �迭 ���� ���
		System.out.println("�迭 ���̴� " + count);

		score[0] = 10; //�ε����� ���ϴ� �� ���� �� ����
		System.out.println(score[0]);
		
		// �迭�� ������ �ε��� �� ���
		System.out.println(score4[score4.length - 1]);
	
		// String[]�� �ʱ�ȭ���� ������ null���� �� ������ �� ���� �����Ƿ� arraylist�� ���
		
		String[] names = new String[2];
		
		// arraylist ����
		ArrayList<Integer> scoreList = new ArrayList<>();//arraylist�� �⺻Ÿ�� �ƴ� ����� ���� Ŭ������ <>�ȿ� �����ؾ� ��
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		//���ϴ� ���� �� �߰� ����
		scoreList.add(2, 100);
		//���ϴ� ���� �� ���� ����
		scoreList.remove(2);
		System.out.println(scoreList);
	
	}

}
