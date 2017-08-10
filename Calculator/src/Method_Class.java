import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Method_Class extends JFrame{
	
	
	
	private JTextField textField;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton button_multiplication;
	private JButton button_divide;
	private JButton button_adding;
	private JButton button_remove;
	private JButton button_equals;
	private JButton clear;
	double result;
	double firstNumber;
	double secondNumber;
	double firstNumber2;
	double secondNumber2;
	double textField2;

	int operation;

	
	
	public Method_Class(){
		super("Kalkulator by K.T");
		setLayout(new FlowLayout());
		
		
		button1 = new JButton("1");
		add(button1);

		
		button2 = new JButton("2");
		add(button2);

		button3 = new JButton("3");
		add(button3);

		button4 = new JButton("4");
		add(button4);

		button5 = new JButton("5");
		add(button5);

		button6 = new JButton("6");
		add(button6);

		button7 = new JButton("7");
		add(button7);

		button8 = new JButton("8");
		add(button8);

		button9 = new JButton("9");
		add(button9);

		button0 = new JButton("0");
		add(button0);

		button_multiplication = new JButton("*");
		add(button_multiplication);

		button_divide = new JButton("/");
		add(button_divide);

		button_adding = new JButton("+");
		add(button_adding);

		button_remove = new JButton("-");
		add(button_remove);

		button_equals = new JButton("=");
		add(button_equals);
		
		clear = new JButton("Clear");
		add(clear);

		textField = new JTextField(20);
		add(textField);
	
	
	
	theHandler handler = new theHandler();
	
	
	button1.addActionListener(handler);
	button2.addActionListener(handler);
	button3.addActionListener(handler);
	button4.addActionListener(handler);
	button5.addActionListener(handler);
	button6.addActionListener(handler);
	button7.addActionListener(handler);
	button8.addActionListener(handler);
	button9.addActionListener(handler);
	button0.addActionListener(handler);
	button_multiplication.addActionListener(handler);
	button_divide.addActionListener(handler);
	button_adding.addActionListener(handler);
	button_remove.addActionListener(handler);
	button_equals.addActionListener(handler);
	clear.addActionListener(handler);
	textField.addActionListener(handler);
	
	}
	
	private class theHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
		
				
	if(event.getSource() == button1)
		textField.setText(textField.getText() + "1");
	 if(event.getSource() == button2)
		textField.setText(textField.getText() +"2");
	 if(event.getSource() == button3)
		textField.setText(textField.getText() +"3");
	 if(event.getSource() == button4)
		textField.setText(textField.getText() +"4");
	 if(event.getSource() == button5)
		textField.setText(textField.getText() +"5");
	 if(event.getSource() == button6)
		textField.setText(textField.getText() +"6");
	 if(event.getSource() == button7)
		textField.setText(textField.getText() +"7");
	 if(event.getSource() == button8)
		textField.setText(textField.getText() +"8");
	 if(event.getSource() == button9)
		textField.setText(textField.getText() +"9");
	 if(event.getSource() == button0)
		textField.setText(textField.getText() +"0");
	 
	 
	
	
	if(event.getSource() == button_multiplication) {
		firstNumber = Double.parseDouble(textField.getText());
		textField.setText("");
		operation = 1;
	}
	 if(event.getSource() == button_divide){
		firstNumber = Double.parseDouble(textField.getText());
		textField.setText("");
		operation = 2;
	}
	 if(event.getSource() == button_adding){
		firstNumber = Double.parseDouble(textField.getText());
		textField.setText("");
		operation = 3;
	}
	 if(event.getSource() == button_remove){
		firstNumber = Double.parseDouble(textField.getText());
		textField.setText("");
		operation = 4;
	}
	 if(event.getSource() == clear){
		 textField.setText(null);
		
	 }
	
	if(event.getSource() == button_equals){
		secondNumber = Double.parseDouble(textField.getText().toString());
		textField.setText(textField.getText());
		
		switch(operation){
		case 1: {
			result = firstNumber * secondNumber;
			break;
		}
		case 2:{
			result = firstNumber/secondNumber;
			break;
		}
		case 3:{
			result = firstNumber + secondNumber;
			break;
		}
		case 4:{
			result = firstNumber - secondNumber;
			break;
		}
		
		
		
		
		
		}
		
		textField.setText(result + "");

	}

	
		
		
	
}
		}
	}


	
	


	

