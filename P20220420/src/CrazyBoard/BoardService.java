package CrazyBoard;

public interface BoardService {

	// 1. 글등록 2.글수정 3.글삭제 4.글상세조회(글번호) 5.전체목록 6.종료
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int LIST = 5;

	public void addBoard();

	public void modBoard();

	public void delBoard();

	public void searchBoard();

	public void listBoard();

}
