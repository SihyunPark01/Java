package java_100;

public class Main3 {
	// 제네릭 개념 - <>안에 들어가는 타입, 우리가 메소드로 만들 수 있음
	public static void main(String[] args) {
		print("안녕");
		print(1);
		print(3L);
		print(true);
	}
	
	public static <T> void print(T type) {
		System.out.println(type);
	}

}
