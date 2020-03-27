package lab3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

public class ShapePanel extends JPanel {

	private static Shapes currentShape;
	private ArrayList<Shapes> shapes = new ArrayList<Shapes>();

	public ShapePanel(Model model) {
		currentShape = new Circle(0, 0, 0, Color.black);

		this.setPreferredSize(new Dimension(40, 400));
		this.setMaximumSize(new Dimension(40, 400));

		shapes.add(0, new Circle(0, 0, 0, Color.black));
		shapes.add(1, new Square(0, 0, 0, Color.black));
		shapes.add(2, new Triangle(0, 0, 0, Color.black));

		addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {

				int shaper = e.getY() / 40;
				//for (int i = 0; i < shapes.size(); ++i) {
					//if (i == shaper) {
						currentShape = shapes.get(shaper);
					//}
				//}
				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(0, 0, 40, 40);
		if (currentShape == shapes.get(0)) {
			g.setColor(Color.WHITE);
			g.fillOval(10, 10, 20, 20);

		}
		g.setColor(Color.BLACK);
		g.fillRect(0, 40, 40, 40);
		if (currentShape == shapes.get(1)) {
			g.setColor(Color.WHITE);
			g.fillOval(10, 50, 20, 20);
		}

		int[] xPoints = new int[3];
		xPoints[0] = 20;
		xPoints[1] = 40;
		xPoints[2] = 0;

		int[] yPoints = new int[3];
		yPoints[0] = 80;
		yPoints[1] = 120;
		yPoints[2] = 120;

		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, 3);
		if (currentShape == shapes.get(2)) {
			g.setColor(Color.WHITE);
			g.fillOval(12, 98, 17, 17);
		}
	}

	public static Shapes getCurrentShape() {
		return currentShape;
	}

	public void setCurrentShape(Shapes currentShape) {
		ShapePanel.currentShape = currentShape;
	}

}
