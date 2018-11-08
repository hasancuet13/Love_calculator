package LoveCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.Toolkit;


public class HomePage {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setForeground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\World of Photos\\KAPTAI\\\u09AE\u09BE\u09B8\u09C1\u09A6 - Copy.jpg"));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setTitle("Welcome To Strange Calculator...");
		frame.setBounds(100, 100, 570, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoveCalculator = new JButton("Love Calculator");
		btnLoveCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnLoveCalculator.setBackground(Color.LIGHT_GRAY);
		btnLoveCalculator.setForeground(new Color(0, 255, 255));
		btnLoveCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LoveCalculator.main(null);
			}
		});
		btnLoveCalculator.setBounds(46, 56, 172, 67);
		frame.getContentPane().add(btnLoveCalculator);
		
		JButton btnAgeCalculator = new JButton("Age Calculator");
		btnAgeCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AgeCalculator.main(null);
			}
		});
		btnAgeCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnAgeCalculator.setBackground(Color.LIGHT_GRAY);
		btnAgeCalculator.setForeground(Color.CYAN);
		btnAgeCalculator.setBounds(314, 56, 172, 67);
		frame.getContentPane().add(btnAgeCalculator);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Ravie", Font.BOLD, 14));
		btnClose.setBackground(Color.LIGHT_GRAY);
		btnClose.setForeground(Color.RED);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnClose.setBounds(213, 207, 104, 48);
		frame.getContentPane().add(btnClose);
	}

}
