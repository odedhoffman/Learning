package gitTester;

import java.util.ArrayList;
import java.util.List;

public class GitTester {
	
	private List<Shape> shapes;
	
	private void shapeShuffle() {
		for (Shape s : shapes) {
			System.out.println("Shape size: " + s.calcSize() + " Shape type: " + s.getType());
		}
		System.out.println("Adding printer");
	}
	
	GitTester() {
		shapes = new ArrayList<Shape>();
		shapes.add(new Circle(3));
		shapes.add(new Triangle(6,2));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to shape master");
		GitTester gt = new GitTester();
		gt.shapeShuffle();

	}

}
