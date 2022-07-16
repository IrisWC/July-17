package Screen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FortunePanel extends JPanel{
	
	
	public FortunePanel() {
		ImageIcon background = new ImageIcon("img//fortune.png");
		JLabel label = new JLabel(background);
		label.setSize(1600, 900);
		
		add(label);
	}
	
}
