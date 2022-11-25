import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingUtilities;
import java.math.*;
import java.lang.*;
import java.awt.Window.Type;
import java.awt.event.*;
import java.lang.annotation.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingUtilities;
import java.math.*;
import java.lang.*;
import java.awt.Window.Type;
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingUtilities;
import java.math.*;
import java.lang.*;
import java.awt.Window.Type;
import java.awt.event.*;

public class Calculator {
	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btnZero;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btnSqrt;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnPlus;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDivide;
	private JButton btnPercent;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	boolean equalpress = false;

	 /**
	   * Launch the application through JFrame Window/Frame management
	   * In Window, created textField to accept the numbers, to display 
	   * the result after calculation. 
	   * Buttons are created to enable entering the numbers and perform 
	   * the operations.
	   * Internally SwingUtilities has been used .
	   */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}
	 /**
	   * Initialize the contents of the Frame
	   * The following parameters are set
	   * Title
	   * Type
	   * Boundaries
	   * Type of default operation
	   * Setting the position
	   */ 
	private void initialize() {
		frame = new JFrame("CALCULATOR");
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 256, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setBounds(10, 11, 231, 51);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		/**
		 * Declare a String backspace and assign null to it
		 * For the backspace operation, length of the textField is
		 * checked and is reduced by 1 for every button press
		 * and refreshes the textField with new String
		*/ 
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBounds(10, 73, 58, 29);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		frame.getContentPane().add(btnBackspace);
		/**
		 * The boundary values, font are set 
		 * and the button 7 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 97, 58, 29);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);
		/**
		 * The boundary values, font are set 
		 * and the button 4 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		btn4 = new JButton("4");
		btn4.setBounds(10, 124, 58, 29);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);
		/**
		 * The boundary values, font are set 
		 * and the button 1 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		btn1 = new JButton("1");
		btn1.setBounds(10, 151, 58, 29);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
        btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		/**
		 * The boundary values, font are set 
		 * and the button 0 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		btnZero = new JButton("0");
		btnZero.setBounds(10, 176, 58, 29);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btnZero.getText();
				textField.setText(number);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnZero);
		/**
		 * The boundary values, font are set 
		 * and the button Clear is added to the frame
		 * This clears the textField
		*/ 
		btnClear = new JButton("C");
		btnClear.setBounds(67, 73, 58, 29);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnClear);
		/**
		 * The boundary values, font are set 
		 * and the button 8 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		btn8 = new JButton("8");
		btn8.setBounds(67, 97, 58, 29);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		/**
		 * The boundary values, font are set 
		 * and the button 5 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		
		btn5 = new JButton("5");
		btn5.setBounds(67, 124, 58, 29);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);
		/**
		 * The boundary values, font are set 
		 * and the button 2 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/ 
		btn2 = new JButton("2");
		btn2.setBounds(67, 151, 58, 29);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);
		/**
		 * The boundary values, font are set 
		 * and the button dot is added to the frame
		 * Take text from the user and displays the dot in the textField
		*/ 
		btnDot = new JButton(".");
		btnDot.setBounds(67, 176, 58, 29);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDot);
		/**
		 * The boundary values, font are set 
		 * and the button Square root is added to the frame
		 * Squarerroot operation will be performed only if
		 * the textField is not blank 
		 * The textField shall be set to zero for the firstpress
		*/ 
		
		
		btnSqrt = new JButton("√");
		btnSqrt.setBounds(123, 73, 58, 29);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					first = Double.parseDouble(textField.getText());
					operation = "√";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSqrt);
		/**
		 * The boundary values, font are set 
		 * and the button 9 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/
		
		btn9 = new JButton("9");
		btn9.setBounds(123, 97, 58, 29);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);
		/**
		 * The boundary values, font are set 
		 * and the button 6 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/
		
		btn6 = new JButton("6");
		btn6.setBounds(123, 124, 58, 29);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);
		/**
		 * The boundary values, font are set 
		 * and the button 3 is added to the frame
		 * Attribute equalpress finds the previous calculation and
		 * refreshes the textField when new number is entered
		 * Take text from the user and display the text in the textField
		*/
		
		btn3 = new JButton("3");
		btn3.setBounds(123, 151, 58, 29);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalpress == true) {
					textField.setText(null);
					equalpress = false;
				}
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);
		/**
		 * The boundary values, font are set 
		 * and the button equal is added to the frame
		 * when the equal button is pressed it checks the 
		 * operation to be performed (+,-,%,/,√) based on the operation button pressed
		 * and takes the recent number in the textField as second number
		*/
		
		btnEqual = new JButton("=");
		btnEqual.setBounds(123, 176, 58, 29);
		btnEqual.setToolTipText("");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				if (!textField.getText().isBlank()) {
					equalpress = true;
					second = Double.parseDouble(textField.getText());
					if (operation == "+") {
						result = first + second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "-") {
						result = first - second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "*") {
						result = first * second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "/") {
						result = first / second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
						if (second == 0) {
							textField.setText(" Invalid Division");
						} else if (result == result / second) {
							textField.setText(answer);
						}
					} else if (operation == "%") {
						result = first % second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					} else if (operation == "√") {
						result = Double.parseDouble(textField.getText());
						Double sqrt = Math.sqrt(result);
						answer = String.format("%.2f", result);
						textField.setText(Double.toString(sqrt));
					}
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnEqual);
		/**
		 * Determine the first number when operation button + is pressed
		 * and clear the textField for the second number 
		*/
		
		btnPlus = new JButton("+");
		btnPlus.setBounds(178, 73, 58, 29);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "+";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPlus);
		/**
		 * Determine the first number when operation button - is pressed
		 * and clear the textField for the second number
		*/
		
		btnSub = new JButton("-");
		btnSub.setBounds(178, 97, 58, 29);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "-";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSub);
		/**
		 * Determine the first number when operation button * is pressed
		 * and clear the textField for the second number
		*/
		
		btnMul = new JButton("*");
		btnMul.setBounds(178, 124, 58, 29);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnMul);
		/**
		 * Determine the first number when operation button / is pressed
		 * and clear the textField for the second number
		*/
		
		btnDivide = new JButton("/");
		btnDivide.setBounds(178, 151, 58, 29);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDivide);
		/**
		 * Determine the first number when operation button % is pressed
		 * and clear the textField for the second number
		*/
		
		btnPercent = new JButton("%");
		btnPercent.setBounds(178, 176, 58, 29);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "%";
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPercent);
	}
}
