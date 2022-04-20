package co.edu.nested;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
//		Inner inner = new Inner(); 
		//이렇게 작성시 Outer클래스라 Inner가 에러가 뜸 그래서 outer클래스를 붙이고 .을 붙여야함
//		Inner inner = outer.new Inner();
		// instance 멤버클래스
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
		
		//static 멤버클래스
		Outer.Inner2.method5();
//		inner.method2();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4(); // 인스턴스 메소드
		inner2.method5(); // 정적 메소드
		
	}
}
