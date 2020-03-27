package lab3;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shapes {

	public Triangle(int x, int y, int i, Color color) {
		super(x, y, i, color);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(getColor());
		int[] xPoints = new int[3];
		xPoints[0] = getX() + 20;
		xPoints[1] = getX() + 40;
		xPoints[2] = getX();

		int[] yPoints = new int[3];
		yPoints[0] = getY();
		yPoints[1] = getY() + 40;
		yPoints[2] = getY() + 40;

		g.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public Shapes getShapes(int x, int y, int i, Color color) {

		return new Triangle((x - 18), (y - 23), i, color);
	}
}