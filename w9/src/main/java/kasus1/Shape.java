package kasus1;

public abstract class Shape {
	// variabel instance
	private String shapeName;
	
	// abstract method dari area()
	public abstract double area();
	
	// set shapeName
	public Shape(String name) {
		this.shapeName = name;
	}
	
	// toString method, mengembalikan nama dari Shape
	public String toString() {
		return shapeName;
	}
}