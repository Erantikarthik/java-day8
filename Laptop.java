
public class Laptop {
	String Brand;
	String Model;
	String Battery;
	int price;
	int year;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getBattery() {
		return Battery;
	}
	public void setBattery(String battery) {
		Battery = battery;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Laptop [Brand=" + Brand + ", Model=" + Model + ", Battery=" + Battery + ", price=" + price + ", year="
				+ year + "]";
	}
	public Laptop(String brand, String model, String battery, int price, int year) {
		super();
		Brand = brand;
		Model = model;
		Battery = battery;
		this.price = price;
		this.year = year;
	}

}
