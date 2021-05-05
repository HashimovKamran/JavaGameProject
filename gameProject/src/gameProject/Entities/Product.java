package gameProject.Entities;

public class Product {
	private int id;
	private String productName;
	private int unitPrice;
	private int stock;

	public Product(int id, String productName, int unitPrice, int stock) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
