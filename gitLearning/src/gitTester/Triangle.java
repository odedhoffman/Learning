package gitTester;

public class Triangle implements Shape {
	
	private double base;
	private double hight;
	
	Triangle(double base, double hight) {
		this.base = base;
		this.hight = hight;
	}
	
	@Override
	public double calcSize() {
		return base*hight/2;
	}

	@Override
	public String getType() {
		return "I'm Triangle";
	}

}
