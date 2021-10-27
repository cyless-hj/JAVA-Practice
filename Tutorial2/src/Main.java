
public class Main {
	
	final static double PI = 3.141592; // 상수 선언
	
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		int intType = 100;
		double doubleType = 50.5;
		String stringType = "정현진";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);

		int r = 30;
		System.out.println(r * r * PI);
		
		int a = INT_MAX;
		System.out.println(a);
		System.out.println(a + 1); // 오버플로 발생 - 정수형의 최소값
		System.out.println(a); // 정수형의 최대값
		
		//사칙연산
		int x = 1;
		int y = 2;
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
	}

}
