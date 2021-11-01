
public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
	//마우스 우클릭 - Source - Generate Getters and Setters 이용하여 아래 자동 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//마우스 우클릭 - Source - Generate Constructor using Fields 이용하여 생성자 생성
	public Person(String name, int age, int height, int weight) {
		super();//부모 클래스의 생성자 실행
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
}
