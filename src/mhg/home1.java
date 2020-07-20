package mhg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class home1 {

	public static JFrame frame;
	public static boolean manager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home1 window = new home1();
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
	public home1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\gfjnfm1.png"));
		label.setBounds(98, 11, 200, 163);
		frame.getContentPane().add(label);

		JButton btnNewButton = new JButton("Add a New Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add u = new add();
				u.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(124, 198, 149, 33);
		frame.getContentPane().add(btnNewButton);

		JButton btnSearchForPerson = new JButton("Search for person");
		btnSearchForPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searcher.frmSearch.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnSearchForPerson.setForeground(new Color(255, 255, 255));
		btnSearchForPerson.setBackground(new Color(30, 144, 255));
		btnSearchForPerson.setBounds(124, 242, 149, 33);
		frame.getContentPane().add(btnSearchForPerson);

		JButton btnStatistics = new JButton("statistics");
		btnStatistics.setForeground(new Color(255, 255, 255));
		btnStatistics.setBackground(new Color(30, 144, 255));
		btnStatistics.setBounds(124, 286, 149, 33);
		frame.getContentPane().add(btnStatistics);

		JButton btnInfo = new JButton("Info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"Designed by Mohammad Talib And Mahmood Khairi");
			}
		});
		btnInfo.setForeground(new Color(255, 255, 255));
		btnInfo.setBackground(new Color(30, 144, 255));
		btnInfo.setBounds(124, 330, 149, 33);
		frame.getContentPane().add(btnInfo);

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				login log = new login();
				login.login.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogOut.setForeground(new Color(255, 255, 255));
		btnLogOut.setBackground(new Color(30, 144, 255));
		btnLogOut.setBounds(124, 374, 149, 33);
		frame.getContentPane().add(btnLogOut);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(30, 144, 255));
		btnExit.setBounds(124, 418, 149, 33);
		frame.getContentPane().add(btnExit);
		frame.setBounds(100, 100, 404, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}

}
