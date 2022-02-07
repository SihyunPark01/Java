package basic7;

public class Main {

	public static void main(String[] args) {
		// 입력된 수가 소수인지 판별하시오
		
		int num =20; //1과 자기자신으로만 나누어 떨어지는 수 찾기
		
		boolean isPrimeNumber = true; //소수임
		
		for(int i = 2; i <= num-1; i++) { //왜 2부터 시작해야하는가? 2부터 자기자신-1까지 나눠줘야 소수인지 판별가능
			if(num % i == 0) {//한번이라도 나누어떨어지면
				isPrimeNumber = false; //소수가 아님
				//소수는 결국 if문을 타지 않게 됨
			}
		}
		if (isPrimeNumber) {
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
		

	}

}
