package java_100;

public class Main3 {
	// ���׸� ���� - <>�ȿ� ���� Ÿ��, �츮�� �޼ҵ�� ���� �� ����
	public static void main(String[] args) {
		print("�ȳ�");
		print(1);
		print(3L);
		print(true);
	}
	
	public static <T> void print(T type) {
		System.out.println(type);
	}

}
