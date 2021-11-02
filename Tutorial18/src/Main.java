//추상은 직접적으로 인스턴스 생성 불가능
//추상 클래스는 상속을 받아야 사용 가능
public class Main extends Player {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.crying();
		cat.crying();
		
		Main main = new Main();
		main.play("Gaeko - Feel so good");
		main.pause();
		main.stop();

	}
//Override 필수
	@Override
	void play(String songName) {
		
		System.out.println(songName + " 곡을 재생합니다.");
		
	}

	@Override
	void pause() {
		
		System.out.println("곡을 일시정지합니다.");
		
	}

	@Override
	void stop() {
		
		System.out.println("곡을 정지합니다.");
		
	}

}
