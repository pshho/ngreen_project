package product;

public class Product {
	private String pid, pname, maker, date;
	private int price;
	
	// 생성자
	public Product(String pid, String pname, String maker, String date, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.maker = maker;
		this.date = date;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
