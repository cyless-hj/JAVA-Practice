
public class Main {
	
	//number의 k번 째 약수 찾기
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public static char func(String input) { //문자열의 마지막 character를 추출하는 함수
		return input.charAt(input.length() - 1); //charAt - String에서 character를 하나 추출
	}
	
	//a, b 중 큰 값을 반환
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	//a, b, c 중 가장 큰 값 반환
	public static int maxium(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {
		int result = function(3050, 10);
		if(result == -1)
		{
			System.out.println("3050의 10번 째 약수는 없습니다.");
		}
		else
		{
			System.out.println("3050의 10번 째 약수는 " + result + "입니다.");
		}
		
		System.out.println("Hello world의 마지막 단어는 " + func("Hello world"));
		
		System.out.println("(345, 567, 789) 중에서 가장 큰 값은 " + maxium(345, 567, 789));
	}

}
