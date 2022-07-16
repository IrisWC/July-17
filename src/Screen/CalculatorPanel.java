package Screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorPanel extends JPanel{
	public CalculatorPanel() {
		setBackground(Color.WHITE);
		
		String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
		
		JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(80, 50, 140, 20);
        
        JButton jButton = new JButton("Done");
        jButton.setBounds(100, 100, 90, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(90, 100, 400, 100);
        
        add(jButton);
        add(jComboBox);
        add(jLabel);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = "You selected " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
                jLabel.setText(selectedFruit);
            }
        });
	}
}
