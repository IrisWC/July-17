package Screen;

import java.awt.Color;

import javax.swing.*;

public class CalculatorPanel extends JPanel{
	public CalculatorPanel() {
		setBackground(Color.WHITE);
		String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        String getFavFruit = (String) JOptionPane.showInputDialog(
                null,
                "What fruit do you like the most?",
                "Choose Fruit",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[3]);
	}
}
