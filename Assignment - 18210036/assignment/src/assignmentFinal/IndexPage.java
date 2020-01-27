package assignmentFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IndexPage {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexPage window = new IndexPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IndexPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panel.setBounds(102, 89, 561, 259);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Ministry of Foreign Affairs");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWelcomeToThe.setBounds(59, 25, 460, 59);
		panel.add(lblWelcomeToThe);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HomePage homePage = new HomePage ();
				frame.setVisible(false);
				homePage.setLocationRelativeTo(null);
				homePage.setVisible(true);
			}
		});
		btnStart.setBounds(207, 163, 149, 49);
		panel.add(btnStart);
	}
}
