package products;

public class Product {
	private String pid, pname, pdescription, pcategory, pmanufacturer, pcondition, pproductImage;
	private int punitPrice, punitsInstock;
	
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
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public String getPmanufacturer() {
		return pmanufacturer;
	}
	public void setPmanufacturer(String pmanufacturer) {
		this.pmanufacturer = pmanufacturer;
	}
	public String getPcondition() {
		return pcondition;
	}
	public void setPcondition(String pcondition) {
		this.pcondition = pcondition;
	}
	public String getPproductImage() {
		return pproductImage;
	}
	public void setPproductImage(String pproductImage) {
		this.pproductImage = pproductImage;
	}
	public int getPunitPrice() {
		return punitPrice;
	}
	public void setPunitPrice(int punitPrice) {
		this.punitPrice = punitPrice;
	}
	public int getPunitsInstock() {
		return punitsInstock;
	}
	public void setPunitsInstock(int punitsInstock) {
		this.punitsInstock = punitsInstock;
	}
}
