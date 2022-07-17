package Core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Screen.*;

public class July17 extends JFrame implements ActionListener {
	
	CardLayout cl;
	Container container;
	JPanel menuPanel, calculatorPanel, fortunePanel, infoPanel;
	JButton goMenu1, goMenu2, goMenu3, goCalculator, goFortune, goInfo, calcButton, fortuneButton;
	ImageIcon backButton;
	JLabel fortuneLabel, fortune8Label;
	
	private String[] mathOptions = {"0", "1", "2", "3", "4+"};
	private String[] peachOptions = {"0", "1-5", "6-10", "11-15", "16+"};
	private String[] tattooOptions = {"0", "1-2", "3-4", "4-5", "6+"};
	private String[] emojiOptions = {"0", "1-5", "6-15", "16-30", "31+"};
	private String[] iceCreamOptions = {"0", "1", "2-3", "4-6", "7+"};
	private String[] planeOptions = {"0", "1", "2-3", "4-6", "7+"};
	private String[] lotteryOptions = {"0", "1", "2-5", "6-15", "16+"};
	private String[] holidayOptions = {"0", "1-3", "4-9", "10", "11+"};
	
	public July17() {
		super("July 17");
		cl = new CardLayout();
		container = getContentPane();
		container.setLayout(cl);
		
		menuPanel = new JPanel();
		calculatorPanel = new JPanel();
		fortunePanel = new JPanel();
		infoPanel = new JPanel();
		
		goMenu3 = new JButton("Back");

		goMenu3.addActionListener(this);
		
		infoPanel.add(goMenu3);
		
		backButton = new ImageIcon("img//backButton.png");
		Image backButtonNew = backButton.getImage();
		Image backButtonModified = backButtonNew.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		backButton = new ImageIcon(backButtonModified);
		
		//Menu Panel start --------------------------------------------------------
	    
		ImageIcon menuBackground = new ImageIcon("img//menu.gif"); 
		JLabel menuLabel = new JLabel(menuBackground);
		menuLabel.setSize(1600, 900);
		
		ImageIcon nwcIcon = new ImageIcon("img//nwc.png"); 
	    goCalculator = new JButton(nwcIcon);
	    goCalculator.setBounds(787, 90, 324, 324);
	    goCalculator.setBackground(Color.BLACK);
	    goCalculator.setBorderPainted(false);
		goCalculator.addActionListener(this);
	    
	    ImageIcon fortuneIcon = new ImageIcon("img//ft.png"); 
	    goFortune = new JButton(fortuneIcon);
	    goFortune.setBounds(1174, 90, 324, 324);
	    goFortune.setBackground(Color.BLACK);
	    goFortune.setBorderPainted(false);
		goFortune.addActionListener(this);
	    
	    ImageIcon infoIcon = new ImageIcon("img//i.png"); 
	    goInfo = new JButton(infoIcon);
	    goInfo.setBounds(787, 486, 324, 324);
	    goInfo.setBackground(Color.BLACK);
	    goInfo.setBorderPainted(false);
	    goInfo.addActionListener(this);
	    
	    menuLabel.add(goCalculator);
	    menuLabel.add(goFortune);
	    menuLabel.add(goInfo);
	    
	    menuPanel.add(menuLabel);
		
		//Menu Panel end ----------------------------------------------------------
		
		//Calculator Panel start --------------------------------------------------
		
		
		goMenu1 = new JButton(backButton);
		goMenu1.setBounds(100, 100, 50, 50);
		goMenu1.setBackground(Color.BLACK);
		goMenu1.setBorderPainted(false);
		goMenu1.addActionListener(this);
		
		ImageIcon calcBackground = new ImageIcon("img//calculator.png");
		JLabel calcLabel = new JLabel(calcBackground);
		calcLabel.setSize(1600, 900);
		
		JComboBox<String> mathBox = new JComboBox<>(mathOptions);
	    mathBox.setBounds(543, 244, 140, 50);
	    mathBox.setBackground(Color.WHITE);
	    mathBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> peachBox = new JComboBox<>(peachOptions);
	    peachBox.setBounds(543, 376, 140, 50);
	    peachBox.setBackground(Color.WHITE);
	    peachBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> tattooBox = new JComboBox<>(tattooOptions);
	    tattooBox.setBounds(543, 508, 140, 50);
	    tattooBox.setBackground(Color.WHITE);
	    tattooBox.setForeground(new Color(40, 75, 80));
	    
	    JComboBox<String> emojiBox = new JComboBox<>(emojiOptions);
	    emojiBox.setBounds(543, 625, 140, 50);
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
	    holidayBox.setBounds(1263, 625, 140, 50);
	    holidayBox.setBackground(Color.WHITE);
	    holidayBox.setForeground(new Color(40, 75, 80));
	    
	    calcLabel.add(mathBox);
	    calcLabel.add(peachBox);
	    calcLabel.add(tattooBox);
	    calcLabel.add(emojiBox);
	    calcLabel.add(iceCreamBox);
	    calcLabel.add(planeBox);
	    calcLabel.add(lotteryBox);
	    calcLabel.add(holidayBox);
	    
	    ImageIcon calcIcon = new ImageIcon("img//calculateNW.png");
	    Image calcIconNew = calcIcon.getImage();
		Image calcIconModified = calcIconNew.getScaledInstance(250, 90, Image.SCALE_SMOOTH);
		calcIcon = new ImageIcon(calcIconModified);
	    
	    calcButton = new JButton(calcIcon);
	    calcButton.setBounds(675, 737, 250, 90);
	    calcButton.setBackground(new Color(40, 75, 80));
	    calcButton.setBorderPainted(false);
	    
	    
	    calcLabel.add(calcButton);
	    
	    calcLabel.add(goMenu1);
	    
	    calculatorPanel.add(calcLabel);
		
	  //Calculator Panel end ---------------------------------------------------------
	    
	  //Fortune Panel start ----------------------------------------------------------
	    
	    goMenu2 = new JButton(backButton);
		goMenu2.setBounds(100, 100, 50, 50);
		goMenu2.setBackground(Color.BLACK);
		goMenu2.setBorderPainted(false);
		goMenu2.addActionListener(this);
	    
	    ImageIcon fortuneBackground = new ImageIcon("img//fortune.png");
		fortuneLabel = new JLabel(fortuneBackground);
		fortuneLabel.setSize(1600, 900);
		
		fortuneIcon = new ImageIcon("img//getCard.png");
		Image fortuneIconNew = fortuneIcon.getImage();
		Image fortuneIconModified = fortuneIconNew.getScaledInstance(160, 74, Image.SCALE_SMOOTH);
		fortuneIcon = new ImageIcon(fortuneIconModified);
	    
	    fortuneButton = new JButton(fortuneIcon);
	    fortuneButton.setBounds(730, 650, 160, 74);
	    fortuneButton.setBackground(Color.BLACK);
	    fortuneButton.setBorderPainted(false);
	    
	    ImageIcon fortune8Icon = new ImageIcon("img//fortune8.png");
	    Image fortune8IconNew = fortune8Icon.getImage();
		Image fortune8IconModified = fortune8IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune8Icon = new ImageIcon(fortune8IconModified);
		fortune8Label = new JLabel(fortune8Icon);
		fortune8Label.setBounds(0, 740, 1600, 157);
	    
	    fortuneLabel.add(fortuneButton);
		
		fortuneLabel.add(goMenu2);
		
		fortunePanel.add(fortuneLabel);
	    
	  //Fortune Panel end ------------------------------------------------------------
	    
		container.add(menuPanel, "menuPanel");
		container.add(calculatorPanel, "calculatorPanel");
		container.add(fortunePanel, "fortunePanel");
		container.add(infoPanel, "infoPanel");
		

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == goMenu1 || e.getSource() == goMenu2 || e.getSource() == goMenu3) {
			cl.show(container, "menuPanel");
		}
		if(e.getSource() == goCalculator) {
			cl.show(container, "calculatorPanel");
		}
		if(e.getSource() == goFortune) {
			cl.show(container, "fortunePanel");
		}
		if(e.getSource() == goInfo) {
			cl.show(container, "infoPanel");
		}
		if(e.getSource() == calcButton) {

		}
		if(e.getSource() == fortuneButton) {

		}
	}
	
//	CardLayout cl;
//    JPanel mainPanel;
//    MenuPanel menu;
//    CalculatorPanel calculator;
//    FortunePanel fortune;
//	
//	public July17() {
//		cl = new CardLayout();
//		mainPanel = new JPanel(cl);
//		menu = new MenuPanel();
//		calculator = new CalculatorPanel();
//		fortune = new FortunePanel();
//		
////		JButton back = new JButton("Go back");
////		back.addActionListener(this);
////		
//		mainPanel.add(menu, "menu");
//		mainPanel.add(calculator, "calculator");
//		mainPanel.add(fortune, "fortune");
//		
//		add(mainPanel);
//		add(menu);
//		add(calculator);
//		setSize(1600,900);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//	}
//	
//	public void actionPerformed(ActionEvent e) {
//		cl.show(mainPanel, "menu");
//	}
//	
//	public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable(){
//            @Override
//            public void run() {
//                July17 game = new July17();
//            }
//        });
//    }
}
