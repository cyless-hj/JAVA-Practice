
public class Main {

	public static void main(String[] args) {
		//학생 인스턴스 변수 생성
		Student student1 = new Student("홍길동", 20, 175, 70, "20170101", 1, 4.5);
		Student student2 = new Student("이순신", 20, 175, 70, "20170101", 1, 4.5);
		student1.show();
		student2.show();
	}

}
