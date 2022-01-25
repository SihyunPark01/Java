package java_100_2;

// 클래스는 (extends A, B) 이렇게 다중 상속이 불가능.
// 인터페이스는 (implements A, B) 이렇게 다중 상속이 가능.
// 다형성에 의해 Magician은 Character이기도 하면서 ICharacter2이기도 함
public class Magician extends Character implements ICharacter2{

	@Override
	public void attack(Hero hero) {
	}

	@Override
	public void attack(Person3 person) {
	}
}
