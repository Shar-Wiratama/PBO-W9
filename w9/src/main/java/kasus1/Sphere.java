package kasus1;

public class Sphere extends Shape{
	private double radius; // jari-jari dalam bentuk feet
	
	public Sphere(double r) { // constructor untuk Sphere
		super("Sphere");
		radius = r;
	}
	
	@Override
	public double area() { // mengembalikan nilai rumus bola
		return 4*Math.PI*radius*radius;
	}
	
	public String toString() { // mengembalikan nilai toString
		return super.toString() + " of radius " + radius;
	}
}