package mhg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class home {

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.scrollbar);
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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\2017-04-06_003318.png"));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(124, 198, 149, 33);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("statistics");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\2017-04-06_003318.png"));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(124, 286, 149, 33);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Search for person");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				searcher s = new searcher();
				s.frmSearch.setVisible(true);
				frame.setVisible(false);

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\2017-04-06_003318.png"));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(124, 242, 149, 33);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Info");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// JOptionPane
				// .showMessageDialog(null,
				// "The Username or The Password Is not found");
				//
				//
				JOptionPane.showMessageDialog(null,
						"Designed by Mohammad Talib And Mahmood Khairi");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_3.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\2017-04-06_003318.png"));
		btnNewButton_3.setBackground(new Color(30, 144, 255));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(124, 374, 149, 33);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Log out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				login log = new login();
				login.login.setVisible(true);
				frame.setVisible(false);

			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\2017-04-06_003318.png"));
		btnNewButton_4.setBackground(new Color(30, 144, 255));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBounds(124, 418, 149, 33);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_5.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\2017-04-06_003318.png"));
		btnNewButton_5.setBackground(new Color(30, 144, 255));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBounds(124, 462, 149, 33);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnAdminControlPanel = new JButton("Admin Control Panel");
		btnAdminControlPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminc.main(null);
				frame.setVisible(false);
			}
		});
		btnAdminControlPanel.setForeground(Color.WHITE);
		btnAdminControlPanel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAdminControlPanel.setBackground(new Color(30, 144, 255));
		btnAdminControlPanel.setBounds(124, 330, 149, 33);
		frame.getContentPane().add(btnAdminControlPanel);
		frame.setBounds(100, 100, 404, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
