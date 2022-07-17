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
	JLabel fortuneLabel, fortune1Label, fortune2Label, fortune3Label, fortune4Label, fortune5Label, fortune6Label, fortune7Label, fortune8Label;
	
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
		Image nwcIconNew = nwcIcon.getImage();
		Image nwcIconModified = nwcIconNew.getScaledInstance(282, 282, Image.SCALE_SMOOTH);
		nwcIcon = new ImageIcon(nwcIconModified);
	    goCalculator = new JButton(nwcIcon);
	    goCalculator.setBounds(787, 90, 282, 282);
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
	    calcButton.addActionListener(this);
	    
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
		
		ImageIcon getCardIcon = new ImageIcon("img//getCard.png");
		Image getCardIconNew = getCardIcon.getImage();
		Image getCardIconModified = getCardIconNew.getScaledInstance(160, 74, Image.SCALE_SMOOTH);
		getCardIcon = new ImageIcon(getCardIconModified);
	    
	    fortuneButton = new JButton(getCardIcon);
	    fortuneButton.setBounds(730, 650, 160, 74);
	    fortuneButton.setBackground(Color.BLACK);
	    fortuneButton.setBorderPainted(false);
	    fortuneButton.addActionListener(this);
	    
	    ImageIcon fortune1Icon = new ImageIcon("img//fortune1.png");
	    Image fortune1IconNew = fortune1Icon.getImage();
		Image fortune1IconModified = fortune1IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune1Icon = new ImageIcon(fortune1IconModified);
		fortune1Label = new JLabel(fortune1Icon);
		fortune1Label.setBounds(0, 740, 1600, 157);
		
		ImageIcon fortune2Icon = new ImageIcon("img//fortune2.png");
	    Image fortune2IconNew = fortune2Icon.getImage();
		Image fortune2IconModified = fortune2IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune2Icon = new ImageIcon(fortune2IconModified);
		fortune2Label = new JLabel(fortune2Icon);
		fortune2Label.setBounds(0, 740, 1600, 157);
	    
	    ImageIcon fortune3Icon = new ImageIcon("img//fortune3.png");
	    Image fortune3IconNew = fortune3Icon.getImage();
		Image fortune3IconModified = fortune3IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune3Icon = new ImageIcon(fortune3IconModified);
		fortune3Label = new JLabel(fortune3Icon);
		fortune3Label.setBounds(0, 740, 1600, 157);
	    
	    ImageIcon fortune4Icon = new ImageIcon("img//fortune4.png");
	    Image fortune4IconNew = fortune4Icon.getImage();
		Image fortune4IconModified = fortune4IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune4Icon = new ImageIcon(fortune4IconModified);
		fortune4Label = new JLabel(fortune4Icon);
		fortune4Label.setBounds(0, 740, 1600, 157);
	    
	    ImageIcon fortune5Icon = new ImageIcon("img//fortune5.png");
	    Image fortune5IconNew = fortune5Icon.getImage();
		Image fortune5IconModified = fortune5IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune5Icon = new ImageIcon(fortune5IconModified);
		fortune5Label = new JLabel(fortune5Icon);
		fortune5Label.setBounds(0, 740, 1600, 157);
	    
	    ImageIcon fortune6Icon = new ImageIcon("img//fortune6.png");
	    Image fortune6IconNew = fortune6Icon.getImage();
		Image fortune6IconModified = fortune6IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune6Icon = new ImageIcon(fortune6IconModified);
		fortune6Label = new JLabel(fortune6Icon);
		fortune6Label.setBounds(0, 740, 1600, 157);
		
		ImageIcon fortune7Icon = new ImageIcon("img//fortune7.png");
	    Image fortune7IconNew = fortune7Icon.getImage();
		Image fortune7IconModified = fortune7IconNew.getScaledInstance(1600, 157, Image.SCALE_SMOOTH);
		fortune7Icon = new ImageIcon(fortune7IconModified);
		fortune7Label = new JLabel(fortune7Icon);
		fortune7Label.setBounds(0, 740, 1600, 157);
	    
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
			JFrame result = new JFrame();
			result.setSize(400, 400);
			result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			result.setLocationRelativeTo(null);
			result.setVisible(true);
		}
		if(e.getSource() == fortuneButton) {
			int rand = (int)(Math.random()*8);
			switch(rand) {
			case 1:
				fortuneLabel.add(fortune1Label);
				break;
			case 2:
				fortuneLabel.add(fortune2Label);
				break;
			case 3:
				fortuneLabel.add(fortune3Label);
				break;
			case 4:
				fortuneLabel.add(fortune4Label);
				break;
			case 5:
				fortuneLabel.add(fortune5Label);
				break;
			case 6:
				fortuneLabel.add(fortune6Label);
				break;
			case 7:
				fortuneLabel.add(fortune7Label);
				break;
			case 8:
				fortuneLabel.add(fortune8Label);
				break;
			}
			fortunePanel.revalidate();
			fortunePanel.repaint();
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
