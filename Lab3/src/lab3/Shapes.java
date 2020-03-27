package lab3;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shapes {
	private int x;
	private int y;
	private Color color;

	public Shapes(int x, int y, int i, Color color) {

		this.x = x;
		this.y = y;
		this.color = color;
	}

	public abstract void paintComponent(Graphics g);

	public void setShape(int x, int y, int diameter, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public abstract Shapes getShapes(int x, int y, int i, Color color);

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Color getColor() {
		return color;
	}

}