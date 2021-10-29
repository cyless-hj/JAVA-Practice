
public class Main {

	public static void main(String[] args) {
		
		int N = 50;
		int[][] array = new int[N][N];
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int) (Math.random() * 10);//0 - 9 랜덤한 정수 생성
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
