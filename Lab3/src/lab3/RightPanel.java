package lab3;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class RightPanel extends JPanel {

	public RightPanel(Model model) {
		this.setPreferredSize(new Dimension(50, 400));
		this.setMaximumSize(new Dimension(50, 400));
		// this.setBorder((BorderFactory.createLineBorder(Color.black)));
		this.setBackground(Color.lightGray);
		this.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.black));
	
		ColorPanel colorPanel = new ColorPanel(model);
		ShapePanel shapePanel = new ShapePanel(model);		
		this.add(colorPanel);
		this.add(shapePanel);
	}

}