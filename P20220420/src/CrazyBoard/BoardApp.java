package CrazyBoard;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp implements BoardService {

	// 게시글번호 / 제목 / 내용 / 작성자 / 작성일시
	Scanner sc = new Scanner(System.in);

	ArrayList<Board> board = new ArrayList<Board>();

	@Override
	public void addBoard() {
		System.out.println("게시글 번호");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("제목");
		String title = sc.nextLine();
		System.out.println("내용");
		String content = sc.next();
		System.out.println("작성자");
		String name = sc.next();
		System.out.println("작성일시");
		String date = sc.next();

		board.add(new Board(number, title, content, name, date));
	}

//	@Override
//	public void modBoard() {
//		System.out.println("게시글번호를 입력해주세요.");
//		int number = sc.nextInt();
//		sc.nextLine();
//		for (int i = 0; i < board.size(); i++) {
//			if (board.get(i).se
//				break;
//			}
//		}
		
		

	@Override
	public void delBoard() {

	}

	@Override
	public void searchBoard() {

	}

	@Override
	public void listBoard() {
		for (int i = 0; i < board.size(); i++) {
			System.out.println(board.get(i).toString());
	//		break;
		}

	}

	@Override
	public void modBoard() {
		// TODO Auto-generated method stub
		
	}

}
