package Core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Screen.*;

public class Main {
	public static void main(String args[]) {
		JFrame window = new JFrame("July 17");
		window.setSize(800, 450);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    July17 panel = new July17();
	    CalculatorScreen calculator = new CalculatorScreen();
	    //calculator.setBackground(Color.WHITE);
	    Container c = window.getContentPane();
	    c.add(panel);
	    c.add(calculator);

	    window.setVisible(true);
	}
}
