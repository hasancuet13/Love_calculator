package LoveCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class AgeCalculator {

	private JFrame frmAgeCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextPane txtpnDate;
	private JTextPane txtpnDate_1;
	private JTextPane txtpnMonth;
	private JTextPane txtpnMonth_1;
	private JTextPane txtpnYear;
	private JTextPane txtpnYear_1;
	private JTextPane txtpnEnterCurrentDate;
	private JTextPane txtpnYourCurrentAge;
	private JButton btnCalculateYourAge;
	private JTextField textField_7;
	private JButton btnRefresh;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgeCalculator window = new AgeCalculator();
					window.frmAgeCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgeCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgeCalculator = new JFrame();
		frmAgeCalculator.setResizable(false);
		frmAgeCalculator.setTitle("              Age Calculator");
		frmAgeCalculator.getContentPane().setBackground(Color.GRAY);
		frmAgeCalculator.setBounds(100, 100, 570, 370);
		frmAgeCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgeCalculator.getContentPane().setLayout(null);
		
		JTextPane Birthdate = new JTextPane();
		Birthdate.setForeground(Color.ORANGE);
		Birthdate.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		Birthdate.setBackground(Color.GRAY);
		Birthdate.setEditable(false);
		Birthdate.setText("Enter Your Birth date:");
		Birthdate.setBounds(22, 42, 196, 27);
		frmAgeCalculator.getContentPane().add(Birthdate);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(252, 126, 71, 27);
		frmAgeCalculator.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(453, 126, 71, 27);
		frmAgeCalculator.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(353, 126, 71, 27);
		frmAgeCalculator.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		txtpnDate = new JTextPane();
		txtpnDate.setForeground(Color.GREEN);
		txtpnDate.setBackground(Color.GRAY);
		txtpnDate.setEditable(false);
		txtpnDate.setText("Date");
		txtpnDate.setBounds(252, 107, 71, 20);
		frmAgeCalculator.getContentPane().add(txtpnDate);
		
		txtpnMonth = new JTextPane();
		txtpnMonth.setForeground(Color.GREEN);
		txtpnMonth.setBackground(Color.GRAY);
		txtpnMonth.setEditable(false);
		txtpnMonth.setText("Month");
		txtpnMonth.setBounds(353, 107, 66, 20);
		frmAgeCalculator.getContentPane().add(txtpnMonth);
		
		txtpnYear = new JTextPane();
		txtpnYear.setForeground(Color.GREEN);
		txtpnYear.setBackground(Color.GRAY);
		txtpnYear.setEditable(false);
		txtpnYear.setText("Year");
		txtpnYear.setBounds(453, 107, 53, 20);
		frmAgeCalculator.getContentPane().add(txtpnYear);
		
		txtpnEnterCurrentDate = new JTextPane();
		txtpnEnterCurrentDate.setForeground(Color.ORANGE);
		txtpnEnterCurrentDate.setBackground(Color.GRAY);
		txtpnEnterCurrentDate.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		txtpnEnterCurrentDate.setEditable(false);
		txtpnEnterCurrentDate.setText("Enter Current Date:");
		txtpnEnterCurrentDate.setBounds(22, 126, 196, 27);
		frmAgeCalculator.getContentPane().add(txtpnEnterCurrentDate);
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(252, 42, 71, 27);
		frmAgeCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(453, 42, 71, 27);
		frmAgeCalculator.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(353, 42, 71, 27);
		frmAgeCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		txtpnDate_1 = new JTextPane();
		txtpnDate_1.setForeground(Color.GREEN);
		txtpnDate_1.setBackground(Color.GRAY);
		txtpnDate_1.setEditable(false);
		txtpnDate_1.setText("Day");
		txtpnDate_1.setBounds(252, 22, 71, 20);
		frmAgeCalculator.getContentPane().add(txtpnDate_1);
		
		txtpnMonth_1 = new JTextPane();
		txtpnMonth_1.setForeground(Color.GREEN);
		txtpnMonth_1.setBackground(Color.GRAY);
		txtpnMonth_1.setEditable(false);
		txtpnMonth_1.setText("Month");
		txtpnMonth_1.setBounds(353, 22, 66, 20);
		frmAgeCalculator.getContentPane().add(txtpnMonth_1);
		
		txtpnYear_1 = new JTextPane();
		txtpnYear_1.setForeground(Color.GREEN);
		txtpnYear_1.setBackground(Color.GRAY);
		txtpnYear_1.setEditable(false);
		txtpnYear_1.setText("Year");
		txtpnYear_1.setBounds(453, 22, 53, 20);
		frmAgeCalculator.getContentPane().add(txtpnYear_1);
		
		btnCalculateYourAge = new JButton("Calculate Your Age");
		btnCalculateYourAge.setForeground(Color.GREEN);
		btnCalculateYourAge.setFont(new Font("Ravie", Font.PLAIN, 14));
		btnCalculateYourAge.setBackground(Color.GRAY);
		btnCalculateYourAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtpnYourCurrentAge = new JTextPane();
				txtpnYourCurrentAge.setEditable(false);
				txtpnYourCurrentAge.setBackground(Color.GRAY);
				txtpnYourCurrentAge.setText("Your Current Age:");
				txtpnYourCurrentAge.setBounds(22, 235, 125, 20);
				frmAgeCalculator.getContentPane().add(txtpnYourCurrentAge);
				
				textField_7 = new JTextField();
				textField_7.setBackground(Color.RED);
				textField_7.setText("Age is Coming...");
				textField_7.setEditable(false);
				textField_7.setBounds(216, 235, 114, 27);
				frmAgeCalculator.getContentPane().add(textField_7);
				textField_7.setColumns(10);
				
			}
		});
		btnCalculateYourAge.setBounds(75, 178, 227, 27);
		frmAgeCalculator.getContentPane().add(btnCalculateYourAge);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(Color.GREEN);
		btnRefresh.setFont(new Font("Ravie", Font.PLAIN, 14));
		btnRefresh.setBackground(Color.GRAY);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnYourCurrentAge.setVisible(false);
				textField_7.setVisible(false);
			}
		});
		btnRefresh.setBounds(344, 178, 115, 27);
		frmAgeCalculator.getContentPane().add(btnRefresh);
		
		btnNewButton = new JButton("Home");
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Ravie", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgeCalculator.setVisible(false);
				HomePage.main(null);
			}
		});
		btnNewButton.setBounds(230, 290, 93, 27);
		frmAgeCalculator.getContentPane().add(btnNewButton);
		
		
	}
}
