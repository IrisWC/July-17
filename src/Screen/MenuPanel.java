package Screen;

import javax.swing.*;

import java.awt.Color;
import java.awt.color.*;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel{
	
	JButton calculatorButton;
	
	public MenuPanel(ActionListener a) {
		setBackground(Color.BLACK);
		calculatorButton = new JButton("Net Worth Calculator");
		calculatorButton.addActionListener(a);
	}

}
