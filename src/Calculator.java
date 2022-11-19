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

public class Calculator<DecimalFormat> {

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

	/**
	 * Launch the application.
	 */
	double first;
	double second;
	double result;
	String operation;
	String answer;

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

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("CALCULATOR");
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 256, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 231, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // working of backspace
				// Declare a string backspace and assign null to it
				String backSpace = null; // This backspace removes one character to the left with the help of
											// stringbuilder
											// class.It first checks the length of the textfield.
				if (textField.getText().length() > 0) // If it is greater than 0 that means it can delete the characters
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString(); // It deletes the characters and converts it to string and paste it
					textField.setText(backSpace); // to the textfield.
				}
			}
		});

		// This button is for backspace option

		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18)); // change the font to wingdings
		btnBackspace.setBounds(10, 73, 58, 29);
		frame.getContentPane().add(btnBackspace);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() { // here we check the contents of textField and add with the
			public void actionPerformed(ActionEvent e) { // digit which we want to click. In this it gets the content
															// of the textField, and then adds the character to it.
				// Take text from the user
				String number = textField.getText() + btn7.getText();
				// Display text in the text field
				textField.setText(number);
			}
		});

		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 97, 58, 29);
		frame.getContentPane().add(btn7);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn4.getText();
				// Display text in the textfield
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18)); // Working same as button 7
		btn4.setBounds(10, 124, 58, 29);
		frame.getContentPane().add(btn4);

		btn1 = new JButton("1");

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn1.getText();
				// Display text in the textfield
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18)); // Working same as button 7
		btn1.setBounds(10, 151, 58, 29);
		frame.getContentPane().add(btn1);

		btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btnZero.getText();
				// Display text in the textfield
				textField.setText(number);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnZero.setBounds(10, 176, 58, 29);
		frame.getContentPane().add(btnZero);

		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Text field to be blank on clicking the clear button
				textField.setText(null); // We just the set the textField to null
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(67, 73, 58, 29);
		frame.getContentPane().add(btnClear);

		btn8 = new JButton("8"); // Working same as button 7
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn8.getText();
				// Display text in the text field
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(67, 97, 58, 29);
		frame.getContentPane().add(btn8);

		btn5 = new JButton("5"); // Working same as button 7
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn5.getText();
				// Display text in the text field
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(67, 124, 58, 29);
		frame.getContentPane().add(btn5);

		btn2 = new JButton("2"); // Working same as button 7
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn2.getText();
				// Display text in the textfield
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(67, 151, 58, 29);
		frame.getContentPane().add(btn2);
		// **This button is for the symbol "."
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btnDot.getText();
				// Display dot in the textfield
				textField.setText(number);

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(67, 176, 58, 29);
		frame.getContentPane().add(btnDot);

		// **This button is for the button Square root
		btnSqrt = new JButton("√");

		btnSqrt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isBlank()) {// Take text from the user
					first = Double.parseDouble(textField.getText()); // Square root operation.and also sets the
																		// textField to just a space
					operation = "√";

				}
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSqrt.setBounds(123, 73, 58, 29);
		frame.getContentPane().add(btnSqrt);

		btn9 = new JButton("9"); // Works same as button 7
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn9.getText();
				// Display dot in the text field
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(123, 97, 58, 29);
		frame.getContentPane().add(btn9);

		btn6 = new JButton("6"); // Working same as button 7
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn6.getText();
				// Display text in the textfield
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(123, 124, 58, 29);
		frame.getContentPane().add(btn6);

		btn3 = new JButton("3"); // Working same as button 7
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Take text from the user
				String number = textField.getText() + btn3.getText();
				// Display text in the textfield
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(123, 151, 58, 29);
		frame.getContentPane().add(btn3);
		// when the equals button is pressed then the operations variable is checked
		// for the respective operation. And then the result is calculated and printed
		// in the textField with 2 places of decimal
		btnEqual = new JButton("=");
		btnEqual.setToolTipText("");

		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				if (!textField.getText().isBlank()) {
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
					}

					else if (operation == "%") {
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
		}

		);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(123, 176, 58, 29);
		frame.getContentPane().add(btnEqual);

		// **This button is for the Addition
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() { // On clicking this button it gets the content of the textField
															// and
			public void actionPerformed(ActionEvent e) { // set it to the first and then sets the operations variable
				if (!textField.getText().isBlank()) {											// with the
				first = Double.parseDouble(textField.getText()); // addition operation.and also sets the textField to
																	// just a space
				textField.setText("");
				operation = "+";
				}

			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(178, 73, 58, 29);
		frame.getContentPane().add(btnPlus);

		// **This button is for the substraction
		btnSub = new JButton("-"); // On clicking this button it gets the content of the textField and
		btnSub.addActionListener(new ActionListener() { // set it to the firstNum and then sets the operations variable
														// with the
			public void actionPerformed(ActionEvent e) { // subtraction operation.and also sets the textField to just a
				if (!textField.getText().isBlank()) {											// space
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
				}

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(178, 97, 58, 29);
		frame.getContentPane().add(btnSub);

		// **This button is for the Multiplication
		btnMul = new JButton("*"); // On clicking this button it gets the content of the textField and
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // set it to the firstNum and then sets the operations variable
				if (!textField.getText().isBlank()) {											// with the
				first = Double.parseDouble(textField.getText()); // multiplication operation.and also sets the textField
																	// to just a space
				textField.setText("");
				operation = "*";
				}

			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(178, 124, 58, 29);
		frame.getContentPane().add(btnMul);

		// **This button is for the Division
		btnDivide = new JButton("/"); // On clicking this button it gets the content of the textField and
		btnDivide.addActionListener(new ActionListener() { // set it to the firstNum and then sets the operations
															// variable with the
			public void actionPerformed(ActionEvent e) { // division operation.and also sets the textField to just a
				if (!textField.getText().isBlank()) {											// space

				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
				}

			}

		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(178, 151, 58, 29);
		frame.getContentPane().add(btnDivide);
		// **This button is for finding the percentage
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() { // On clicking this button it gets the content of the
															// textField and
			public void actionPerformed(ActionEvent e) { // set it to the firstNum and then sets the operations variable
				if (!textField.getText().isBlank()) {											// with the
				first = Double.parseDouble(textField.getText()); // percentage operation.and also sets the textField to
																	// just a space
				textField.setText("");
				operation = "%";
				}

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(178, 176, 58, 29);
		frame.getContentPane().add(btnPercent);
	}
}
