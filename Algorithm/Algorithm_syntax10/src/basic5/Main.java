package basic5;

public class Main {
	
	public static void main(String[] args) {
		//�빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ�
		
		String input = "helLowOrlD"; //�ƽ�Ű�ڵ� �������� ����
		char[] arr; //char �迭�� �ƽ�Ű�ڵ� ������
		arr = input.toCharArray(); // ���� ������ ���ٰ���
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') { //arr[i]�� �ҹ����ϋ�
				arr[i] = (char) (arr[i] + 'A'-'a'); //�� ������ ���ϸ� �ҹ��ڰ� �빮�ڷ� ��ȯ��
			} 
			else if(arr[i] >= 'A' && arr[i] <= 'Z') {//arr[i]�� �빮���϶�
				arr[i] = (char) (arr[i] - ('A'-'a')); //�� ������ ���� �빮�ڰ� �ҹ��ڷ� ��ȯ��
			}
		}
		System.out.println(arr);
	}

}
