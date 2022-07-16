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
	
	private BufferedImage image;
	
	
	public CalculatorPanel() {
		//background image
//		BufferedImage myPicture;
//		try {
//			myPicture = ImageIO.read(new File("calculator.png"));
//			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//			add(picLabel);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		Image background;
	    try {
	        background = ImageIO.read(new File("calculator.png")).getScaledInstance(1600, 900, Image.SCALE_SMOOTH);
	        JLabel picLabel = new JLabel(new ImageIcon(background));
			add(picLabel);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		
		String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
		
		JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(80, 50, 140, 20);
        
        ImageIcon icon = new ImageIcon("Test.png");
        
        JButton jButton = new JButton(icon);
        jButton.setBounds(100, 100, 90, 20);
        jButton.setBackground(Color.BLACK);
        jButton.setBorderPainted(false);

//        JLabel jLabel = new JLabel();
//        jLabel.setBounds(90, 100, 400, 100);
        
        add(jButton);
        add(jComboBox);
        //add(jLabel);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = "You selected " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
                //jLabel.setText(selectedFruit);
            }
        });
	}
	
//	public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(image, 0, 0, this);       
//    }
}

