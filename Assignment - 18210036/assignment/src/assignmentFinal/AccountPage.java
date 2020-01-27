package assignmentFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AccountPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtfirst;
	private JTextField txtfather;
	private JTextField txtgrand;
	private JTextField txtfam;
	private JTextField txtssn;
	private JTextField txtemail;
	private JTextField txtnumber;
	private JTextField txtcountry;
	private JTextField txtcity;
	private JTextField txtuser;
	private JTextField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountPage frame = new AccountPage();
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
	public AccountPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 756, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("First Name :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 112, 81, 23);
		panel.add(label);
		
		txtfirst = new JTextField();
		txtfirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfirst.setColumns(10);
		txtfirst.setBounds(159, 115, 127, 20);
		panel.add(txtfirst);
		
		JLabel label_1 = new JLabel("Father's Name :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 140, 101, 23);
		panel.add(label_1);
		
		txtfather = new JTextField();
		txtfather.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfather.setColumns(10);
		txtfather.setBounds(159, 149, 127, 20);
		panel.add(txtfather);
		
		JLabel label_2 = new JLabel("Grandfather's Name :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 174, 139, 23);
		panel.add(label_2);
		
		txtgrand = new JTextField();
		txtgrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtgrand.setColumns(10);
		txtgrand.setBounds(159, 177, 127, 20);
		panel.add(txtgrand);
		
		JLabel label_3 = new JLabel("Family Name :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 208, 139, 23);
		panel.add(label_3);
		
		txtfam = new JTextField();
		txtfam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfam.setColumns(10);
		txtfam.setBounds(159, 211, 127, 20);
		panel.add(txtfam);
		
		JLabel label_4 = new JLabel("SSN :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(391, 112, 81, 23);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Email :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(391, 146, 81, 23);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Phone number  :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(391, 180, 110, 23);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Country :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(391, 214, 69, 23);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("City :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(391, 248, 69, 23);
		panel.add(label_8);
		
		txtssn = new JTextField();
		txtssn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtssn.setColumns(10);
		txtssn.setBounds(527, 115, 127, 20);
		panel.add(txtssn);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtemail.setColumns(10);
		txtemail.setBounds(527, 149, 127, 20);
		panel.add(txtemail);
		
		txtnumber = new JTextField();
		txtnumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnumber.setColumns(10);
		txtnumber.setBounds(527, 183, 127, 20);
		panel.add(txtnumber);
		
		txtcountry = new JTextField();
		txtcountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcountry.setColumns(10);
		txtcountry.setBounds(527, 217, 127, 20);
		panel.add(txtcountry);
		
		txtcity = new JTextField();
		txtcity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcity.setColumns(10);
		txtcity.setBounds(527, 251, 127, 20);
		panel.add(txtcity);
		
		JLabel label_9 = new JLabel("Username :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(10, 327, 81, 23);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Password :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(10, 361, 81, 23);
		panel.add(label_10);
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtuser.setColumns(10);
		txtuser.setBounds(159, 328, 127, 20);
		panel.add(txtuser);
		
		txtpass = new JTextField();
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpass.setColumns(10);
		txtpass.setBounds(159, 362, 127, 20);
		panel.add(txtpass);
		
		JLabel label_11 = new JLabel("Please fill all of the boxes below");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_11.setBounds(10, 11, 395, 42);
		panel.add(label_11);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String userFirst = "";
				String firstName = "";
				String fatherName = "";
				String grandName = "";
				String lastName = "";
				String username = "";
				String password = "";
				String email = "";
				String phone = "";
				String ssn = "";
				String country = "";
				String city = "";
				
				username = txtuser.getText();
				password = txtpass.getText();
				firstName = txtfirst.getText();
				fatherName = txtfather.getText();
				grandName = txtgrand.getText();
				lastName = txtfam.getText();
				ssn = txtssn.getText();
				email = txtemail.getText();
				phone = txtnumber.getText();
				country = txtcountry.getText();
				city = txtcity.getText();
				
				File file = new File("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Users\\" + username + ".txt");
				
				userFirst = LoginPage.txtUser.getText();
				
				if (file.exists() && username != userFirst)
				{
					JOptionPane.showMessageDialog(null, "Username Already exists please try again");
				}
				
				else
				{
				
				 File newFile = new File("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Users\\" + userFirst + ".txt"); 
				 
				 newFile.delete();
				
				FileWriter fileWriter = new FileWriter ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Users\\" + username + ".txt");
				
				fileWriter.write(username + "\n");
				fileWriter.write(password + "\n");
				fileWriter.write(firstName + "\n");
				fileWriter.write(fatherName + "\n");
				fileWriter.write(grandName + "\n");
				fileWriter.write(lastName + "\n");
				fileWriter.write(ssn + "\n");
				fileWriter.write(email + "\n");
				fileWriter.write(phone + "\n");
				fileWriter.write(country + "\n");
				fileWriter.write(city + "\n");
				
				fileWriter.close();
				
				JOptionPane.showMessageDialog(null, "Thank you, your credintials have been changed");
					
				}	
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(594, 350, 133, 42);
		panel.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				MainPage main = new MainPage();
				setVisible(false);
				main.setLocationRelativeTo(null);
				main.setVisible(true); 
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(594, 407, 133, 42);
		panel.add(button_1);
		
		JButton btnGetInformation = new JButton("Get Information");
		btnGetInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
				String userFirst = LoginPage.txtUser.getText();
				
				File getFile = new File("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Users\\" + userFirst + ".txt");
				
				Scanner scan = new Scanner (getFile);
				
				String username = scan.nextLine();
				String password = scan.nextLine();
				String firstName = scan.nextLine();
				String fatherName = scan.nextLine();
				String grandName = scan.nextLine();
				String lastName = scan.nextLine();
				String ssn = scan.nextLine();
				String email = scan.nextLine();
				String phone = scan.nextLine();
				String country = scan.nextLine();
				String city = scan.nextLine();
				
				
				txtuser.setText(username);
				txtpass.setText(password);
				txtfirst.setText(firstName);
				txtfather.setText(fatherName);
				txtgrand.setText(grandName);
				txtfam.setText(lastName);
				txtssn.setText(ssn);
				txtemail.setText(email);
				txtnumber.setText(phone);
				txtcountry.setText(country);
				txtcity.setText(city);
				
				scan.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnGetInformation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGetInformation.setBounds(451, 408, 133, 42);
		panel.add(btnGetInformation);
	}
}
