package com.example.maven.calculator_mirunal_cornelial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class MainFrame {

	private JFrame frmCalculator;
	private JTextField textfield1;
	private JTextField textfield2;
	JLabel lblResult = new JLabel("Result: ");
	
	SimpleCalculator c = new SimpleCalculator();
	AdvancedCalculator ca = new AdvancedCalculator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 756, 621);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		
		
		JLabel lblFirstNumber = new JLabel("first number");
		lblFirstNumber.setBounds(12, 25, 112, 15);
		frmCalculator.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("second number");
		lblSecondNumber.setBounds(12, 63, 112, 15);
		frmCalculator.getContentPane().add(lblSecondNumber);
		
		
		
	
		lblResult.setBounds(12, 112, 326, 15);
		frmCalculator.getContentPane().add(lblResult);
		
		textfield1 = new JTextField();
		textfield1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textfield1.setBounds(166, 23, 114, 19);
		frmCalculator.getContentPane().add(textfield1);
		textfield1.setColumns(10);
		
		textfield2 = new JTextField();
		textfield2.setBounds(166, 61, 114, 19);
		frmCalculator.getContentPane().add(textfield2);
		textfield2.setColumns(10);
		
		/**
		 * get the numbers from the textfields
		 *  call the method addition from basic calculator
		 *update the label result
		 */
	
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double secondNumber = Double.parseDouble(textfield2.getText().toString());
				double result = c.addition(firstNumber, secondNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
				
			
				
			}
		});
		btnAddition.setBounds(7, 150, 117, 25);
		frmCalculator.getContentPane().add(btnAddition);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double secondNumber = Double.parseDouble(textfield2.getText().toString());
				double result = c.subtraction(firstNumber, secondNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnSubtraction.setBounds(7, 187, 117, 25);
		frmCalculator.getContentPane().add(btnSubtraction);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double secondNumber = Double.parseDouble(textfield2.getText().toString());
				double result = c.multiplication(firstNumber, secondNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnMultiplication.setBounds(7, 224, 117, 25);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double secondNumber = Double.parseDouble(textfield2.getText().toString());
				double result = c.division(firstNumber, secondNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnDivision.setBounds(7, 261, 117, 25);
		frmCalculator.getContentPane().add(btnDivision);
		
		JButton btnRaised2 = new JButton("x2");
		btnRaised2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double result = ca.raisedToThePowerOf2(firstNumber);
			
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnRaised2.setBounds(7, 298, 117, 25);
		frmCalculator.getContentPane().add(btnRaised2);
		
		JButton btnRaised3 = new JButton("x3");
		btnRaised3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double result = ca.raisedToThePowerOf3(firstNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnRaised3.setBounds(228, 150, 117, 25);
		frmCalculator.getContentPane().add(btnRaised3);
		
		JButton btnRaised4 = new JButton("x4");
		btnRaised4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double result = ca.raisedToThePowerOf4(firstNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnRaised4.setBounds(228, 187, 117, 25);
		frmCalculator.getContentPane().add(btnRaised4);
		
		JButton btnRemainder = new JButton("%");
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double secondNumber = Double.parseDouble(textfield2.getText().toString());
				double result = ca.remainder(firstNumber, secondNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnRemainder.setBounds(228, 230, 117, 25);
		frmCalculator.getContentPane().add(btnRemainder);
		
		JButton btnSquareRoot = new JButton(" √");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double result = ca.squareRoot(firstNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});	
		btnSquareRoot.setBounds(228, 267, 117, 25);
		frmCalculator.getContentPane().add(btnSquareRoot);
		
		JButton btnCubeRoot = new JButton("3√");
		btnCubeRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(textfield1.getText().toString());
				double result = ca.cubeRoot(firstNumber);
				
				lblResult.setText("Result: "+result);
				textfield1.setText("");
				textfield2.setText("");
			}
		});
		btnCubeRoot.setBounds(228, 304, 117, 25);
		frmCalculator.getContentPane().add(btnCubeRoot);
	}
}
