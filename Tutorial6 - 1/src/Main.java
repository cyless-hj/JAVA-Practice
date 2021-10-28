
public class Main {
	
	final static int N = 30;
	final static int M = 15;
	
	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		
		while(i <= 1000)//이 부분이 참일때 실행
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");

		//for문 : 초기화 부분, 조건 부분, 연산 부분
		for(int j = N; j > 0; j--)
		{
			System.out.println("*");
		}
		
		//이중 for문
		for(int k = N; k > 0; k--)
		{
			for(int l = k; l > 0; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//원 그리기
		// 원 방정식 - x^2 + y^2 = r^2
		for(int o = -M; o <= M; o++)
		{
			for(int p = -M; p <= M; p++)
			{
				if(o * o + p * p <= M * M)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
