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

public class VisitVisas extends JFrame {

	private JPanel contentPane;
	private JTextField txtfirst;
	private JTextField txtfather;
	private JTextField txtgrand;
	private JTextField txtfam;
	private JTextField txtssn;
	private JTextField txtdob;
	private JTextField txtpassportnum;
	private JTextField txtnum;
	private JTextField txtduration;
	private JLabel label_7;
	private JTextField txtpassportscan;
	private JLabel label_8;
	private JTextField txtphotoscan;
	private JTextField txthotelscan;
	private JLabel lblHotelReservationScan;
	private JLabel lblVisitationVisas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisitVisas frame = new VisitVisas();
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
	public VisitVisas() {
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
		label.setBounds(20, 54, 89, 23);
		panel.add(label);
		
		txtfirst = new JTextField();
		txtfirst.setColumns(10);
		txtfirst.setBounds(180, 57, 149, 20);
		panel.add(txtfirst);
		
		JLabel label_1 = new JLabel("Father's Name :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(20, 88, 109, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("GrandFather's Name :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(20, 122, 149, 23);
		panel.add(label_2);
		
		txtfather = new JTextField();
		txtfather.setColumns(10);
		txtfather.setBounds(180, 91, 149, 20);
		panel.add(txtfather);
		
		txtgrand = new JTextField();
		txtgrand.setColumns(10);
		txtgrand.setBounds(179, 125, 150, 20);
		panel.add(txtgrand);
		
		JLabel label_3 = new JLabel("Last Name :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(20, 156, 89, 23);
		panel.add(label_3);
		
		txtfam = new JTextField();
		txtfam.setColumns(10);
		txtfam.setBounds(180, 159, 149, 20);
		panel.add(txtfam);
		
		JLabel label_4 = new JLabel("SSN :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(20, 190, 89, 23);
		panel.add(label_4);
		
		txtssn = new JTextField();
		txtssn.setColumns(10);
		txtssn.setBounds(180, 193, 149, 20);
		panel.add(txtssn);
		
		JLabel label_5 = new JLabel("Date of Birth");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(20, 224, 118, 23);
		panel.add(label_5);
		
		txtdob = new JTextField();
		txtdob.setColumns(10);
		txtdob.setBounds(180, 227, 149, 20);
		panel.add(txtdob);
		
		JLabel label_6 = new JLabel("Passport number : ");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(20, 258, 118, 23);
		panel.add(label_6);
		
		txtpassportnum = new JTextField();
		txtpassportnum.setColumns(10);
		txtpassportnum.setBounds(180, 258, 149, 20);
		panel.add(txtpassportnum);
		
		JLabel label_9 = new JLabel("How many entries :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(20, 292, 149, 23);
		panel.add(label_9);
		
		txtnum = new JTextField();
		txtnum.setColumns(10);
		txtnum.setBounds(180, 292, 149, 20);
		panel.add(txtnum);
		
		JLabel label_10 = new JLabel("Visa Duration :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(20, 326, 118, 23);
		panel.add(label_10);
		
		txtduration = new JTextField();
		txtduration.setColumns(10);
		txtduration.setBounds(180, 326, 149, 20);
		panel.add(txtduration);
		
		label_7 = new JLabel("Passport Scan (Google Drive Link)");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(439, 54, 227, 17);
		panel.add(label_7);
		
		txtpassportscan = new JTextField();
		txtpassportscan.setColumns(10);
		txtpassportscan.setBounds(449, 85, 180, 88);
		panel.add(txtpassportscan);
		
		label_8 = new JLabel("Photo Scan (Google Drive Link)");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(439, 187, 216, 17);
		panel.add(label_8);
		
		txtphotoscan = new JTextField();
		txtphotoscan.setColumns(10);
		txtphotoscan.setBounds(449, 221, 180, 88);
		panel.add(txtphotoscan);
		
		txthotelscan = new JTextField();
		txthotelscan.setColumns(10);
		txthotelscan.setBounds(449, 361, 180, 88);
		panel.add(txthotelscan);
		
		lblHotelReservationScan = new JLabel("Hotel Reservation Scan (Google Drive Link)");
		lblHotelReservationScan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHotelReservationScan.setBounds(409, 329, 288, 17);
		panel.add(lblHotelReservationScan);
		
		lblVisitationVisas = new JLabel("Visitation Visas :");
		lblVisitationVisas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblVisitationVisas.setBounds(10, 11, 216, 29);
		panel.add(lblVisitationVisas);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				VisaMenu visa = new VisaMenu();
				setVisible(false);
				visa.setLocationRelativeTo(null);
				visa.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(0, 432, 149, 42);
		panel.add(button);
		
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
					String passportnum = "";
					String dateofbirth = "";
					String passportscan = "";
					String photoscan = "";
					String hotelscan = "";
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
					hotelscan = txthotelscan.getText();
					numberoE = txtnum.getText();
					duration = txtduration.getText();

					 
					FileWriter fileWriter = new FileWriter ("C:\\Users\\user\\eclipse-workspace\\assignment\\src\\Text Files\\Visas\\Visit\\" + username + ".txt");
					
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
					fileWriter.write(hotelscan + "\n");
					
					fileWriter.close();
					
					JOptionPane.showMessageDialog(null, "Your request has been sent");
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBounds(0, 382, 149, 42);
		panel.add(button_1);
	}
}
