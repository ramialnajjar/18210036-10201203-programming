package assignmentFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.io.*;
public class PassPortRenewal extends JFrame {

	private JPanel contentPane;
	private JTextField txtfirst;
	private JTextField txtfather;
	private JTextField txtgrand;
	private JTextField txtfam;
	private JTextField txtssn;
	private JTextField txtpassportnum;
	private JTextField txtdob;
	private JTextField txtpassportscan;
	private JTextField txtphotoscan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassPortRenewal frame = new PassPortRenewal();
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
	public PassPortRenewal() {
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
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(10, 421, 149, 42);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				MainPage main = new MainPage();
				setVisible(false);
				main.setLocationRelativeTo(null);
				main.setVisible(true);
			}
		});
		
		JLabel label = new JLabel("Passport Renewals :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(10, 11, 216, 29);
		panel.add(label);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					
				String username = "";
				String firstName = "";
				String fatherName = "";
				String grandName = "";
				String lastName = "";
				String ssn = "";
				String passportnum = "";
				String dateofbirth = "";
				String passportscan = "";
				String photoscan = "";
				
				firstName = txtfirst.getText();
				fatherName = txtfather.getText();
				grandName = txtgrand.getText();
				lastName = txtfam.getText();
				ssn = txtssn.getText();
				passportnum = txtpassportnum.getText();
				dateofbirth = txtdob.getText();
				username = LoginPage.txtUser.getText();
				passportscan = txtpassportscan.getText();
				photoscan = txtphotoscan.getText();

				 
				FileWriter fileWriter = new FileWriter ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Passport_Renewals\\" + username + ".txt");
				
				fileWriter.write(username + "\n");
				fileWriter.write(firstName + "\n");
				fileWriter.write(fatherName + "\n");
				fileWriter.write(grandName + "\n");
				fileWriter.write(lastName + "\n");
				fileWriter.write(ssn + "\n");
				fileWriter.write(passportnum + "\n");
				fileWriter.write(dateofbirth + "\n");
				fileWriter.write(passportscan + "\n");
				fileWriter.write(photoscan + "\n");
				
				fileWriter.close();
				
				JOptionPane.showMessageDialog(null, "Your request has been sent");
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.setBounds(597, 421, 149, 42);
		panel.add(btnSubmit);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(10, 91, 89, 23);
		panel.add(lblFirstName);
		
		JLabel lblFathersName = new JLabel("Father's Name :");
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName.setBounds(10, 125, 109, 23);
		panel.add(lblFathersName);
		
		JLabel lblGrandfathersName = new JLabel("GrandFather's Name :");
		lblGrandfathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrandfathersName.setBounds(10, 159, 149, 23);
		panel.add(lblGrandfathersName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(10, 193, 89, 23);
		panel.add(lblLastName);
		
		txtfirst = new JTextField();
		txtfirst.setBounds(170, 94, 149, 20);
		panel.add(txtfirst);
		txtfirst.setColumns(10);
		
		txtfather = new JTextField();
		txtfather.setColumns(10);
		txtfather.setBounds(170, 128, 149, 20);
		panel.add(txtfather);
		
		txtgrand = new JTextField();
		txtgrand.setColumns(10);
		txtgrand.setBounds(169, 162, 150, 20);
		panel.add(txtgrand);
		
		txtfam = new JTextField();
		txtfam.setColumns(10);
		txtfam.setBounds(170, 196, 149, 20);
		panel.add(txtfam);
		
		JLabel lblSsn = new JLabel("SSN :");
		lblSsn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSsn.setBounds(10, 227, 89, 23);
		panel.add(lblSsn);
		
		txtssn = new JTextField();
		txtssn.setColumns(10);
		txtssn.setBounds(170, 230, 149, 20);
		panel.add(txtssn);
		
		JLabel lblPassportNumber = new JLabel("Passport number : ");
		lblPassportNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassportNumber.setBounds(10, 261, 118, 23);
		panel.add(lblPassportNumber);
		
		txtpassportnum = new JTextField();
		txtpassportnum.setColumns(10);
		txtpassportnum.setBounds(170, 261, 149, 20);
		panel.add(txtpassportnum);
		
		JLabel lblDateofbirth = new JLabel("Date of Birth :");
		lblDateofbirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateofbirth.setBounds(10, 295, 118, 23);
		panel.add(lblDateofbirth);
		
		txtdob = new JTextField();
		txtdob.setColumns(10);
		txtdob.setBounds(170, 298, 149, 20);
		panel.add(txtdob);
		
		JLabel lblPassportScangoogle = new JLabel("Passport Scan (Google Drive Link)");
		lblPassportScangoogle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassportScangoogle.setBounds(473, 97, 227, 17);
		panel.add(lblPassportScangoogle);
		
		txtpassportscan = new JTextField();
		txtpassportscan.setBounds(483, 128, 180, 88);
		panel.add(txtpassportscan);
		txtpassportscan.setColumns(10);
		
		JLabel lblPhotoScangoogle = new JLabel("Photo Scan (Google Drive Link)");
		lblPhotoScangoogle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhotoScangoogle.setBounds(473, 230, 196, 17);
		panel.add(lblPhotoScangoogle);
		
		txtphotoscan = new JTextField();
		txtphotoscan.setColumns(10);
		txtphotoscan.setBounds(483, 264, 180, 88);
		panel.add(txtphotoscan);
	}
}
