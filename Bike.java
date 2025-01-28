
public class Bike {
	String brand;
	String model;
	String name;
	int year;
	int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", model=" + model + ", name=" + name + ", year=" + year + ", price=" + price
				+ "]";
	}
	public Bike(String brand, String model, String name, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.name = name;
		this.year = year;
		this.price = price;
	}

}
