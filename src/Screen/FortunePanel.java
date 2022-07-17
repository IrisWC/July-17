package Screen;

import java.awt.Color;
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
		
		ImageIcon icon = new ImageIcon("img//getCard.png");
	    
	    JButton calcButton = new JButton(icon);
	    calcButton.setBounds(675, 737, 250, 90);
	    calcButton.setBackground(new Color(75, 54, 78));
//	    calcButton.setBorderPainted(false);
	    
	    label.add(calcButton);
		
		add(label);
	}
	
}
