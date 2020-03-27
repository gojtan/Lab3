package lab3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	private ArrayList<Color> colors = new ArrayList<Color>();

	private static Color currentColor = Color.BLACK;

	public ColorPanel(Model model) {
		super();
		this.setPreferredSize(new Dimension(30, 270));
		this.setMaximumSize(new Dimension(30, 270));
		this.setBorder((BorderFactory.createLineBorder(Color.gray)));

		Color saksblå = new Color(163, 248, 253);
		Color rosa = new Color(245, 99, 240);
		Color lila = new Color(160, 37, 255);

		colors.add(0, Color.BLACK);
		colors.add(1, Color.GREEN);
		colors.add(2, Color.BLUE);
		colors.add(3, Color.YELLOW);
		colors.add(4, Color.RED);
		colors.add(5, Color.ORANGE);	
		colors.add(6, saksblå);
		colors.add(7, lila);
		colors.add(8, rosa);

		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				int colorama = e.getY() / 30;
				for (int i = 0; i < colors.size(); ++i) {
					if (i == colorama) {
						currentColor = colors.get(i);
					}
				}
				repaint();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		int y = 0;
		for (Color c : colors) {
			g.setColor(c);
			g.fillRect(0, y, 30, 30);
			if (c == currentColor) {
				g.setColor(Color.WHITE);
				g.fillRect(11, y + 11, 9, 9);
			}
			y = y + 30;
		}

	}

	public static Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		ColorPanel.currentColor = currentColor;
	}

}