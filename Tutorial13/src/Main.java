import java.util.Scanner;

public class Main {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		
		//배열 안의 값들 중 MAX값 반환
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}

		System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : " + result + "입니다.");
		
		
		//Random한 100개의 정수의 평균 구하기
		int[] arr = new int[100];
		for(int i = 0; i < 100; i++)
		{
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(arr[i]);
			System.out.print("\t");
		}
		System.out.print("\n");
		int sum = 0;
		for(int i = 0; i < 100; i++)
		{
			sum += arr[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
	}

}
