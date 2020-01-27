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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FamilyVisas extends JFrame {

	private JPanel contentPane;
	private JTextField txtfirst;
	private JTextField txtfather;
	private JTextField txtgrand;
	private JTextField txtfam;
	private JTextField txtssn;
	private JTextField txtdob;
	private JTextField txtpassportnum;
	private JTextField txtnumberoE;
	private JTextField txtduration;
	private JTextField txtpassportscan;
	private JTextField txtrletter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FamilyVisas frame = new FamilyVisas();
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
	public FamilyVisas() {
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
		label.setBounds(22, 60, 89, 23);
		panel.add(label);
		
		txtfirst = new JTextField();
		txtfirst.setColumns(10);
		txtfirst.setBounds(182, 63, 149, 20);
		panel.add(txtfirst);
		
		JLabel label_1 = new JLabel("Father's Name :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(22, 94, 109, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("GrandFather's Name :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(22, 128, 149, 23);
		panel.add(label_2);
		
		txtfather = new JTextField();
		txtfather.setColumns(10);
		txtfather.setBounds(182, 97, 149, 20);
		panel.add(txtfather);
		
		txtgrand = new JTextField();
		txtgrand.setColumns(10);
		txtgrand.setBounds(181, 131, 150, 20);
		panel.add(txtgrand);
		
		JLabel label_3 = new JLabel("Last Name :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(22, 162, 89, 23);
		panel.add(label_3);
		
		txtfam = new JTextField();
		txtfam.setColumns(10);
		txtfam.setBounds(182, 165, 149, 20);
		panel.add(txtfam);
		
		JLabel label_4 = new JLabel("SSN :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(22, 196, 89, 23);
		panel.add(label_4);
		
		txtssn = new JTextField();
		txtssn.setColumns(10);
		txtssn.setBounds(182, 199, 149, 20);
		panel.add(txtssn);
		
		JLabel label_5 = new JLabel("Date of Birth");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(22, 230, 118, 23);
		panel.add(label_5);
		
		txtdob = new JTextField();
		txtdob.setColumns(10);
		txtdob.setBounds(182, 233, 149, 20);
		panel.add(txtdob);
		
		JLabel label_6 = new JLabel("Passport number : ");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(22, 264, 118, 23);
		panel.add(label_6);
		
		txtpassportnum = new JTextField();
		txtpassportnum.setColumns(10);
		txtpassportnum.setBounds(182, 264, 149, 20);
		panel.add(txtpassportnum);
		
		JLabel label_9 = new JLabel("How many entries :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(22, 298, 149, 23);
		panel.add(label_9);
		
		txtnumberoE = new JTextField();
		txtnumberoE.setColumns(10);
		txtnumberoE.setBounds(182, 298, 149, 20);
		panel.add(txtnumberoE);
		
		JLabel label_10 = new JLabel("Visa Duration :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(22, 332, 118, 23);
		panel.add(label_10);
		
		txtduration = new JTextField();
		txtduration.setColumns(10);
		txtduration.setBounds(182, 332, 149, 20);
		panel.add(txtduration);
		
		JLabel lblFriendsAndFamily = new JLabel("Friends and Family Visas :");
		lblFriendsAndFamily.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblFriendsAndFamily.setBounds(10, 11, 314, 29);
		panel.add(lblFriendsAndFamily);
		
		JLabel label_7 = new JLabel("Passport Scan (Google Drive Link)");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(488, 56, 227, 17);
		panel.add(label_7);
		
		txtpassportscan = new JTextField();
		txtpassportscan.setColumns(10);
		txtpassportscan.setBounds(498, 87, 180, 88);
		panel.add(txtpassportscan);
		
		JLabel label_8 = new JLabel("Photo Scan (Google Drive Link)");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(488, 189, 216, 17);
		panel.add(label_8);
		
		JTextField txtphotoscan = new JTextField();
		txtphotoscan.setColumns(10);
		txtphotoscan.setBounds(498, 223, 180, 88);
		panel.add(txtphotoscan);
		
		JLabel lblFamilyfriendLettergoogle = new JLabel("Family/Friend Letter (Google Drive Link)");
		lblFamilyfriendLettergoogle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFamilyfriendLettergoogle.setBounds(470, 335, 257, 17);
		panel.add(lblFamilyfriendLettergoogle);
		
		txtrletter = new JTextField();
		txtrletter.setColumns(10);
		txtrletter.setBounds(498, 363, 180, 88);
		panel.add(txtrletter);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					
					String username = LoginPage.txtUser.getText();
					String firstName = txtfirst.getText();
					String fatherName = txtfather.getText();
					String grandName = txtgrand.getText();
					String lastName = txtfam.getText();
					String ssn = txtssn.getText();
					String passportnum = txtpassportnum.getText();
					String dateofbirth = txtdob.getText();
					String passportscan = txtpassportscan.getText();
					String photoscan = txtphotoscan.getText();
					String rletter = txtrletter.getText();
					String numberoE = txtnumberoE.getText();
					String duration = txtduration.getText();
					 
					FileWriter fileWriter = new FileWriter ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Visas\\Family\\" + username + ".txt");
					
					fileWriter.write(username + "\n");
					fileWriter.write(firstName + "\n");
					fileWriter.write(fatherName + "\n");
					fileWriter.write(grandName + "\n");
					fileWriter.write(lastName + "\n");
					fileWriter.write(ssn + "\n");
					fileWriter.write(passportnum + "\n");
					fileWriter.write(dateofbirth + "\n");
					fileWriter.write(numberoE + "\n");
					fileWriter.write(duration + "\n");
					fileWriter.write(passportscan + "\n");
					fileWriter.write(photoscan + "\n");
					fileWriter.write(rletter + "\n");
					
					fileWriter.close();
					
					JOptionPane.showMessageDialog(null, "Your request has been sent");
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(10, 371, 149, 42);
		panel.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				VisaMenu visa = new VisaMenu ();
				setVisible (false);
				visa.setLocationRelativeTo(null);
				visa.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(10, 421, 149, 42);
		panel.add(button_1);
	}

}
