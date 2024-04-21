// 예제 4-11 : static 멤버를 가진 Calc 클래스 작성
// 전역 함수로 작성하ㅏ고자 하는 abs, max, min의
// 3개 함수를 static 매소드로 작성하고 호출하는 사례를 보여라.

class Calc{
	public static int abs(int a) {
		return a>0?a:-a;
	}
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	public static int min(int a, int b) {
		return (a>b)?b:a;
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
	}
}
