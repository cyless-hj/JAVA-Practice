
public class Main {

	public static void main(String[] args) {
		String a = "I Love You.";
		if(a.contains("Love")) //contains - a라는 변수가 특정한 문자열을 포함하는지 검사
		{
			//참일 경우 실행 부분
			System.out.println("Me Too.");
		}
		else
		{
			//거짓일 경우 실행되는 부분
			System.out.println("I Hate You.");
		}
	}

}
