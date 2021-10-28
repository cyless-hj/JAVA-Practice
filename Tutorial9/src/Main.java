
public class Main {

	//함수 - 반환형, 함수명, 매개변수로 구성
	public static int function(int a, int b, int c) {
		int min;
		//가장 작은 수 탐색
		if(a > b)
		{
			if(b < c)
			{
				min = c;
			}
			else
			{
				min = b;
			}
		}
		else
		{
			if(a > c)
			{
				min = c;
			}
			else
				min = a;
		}
		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i ==0 && c % i == 0) //세 개의 수를 모두 나눌 수 있는 수 탐색
			{
				return i;
			}
		}
		return -1; //없는 경우 -1 리턴하여 없다는 것을 표시
	}
	
	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)의 최대공약수 : " + function(400, 300, 750));
		
	}

}
