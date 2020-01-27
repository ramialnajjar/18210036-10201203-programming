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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class IDRenewal extends JFrame {

	private JPanel contentPane;
	private JTextField txtfirst;
	private JTextField txtfather;
	private JTextField txtgrand;
	private JTextField txtfam;
	private JTextField txtssn;
	private JTextField txtidnum;
	private JTextField txtdob;
	private JTextField txtidscan;
	private JTextField txtphotoscan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDRenewal frame = new IDRenewal();
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
	public IDRenewal() {
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
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				MainPage main = new MainPage ();
				setVisible(false);
				main.setLocationRelativeTo(null);
				main.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(10, 421, 149, 42);
		panel.add(button);
		
		JLabel lblIdRenewals = new JLabel("ID Renewals :");
		lblIdRenewals.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblIdRenewals.setBounds(10, 11, 216, 29);
		panel.add(lblIdRenewals);
		
		JButton button_1 = new JButton("Submit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					
				String username = "";
				String firstName = "";
				String fatherName = "";
				String grandName = "";
				String lastName = "";
				String ssn = "";
				String idnum = "";
				String dateofbirth = "";
				String idscan = "";
				String photoscan = "";
				
				firstName = txtfirst.getText();
				fatherName = txtfather.getText();
				grandName = txtgrand.getText();
				lastName = txtfam.getText();
				ssn = txtssn.getText();
				idnum = txtidnum.getText();
				dateofbirth = txtdob.getText();
				username = LoginPage.txtUser.getText();
				idscan = txtidscan.getText();
				photoscan = txtphotoscan.getText();
				 
				
				FileWriter fileWriter = new FileWriter ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\ID_Renewals\\" + username + ".txt");
				
				fileWriter.write(username + "\n");
				fileWriter.write(firstName + "\n");
				fileWriter.write(fatherName + "\n");
				fileWriter.write(grandName + "\n");
				fileWriter.write(lastName + "\n");
				fileWriter.write(ssn + "\n");
				fileWriter.write(idnum + "\n");
				fileWriter.write(dateofbirth + "\n");
				fileWriter.write(idscan + "\n");
				fileWriter.write(photoscan + "\n");
				
				fileWriter.close();
				
				JOptionPane.showMessageDialog(null, "Your request has been sent");
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(597, 421, 149, 42);
		panel.add(button_1);
		
		JLabel label_1 = new JLabel("First Name :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 91, 89, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Father's Name :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 125, 109, 23);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("GrandFather's Name :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 159, 149, 23);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Last Name :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(10, 193, 89, 23);
		panel.add(label_4);
		
		txtfirst = new JTextField();
		txtfirst.setColumns(10);
		txtfirst.setBounds(170, 94, 149, 20);
		panel.add(txtfirst);
		
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
		
		JLabel label_5 = new JLabel("SSN :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(10, 227, 89, 23);
		panel.add(label_5);
		
		txtssn = new JTextField();
		txtssn.setColumns(10);
		txtssn.setBounds(170, 230, 149, 20);
		panel.add(txtssn);
		
		JLabel lblIdNumber = new JLabel("ID number :");
		lblIdNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdNumber.setBounds(10, 261, 118, 23);
		panel.add(lblIdNumber);
		
		txtidnum = new JTextField();
		txtidnum.setColumns(10);
		txtidnum.setBounds(170, 264, 149, 20);
		panel.add(txtidnum);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth :");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(10, 295, 118, 23);
		panel.add(lblDateOfBirth);
		
		txtdob = new JTextField();
		txtdob.setColumns(10);
		txtdob.setBounds(170, 298, 149, 20);
		panel.add(txtdob);
		
		JLabel lblIdScangoogle = new JLabel("ID Scan (Google Drive Link)");
		lblIdScangoogle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdScangoogle.setBounds(458, 94, 168, 17);
		panel.add(lblIdScangoogle);
		
		txtidscan = new JTextField();
		txtidscan.setColumns(10);
		txtidscan.setBounds(446, 128, 180, 88);
		panel.add(txtidscan);
		
		JLabel label_6 = new JLabel("Photo Scan (Google Drive Link)");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(436, 230, 196, 17);
		panel.add(label_6);
		
		txtphotoscan = new JTextField();
		txtphotoscan.setColumns(10);
		txtphotoscan.setBounds(446, 264, 180, 88);
		panel.add(txtphotoscan);
	}
}
