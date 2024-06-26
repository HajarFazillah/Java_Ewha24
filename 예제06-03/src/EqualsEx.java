// 예제 6-3 : Point 클래스에 equals() 작성
// Point 클래스에 두 점의 좌표가 같으면 true 를 리턴하는 equals() 를 작성하라

class Point{
	private int x, y;
	
	// Constructor to initialize Point object with given coordinates
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Override equals method to check equality based on coordinates
	public boolean equals(Object obj) {
		// Cast obj to Point
		Point p = (Point)obj;
		// Check if the coordinates are equal
		if(x==p.x&&y==p.y)
			return true;
		else
			return  false;
	}
}

public class EqualsEx{
	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if (a==b)// false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) //false
			System.out.println("a is equal to c");
	}
}