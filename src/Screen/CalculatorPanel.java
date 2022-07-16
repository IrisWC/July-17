package Screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;


public class CalculatorPanel extends JPanel{
	
	private int mathClasses, peachIceCream, tattoos, emojis, iceCream, planeRides, lotteryTickets, nationalHolidays;
	
	private String[] mathOptions = {"0", "1", "2", "3", "4+"};
	private String[] peachOptions = {"0", "1-5", "6-10", "11-15", "16+"};
	private String[] tattooOptions = {"0", "1-2", "3-4", "4-5", "6+"};
	private String[] emojiOptions = {"0", "1-5", "6-15", "16-30", "31+"};
	private String[] iceCreamOptions = {"0", "1", "2-3", "4-6", "7+"};
	private String[] planeOptions = {"0", "1", "2-3", "4-6", "7+"};
	private String[] lotteryOptions = {"0", "1", "2-5", "6-15", "16+"};
	private String[] holidayOptions = {"0", "1-3", "4-9", "10", "11+"};
	
	public CalculatorPanel() {
		//background image
		
		
		//drop down
		//Int[] 
		
		
		//drop down boxes
//		String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
//		
//		JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
//	    jComboBox.setBounds(80, 50, 140, 20);
//	    
//	    ImageIcon icon = new ImageIcon("img//Test.png");
//	    
//	    JButton jButton = new JButton(icon);
//	    jButton.setBounds(100, 100, 90, 20);
//	    jButton.setBackground(Color.BLACK);
//	    jButton.setBorderPainted(false);
//	
//	//        JLabel jLabel = new JLabel();
//	//        jLabel.setBounds(90, 100, 400, 100);
//	    
//	    add(jButton);
//	    add(jComboBox);
//	    //add(jLabel);
//	    
//	    BufferedImage background;
//		try {
//			background = ImageIO.read(new File("img//calculator.png"));
//			JLabel picLabel = new JLabel(new ImageIcon(background));
//			add(picLabel);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	    
//	    jButton.addActionListener(new ActionListener() {
//	        @Override
//	        public void actionPerformed(ActionEvent e) {
//	            String selectedFruit = "You selected " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
//	            //jLabel.setText(selectedFruit);
//	        };
//	    });
	}
	
	public long calculateNetWorth() {
		return 0;
	}
	
//	public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(image, 0, 0, this);       
//    }
}

