package java_100_2;

public class Person3 {
	// 멤버변수 - 메소드 밖에서 선언된 변수, 지역변수 - 메소드 안에 선언된 변수, 메소드가 호출될 때 메모리에 공간을 할당받고 종료 시 해제됨
	// 생성자 개념 - 객체를 생성할 때 호출, 멤버변수(필드)의 초기화를 담당, 모든 클래스는 생성자가 반드시 존재하고, 하나 이상을 가질 수 있음
	// 클래스 내부에 생성자 선언을 생략했다면 컴파일러가 기본 생성자를 자동 추가 시킴

	private String name; //필드 = 멤버변수나 전역변수, 클래스의 내부이며서 생성자 또는 메소드 밖에서 정의됨
	private int age;//따라서 클래스 내 모든 메소드에서 사용 가능, 메모리상에 계속 남아있음
	
	// 기본생성자 - 보통 클래스명과 동일하게 선언
	public Person3() {
	}

	// 필드를 전달받아 만들어지는 오버로드 된 생성자 & this 개념
	public Person3(String name, int age){
		this.name = name; //위의 멤버변수를 참조하기 위해서는 this.멤버변수로 초기화해야 함
		this.age = age; //왜냐하면 위의 멤버변수와 매개변수()가 같기 때문.

	// 초기화 개념 - 선언한 객체에 최초로 값을 넣어주는 것
	// 클래스 영역에 선언한 변수들은 실행 시 초기화를 하지 않아도 컴파일러가 자동으로 값 할당을 해주지만
	// 메소드 안에 선언한 변수는 자동으로 값 할당이 되지 않기 때문에 초기화하지 않으면 에러가 뜸
	}
	
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

	@Override
	public String toString() {
		return "Person3 [name=" + name + ", age=" + age + "]";
	}
		
}

