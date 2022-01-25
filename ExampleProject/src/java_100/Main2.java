package java_100;

import java.util.ArrayList;
import java.util.Arrays;

import java_100_2.Character;
import java_100_2.Hero;
import java_100_2.ICharacter2;
import java_100_2.Magician;
import java_100_2.Person3; //다른 패키지의 클래스의 메소드 활용 시 import 해줘야지

//static메소드 설명 
public class Main2 {

	
	//static 개념 - static변수나 static메소드는 heap이 아닌 static영역에 할당되므로 모든 객체가 공유하여 어디서든 참조가능해짐
	// 하지만 garbage collector의 관리 영역 밖에 존재하므로 프로그램 종료시까지 메모리에 계속 할당된 채로 남아있음
	
	public static void main(String[] args) {
		add(50, 10); //add 메소드에 인자 넣어주면 60이 출력
		add(30, 20); //메소드를 활용하면 중복코드 제거, 재사용 가능, 관리 용이 !
		
		//add2는 return값이 있는 메소드이므로 이렇게도 가능
		System.out.println(add2(20, 10));
		System.out.println(add2(30, 55, 70));
		System.out.println("int...numbers = "+add(1,2,3,4,5));
		
		
		//아래의 Person3 클래스 초기화 후 출력 -> 다른 패키지의 클래스로 옮김
		Person3 person = new Person3(); //null과 0
		Person3 person2 = new Person3("홍길동", 10);
		System.out.println(person);
		System.out.println(person2);
		
		
		// 와우 다 불러와지네
		Hero hero = new Hero("슈퍼맨");
		Hero hero2 = new Hero("배트맨");
		hero.attack(hero2);
//		hero.getName();
//		hero.isFlying();
		
		//추상클래스 Character
		//Magician은 Character(상속)이기도 하면서 ICharacter2(인터페이스)이기도 함.
		Character character = new Hero("슈퍼맨3"); //Hero라는 인스턴스를 생성하여 그 주소값을 Character클래스타입의 참조변수 character 저장
		Magician magician = new Magician();
		Character magician2 = new Magician();
		
		ICharacter2 magician3 = new Magician();
		
		//instanceof - 객체 타입 확인 가능한 연산자. 상속관계에서 부모인지 자식인지 확인하는 데 사용
		if(magician2 instanceof Magician) {
			
		}
		
		//다형성에 의해 이렇게도 가능, 여러가지 타입을 하나의 상위개념에 다 담을 수 있음
		ArrayList<Character> characterArrayList = new ArrayList<>();
		characterArrayList.add(magician);
		characterArrayList.add(magician2);
		characterArrayList.add(hero);
	}
	
	//add라는 메소드에 x와 y라는 정수형 파라미터 선언
	public static void add(int x, int y) {
		System.out.println(x + y); //출력문 만들어서
	}

	// return값이란 메소드를 종료하고 출력 값으로 반환해 주는 것. 출력값이 다양하게 사용될 수 있음.
	// return값 선언 시 void 대신 리턴값의 자료형 선언
	public static int add2(int x, int y) {
		return x + y;
	}
	
	// 메소드 오버로드 (메소드명은 같지만 파라미터를 달리하면 재사용 가능)
	public static int add2(int x, int y, int z) {
		return x + y + z;
	}
	
	// 원하는 모든 숫자를 더하는 메소드를 만들고 싶다
	public static int add(int ... numbers) { //...은 0개부터 여러숫자지정가능. numbers에 배열로 들어옴
		int sum = 0;
		for(int i = 0; i <= numbers.length; i++) {
			sum += i;
		}
		System.out.println(Arrays.toString(numbers)); //배열 출력 원할 때!!!
		return sum;
	}
}


// 클래스 : 객체의 속성(멤버변수=필드)과 기능(메소드)
// 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 부름.
// 즉 객체는 모든 인스턴스를 대표하는 포괄적인 의미, 인스턴스는 구체적인 객체 하나.
class Person {
	public String name;
	public int age;
}

//보통 클래스는 private로 접근을 막아서 getter와 setter로 선언해서 씀
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



