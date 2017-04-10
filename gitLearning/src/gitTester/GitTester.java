package gitTester;

import java.util.ArrayList;
import java.util.List;

public class GitTester {
	
	private List<Shape> shapes;
	
	private void shapeShuffle() {
		for (Shape s : shapes) {
			System.out.println(s.calcSize() + " Shape type: " + s.getType());
		}
	}
	
	GitTester() {
		shapes = new ArrayList<Shape>();
		shapes.add(new Circle(3));
		shapes.add(new Triangle(6,2));
	}
	
	public static void main(String[] args) {
		GitTester gt = new GitTester();
		gt.shapeShuffle();

	}

}
