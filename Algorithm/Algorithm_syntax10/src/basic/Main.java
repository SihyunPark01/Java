package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// �л��������� �����ϰ� �л��̸����� �˻����� �� �й��� ����ϴ� ���α׷� �ۼ�.
	
		Student st1 = new Student("ȫ�浿", "1428");
		Student st2 = new Student("�տ���", "1429");
		Student st3 = new Student("���Ȱ�", "1430");
	
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		while (true) { //���ѷ����� ������
			System.out.println("��� �˻��� �ϰ� �����ø� y, �����ϰ� ������ n");
			String input = sc.next();	
			boolean flag = false;
			
			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");

				String name = sc.next();
				
				for (Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й���: "+stu.getNo());
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�ش��ϴ� �л� �̸��� �����ϴ�.");
				}
			}else if(input.equals("n")) {
				break; //���� ����� while�� Ż��
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
