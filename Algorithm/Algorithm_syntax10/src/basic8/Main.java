package basic8;

public class Main {

	public static void main(String[] args) {
		//입력된 수의 팩토리얼을 구하시오
		
		int num = 5;
		int accNum = 1;//왜 1로 초기화하냐면 곱셈이니까
		
		for(int i = num; i >= 1; i--) {
			//5! = 5*4*3*2*1  각각 곱한 결과값을 어떤 변수에 저장한 뒤 반복
			accNum *= i;
		}
	
		System.out.println(accNum);
		
		
		
		
	}

}
