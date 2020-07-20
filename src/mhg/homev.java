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

public class homev {

	public JFrame frame;
	public static boolean viewer = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homev window = new homev();
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
	public homev() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frame.getContentPane().setBackground(SystemColor.controlShadow);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\srhh1.png"));
		label.setBounds(99, 11, 200, 163);
		frame.getContentPane().add(label);

		JButton btnViewMyRecord = new JButton("View My Record");
		btnViewMyRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				searchf s = new searchf();
				s.frame.setVisible(true);
				frame.setVisible(false);
				searchf.btnEdit.setVisible(false);

			}
		});
		btnViewMyRecord.setForeground(Color.WHITE);
		btnViewMyRecord.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnViewMyRecord.setBackground(new Color(30, 144, 255));
		btnViewMyRecord.setBounds(124, 191, 149, 33);
		frame.getContentPane().add(btnViewMyRecord);

		JButton btnChangeThePassword = new JButton("Change The Password");
		btnChangeThePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chpass k = new chpass();
				k.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnChangeThePassword.setForeground(Color.WHITE);
		btnChangeThePassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnChangeThePassword.setBackground(new Color(30, 144, 255));
		btnChangeThePassword.setBounds(124, 235, 149, 33);
		frame.getContentPane().add(btnChangeThePassword);

		JButton button_2 = new JButton("Info");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null,
						"Designed by Mohammad Talib And Mahmood Khairi");
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(124, 279, 149, 33);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("Log out");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// logp logo = new login();
				logp p = new logp();
				logp.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(124, 323, 149, 33);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("Exit");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_4.setBackground(new Color(30, 144, 255));
		button_4.setBounds(124, 367, 149, 33);
		frame.getContentPane().add(button_4);
		frame.setBounds(100, 100, 404, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
