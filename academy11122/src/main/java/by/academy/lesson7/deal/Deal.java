package by.academy.lesson7.deal;

import java.util.Arrays;

public class Deal {
	private User seller;
	private User buyer;
	private Product[] products;
	private int index = 0;

	public Deal() {
		super();
		this.products = new Product[10];
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		this.index = products.length;
	}

	private void grow() {
		int newLength = (int) (products.length == 0 ? 1 : products.length * 1.5);
		Product[] newProducts = new Product[newLength];
		System.arraycopy(products, 0, newProducts, 0, products.length);
		products = newProducts;
	}

	public void addProduct(Product product) {
		if (index == products.length) {
			grow();
		}
		products[index++] = product;
	}

	public Product getProduct(int index) {
		return products[index];
	}

	public void removeProduct(int index) {

	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [seller=");
		builder.append(seller);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", products=");
		builder.append(Arrays.toString(products));
		builder.append(", index=");
		builder.append(index);
		builder.append("]");
		return builder.toString();
	}
}
