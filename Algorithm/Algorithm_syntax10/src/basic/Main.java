package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 학생정보들을 저장하고 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성.
	
		Student st1 = new Student("홍길동", "1428");
		Student st2 = new Student("손오공", "1429");
		Student st3 = new Student("저팔계", "1430");
	
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		while (true) { //무한루프로 돌리기
			System.out.println("계속 검색을 하고 싶으시면 y, 종료하고 싶으면 n");
			String input = sc.next();	
			boolean flag = false;
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");

				String name = sc.next();
				
				for (Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은: "+stu.getNo());
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
			}else if(input.equals("n")) {
				break; //가장 가까운 while문 탈출
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
