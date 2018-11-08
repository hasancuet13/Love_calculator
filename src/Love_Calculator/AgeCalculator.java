package Love_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;


public class AgeCalculator {

	private JFrame frmAgeCalculator;
	private JTextField textField;
	private JTextField dd1;
	private JTextField dd2;
	private JTextField yy1;
	private JTextField yy2;
	private JTextField mm1;
	private JTextField mm2;
	private JTextPane txtpnDate;
	private JTextPane txtpnDate_1;
	private JTextPane txtpnMonth;
	private JTextPane txtpnMonth_1;
	private JTextPane txtpnYear;
	private JTextPane txtpnYear_1;
	private JTextPane txtpnEnterCurrentDate;
	private JTextPane CurrentAge;
	private JButton Calculate;
	private JTextField Age;
	private JButton Refresh;
	private JButton Home;
	private JButton LC;

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
		frmAgeCalculator.getContentPane().setForeground(new Color(255, 0, 204));
		frmAgeCalculator.setResizable(false);
		frmAgeCalculator.setTitle(" Age Calculator");
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
		
		dd2 = new JTextField();
		dd2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		dd2.setHorizontalAlignment(SwingConstants.CENTER);
		dd2.setBackground(Color.LIGHT_GRAY);
		dd2.setBounds(252, 126, 71, 27);
		frmAgeCalculator.getContentPane().add(dd2);
		dd2.setColumns(10);
		
		yy2 = new JTextField();
		yy2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		yy2.setHorizontalAlignment(SwingConstants.CENTER);
		yy2.setBackground(Color.LIGHT_GRAY);
		yy2.setBounds(453, 126, 71, 27);
		frmAgeCalculator.getContentPane().add(yy2);
		yy2.setColumns(10);
		
		mm2 = new JTextField();
		mm2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		mm2.setHorizontalAlignment(SwingConstants.CENTER);
		mm2.setBackground(Color.LIGHT_GRAY);
		mm2.setBounds(353, 126, 71, 27);
		frmAgeCalculator.getContentPane().add(mm2);
		mm2.setColumns(10);
		
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
		dd1 = new JTextField();
		dd1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		dd1.setHorizontalAlignment(SwingConstants.CENTER);
		dd1.setBackground(Color.LIGHT_GRAY);
		dd1.setBounds(252, 42, 71, 27);
		frmAgeCalculator.getContentPane().add(dd1);
		dd1.setColumns(10);
		
		yy1 = new JTextField();
		yy1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		yy1.setHorizontalAlignment(SwingConstants.CENTER);
		yy1.setBackground(Color.LIGHT_GRAY);
		yy1.setBounds(453, 42, 71, 27);
		frmAgeCalculator.getContentPane().add(yy1);
		yy1.setColumns(10);
		
