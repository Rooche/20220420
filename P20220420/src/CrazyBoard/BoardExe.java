package CrazyBoard;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		// 1. 글등록 2.글수정 3.글삭제 4.글상세조회(글번호) 5.전체목록 6.종료
		Scanner sc = new Scanner(System.in);

		BoardService service = new BoardApp();

		while (true) {
			System.out.println("1. 글등록 2.글수정 3.글삭제 4.글상세조회(글번호) 5.전체목록 6.종료");
			System.out.println("선택 >>");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == BoardService.ADD) {
				service.addBoard();
			} else if (menu == BoardService.MOD) {
				service.modBoard();
			} else if (menu == BoardService.DEL) {
				service.delBoard();
			} else if (menu == BoardService.SEARCH) {
				service.searchBoard();
			} else if (menu == BoardService.LIST) {
				service.listBoard();
			} else {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

}
