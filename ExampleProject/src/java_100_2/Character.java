package java_100_2;

//�߻�Ŭ���� - �߻�޼ҵ带 ����, �߻�޼ҵ�� ������ ����, ����� ���� �������̵� �ؼ� ������ ���̱� ����.
//�߻�Ŭ������ new�� ������ �� ����. �̿ϼ� Ŭ�����̱� ����. 

public abstract class Character extends Person3{ //Person3�� ��ӹްڴ�
	public abstract void attack(Hero hero); //�߻�޼ҵ��̹Ƿ� abstract ����
	
}

// �ڹٴ� ���� ��� �������� ����. �߻�Ŭ������ ���� ��Ӹ� ����.
// �������̽��� ���� ����� ȿ���� �� �� ����.
interface ICharacter {
	void attack(Person3 person);
}


// ���� �߻�Ŭ������ �������̽��� ���̸� �˾ƾ� ��.
