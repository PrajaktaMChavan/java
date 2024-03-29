package oops;

public class Product {
	private double price;
	public void setPrice(double price) {
		//validation
		if(price>0) {
			this.price=price;
			
		}
	}
	public double getPrice() {
		return price;
	}

}
