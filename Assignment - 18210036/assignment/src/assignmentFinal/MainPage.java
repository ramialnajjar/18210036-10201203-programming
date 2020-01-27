package assignmentFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setLocationRelativeTo(null);
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel.setBounds(10, 11, 756, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWelcome.setBounds(10, 21, 110, 25);
		panel.add(lblWelcome);
		
		JButton btnset = new JButton("Account Settings");
		btnset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				AccountPage account = new AccountPage ();
				setVisible(false);
				account.setLocationRelativeTo(null);
				account.setVisible(true);
			}
		});
		btnset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnset.setBounds(599, 18, 147, 39);
		panel.add(btnset);
		
		JButton btnNewButton = new JButton("Passport Renewals");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				PassPortRenewal passport = new PassPortRenewal();
				setVisible(false);
				passport.setLocationRelativeTo(null);
				passport.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(54, 295, 164, 48);
		panel.add(btnNewButton);
		
		JButton btnVisas = new JButton("Visas");
		btnVisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				VisaMenu visa = new VisaMenu();
				setVisible(false);
				visa.setLocationRelativeTo(null);
				visa.setVisible(true);
			}
		});
		btnVisas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVisas.setBounds(536, 295, 164, 48);
		panel.add(btnVisas);
		
		JButton btnIdRenewals = new JButton("ID Renewals");
		btnIdRenewals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				IDRenewal id = new IDRenewal();
				setVisible(false);
				id.setLocationRelativeTo(null);
				id.setVisible(true);
			}
		});
		btnIdRenewals.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIdRenewals.setBounds(287, 295, 164, 48);
		panel.add(btnIdRenewals);
		
		JLabel lblNewLabel = new JLabel("Please Choose one of the options below :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(197, 140, 379, 61);
		panel.add(lblNewLabel);
	}

}
