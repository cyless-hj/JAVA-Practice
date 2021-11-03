//객체(Object) 클래스는 모든 객체의 조상으로서 쓰인다.
//사실 모든 클래스는 암시적으로 Object 클래스를 상속 받고 있다. Object 클래스는 모든 클래스의 조상이다.
//모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위함
public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		System.out.println(archer1 == archer2);//내부 값이 같아도 다른 인스턴스기 때문에 false 반환
		System.out.println(archer1.equals(archer2));
	}

}
