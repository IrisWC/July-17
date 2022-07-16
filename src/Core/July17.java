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
	}
}
