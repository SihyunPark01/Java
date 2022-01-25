package java_100;

public class Main4 {

	public static void main(String[] args) {
		// ������ - �ڹٴ� �⺻������ ���ν����忡�� ������
		// �������� ���� ���ÿ� ó���ϰ��� �� �� �����带 �۵���Ŵ
		System.out.println("1");
		
		new Thread(new Runnable() { //Runnable�� �������̽�
			
			@Override
			public void run() { //run�� �߻�޼ҵ�
				try {
				Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() +":"+ i);
				}
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() +":"+ i);
				}
				
			}
		}).start();

		//���ٽ� - �߻�޼ҵ� 1���� ������ �������̽��� �̷��� �����ϰ� ��� ����.
		new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+":"+i);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		System.out.println("2");

	}

}
