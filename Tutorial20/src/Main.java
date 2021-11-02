//인터페이스 사용 시 다중상속 구현 가능
//인터페이스에서는 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다는 특징이 있다.
//추상 클래스보다 추상화의 정도가 높다.
//인터페이스는 extends가 아닌 implements 사용
//다중 상속 가능
public class  Main implements Dog, Cat {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();

	}

	@Override
	public void crying() {
		
		System.out.println("월! 월!!");
		
	}

	@Override
	public void show() {
		
		System.out.println("Hello World!");
		
	}

	@Override
	public void two() {

		System.out.println("Two!");
		
	}

	@Override
	public void one() {
		
		System.out.println("One!");
		
	}

}
