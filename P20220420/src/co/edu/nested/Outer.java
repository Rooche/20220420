package co.edu.nested;

public class Outer {
	// 필드
	private String f1;

	// 멤버클래스
//	static class Inner { // 클래스안에 클래스가 있으면 중첩클래스
//	 class Inner { // 클래스안에 클래스가 있으면 중첩클래스
//		String f2;
//
//		void method2() {
//			System.out.println("method2() call.");
//		}
//
//		static void method4() {
//			System.out.println("method4() call.");
//		}
//	}
	
	class Inner1 {
		String f2;
		
		void method2() {
			System.out.println("method2() call.");
		}
	}
	static class Inner2 { // 정적클래스
		String f4; // static이 아닌 필드
		static String f5; //static인 필드
		
		void method4() {
			System.out.println("method4() call.");
		}
		static void method5() {
			System.out.println("method5() call.");
		}
	}

	// 메소드
	public void method1() {
		System.out.println("method1() call.");

		// 로컬클래스
		class Local {
			String f3;

			void method3() {
				System.out.println("method3() call.");
			}
		}

		Local local = new Local();
		local.method3();
	}

}
