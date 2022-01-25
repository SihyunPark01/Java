package java_100;

import java.util.ArrayList;
import java.util.Arrays;

import java_100_2.Character;
import java_100_2.Hero;
import java_100_2.ICharacter2;
import java_100_2.Magician;
import java_100_2.Person3; //�ٸ� ��Ű���� Ŭ������ �޼ҵ� Ȱ�� �� import �������

//static�޼ҵ� ���� 
public class Main2 {

	
	//static ���� - static������ static�޼ҵ�� heap�� �ƴ� static������ �Ҵ�ǹǷ� ��� ��ü�� �����Ͽ� ��𼭵� ������������
	// ������ garbage collector�� ���� ���� �ۿ� �����ϹǷ� ���α׷� ����ñ��� �޸𸮿� ��� �Ҵ�� ä�� ��������
	
	public static void main(String[] args) {
		add(50, 10); //add �޼ҵ忡 ���� �־��ָ� 60�� ���
		add(30, 20); //�޼ҵ带 Ȱ���ϸ� �ߺ��ڵ� ����, ���� ����, ���� ���� !
		
		//add2�� return���� �ִ� �޼ҵ��̹Ƿ� �̷��Ե� ����
		System.out.println(add2(20, 10));
		System.out.println(add2(30, 55, 70));
		System.out.println("int...numbers = "+add(1,2,3,4,5));
		
		
		//�Ʒ��� Person3 Ŭ���� �ʱ�ȭ �� ��� -> �ٸ� ��Ű���� Ŭ������ �ű�
		Person3 person = new Person3(); //null�� 0
		Person3 person2 = new Person3("ȫ�浿", 10);
		System.out.println(person);
		System.out.println(person2);
		
		
		// �Ϳ� �� �ҷ�������
		Hero hero = new Hero("���۸�");
		Hero hero2 = new Hero("��Ʈ��");
		hero.attack(hero2);
//		hero.getName();
//		hero.isFlying();
		
		//�߻�Ŭ���� Character
		//Magician�� Character(���)�̱⵵ �ϸ鼭 ICharacter2(�������̽�)�̱⵵ ��.
		Character character = new Hero("���۸�3"); //Hero��� �ν��Ͻ��� �����Ͽ� �� �ּҰ��� CharacterŬ����Ÿ���� �������� character ����
		Magician magician = new Magician();
		Character magician2 = new Magician();
		
		ICharacter2 magician3 = new Magician();
		
		//instanceof - ��ü Ÿ�� Ȯ�� ������ ������. ��Ӱ��迡�� �θ����� �ڽ����� Ȯ���ϴ� �� ���
		if(magician2 instanceof Magician) {
			
		}
		
		//�������� ���� �̷��Ե� ����, �������� Ÿ���� �ϳ��� �������信 �� ���� �� ����
		ArrayList<Character> characterArrayList = new ArrayList<>();
		characterArrayList.add(magician);
		characterArrayList.add(magician2);
		characterArrayList.add(hero);
	}
	
	//add��� �޼ҵ忡 x�� y��� ������ �Ķ���� ����
	public static void add(int x, int y) {
		System.out.println(x + y); //��¹� ����
	}

	// return���̶� �޼ҵ带 �����ϰ� ��� ������ ��ȯ�� �ִ� ��. ��°��� �پ��ϰ� ���� �� ����.
	// return�� ���� �� void ��� ���ϰ��� �ڷ��� ����
	public static int add2(int x, int y) {
		return x + y;
	}
	
	// �޼ҵ� �����ε� (�޼ҵ���� ������ �Ķ���͸� �޸��ϸ� ���� ����)
	public static int add2(int x, int y, int z) {
		return x + y + z;
	}
	
	// ���ϴ� ��� ���ڸ� ���ϴ� �޼ҵ带 ����� �ʹ�
	public static int add(int ... numbers) { //...�� 0������ ����������������. numbers�� �迭�� ����
		int sum = 0;
		for(int i = 0; i <= numbers.length; i++) {
			sum += i;
		}
		System.out.println(Arrays.toString(numbers)); //�迭 ��� ���� ��!!!
		return sum;
	}
}


// Ŭ���� : ��ü�� �Ӽ�(�������=�ʵ�)�� ���(�޼ҵ�)
// Ŭ�����κ��� ������� ��ü�� �� Ŭ������ �ν��Ͻ���� �θ�.
// �� ��ü�� ��� �ν��Ͻ��� ��ǥ�ϴ� �������� �ǹ�, �ν��Ͻ��� ��ü���� ��ü �ϳ�.
class Person {
	public String name;
	public int age;
}

//���� Ŭ������ private�� ������ ���Ƽ� getter�� setter�� �����ؼ� ��
class Person2{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}



