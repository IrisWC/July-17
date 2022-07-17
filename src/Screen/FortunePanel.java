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
//		Image fortune1IconModified = fortune1IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune1Icon = new ImageIcon(fortune1IconModified);
//		JLabel fortune1Label = new JLabel(fortune1Icon);
//		fortune1Label.setBounds(0, 740, 1600, 157);
		
//		ImageIcon fortune2Icon = new ImageIcon("img//fortune2.png");
//	    Image fortune2IconNew = fortune2Icon.getImage();
//		Image fortune2IconModified = fortune2IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune2Icon = new ImageIcon(fortune2IconModified);
//		JLabel fortune2Label = new JLabel(fortune2Icon);
//		fortune2Label.setBounds(0, 740, 1600, 157);
	    
//	    ImageIcon fortune3Icon = new ImageIcon("img//fortune3.png");
//	    Image fortune3IconNew = fortune3Icon.getImage();
//		Image fortune3IconModified = fortune3IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune3Icon = new ImageIcon(fortune3IconModified);
//		JLabel fortune3Label = new JLabel(fortune3Icon);
//		fortune3Label.setBounds(0, 740, 1600, 157);
	    
//	    ImageIcon fortune4Icon = new ImageIcon("img//fortune4.png");
//	    Image fortune4IconNew = fortune4Icon.getImage();
//		Image fortune4IconModified = fortune4IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune4Icon = new ImageIcon(fortune4IconModified);
//		JLabel fortune4Label = new JLabel(fortune4Icon);
//		fortune4Label.setBounds(0, 740, 1600, 157);
	    
//	    ImageIcon fortune5Icon = new ImageIcon("img//fortune5.png");
//	    Image fortune5IconNew = fortune5Icon.getImage();
//		Image fortune5IconModified = fortune5IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune5Icon = new ImageIcon(fortune5IconModified);
//		JLabel fortune5Label = new JLabel(fortune5Icon);
//		fortune5Label.setBounds(0, 740, 1600, 157);
	    
//	    ImageIcon fortune6Icon = new ImageIcon("img//fortune6.png");
//	    Image fortune6IconNew = fortune6Icon.getImage();
//		Image fortune6IconModified = fortune6IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune6Icon = new ImageIcon(fortune6IconModified);
//		JLabel fortune6Label = new JLabel(fortune6Icon);
//		fortune6Label.setBounds(0, 740, 1600, 157);
		
//		ImageIcon fortune7Icon = new ImageIcon("img//fortune7.png");
//	    Image fortune7IconNew = fortune7Icon.getImage();
//		Image fortune7IconModified = fortune7IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
//		fortune7Icon = new ImageIcon(fortune7IconModified);
//		JLabel fortune7Label = new JLabel(fortune7Icon);
//		fortune7Label.setBounds(0, 740, 1600, 157);
	    
	    ImageIcon fortune8Icon = new ImageIcon("img//fortune8.png");
	    Image fortune8IconNew = fortune8Icon.getImage();
		Image fortune8IconModified = fortune8IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune8Icon = new ImageIcon(fortune8IconModified);
		JLabel fortune8Label = new JLabel(fortune8Icon);
		fortune8Label.setBounds(0, 740, 1600, 157);
	    
	    
	    fortuneLabel.add(fortuneButton);
		add(fortuneLabel);
		
		fortuneLabel.add(fortune8Label);
	}
	
}
