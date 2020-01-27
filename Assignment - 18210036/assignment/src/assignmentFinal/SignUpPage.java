package assignmentFinal;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
public class SignUpPage extends JFrame 
{
	

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
	private JTextField txtpass;
	private JTextField txtuser;
	private JTextField txtnation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		
	public SignUpPage() {
		
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
		
		JLabel lblPleaseFillAll = new JLabel("Please fill all of the boxes below");
		lblPleaseFillAll.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPleaseFillAll.setBounds(10, 11, 395, 42);
		panel.add(lblPleaseFillAll);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(10, 112, 81, 23);
		panel.add(lblFirstName);
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName.setBounds(10, 140, 101, 23);
		panel.add(lblFathersName);
		
		JLabel lblGrandfathersName = new JLabel("Grandfather's Name :");
		lblGrandfathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrandfathersName.setBounds(10, 174, 139, 23);
		panel.add(lblGrandfathersName);
		
		JLabel lblFamilyName = new JLabel("Family Name :");
		lblFamilyName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFamilyName.setBounds(10, 208, 139, 23);
		panel.add(lblFamilyName);
		
		JLabel lblSsn = new JLabel("SSN :");
		lblSsn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSsn.setBounds(391, 112, 81, 23);
		panel.add(lblSsn);
		
		JLabel lblEamil = new JLabel("Email :");
		lblEamil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEamil.setBounds(391, 146, 81, 23);
		panel.add(lblEamil);
		
		JLabel lblPhoneNumber = new JLabel("Phone number  :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(391, 180, 110, 23);
		panel.add(lblPhoneNumber);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(10, 327, 81, 23);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(10, 361, 81, 23);
		panel.add(lblPassword);
		
		txtfirst = new JTextField();
		txtfirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfirst.setBounds(159, 115, 127, 20);
		panel.add(txtfirst);
		txtfirst.setColumns(10);
		
		txtfather = new JTextField();
		txtfather.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfather.setColumns(10);
		txtfather.setBounds(159, 149, 127, 20);
		panel.add(txtfather);
		
		txtgrand = new JTextField();
		txtgrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtgrand.setColumns(10);
		txtgrand.setBounds(159, 177, 127, 20);
		panel.add(txtgrand);
		
		txtfam = new JTextField();
		txtfam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtfam.setColumns(10);
		txtfam.setBounds(159, 211, 127, 20);
		panel.add(txtfam);
		
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCountry.setBounds(391, 214, 69, 23);
		panel.add(lblCountry);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCity.setBounds(391, 248, 69, 23);
		panel.add(lblCity);
		
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
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtuser.setColumns(10);
		txtuser.setBounds(101, 330, 127, 20);
		panel.add(txtuser);
		
		txtpass = new JTextField();
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpass.setColumns(10);
		txtpass.setBounds(101, 364, 127, 20);
		panel.add(txtpass);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {

					String username = "";

					username = txtuser.getText();

					File file = new File ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Users\\" + username + ".txt");
					

				
				if(file.exists())
				{
					JOptionPane.showMessageDialog(null, "User already exists please choose another UserName");
				}
				else
				{
					String firstName = "";
					String fatherName = "";
					String grandName = "";
					String lastName = "";
					String password = "";
					String email = "";
					String phone = "";
					String ssn = "";
					String country = "";
					String city = "";
					String nationality = "";
					
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
					nationality = txtnation.getText();
					
					
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
					fileWriter.write(nationality + "\n");
					
					fileWriter.close();
					
					JOptionPane.showMessageDialog(null, "User Created please go ahead and login with your new Username");
					
					LoginPage loginPage = new LoginPage();
					setVisible (false); 
					loginPage.setLocationRelativeTo(null);
					loginPage.setVisible(true);
					
					
				}
					
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(493, 313, 133, 42);
		panel.add(btnNewButton);
		
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
		
		JButton btnClearAll = new JButton("Clear all");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtfirst.setText("");
				txtfather.setText("");
				txtgrand.setText("");
				txtfam.setText("");
				txtuser.setText("");
				txtpass.setText("");
				txtssn.setText("");
				txtemail.setText("");
				txtnumber.setText("");
				txtcountry.setText("");
				txtcity.setText("");
			}
		});
		btnClearAll.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClearAll.setBounds(493, 361, 133, 42);
		panel.add(btnClearAll);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(493, 414, 133, 42);
		panel.add(btnCancel);
		
		JLabel lblNationality = new JLabel("Nationality :");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality.setBounds(10, 242, 139, 23);
		panel.add(lblNationality);
		
		txtnation = new JTextField();
		txtnation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtnation.setColumns(10);
		txtnation.setBounds(159, 245, 127, 20);
		panel.add(txtnation);
	}
}
