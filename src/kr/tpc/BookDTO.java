package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// ����Ʈ ������ �޼���(����)
	public BookDTO() {
		// ��ü�� �����ϴ� �۾��� �Ѵ�.
	}
	
	public BookDTO(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
