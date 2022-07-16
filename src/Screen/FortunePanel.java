package Screen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FortunePanel extends JPanel{
	
	
	public FortunePanel() {
		BufferedImage background;
		try {
			background = ImageIO.read(new File("img//fortune.png"));
			JLabel picLabel = new JLabel(new ImageIcon(background));
			add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
}
