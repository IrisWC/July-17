package Core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Screen.*;

public class July17 extends JFrame implements ActionListener {
	
	CardLayout cl;
	Container container;
	JPanel menuPanel, calculatorPanel, fortunePanel, infoPanel;
	JButton goMenu1, goMenu2, goMenu3, goCalculator, goFortune, goInfo;
	
	public July17() {
		super("July 17");
		cl = new CardLayout();
		container = getContentPane();
		container.setLayout(cl);
		
		menuPanel = new JPanel();
		calculatorPanel = new JPanel();
		fortunePanel = new JPanel();
		infoPanel = new JPanel();
		
		goMenu1 = new JButton("Back");
		goMenu2 = new JButton("Back");
		goMenu3 = new JButton("Back");
		goCalculator = new JButton("Net Worth Calculator");
		goFortune = new JButton("Fortune Teller");
		goInfo = new JButton("Info");
		
		
		goMenu1.addActionListener(this);
		goMenu2.addActionListener(this);
		goMenu3.addActionListener(this);
		goCalculator.addActionListener(this);
		goFortune.addActionListener(this);
		goInfo.addActionListener(this);
		
		menuPanel.add(goCalculator);
		menuPanel.add(goFortune);
		menuPanel.add(goInfo);
		calculatorPanel.add(goMenu1);
		fortunePanel.add(goMenu2);
		infoPanel.add(goMenu3);
		
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
