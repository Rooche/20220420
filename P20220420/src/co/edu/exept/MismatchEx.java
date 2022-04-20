package co.edu.exept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택>>");
			int menu = 0;

			
			try {
				Class.forName("java.lang.String"); // Runtime
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}
			
			
			try {
				menu = Integer.parseInt(sc.next()); // "10"이라는 것을 10으로 포현이 가능함, "ten" -> 10으로는 불가능
				//menu = sc.nextInt(); // RuntimeException
				
			} catch (ArrayIndexOutOfBoundsException e) { //예외처리
				System.out.println("배열의 범위를 넘어서 처리하려고 합니다");
				
			} catch (InputMismatchException  | NumberFormatException e2) {
				System.out.println("숫자선택");
				sc.nextLine();
				
			} catch(Exception e3) {
				System.out.println("알수 없는 예외 발생");
			} finally { //try구문이 시작되면 반드시 처리되는걸 넣을때 finally
				System.out.println("예외처리에서 반드시 한번은 실행");
			}
			
			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of prog");
	}

}
