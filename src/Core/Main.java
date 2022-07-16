package Core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Screen.*;

public class Main {
	public static void main(String args[]) {
		//July17 window = new July17();
		JFrame window = new JFrame();
		window.setSize(1600, 900);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    CalculatorPanel calculator = new CalculatorPanel();
	    Container c = window.getContentPane();
	    c.add(calculator);

	    window.setVisible(true);
	    
	
	}
}
