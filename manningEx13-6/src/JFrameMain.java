import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

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
		btnPalindrome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPalindrome.setBounds(297, 13, 243, 50);
		contentPane.add(btnPalindrome);
	}
}
