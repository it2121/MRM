package mhg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class logp {

	public static JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	public static boolean fromep = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logp window = new logp();
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
	public logp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frame.getContentPane().setBackground(SystemColor.info);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\gfjnfm1.png"));
		label.setBackground(new Color(173, 216, 230));
		label.setBounds(-9, 0, 308, 205);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("Connected");
		label_1.setForeground(Color.GREEN);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		label_1.setBounds(85, 191, 109, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Connection :");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		label_2.setBounds(10, 191, 81, 14);
		frame.getContentPane().add(label_2);

		JButton button = new JButton("Log in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				conne.selectp(textField.getText(), passwordField.getText());

				if (conne.foundp == true) {
					conne.selectpic(textField.getText());
					conne.selectmh(textField.getText());

					searchf.cheifcomplaints = conne.cheifcomplaints;
					searchf.HPCs = conne.HPCs;
					searchf.PHs = conne.PHs;
					searchf.SHs = conne.SHs;
					searchf.DHs = conne.DHs;

					searchf.fname = conne.fname;
					searchf.mname = conne.mname;
					searchf.lname = conne.lname;
					searchf.birth = conne.birth;
					searchf.gender = conne.gender;
					searchf.mar = conne.mar;
					searchf.ad = conne.ad;
					searchf.blood = conne.blood;
					searchf.phone = conne.phone;
					searchf.email = conne.email;
					searchf.email = conne.email;
					searchf.o = conne.o;
					searchf.pic = conne.pic;
					searchf.seid = conne.seid;
					fromep = true;
					homev l = new homev();
					l.frame.setVisible(true);
					frame.setVisible(false);

				} else if (conne.foundp == false) {
					JOptionPane.showMessageDialog(null,
							"The Username or The Password Is not found");
					passwordField.setText("");
					textField.setText("");
				}
				conne.foundp = false;
			}
		});
		button.setForeground(new Color(127, 255, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBackground(Color.WHITE);
		button.setBounds(208, 147, 91, 23);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		button_1.setForeground(new Color(255, 102, 153));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(330, 147, 91, 23);
		frame.getContentPane().add(button_1);

		JLabel label_3 = new JLabel("Password");
		label_3.setFont(new Font("Nueva Std", Font.BOLD, 13));
		label_3.setBounds(208, 69, 200, 50);
		frame.getContentPane().add(label_3);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblId.setBounds(208, 38, 200, 50);
		frame.getContentPane().add(lblId);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

				// evt = null;
				// char a = '+';
				char vchar = evt.getKeyChar();
				if (!(Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}

			}
		});
		textField.setColumns(10);
		textField.setBounds(275, 53, 146, 20);
		frame.getContentPane().add(textField);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					conne.selectp(textField.getText(), passwordField.getText());

					if (conne.foundp == true) {
						conne.selectpic(textField.getText());
						conne.selectmh(textField.getText());

						searchf.cheifcomplaints = conne.cheifcomplaints;
						searchf.HPCs = conne.HPCs;
						searchf.PHs = conne.PHs;
						searchf.SHs = conne.SHs;
						searchf.DHs = conne.DHs;

						searchf.fname = conne.fname;
						searchf.mname = conne.mname;
						searchf.lname = conne.lname;
						searchf.birth = conne.birth;
						searchf.gender = conne.gender;
						searchf.mar = conne.mar;
						searchf.ad = conne.ad;
						searchf.blood = conne.blood;
						searchf.phone = conne.phone;
						searchf.email = conne.email;
						searchf.email = conne.email;
						searchf.o = conne.o;
						searchf.pic = conne.pic;
						searchf.seid = conne.seid;
						fromep = true;
						homev l = new homev();
						l.frame.setVisible(true);
						frame.setVisible(false);

					} else if (conne.foundp == false) {
						JOptionPane.showMessageDialog(null,
								"The Username or The Password Is not found");
						passwordField.setText("");
						textField.setText("");
					}
					conne.foundp = false;

				} else {

				}
			}
		});
		passwordField.setBounds(275, 84, 146, 20);
		frame.getContentPane().add(passwordField);
		frame.setBounds(100, 100, 443, 242);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");
			con.close();

			label_1.setText("Connected");
			label_1.setForeground(Color.GREEN);
		} catch (Exception e) {
			label_1.setText("Not Connected");
			label_1.setForeground(Color.RED);
		}
	}
}
