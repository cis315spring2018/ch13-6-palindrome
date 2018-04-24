import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *   file: JFrameMain.java
 */

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class JFrameMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtIn1;
	private JTextField txtOut1;
	private JTextField txtReverseMe;
	private JButton btnReverse;
	private JTextField txtOut2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setTitle("Manning Exercise 13-6 Palindrome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIn1 = new JTextField();
		txtIn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtIn1.setHorizontalAlignment(SwingConstants.CENTER);
		txtIn1.setText("madam");
		txtIn1.setBounds(12, 13, 273, 50);
		contentPane.add(txtIn1);
		txtIn1.setColumns(10);
		
		txtOut1 = new JTextField();
		txtOut1.setEditable(false);
		txtOut1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtOut1.setText("??");
		txtOut1.setHorizontalAlignment(SwingConstants.CENTER);
		txtOut1.setColumns(10);
		txtOut1.setBounds(552, 13, 273, 50);
		contentPane.add(txtOut1);
		
		JButton btnPalindrome = new JButton("Palindrome?");
		btnPalindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strWord = txtIn1.getText();
				
				// examine the word, display result
				if(Recursion.isPalindrome( strWord ) )
					txtOut1.setText("True!");
				else
					txtOut1.setText("False!");
				
			
			}
		});
		btnPalindrome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPalindrome.setBounds(297, 13, 243, 50);
		contentPane.add(btnPalindrome);
		
		txtReverseMe = new JTextField();
		txtReverseMe.setText("ReverseMe!");
		txtReverseMe.setHorizontalAlignment(SwingConstants.CENTER);
		txtReverseMe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtReverseMe.setColumns(10);
		txtReverseMe.setBounds(12, 76, 273, 50);
		contentPane.add(txtReverseMe);
		
		btnReverse = new JButton("Reverse!");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = txtReverseMe.getText();
				String result = Recursion.strReverse();
				
			}
		});
		btnReverse.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReverse.setBounds(297, 76, 243, 50);
		contentPane.add(btnReverse);
		
		txtOut2 = new JTextField();
		txtOut2.setText("??");
		txtOut2.setHorizontalAlignment(SwingConstants.CENTER);
		txtOut2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtOut2.setEditable(false);
		txtOut2.setColumns(10);
		txtOut2.setBounds(552, 76, 273, 50);
		contentPane.add(txtOut2);
	}
}
