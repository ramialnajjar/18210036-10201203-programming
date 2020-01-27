package assignmentFinal;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
import javax.swing.JPasswordField;
import java.io.FileNotFoundException;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUser;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, null, null, null));
		panel.setBounds(10, 11, 756, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your username and password:");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPleaseEnterYour.setBounds(10, 11, 538, 79);
		panel.add(lblPleaseEnterYour);
		
		JLabel label = new JLabel("Username :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 144, 81, 23);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Password :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 246, 81, 23);
		panel.add(label_1);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUser.setColumns(10);
		txtUser.setBounds(142, 147, 127, 20);
		panel.add(txtUser);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					
				String usernameinput = txtUser.getText();
				String passwordinput = txtPass.getText();
				
				
				File file = new File ("C:/Users/user/eclipse-workspace/assignment/src/Text Files/Users/" + usernameinput + ".txt");
				Scanner scan  = new Scanner (file);
				
				String user = scan.nextLine();
				String pass = scan.nextLine();
				
				
				if (file.exists() && pass.equals(passwordinput))
				{
					MainPage main = new MainPage ();
					
					setVisible (false);
					main.setLocationRelativeTo(null);
					main.setVisible(true);
				}
				
				else if (file.exists())
				{
					JOptionPane.showMessageDialog (null, "Password Incorrect");
				}
					
					
				scan.close();
	
				} catch (FileNotFoundException e1) {
					
					JOptionPane.showMessageDialog(null, "Username Does not exist");
				}
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(585, 377, 161, 49);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage homePage = new HomePage();
				setVisible (false);
				homePage.setLocationRelativeTo(null);
				homePage.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(10, 377, 161, 49);
		panel.add(btnCancel);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(142, 249, 127, 20);
		panel.add(txtPass);
	}



}
