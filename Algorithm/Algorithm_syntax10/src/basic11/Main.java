package basic11;

public class Main {

	public static void main(String[] args) {
		// ���ڻ簢��(2) - �Էµ� ��(N)��ŭ N�� N���� ������ ���� �簢���� ���
		// 1  2  3  4  
		// 8  7  6  5
		// 9  10 11 12
		// 16 15 14 13     �̷� ���·� ��������!
		
		int n = 5;
		//�迭 �̿��ؼ� Ǯ��
		int arr[][] = new int[n][n];
		
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}System.out.println();
		}
	}

}
