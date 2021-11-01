import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher("John Doe", 25, 100, 120, "ABC201", 3000000, 5);
		teacher1.show();
		//학생 배열 생성하여 대량 입력
		Student[] student1 = new Student[100];
		for(int i = 0; i < 100; i++)
		{
			student1[i] = new Student("홍길동", 20, 175, 70, i + ""/*학번 문자열 화*/, 1, 4.5);
			student1[i].show();
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? ");
		int number = scan.nextInt();
		Student[] student2 = new Student[number];
		
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			
			student2[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		
		for(int i = 0; i < number; i++)
		{
			student2[i].show();
		}
	}

}