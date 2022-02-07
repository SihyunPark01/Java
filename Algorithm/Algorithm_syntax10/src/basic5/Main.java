package basic5;

public class Main {
	
	public static void main(String[] args) {
		//대문자는 소문자로, 소문자는 대문자로
		
		String input = "helLowOrlD"; //아스키코드 가져오기 힘듬
		char[] arr; //char 배열로 아스키코드 가져옴
		arr = input.toCharArray(); // 문자 각각에 접근가능
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') { //arr[i]가 소문자일떄
				arr[i] = (char) (arr[i] + 'A'-'a'); //뺀 간격을 더하면 소문자가 대문자로 변환됨
			} 
			else if(arr[i] >= 'A' && arr[i] <= 'Z') {//arr[i]가 대문자일때
				arr[i] = (char) (arr[i] - ('A'-'a')); //뺀 간격을 빼면 대문자가 소문자로 변환됨
			}
		}
		System.out.println(arr);
	}

}
