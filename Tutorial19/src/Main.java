//Final 은 값이 변하는 것을 막고 오버라이딩을 막고(재정의 x) 클래스에 붙으면 상속 불가능하게 한다
public class Main extends Parent {

	public static void main(String[] args) {
		
		final int number = 10; //number는 상수가 된다.
		System.out.println(number);
		
		Main main = new Main();
		main.show();
		
	}

}
