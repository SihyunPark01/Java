package basic9;

public class Main {

	public static void main(String[] args) {
		// 입력된 수의 각 자릿수 합 구하기

		int num = 1242; // 각 자릿수를 뽑아내려면 배열로 만들어서 돌리면 안될까?
		int Sum = 0;
		
		// 1242의 1의자리 뽑아내면 2, 2를 빼버리고
		// 124의 1의자리 뽑아내면 4, 4를 빼버리고
		//12의 1의자리 뽑아내면 2, 2를 빼버리고
		//1 다 더하면 되지
		// 1242 => 124 => 	12 	=> 	1  : 반복문으로 계속 10으로 나눈 뒤 몫, 0되면 stop
		// 2		4		2		1  : 10으로 나눴을 때 나머지값
		
		while(num > 0) {
			Sum += num % 10; //나머지값을 Sum에 넣어주고
			num /= 10; //10으로 나눈 값으로 num을 초기화
		}
			System.out.println(Sum);
		
	}

}
