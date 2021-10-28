import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner - 입출력 라이브러리
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt(); //사용자가 입력한 정수를 i에 넣음
		System.out.println("입력한 정수는 " + i + "입니다.");
		sc.close();
		
		File file = new File("input.txt"); //input.txt 라는 파일을 불러와 처리 가능하게 해준다.
		try { //실행 부분
			Scanner sc2 = new Scanner(file);
			while(sc2.hasNextInt())
			{
				System.out.println(sc2.nextInt() * 100);
			}
			sc2.close();
		} catch (FileNotFoundException e) { //FileNotFoundException 오류가 발생할 경우 다음과같이 처리하는 예외처리 구문
			System.out.println("파일을 불러오는 도중에 오류가 발생했습니다.");
		}
		
	}

}
