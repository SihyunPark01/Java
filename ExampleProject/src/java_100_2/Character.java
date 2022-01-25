package java_100_2;

//추상클래스 - 추상메소드를 포함, 추상메소드는 내용이 없지, 상속을 통해 오버라이드 해서 구현할 것이기 때문.
//추상클래스는 new로 생성할 수 없음. 미완성 클래스이기 때문. 

public abstract class Character extends Person3{ //Person3을 상속받겠다
	public abstract void attack(Hero hero); //추상메소드이므로 abstract 선언
	
}

// 자바는 다중 상속 지원하지 않음. 추상클래스는 단일 상속만 가능.
// 인터페이스는 다중 상속의 효과를 낼 수 있음.
interface ICharacter {
	void attack(Person3 person);
}


// 따라서 추상클래스와 인터페이스의 차이를 알아야 함.
