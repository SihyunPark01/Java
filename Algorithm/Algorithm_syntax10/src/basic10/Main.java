package basic10;

public class Main {

	public static void main(String[] args) {
		// ���� �簢��(1) : �Էµ� ��(N)��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ���Ͻÿ� 4�� 4�� 4���� ���ڵ� ���ʴ��
		// 1	2  	3 	4
		// 5	6  	7 	8
		// 9	10 	11 	12
		// 13 	14 	15 	16
		
		int n = 5;
		
		int num = 1;
		
		//��� ���̹Ƿ� ��øfor�� �ʿ�
		
		for(int i = 0; i < n; i++) {//��
			for(int j = 0; j < n; j++) { //��
				System.out.print(num + " "); //println���� �ȵ���
				num++;
				//num ������� Ǯ���� �ٷ� print(i*n + j + 1 + " ") ���൵ ��
				
			}
			System.out.println(); //�� ���� �� ���� �־���� �簢�� ���·� ��µ���
		}
	}	

}
