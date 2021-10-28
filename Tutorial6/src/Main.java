
public class Main {
//조건문을 사용한 점수에 따른 학점 
	public static void main(String[] args) {
		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+ 입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B+ 입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C+ 입니다.");
		}
		else
		{
			System.out.println("A+ 입니다.");
		}
		
		String a = "Man";
		int b = 0;
	
		//Java는 String을 비교할 때 equal()을 이용
		//그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문
		
		if(a.contentEquals("Man"))
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
		}
		
		if(b == 3)
		{
			System.out.println("b는 3 입니다.");
		}
		else
		{
			System.out.println("b는 3이 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 3) //equalsIgnoreCase는 대소문자 구분 없이 문자가 같은지 검사
		{
			System.out.println("참입니다.");
		}
		else
		{
			System.out.println("거짓입니다.");
		}
	}

}
