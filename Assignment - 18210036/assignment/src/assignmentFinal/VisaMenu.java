package assignmentFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VisaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisaMenu frame = new VisaMenu();
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
	public VisaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVisa = new JLabel("Choose the Type of Visa that you are applying for :");
		lblVisa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVisa.setBounds(135, 88, 531, 63);
		contentPane.add(lblVisa);
		
		JButton button = new JButton("Back");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				MainPage main = new MainPage();
				setVisible(false);
				main.setLocationRelativeTo(null);
				main.setVisible(true);
			}
		});
		button.setBounds(10, 441, 133, 44);
		contentPane.add(button);
		
		JButton btnWork = new JButton("Work");
		btnWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				WorkVisas work = new WorkVisas ();
				setVisible(false);
				work.setLocationRelativeTo(null);
				work.setVisible(true);
			}
		});
		btnWork.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnWork.setBounds(108, 235, 133, 44);
		contentPane.add(btnWork);
		
		JButton btnTourism = new JButton("Tourism");
		btnTourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				VisitVisas visit = new VisitVisas ();
				setVisible(false);
				visit.setLocationRelativeTo(null);
				visit.setVisible(true);
			}
		});
		btnTourism.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTourism.setBounds(303, 235, 133, 44);
		contentPane.add(btnTourism);
		
		JButton btnFamilyfriends = new JButton("Family/Friends");
		btnFamilyfriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FamilyVisas fam = new FamilyVisas ();
				setVisible(false);
				fam.setLocationRelativeTo(null);
				fam.setVisible(true);
			}
		});
		btnFamilyfriends.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFamilyfriends.setBounds(501, 235, 133, 44);
		contentPane.add(btnFamilyfriends);
	}

}
