package basic6;

public class Main {

	public static void main(String[] args) {
		//입력된 두 수의 최대공약수 구하기
		
		int num1, num2;
		num1 = 10;
		num2 = 15;
		
		int small; //두 수 중 어떤 수가 큰지 판별해야 함
		int big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		int gcd = 1;//최대공약수
		
		for (int i = 1; i <= small; i++) {
			if(big % i == 0 && small % i ==0) {//둘다 나누어 떨어지면
				gcd = i;
			}
			
		}System.out.println(gcd);
		
		
		
		
	}

}
