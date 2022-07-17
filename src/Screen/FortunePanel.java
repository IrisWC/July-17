package Screen;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class FortunePanel extends JPanel {
	
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
	    
	    //fortune
//	    ImageIcon fortune1Icon = new ImageIcon("img//fortune1.png");
//	    Image fortune1IconNew = fortune1Icon.getImage();
//		Image fortune1IconModified = fortune1IconNew.getScaledInstance(383, 37, Image.SCALE_SMOOTH);
//		fortune1Icon = new ImageIcon(fortune1IconModified);
//		JLabel fortune1Label = new JLabel(fortune1Icon);
//		fortune1Label.setBounds(613, 756, 383, 37);
		
//		ImageIcon fortune2Icon = new ImageIcon("img//fortune2.png");
//	    Image fortune2IconNew = fortune2Icon.getImage();
//		Image fortune2IconModified = fortune2IconNew.getScaledInstance(557, 37, Image.SCALE_SMOOTH);
//		fortune2Icon = new ImageIcon(fortune2IconModified);
//		JLabel fortune2Label = new JLabel(fortune2Icon);
//		fortune2Label.setBounds(520, 756, 557, 37);
	    
	    ImageIcon fortune3Icon = new ImageIcon("img//fortune3.png");
	    Image fortune3IconNew = fortune3Icon.getImage();
		Image fortune3IconModified = fortune3IconNew.getScaledInstance(703, 37, Image.SCALE_SMOOTH);
		fortune3Icon = new ImageIcon(fortune3IconModified);
		JLabel fortune3Label = new JLabel(fortune3Icon);
		fortune3Label.setBounds(448, 756, 703, 37);
	    
	    fortuneLabel.add(fortuneButton);
		add(fortuneLabel);
		
//		fortuneLabel.add(fortune1Label);
//		fortuneLabel.add(fortune2Label);
		fortuneLabel.add(fortune3Label);
	}
	
}
