package assignmentFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Please Choose one of the following options");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(146, 55, 485, 42);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel.setBounds(97, 163, 226, 229);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("If you already have an");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(36, 11, 180, 53);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("account please:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(36, 51, 154, 26);
		panel.add(label_2);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				LoginPage log = new LoginPage ();
				setVisible(false);
				log.setLocationRelativeTo(null);
				log.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(36, 118, 145, 42);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel_1.setBounds(448, 163, 226, 229);
		contentPane.add(panel_1);
		
		JLabel label_3 = new JLabel("If you don't have an");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(22, 11, 180, 53);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("account then please:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(22, 56, 154, 26);
		panel_1.add(label_4);
		
		JButton button_1 = new JButton("Sign Up");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignUpPage sign = new SignUpPage ();
				setVisible(false);
				sign.setLocationRelativeTo(null);
				sign.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(31, 119, 145, 42);
		panel_1.add(button_1);
	}
}
