
public class Main {
	
	final static int SECOND = 1000;

	public static void main(String[] args) {
		
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분 " + second + "초");// 분, 초 계산
		
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다.");
		a++; //증감연산자
		System.out.println("현재의 a는 " + a + "입니다.");
		System.out.println("현재의 a는 " + ++a + "입니다."); //a를 증가 시킨 후 출력
		System.out.println("현재의 a는 " + a++ + "입니다."); //출력 후 a를 증가시킨다.
		System.out.println("현재의 a는 " + a + "입니다.");
		
		System.out.println(1 % 3);//modular 연산
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int x = 50;
		int y = 50;
		//논리 연산자
		System.out.println("x와 y가 같은가요? " + (x == y));
		System.out.println("x가 y보다 큰가요? " + (x > y));
		System.out.println("x가 y보다 작은가요? " + (x < y));
		System.out.println("x가 y와 같으면서 30보다 큰가요? " + ((x == y) && (x > 30)));
		System.out.println("x가 50이 아닌가요? " + !(x == 50));
		
		int t = 50;
		int p = 60;
		
		System.out.println("최대값은 " + max(t, p) + "입니다.");
		
		double i = Math.pow(3.0, 20.0); //거듭제곱 연산
		System.out.println("3의 20 제곱은 " + (int) i + "입니다.");
		
	}
	//삼항 연산자  '조건 ? 참 : 거짓'
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
}
