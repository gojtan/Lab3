package lab3;

import java.awt.Color;
import java.util.ArrayList;

public class Model {
	private static ArrayList<Shapes> shapes = new ArrayList<Shapes>();

	public static void addShape(int x, int y, Color color) {
		Shapes s = ShapePanel.getCurrentShape().getShapes(x, y, 40, color);
		shapes.add(s);
	}

	public static ArrayList<Shapes> getShapes() {
		return shapes;
	}

	public void clear() {
		shapes.clear();
	}

}