		mm1 = new JTextField();
		mm1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 13));
		mm1.setHorizontalAlignment(SwingConstants.CENTER);
		mm1.setBackground(Color.LIGHT_GRAY);
		mm1.setBounds(353, 42, 71, 27);
		frmAgeCalculator.getContentPane().add(mm1);
		mm1.setColumns(10);
		
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

		CurrentAge = new JTextPane();
		CurrentAge.setForeground(Color.MAGENTA);
		CurrentAge.setFont(new Font("Lucida Handwriting", Font.BOLD, 14));
		CurrentAge.setEditable(false);
		CurrentAge.setVisible(false);
		CurrentAge.setBackground(Color.GRAY);
		CurrentAge.setText("Your Current Age:");
		CurrentAge.setBounds(22, 235, 171, 20);
		frmAgeCalculator.getContentPane().add(CurrentAge);
		
		Age = new JTextField();
		Age.setHorizontalAlignment(SwingConstants.CENTER);
		Age.setFont(new Font("Lucida Handwriting", Font.BOLD, 14));
		Age.setForeground(Color.GREEN);
		Age.setBackground(Color.GRAY);
		Age.setVisible(false);
		Age.setText("");
		Age.setEditable(false);
		Age.setBounds(234, 235, 290, 27);
		frmAgeCalculator.getContentPane().add(Age);
		Age.setColumns(10);
		
		Calculate = new JButton("Calculate Your Age");
		Calculate.setForeground(Color.GREEN);
		Calculate.setFont(new Font("Ravie", Font.PLAIN, 14));
		Calculate.setBackground(Color.GRAY);
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d1,d2,m1,m2,y1,y2;
				try {
					d1=Integer.parseInt(dd1.getText());
					d2=Integer.parseInt(dd2.getText());
					m1=Integer.parseInt(mm1.getText());
					m2=Integer.parseInt(mm2.getText());
					y1=Integer.parseInt(yy1.getText());
					y2=Integer.parseInt(yy2.getText());
					int d,m,y;
			        int p=0,q=0;
			        if(d2<d1){
			            d2+=30;
			            p=1;
			        }
			        m1+=p;
			        if(m2<m1){
			            m2+=12;
			            q=1;
			        }
			        y1+=q;
			        d=d2-d1+1;
			        m=m2-m1;
			        y=y2-y1;
			        if(d>=30){
			            d=d-30;
			            m++;
			        }
			        if(m>=12){
			            m=m-12;
			            y++;
			        }
			        int age=m*30+d;
			        if(y<0 || (y==0 && m==0 && d==0)){
			        	Age.setBounds(134, 235, 290, 27);
			        	Age.setForeground(Color.RED);
			        	CurrentAge.setVisible(false);
			        	Age.setText("Invalid Input...Check Dates...!!!");
			        	Age.setVisible(true);
			        }
			        else if(y==0 && m==0){
						CurrentAge.setVisible(true);
						Age.setText(d+"-Days");
						Age.setBounds(234, 235, 290, 27);
						Age.setVisible(true);
					}
					else if(y==0){
						CurrentAge.setVisible(true);
						Age.setBounds(234, 235, 290, 27);
						Age.setText(age+"-Days");
						Age.setVisible(true);
					}
					else if(y>=0 && m>=0 && d>=0){
						CurrentAge.setVisible(true);
						Age.setBounds(234, 235, 290, 27);
						Age.setText(y+"-Years "+age+"-Days");
						Age.setVisible(true);
					}
			        else {
			        	Age.setBounds(134, 235, 290, 27);
			        	Age.setForeground(Color.RED);
			        	CurrentAge.setVisible(false);
			        	Age.setText("Invalid Input...Check Dates...!!!");
			        	Age.setVisible(true);
					}
				} catch (Exception e2) {
					// TODO: handle exception
					CurrentAge.setVisible(false);
		        	Age.setBounds(134, 235, 290, 27);
		        	Age.setForeground(Color.RED);
		        	Age.setText("Please...Enter Valid Date....!!!");
		        	Age.setVisible(true);
				}
			}
		});
		Calculate.setBounds(75, 178, 227, 27);
		frmAgeCalculator.getContentPane().add(Calculate);
		
		Refresh = new JButton("Refresh");
		Refresh.setForeground(Color.GREEN);
		Refresh.setFont(new Font("Ravie", Font.PLAIN, 14));
		Refresh.setBackground(Color.GRAY);
		Refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dd1.setText("");
				dd2.setText("");
				mm1.setText("");
				mm2.setText("");
				yy1.setText("");
				yy2.setText("");
				CurrentAge.setVisible(false);
				Age.setVisible(false);
			}
		});
		Refresh.setBounds(344, 178, 115, 27);
		frmAgeCalculator.getContentPane().add(Refresh);
		
		Home = new JButton("BACK");
		Home.setForeground(Color.CYAN);
		Home.setBackground(Color.DARK_GRAY);
		Home.setFont(new Font("Ravie", Font.BOLD, 13));
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgeCalculator.setVisible(false);
				Index.main(null);
			}
		});
		Home.setBounds(230, 290, 93, 27);
		frmAgeCalculator.getContentPane().add(Home);
		
		LC = new JButton("L. C.");
		LC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAgeCalculator.setVisible(false);
				LoveCalculator.main(null);
			}
		});
		LC.setForeground(new Color(255, 255, 255));
		LC.setFont(new Font("Lucida Handwriting", Font.BOLD, 13));
		LC.setBackground(Color.GRAY);
		LC.setBounds(453, 292, 71, 23);
		frmAgeCalculator.getContentPane().add(LC);
		
		
	}
}
