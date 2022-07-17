package Screen;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class InfoPanel extends JPanel{

	public InfoPanel() {
		
		ImageIcon backButton = new ImageIcon("img//backButton.png");
		Image backButtonNew = backButton.getImage();
		Image backButtonModified = backButtonNew.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		backButton = new ImageIcon(backButtonModified);
		
		JButton goMenu3 = new JButton(backButton);
		goMenu3.setBounds(80, 80, 70, 70);
		goMenu3.setBackground(Color.BLACK);
		goMenu3.setBorderPainted(false);
	    
	    ImageIcon infoBackground = new ImageIcon("img//info.png");
		JLabel infoLabel = new JLabel(infoBackground);
		infoLabel.setSize(1600, 900);
		
		ImageIcon buttonPointerIcon = new ImageIcon("img//buttonPointer.png");
	    Image buttonPointerIconnNew = buttonPointerIcon.getImage();
		Image buttonPointerIconModified = buttonPointerIconnNew.getScaledInstance(213, 32, Image.SCALE_SMOOTH);
		buttonPointerIcon = new ImageIcon(buttonPointerIconModified);
		JLabel buttonPointerLabel = new JLabel(buttonPointerIcon);
		buttonPointerLabel.setBounds(160, 97, 213, 32);
		
		infoLabel.add(goMenu3);
		infoLabel.add(buttonPointerLabel);
		
		add(infoLabel);
	}
}
