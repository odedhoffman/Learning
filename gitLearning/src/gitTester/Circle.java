package gitTester;

public class Circle implements Shape {
	
	private double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcSize() {
		return radius*Math.pow(Math.PI, 2);
	}

	@Override
	public String getType() {
		return "I'm Circle";
	}

}
