package lab3;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow(String title) {
		super(title);

		setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);

		Model model = new Model();

		RightPanel rightPanel = new RightPanel(model);
		this.add(rightPanel, BorderLayout.EAST);

		DrawPanel drawPanel = new DrawPanel(this, model);
		this.add(drawPanel);

		ClearPanel southPanel = new ClearPanel(model, drawPanel);
		this.add(southPanel, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyWindow("Bästa ritprogrammet i norr!");
	}

}