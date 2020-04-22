import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Button;

public class calc {

	private JFrame frame;
	private JTextField num2field;
	private JTextField num1field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		frame.getContentPane().setBackground(new Color(51, 204, 51));
		frame.setBounds(100, 100, 618, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel num1Label = new JLabel("Number 1:");
		num1Label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		num1Label.setBounds(46, 26, 102, 48);
		frame.getContentPane().add(num1Label);

		JLabel num2Label = new JLabel("Number 2:");
		num2Label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		num2Label.setBounds(46, 134, 102, 34);
		frame.getContentPane().add(num2Label);

		num2field = new JTextField();
		num2field.setForeground(new Color(255, 255, 255));
		num2field.setBackground(new Color(102, 102, 102));
		num2field.setBounds(238, 136, 116, 38);
		frame.getContentPane().add(num2field);
		num2field.setColumns(10);

		JLabel resultLabel = new JLabel("Result:");
		resultLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		resultLabel.setBounds(46, 279, 476, 38);
		frame.getContentPane().add(resultLabel);

		JButton Clear = new JButton("C");
		Clear.setBackground(new Color(102, 102, 102));
		Clear.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1field.setText(" ");
				num2field.setText(" ");
				resultLabel.setText("Result: ");
			}
		});
		Clear.setBounds(458, 82, 89, 67);
		frame.getContentPane().add(Clear);

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1field.getText());
					double num2 = Double.parseDouble(num2field.getText());
					double result = num1 + num2;
					resultLabel.setText(String.format("Result: %.3f", result));
				} catch (NumberFormatException e1) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});
		btnNewButton_1.setBounds(47, 224, 55, 34);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBackground(new Color(102, 102, 102));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1field.getText());
					double num2 = Double.parseDouble(num2field.getText());
					double result = num1 - num2;
					resultLabel.setText(String.format("Result: %.3f", result));
				} catch (NumberFormatException e1) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});
		btnNewButton_2.setBounds(139, 224, 55, 34);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("*");
		btnNewButton_3.setBackground(new Color(102, 102, 102));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1field.getText());
					double num2 = Double.parseDouble(num2field.getText());
					double result = num1 * num2;
					resultLabel.setText(String.format("Result: %.3f", result));
				} catch (NumberFormatException e1) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});
		btnNewButton_3.setBounds(227, 224, 55, 34);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.setBackground(new Color(102, 102, 102));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1field.getText());
					double num2 = Double.parseDouble(num2field.getText());
					double result = num1 / num2;
					resultLabel.setText(String.format("Result: %.3f", result));
				} catch (NumberFormatException e1) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});
		btnNewButton_4.setBounds(305, 224, 55, 34);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Max");
		btnNewButton_5.setBackground(new Color(102, 102, 102));
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1field.getText());
					double num2 = Double.parseDouble(num2field.getText());
					double result = Math.max(num1, num2);
					resultLabel.setText(String.format("Result: %.3f", result));
				} catch (NumberFormatException e1) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});
		btnNewButton_5.setBounds(401, 224, 89, 34);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Min");
		btnNewButton_6.setBackground(new Color(102, 102, 102));
		btnNewButton_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1field.getText());
					double num2 = Double.parseDouble(num2field.getText());
					double result = Math.min(num1, num2);
					resultLabel.setText(String.format("Result: %.3f", result));
				} catch (NumberFormatException e1) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});
		btnNewButton_6.setBounds(500, 224, 92, 34);
		frame.getContentPane().add(btnNewButton_6);

		num1field = new JTextField();
		num1field.setForeground(new Color(255, 255, 255));
		num1field.setBackground(new Color(102, 102, 102));
		num1field.setBounds(238, 37, 116, 34);
		frame.getContentPane().add(num1field);
		num1field.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(102, 102, 102));
		separator.setBounds(10, 11, 582, 4);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(102, 102, 102));
		separator_1.setBounds(10, 328, 582, 4);
		frame.getContentPane().add(separator_1);

	}
}
