
public class Main {

	public static void main(String[] args) {
		//1. 자신의 이름을 출력하는 프로그램을 작성해보세요.
		System.out.println("정현진");

		//2. 아래 프로그램의 실행 결과를 써보세요.
		//20, 100, 2, 20, 5
		System.out.println(10 + 10);
		System.out.println(10 * 10);
		System.out.println(20 / 10);
		System.out.println(30 - 10);
		System.out.println(395 % 10);		
		
		//3. 사각형 모양 출력
		for(int i = 0; i < 10; i++)
		{
				for(int j = 0; j  < 10; j++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
	}

}
