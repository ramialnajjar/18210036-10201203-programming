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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class WorkVisas extends JFrame {

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
	private JLabel lblWorkVisas;
	private JLabel label_7;
	private JTextField txtpassportscan;
	private JLabel label_8;
	private JTextField txtphotoscan;
	private JLabel lblBusinessLettergoogle;
	private JTextField txtletter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkVisas frame = new WorkVisas();
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
	public WorkVisas() {
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
		
		JLabel label = new JLabel("First Name :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(24, 72, 89, 23);
		panel.add(label);
		
		txtfirst = new JTextField();
		txtfirst.setColumns(10);
		txtfirst.setBounds(184, 75, 149, 20);
		panel.add(txtfirst);
		
		JLabel label_1 = new JLabel("Father's Name :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(24, 106, 109, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("GrandFather's Name :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(24, 140, 149, 23);
		panel.add(label_2);
		
		txtfather = new JTextField();
		txtfather.setColumns(10);
		txtfather.setBounds(184, 109, 149, 20);
		panel.add(txtfather);
		
		txtgrand = new JTextField();
		txtgrand.setColumns(10);
		txtgrand.setBounds(183, 143, 150, 20);
		panel.add(txtgrand);
		
		JLabel label_3 = new JLabel("Last Name :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(24, 174, 89, 23);
		panel.add(label_3);
		
		txtfam = new JTextField();
		txtfam.setColumns(10);
		txtfam.setBounds(184, 177, 149, 20);
		panel.add(txtfam);
		
		JLabel label_4 = new JLabel("SSN :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(24, 208, 89, 23);
		panel.add(label_4);
		
		txtssn = new JTextField();
		txtssn.setColumns(10);
		txtssn.setBounds(184, 211, 149, 20);
		panel.add(txtssn);
		
		JLabel label_5 = new JLabel("Date of Birth");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(24, 242, 118, 23);
		panel.add(label_5);
		
		txtdob = new JTextField();
		txtdob.setColumns(10);
		txtdob.setBounds(184, 245, 149, 20);
		panel.add(txtdob);
		
		JLabel label_6 = new JLabel("Passport number : ");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(24, 276, 118, 23);
		panel.add(label_6);
		
		txtpassportnum = new JTextField();
		txtpassportnum.setColumns(10);
		txtpassportnum.setBounds(184, 276, 149, 20);
		panel.add(txtpassportnum);
		
		JLabel lblHowManyEntries = new JLabel("How many entries :");
		lblHowManyEntries.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHowManyEntries.setBounds(24, 310, 149, 23);
		panel.add(lblHowManyEntries);
		
		txtnumberoE = new JTextField();
		txtnumberoE.setColumns(10);
		txtnumberoE.setBounds(184, 310, 149, 20);
		panel.add(txtnumberoE);
		
		JLabel lblVisaDuration = new JLabel("Visa Duration :");
		lblVisaDuration.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVisaDuration.setBounds(24, 344, 118, 23);
		panel.add(lblVisaDuration);
		
		txtduration = new JTextField();
		txtduration.setColumns(10);
		txtduration.setBounds(184, 344, 149, 20);
		panel.add(txtduration);
		
		lblWorkVisas = new JLabel("Work Visas :");
		lblWorkVisas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWorkVisas.setBounds(10, 23, 162, 29);
		panel.add(lblWorkVisas);
		
		label_7 = new JLabel("Passport Scan (Google Drive Link)");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(446, 55, 227, 17);
		panel.add(label_7);
		
		txtpassportscan = new JTextField();
		txtpassportscan.setColumns(10);
		txtpassportscan.setBounds(456, 86, 180, 88);
		panel.add(txtpassportscan);
		
		label_8 = new JLabel("Photo Scan (Google Drive Link)");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(446, 188, 216, 17);
		panel.add(label_8);
		
		txtphotoscan = new JTextField();
		txtphotoscan.setColumns(10);
		txtphotoscan.setBounds(456, 222, 180, 88);
		panel.add(txtphotoscan);
		
		lblBusinessLettergoogle = new JLabel("Business Letter (Google Drive Link)");
		lblBusinessLettergoogle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBusinessLettergoogle.setBounds(442, 334, 220, 17);
		panel.add(lblBusinessLettergoogle);
		
		txtletter = new JTextField();
		txtletter.setColumns(10);
		txtletter.setBounds(456, 362, 180, 88);
		panel.add(txtletter);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
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
					String bletter = "";
					String numberoE = "";
					String duration = "";
					
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
					bletter = txtletter.getText();
					numberoE = txtnumberoE.getText();
					duration = txtduration.getText();

					 
					FileWriter fileWriter = new FileWriter ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Visas\\Work\\" + username + ".txt");
					
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
					fileWriter.write(bletter + "\n");
					
					fileWriter.close();
					
					JOptionPane.showMessageDialog(null, "Your request has been sent");
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(10, 378, 149, 42);
		panel.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				VisaMenu visa = new VisaMenu();
				setVisible (false);
				visa.setLocationRelativeTo(null);
				visa.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(10, 428, 149, 42);
		panel.add(button_1);
	}
}
