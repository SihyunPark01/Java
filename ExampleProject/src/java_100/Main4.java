package java_100;

public class Main4 {

	public static void main(String[] args) {
		// 스레드 - 자바는 기본적으로 메인스레드에서 동작함
		// 여러가지 일을 동시에 처리하고자 할 때 스레드를 작동시킴
		System.out.println("1");
		
		new Thread(new Runnable() { //Runnable은 인터페이스
			
			@Override
			public void run() { //run은 추상메소등
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

		//람다식 - 추상메소드 1개만 가지는 인터페이스는 이렇게 간단하게 사용 가능.
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
