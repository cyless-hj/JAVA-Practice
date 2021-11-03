
public class Archer {

	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	//자기 자신의 인스턴스와 오브젝트가 같은지 비교하여 출력
	public boolean equals(Object obj) {
		Archer temp = (Archer) obj;
		if(name == temp.name && power == temp.power){
			return true;
		}
		else
		{
			return false;
		}
	}
}
