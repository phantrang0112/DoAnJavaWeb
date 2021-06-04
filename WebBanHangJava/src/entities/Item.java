package entities;

public class Item {
	Product product;
	String filter;
	int soluong;
	public Item(Product product, int soluong) {
		super();
		this.product = product;
		this.soluong = soluong;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public Item(Product product, String filter, int soluong) {
		super();
		this.product = product;
		this.filter = filter;
		this.soluong = soluong;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public Item() {
		super();
	}
	public Item(Product product, String filter) {
		super();
		this.product = product;
		this.filter = filter;
	}

}
