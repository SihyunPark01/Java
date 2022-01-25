package java_100_2;

// 상속의 개념 - Person3 클래스 기능을 상속하고 싶을 때
public class Hero extends Character {
	
	//생성자
	public Hero(String name) {
		setName(name);
	}
	
	private boolean isFlying;
	
	//getter, setter 선언해주어 Main2 클래스에서도 사용하게 끔
	public boolean isFlying() {
		return isFlying;
	}
	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	@Override
	public void attack(Hero hero) {
		System.out.println(this.getName() + "은 " + hero.getName() + "과 싸움을 했다.");
	}
	
}
