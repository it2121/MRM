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

public class cc {

	public static JFrame frame;
	public static boolean cc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cc window = new cc();
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
	public cc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setBounds(100, 100, 404, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setBackground(SystemColor.control);
		label.setIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\gfjnfm1.png"));
		label.setBounds(99, 10, 200, 163);
		frame.getContentPane().add(label);

		JButton button_1 = new JButton("Search for person");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cc = true;
				searcher j = new searcher();
				j.frmSearch.setVisible(true);
				frame.setVisible(false);

			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setBounds(124, 200, 149, 33);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("statistics");
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(124, 244, 149, 33);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("Info");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"Designed by Mohammad Talib And Mahmood Khairi");
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(124, 288, 149, 33);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("Log Out");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// logp logo = new login();
				logp p = new logp();
				logp.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(30, 144, 255));
		button_4.setBounds(124, 332, 149, 33);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("Exit");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setBackground(new Color(30, 144, 255));
		button_5.setBounds(124, 376, 149, 33);
		frame.getContentPane().add(button_5);
	}

}
