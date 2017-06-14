package edu.oit.missing.lesson8;

public class Taobao {

	private String[] name;
	private double price;
	private int number;
	public static int amount = 0;
	public static double total = 0;

	public class Product {
		public String productName;
		public double productPrice;
		public int productNumber;

		public Product(String name, double price, int items) {
			this.productName = name;
			this.productNumber = items;
			this.productPrice = price;
		}
	}

	public void addToCart(Product product) {
		Taobao.amount = product.productNumber + Taobao.amount;
		Taobao.total = product.productNumber * product.productPrice + Taobao.total;
	}

	public int getAmount() {
		return amount;
	}

	public double getTotal() {
		return total;
	}

	public static void main(String[] args) {
		Taobao customer1 = new Taobao();
		Taobao.Product fan = customer1.new Product("Fan", 10, 2);
		Taobao.Product cup = customer1.new Product("Cup", 3, 3);
		Taobao.Product umbralla = customer1.new Product("Umbralla", 20, 3);
		customer1.addToCart(fan);
		customer1.addToCart(cup);
		customer1.addToCart(umbralla);
		System.out.println("Total amount : " + customer1.getAmount());
		System.out.println("Total price :" + customer1.getTotal());

	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}