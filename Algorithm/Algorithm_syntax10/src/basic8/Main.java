package basic8;

public class Main {

	public static void main(String[] args) {
		//�Էµ� ���� ���丮���� ���Ͻÿ�
		
		int num = 5;
		int accNum = 1;//�� 1�� �ʱ�ȭ�ϳĸ� �����̴ϱ�
		
		for(int i = num; i >= 1; i--) {
			//5! = 5*4*3*2*1  ���� ���� ������� � ������ ������ �� �ݺ�
			accNum *= i;
		}
	
		System.out.println(accNum);
		
		
		
		
	}

}
