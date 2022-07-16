package Core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Screen.*;

public class July17 extends JFrame implements ActionListener {
	
	CardLayout cl;
    JPanel mainPanel;
    MenuPanel menu;
    CalculatorPanel calculator;
    FortunePanel fortune;
	
	public July17() {
		cl = new CardLayout();
		mainPanel = new JPanel(cl);
		menu = new MenuPanel();
		calculator = new CalculatorPanel();
		fortune = new FortunePanel();
		
//		JButton back = new JButton("Go back");
//		back.addActionListener(this);
//		
		mainPanel.add(menu, "menu");
		mainPanel.add(calculator, "calculator");
		mainPanel.add(fortune, "fortune");
		
		add(mainPanel);
		add(menu);
		add(calculator);
		setSize(1600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		cl.show(mainPanel, "menu");
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                July17 game = new July17();
            }
        });
    }
}
