package basic7;

public class Main {

	public static void main(String[] args) {
		// �Էµ� ���� �Ҽ����� �Ǻ��Ͻÿ�
		
		int num =20; //1�� �ڱ��ڽ����θ� ������ �������� �� ã��
		
		boolean isPrimeNumber = true; //�Ҽ���
		
		for(int i = 2; i <= num-1; i++) { //�� 2���� �����ؾ��ϴ°�? 2���� �ڱ��ڽ�-1���� ������� �Ҽ����� �Ǻ�����
			if(num % i == 0) {//�ѹ��̶� �����������
				isPrimeNumber = false; //�Ҽ��� �ƴ�
				//�Ҽ��� �ᱹ if���� Ÿ�� �ʰ� ��
			}
		}
		if (isPrimeNumber) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
		

	}

}
