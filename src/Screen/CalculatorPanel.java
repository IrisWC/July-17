package Screen;

import java.awt.Color;
import javax.swing.*;


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
		
//		BufferedImage img;
//		try {
//			img = ImageIO.read(new File("img//calculator.png"));
//			JLabel picLabel = new JLabel(new ImageIcon(img));
//			add(picLabel);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		ImageIcon background = new ImageIcon("img//calculator.png");
		JLabel label = new JLabel(background);
		label.setSize(1600, 900);
		
		
		JComboBox<String> mathBox = new JComboBox<>(mathOptions);
	    mathBox.setBounds(543, 244, 140, 50);
	    mathBox.setBackground(Color.WHITE);
	    mathBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> peachBox = new JComboBox<>(peachOptions);
	    peachBox.setBounds(543, 376, 140, 50);
	    peachBox.setBackground(Color.WHITE);
	    peachBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> tattooBox = new JComboBox<>(tattooOptions);
	    tattooBox.setBounds(543, 491, 140, 50);
	    tattooBox.setBackground(Color.WHITE);
	    tattooBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> emojiBox = new JComboBox<>(emojiOptions);
	    emojiBox.setBounds(543, 623, 140, 50);
	    emojiBox.setBackground(Color.WHITE);
	    emojiBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> iceCreamBox = new JComboBox<>(iceCreamOptions);
	    iceCreamBox.setBounds(1263, 244, 140, 50);
	    iceCreamBox.setBackground(Color.WHITE);
	    iceCreamBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> planeBox = new JComboBox<>(planeOptions);
	    planeBox.setBounds(1263, 376, 140, 50);
	    planeBox.setBackground(Color.WHITE);
	    planeBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> lotteryBox = new JComboBox<>(lotteryOptions);
	    lotteryBox.setBounds(1263, 508, 140, 50);
	    lotteryBox.setBackground(Color.WHITE);
	    lotteryBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> holidayBox = new JComboBox<>(holidayOptions);
	    holidayBox.setBounds(1263, 623, 140, 50);
	    holidayBox.setBackground(Color.WHITE);
	    holidayBox.setForeground(new Color(40, 75, 80));
	    
	    label.add(mathBox);
	    label.add(peachBox);
	    label.add(tattooBox);
	    label.add(emojiBox);
	    label.add(iceCreamBox);
	    label.add(planeBox);
	    label.add(lotteryBox);
	    label.add(holidayBox);
	    
	    ImageIcon icon = new ImageIcon("img//calculateNW.png");
	    
	    JButton calcButton = new JButton(icon);
	    calcButton.setBounds(675, 737, 250, 90);
	    calcButton.setBackground(Color.BLACK);
	    calcButton.setBorderPainted(true);
	    
	    label.add(calcButton);
	    
//	    JButton jButton = new JButton(icon);
//	    jButton.setBounds(100, 100, 90, 20);
//	    jButton.setBackground(new Color(40, 75, 80));
//	    jButton.setBorderPainted(false);
//	
//	//        JLabel jLabel = new JLabel();
//	//        jLabel.setBounds(90, 100, 400, 100);
//	    
//	    add(jButton);
//	    add(jComboBox);
	    add(label);
	    //add(jLabel);
//	    
//	    
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

