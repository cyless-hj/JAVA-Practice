
public class Main {

	//반복문을 이용한 팩토리얼
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum *= i;
		}
		return sum;
	}
	
	//재귀함수를 이용한 팩토리얼
	public static int factorialRecursive(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorialRecursive(number - 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + factorial(10));
		System.out.println("10 팩토리얼은 " + factorialRecursive(10));

	}

}
