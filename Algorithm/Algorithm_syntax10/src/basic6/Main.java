package basic6;

public class Main {

	public static void main(String[] args) {
		//�Էµ� �� ���� �ִ����� ���ϱ�
		
		int num1, num2;
		num1 = 10;
		num2 = 15;
		
		int small; //�� �� �� � ���� ū�� �Ǻ��ؾ� ��
		int big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		int gcd = 1;//�ִ�����
		
		for (int i = 1; i <= small; i++) {
			if(big % i == 0 && small % i ==0) {//�Ѵ� ������ ��������
				gcd = i;
			}
			
		}System.out.println(gcd);
		
		
		
		
	}

}
