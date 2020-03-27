package lab3;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class DrawPanel extends JComponent {
	private Model model;

	public DrawPanel(MyWindow w, Model model) {
		this.setModel(model);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Model.addShape(e.getX(), e.getY(), ColorPanel.getCurrentColor());
				repaint();
			}
		});

	}

	public void paintComponent(Graphics g) {

		for (Shapes s : Model.getShapes()) {
			s.paintComponent(g);
		}
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}
