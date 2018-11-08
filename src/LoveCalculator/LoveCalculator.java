package LoveCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class LoveCalculator extends HomePage{
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txt1;
	private JTextField txt2;
	private JTextPane textPane;
	private JTextField rslt;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoveCalculator window = new LoveCalculator();
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
	public LoveCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.PINK);
		frame.setBounds(100, 100, 570, 370);
		frame.getContentPane().setLayout(null);
		
		JTextArea YourName = new JTextArea();
		YourName.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		YourName.setBackground(Color.GRAY);
		YourName.setForeground(Color.ORANGE);
		YourName.setEditable(false);
		YourName.setText("Enter Your Name :");
		YourName.setBounds(20, 70, 172, 31);
		frame.getContentPane().add(YourName);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		txt1.setForeground(Color.DARK_GRAY);
		txt1.setBackground(Color.LIGHT_GRAY);
		txt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txt1.setBounds(310, 67, 200, 31);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JTextArea LoverName = new JTextArea();
		LoverName.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		LoverName.setBackground(Color.GRAY);
		LoverName.setForeground(Color.ORANGE);
		LoverName.setEditable(false);
		LoverName.setText("Enter Your Lover's Name :");
		LoverName.setBounds(20, 124, 224, 27);
		frame.getContentPane().add(LoverName);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		txt2.setBackground(Color.LIGHT_GRAY);
		txt2.setBounds(310, 121, 200, 31);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);

        JTextArea result = new JTextArea();
        result.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		result.setBackground(Color.GRAY);
		result.setVisible(false);
		result.setText("Love Percantage : ");
		result.setForeground(Color.GREEN);
		result.setEditable(true);
		
		result.setBounds(20, 225, 160, 27);
		frame.getContentPane().add(result);
		
		rslt = new JTextField();
		rslt.setForeground(Color.MAGENTA);
		rslt.setFont(new Font("Lucida Handwriting", Font.BOLD, 11));
		rslt.setText("Calculating.");
		rslt.setVisible(false);
		rslt.setEditable(false);
		rslt.setBackground(Color.GREEN);
		rslt.setBounds(310, 224, 200, 27);
		frame.getContentPane().add(rslt);
		rslt.setColumns(10);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.setBackground(Color.GRAY);
		Calculate.setFont(new Font("Ravie", Font.PLAIN, 14));
		Calculate.setForeground(Color.GREEN);
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setVisible(true);
				rslt.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					String name;
					char[] name1=new char[100];
					char[] name2=new char[100];
					//char[] m=new char[100];
					name=txt1.getText();
					name1=name.toCharArray();
					name=txt2.getText();
					name2=name.toCharArray();
					int l1,l2;
					l1=name1.length;
					l2=name2.length;
					int n1=0;
					for(int i=0;i<l1;i++){
						if(name1[i]>='a' && name1[i]<='z')
							n1+=name1[i]-'a'+1;
			            else if(name1[i]>='A' && name1[i]<='Z')
			                n1+=name1[i]-'A'+1;	
					}
					int n2=0;
			        for(int i=0;i<l2;i++){
			            if(name2[i]>='a' && name2[i]<='z')
			                n2+=name2[i]-'a'+1;
			            else if(name2[i]>='A' && name2[i]<='Z')
			                n2+=name2[i]-'A'+1;
			        }
			        int m;
			        while(n1>9){
			            m=0;
			            while(n1!=0){
			                int a=n1%10;
			                n1/=10;
			                m+=a;
			            }
			                n1=m;
			        }
			        while(n2>9){
			            m=0;
			            while(n2!=0){
			                int a=n2%10;
			                n2/=10;
			                m+=a;
			            }
			            n2=m;
			        }
			        double res;
			        if(n1<=n2)
			            res=(double)n1/(double)n2*100;
			        else
			            res=(double)n2/(double)n1*100;
			        String Love=Double.toString(res)+"%";
				    if(n1==0 || n2==0) Love="Enter Valid Names...!!!";
				    rslt.setText(Love);
			}
		});
		Calculate.setBounds(91, 175, 127, 23);
		frame.getContentPane().add(Calculate);
		
		JTextArea txtrLoveCalculator = new JTextArea();
		txtrLoveCalculator.setBackground(Color.GRAY);
		txtrLoveCalculator.setFont(new Font("Engravers MT", Font.PLAIN, 20));
		txtrLoveCalculator.setForeground(Color.MAGENTA);
		txtrLoveCalculator.setEditable(false);
		txtrLoveCalculator.setText(" Love Calculator");
		txtrLoveCalculator.setBounds(123, 0, 275, 31);
		frame.getContentPane().add(txtrLoveCalculator);
		
		JButton Home = new JButton("Home");
		Home.setFont(new Font("Ravie", Font.BOLD, 13));
		Home.setForeground(Color.CYAN);
		Home.setBackground(Color.DARK_GRAY);
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				HomePage.main(null);
			}
		});
		Home.setBounds(211, 276, 89, 23);
		frame.getContentPane().add(Home);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBackground(Color.GRAY);
		btnRefresh.setFont(new Font("Ravie", Font.PLAIN, 14));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				result.setVisible(false);
				rslt.setVisible(false);
			}
		});
		btnRefresh.setForeground(Color.GREEN);
		btnRefresh.setBounds(325, 175, 118, 23);
		frame.getContentPane().add(btnRefresh);
		
	}
}
