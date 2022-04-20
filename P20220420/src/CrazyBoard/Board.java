package CrazyBoard;

public class Board {
	//게시글번호 / 제목 / 내용 / 작성자 / 작성일시
	//필드
	private int number;
	private String title;
	private String content;
	private String name;
	private String Date;
	
	//생성자
	
	public int getNumber() {
		return number;
	}
	public Board(int number, String title, String content, String name, String date) {
		super();
		this.number = number;
		this.title = title;
		this.content = content;
		this.name = name;
		Date = date;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "게시글 번호 : " + number + ", 제목 : " + title + ", 내용 : " + content + ", 작성자 : " + name + ", 작성일시 : "
				+ Date + "";
	}
	
	
}
