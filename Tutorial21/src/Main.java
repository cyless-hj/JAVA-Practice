import java.util.Scanner;

//다형성은 다양한 형태의 성질을 가진다.
//자바에서는 다형성을 이용하여 객체를 사용할 때 사용하는 변수 형태를 바꾸어 여러 타입의 객체를 참조할 수 있다.
//다형성은 부모 클래스 타입의 참조변수로 하위 클래스의 객체를 참조할 수 있게 해준다.
public class Main {

	public static void main(String[] args) {

		Fruit fruit1 = new Peach();
		fruit1.show();
		System.out.println();
		
		Fruit fruit2 = new Banana();
		fruit2.show();
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("바나나 : 1, 복숭아 : 2 ? ");
		int input = scanner.nextInt();
		Fruit fruit; //미리 선언 후 조건문 이용하여 효율적 사용
		
		if(input == 1)
		{
			fruit = new Banana();
			fruit.show();
		}
		else if(input == 2)
		{
			fruit = new Peach();
			fruit.show();
		}

	}

}
