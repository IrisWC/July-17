package Screen;

import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.color.*;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel{
	
	public MenuPanel(ActionListener a) {
		ImageIcon menuBackground = new ImageIcon("img//menu.gif"); //TODO link to correct background file
		JLabel menuLabel = new JLabel(menuBackground);
		menuLabel.setSize(1600, 900);
		
		ImageIcon nwcIcon = new ImageIcon("img//nwc.png"); //TODO link to correct button image
	    JButton goCalculator = new JButton(nwcIcon);
	    goCalculator.setBounds(675, 737, 250, 90);
	    goCalculator.setBackground(Color.BLACK);
	    goCalculator.setBorderPainted(true);
	    
	    ImageIcon fortuneIcon = new ImageIcon("img//ft.png"); //TODO link to correct button image
	    JButton goFortune = new JButton(fortuneIcon);
	    goFortune.setBounds(675, 737, 250, 90);
	    goFortune.setBackground(Color.BLACK);
	    goFortune.setBorderPainted(true);
	    
	    ImageIcon infoIcon = new ImageIcon("img//i.png"); //TODO link to correct button image
	    JButton goInfo = new JButton(infoIcon);
	    goInfo.setBounds(675, 737, 250, 90);
	    goInfo.setBackground(Color.BLACK);
	    goInfo.setBorderPainted(true);
	    
	    
	}

}
