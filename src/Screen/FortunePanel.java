package Screen;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class FortunePanel extends JPanel{
	
	public FortunePanel() {
		
		//background
		ImageIcon fortuneBackground = new ImageIcon("img//fortune.png");
		JLabel fortuneLabel = new JLabel(fortuneBackground);
		fortuneLabel.setSize(1600, 900);
		
		
		//button
		ImageIcon fortuneIcon = new ImageIcon("img//getCard.png");
		Image fortuneIconNew = fortuneIcon.getImage();
		Image fortuneIconModified = fortuneIconNew.getScaledInstance(160, 74, Image.SCALE_SMOOTH);
		fortuneIcon = new ImageIcon(fortuneIconModified);
	    
	    JButton fortuneButton = new JButton(fortuneIcon);
	    fortuneButton.setBounds(730, 650, 160, 74);
	    fortuneButton.setBackground(Color.BLACK);
	    fortuneButton.setBorderPainted(true);
	    
	    
	    fortuneLabel.add(fortuneButton);
		add(fortuneLabel);
	}
	
}
