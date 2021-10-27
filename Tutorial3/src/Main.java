
public class Main {

	public static void main(String[] args) {
		int a = (int) 0.5; //형변환
		System.out.println(a);
		
		double b = 0.5;
		int c = (int) (b + 0.5); //형변환은 버림을 하기 때문에 0.5를 더하여 형변환 시 반올림
		System.out.println(c);

		for(char i = 'a'; i <= 'z'; i++) // a - z 알파벳 출력
		{
			System.out.print(i+ " ");
			System.out.print("\n");
		}
		
		int d = 200; //진수 변환
		System.out.println("10진수 : " + d);
		System.out.format("8진수 : %o\n", d);
		System.out.format("16진수 : %x\n", d);
		
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0, 1)); //0번째 문자부터 1번째 문자까지
		System.out.println(name.substring(3, 6)); //3번째 문자부터 6번째 문자까지
		System.out.println(name.substring(5, 8));
	}

}
