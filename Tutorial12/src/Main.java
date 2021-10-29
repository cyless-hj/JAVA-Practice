
public class Main {
	
	//피보나치 수열의 원소를 찾는 함수
	public static int fibonacci(int number) {
				int one = 1;
				int two = 1;
				int result = -1;
				
				if(number == 1)
				{
					return one;
				}
				else if(number == 2)
				{
					return two;
				}
				else
				{
					for(int i = 2; i < number; i++)
					{
						result = one + two;
						one = two;
						two = result;
					}
				}
				return result;
			}
	
	//재귀함수를 이용한 피보나치 수열의 원소를 찾는 함수
	//재귀함수를 이용할 경우 특정한 숫자 연산이 반복되어 기하급수적으로 연산이 복잡해질 수 있다는 문제 발생 가능
	//연산의 복잡도를 고려하여 재귀함수와 반복 함수의 적절한 사용 필요
	public static int fibonacciRecursive(int number) {
		if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else
		{
			return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacciRecursive(10) + "입니다.");

	}

}
