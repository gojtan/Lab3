package lab3;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shapes {

	public Square(int x, int y, int i, Color color) {
		super(x, y, i, color);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX(), getY(), 40, 40);
	}

	@Override
	public Shapes getShapes(int x, int y, int i, Color color) {
		return new Square((x - 18), (y - 23), i, color);
	}

}
