package Love_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.Toolkit;


public class Index {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
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
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(51, 204, 204));
		frame.setTitle("Welcome To Strange Calculator...");
		frame.setBounds(100, 100, 570, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoveCalculator = new JButton("Love Calculator");
		btnLoveCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnLoveCalculator.setBackground(new Color(255, 0, 204));
		btnLoveCalculator.setForeground(new Color(0, 255, 255));
		btnLoveCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LoveCalculator.main(null);
			}
		});
		btnLoveCalculator.setBounds(178, 56, 194, 42);
		frame.getContentPane().add(btnLoveCalculator);
		
		JButton btnAgeCalculator = new JButton("Age Calculator");
		btnAgeCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AgeCalculator.main(null);
			}
		});
		btnAgeCalculator.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnAgeCalculator.setBackground(new Color(153, 153, 153));
		btnAgeCalculator.setForeground(Color.CYAN);
		btnAgeCalculator.setBounds(178, 109, 194, 42);
		frame.getContentPane().add(btnAgeCalculator);
		
		JButton btnClose = new JButton("EXIT");
		btnClose.setFont(new Font("Lucida Handwriting", Font.BOLD, 14));
		btnClose.setBackground(new Color(51, 204, 255));
		btnClose.setForeground(new Color(153, 0, 255));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int choice=JOptionPane.showConfirmDialog(null, "Really Exit ?","Confirmation",JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION){
			//	JOptionPane.showMessageDialog(null, "Really Exit ?","",JOptionPane.YES_NO_OPTION);
				System.exit(0);
			}
			}
		});
		btnClose.setBounds(223, 207, 104, 48);
		frame.getContentPane().add(btnClose);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Love & Age Calculator v1.0\nDevelopers:\n   Masudur Rahman\n   Mohammad Hasan\n   University: CUET");
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		btnNewButton.setBounds(178, 162, 194, 34);
		frame.getContentPane().add(btnNewButton);
	}

}
