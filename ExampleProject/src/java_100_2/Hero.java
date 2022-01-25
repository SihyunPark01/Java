package java_100_2;

// ����� ���� - Person3 Ŭ���� ����� ����ϰ� ���� ��
public class Hero extends Character {
	
	//������
	public Hero(String name) {
		setName(name);
	}
	
	private boolean isFlying;
	
	//getter, setter �������־� Main2 Ŭ���������� ����ϰ� ��
	public boolean isFlying() {
		return isFlying;
	}
	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	@Override
	public void attack(Hero hero) {
		System.out.println(this.getName() + "�� " + hero.getName() + "�� �ο��� �ߴ�.");
	}
	
}
