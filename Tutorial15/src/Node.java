
public class Node {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	//x값을 설정
	public void setX(int x) {
		this.x = x; //this는 x값을 바꾸는 함수
	}
	
	public int getY() {
		return y;
	}
	//y값을 설정
	public void setY(int y) {
		this.y = y; //this는 y값을 바꾸는 함수
	}
	//생성자 - 인스턴스 생성시 자동으로 값을 넣어주는 것
	//x, y 값 초기화
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//다른 노드의 좌표와 비교하여 정 중앙의 좌표를 반환
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
