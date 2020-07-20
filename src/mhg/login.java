package mhg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {

	public static JFrame login;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblNewLabel;
	private JLabel conl;
	public static int a;
	public static int levelofadmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		//

		login = new JFrame();
		login.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		login.setResizable(false);
		login.getContentPane().setBackground(new Color(250, 250, 210));
		login.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Exit");
		btnNewButton
				.setSelectedIcon(new ImageIcon(
						"C:\\Users\\Mohammad\\Downloads\\Wallpapers\\mr-robot-logo-hd-qu-1366x768.jpg"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 102, 153));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(330, 139, 91, 23);
		login.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(new Color(127, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				conne Con = new conne();
				conne.getcon("select * from admins WHERE username = '"
						+ textField.getText() + "'AND passsword = '"
						+ passwordField.getText() + "'");

				if (conne.found == true) {

					if (conne.a == 3) {
						home o = new home();
						o.frame.setVisible(true);
						login.setVisible(false);
						textField.setText("");
						passwordField.setText("");
						// levelofadmin = "3";
						// searcher.level = levelofadmin;
						searcher.level = 3;
					} else if (conne.a == 2) {
						home1 o1 = new home1();
						o1.frame.setVisible(true);
						login.setVisible(false);
						textField.setText("");
						passwordField.setText("");
						// levelofadmin = "2";
						// searcher.level = levelofadmin;
						searcher.level = 2;
					} else if (conne.a == 1) {
						cc ov = new cc();
						ov.frame.setVisible(true);
						login.setVisible(false);
						textField.setText("");
						passwordField.setText("");
						// levelofadmin = "1";
						// searcher.level = levelofadmin;
						searcher.level = 1;
					}
				} else if (conne.found == false) {
					JOptionPane.showMessageDialog(null,
							"The Username or The Password Is not found");
					passwordField.setText("");
					textField.setText("");
				}
				// try {
				//
				// Connection conn = DriverManager.getConnection(
				// "jdbc:mysql://localhost:3306/test", "root", "");
				//
				// Statement stmtt = conn.createStatement();
				//
				// stmtt.executeUpdate("INSERT INTO `names`(`fname`, `lname`) VALUES (['asdsad'],['sa'])");
				//
				// } catch (Exception e) {
				// System.out.println("sdsd");
				// }
			}

		});
		btnNewButton_1.setBounds(208, 139, 91, 23);
		login.getContentPane().add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(275, 45, 146, 20);
		login.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		// s
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/admins", "root",
								"");
						// here sonoo is database name, root is username and
						// password
						Statement stmt = con.createStatement();
						ResultSet rs = stmt
								.executeQuery("select * from admins WHERE username = '"
										+ textField.getText()
										+ "'AND passsword = '"
										+ passwordField.getText() + "'");
						boolean found = false;
						while (rs.next()) {
							found = true;
							a = rs.getInt("level");

						}
						con.close();
						if (found == true) {

							if (a == 3) {
								home o = new home();
								o.frame.setVisible(true);
								login.setVisible(false);
								textField.setText("");
								passwordField.setText("");
								searcher.level = 3;
							} else if (a == 2) {
								home1 o1 = new home1();
								o1.frame.setVisible(true);
								login.setVisible(false);
								textField.setText("");
								passwordField.setText("");
								searcher.level = 2;
							} else {
								cc ov = new cc();
								ov.frame.setVisible(true);
								login.setVisible(false);
								textField.setText("");
								passwordField.setText("");
								searcher.level = 1;
							}
						} else if (found == false) {
							JOptionPane
									.showMessageDialog(null,
											"The Username or The Password Is not found");
						}
					} catch (Exception ex) {
						System.out.println(ex);
					}
				} else {
				}

			}

		});
		passwordField.setBounds(275, 76, 146, 20);
		login.getContentPane().add(passwordField);
		// s
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblUsername.setBounds(208, 30, 200, 50);
		login.getContentPane().add(lblUsername);

		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Nueva Std", Font.BOLD, 13));
		lblPassword.setBounds(208, 61, 200, 50);
		login.getContentPane().add(lblPassword);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(173, 216, 230));
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\all\\gfjnfm1.png"));
		lblNewLabel.setBounds(-13, 0, 308, 205);
		login.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Connection :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		lblNewLabel_1.setBounds(10, 183, 81, 14);
		login.getContentPane().add(lblNewLabel_1);

		conl = new JLabel("");

		conl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		conl.setBounds(85, 183, 109, 14);
		login.getContentPane().add(conl);
		login.setTitle("login");
		login.setBounds(100, 100, 443, 242);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setLocationRelativeTo(null);
		login.setResizable(false);
		// System.out.println("a");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");
			con.close();

			conl.setText("Connected");
			conl.setForeground(Color.GREEN);
		} catch (Exception e) {
			conl.setText("Not Connected");
			conl.setForeground(Color.RED);
		}
	}
}
