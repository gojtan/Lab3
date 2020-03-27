package lab3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ClearPanel extends JPanel {

	public ClearPanel(Model model, DrawPanel drawPanel) {
		super();
		JButton clear = new JButton("Rensa");
		this.add(clear);
		this.setBorder((BorderFactory.createLineBorder(Color.black)));
		this.setBackground(Color.lightGray);

		clear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				model.clear();
				drawPanel.repaint();

			}

		});
	}
}
