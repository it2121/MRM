package mhg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class chpass {

	public static JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chpass window = new chpass();
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
	public chpass() {
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
		frame.setBounds(100, 100, 399, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(161, 63, 195, 20);
		frame.getContentPane().add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(161, 94, 195, 20);
		frame.getContentPane().add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(161, 125, 195, 20);
		frame.getContentPane().add(passwordField_2);

		Label label = new Label("The Old Password:");
		label.setBackground(SystemColor.controlHighlight);
		label.setFont(new Font("Dialog", Font.BOLD, 10));
		label.setAlignment(Label.CENTER);
		label.setBounds(28, 61, 127, 22);
		frame.getContentPane().add(label);

		Label label_1 = new Label("The New Password:");
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setFont(new Font("Dialog", Font.BOLD, 10));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(28, 92, 127, 22);
		frame.getContentPane().add(label_1);

		Label label_2 = new Label("re-write The Password:");
		label_2.setBackground(SystemColor.controlHighlight);
		label_2.setFont(new Font("Dialog", Font.BOLD, 10));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(28, 123, 127, 22);
		frame.getContentPane().add(label_2);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				homev g = new homev();
				g.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(10, 197, 91, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				conne.selectpa(searchf.seid, passwordField.getText());

				if (conne.foundpa == true) {
					if (!(passwordField_1.getText().equals(passwordField_2
							.getText()))) {

						JOptionPane.showMessageDialog(null,
								"The Passwords Do NoT Mach");

					} else {

						conne.uppass(searchf.seid, passwordField_1.getText());
						JOptionPane.showMessageDialog(null,
								"The Password Has Been saved successfully. ");
						frame.setVisible(false);
						homev g = new homev();
						g.frame.setVisible(true);
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"The Old Passwords Is Not correct. ");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(290, 197, 91, 23);
		frame.getContentPane().add(btnNewButton_1);

		Label label_3 = new Label("New label");
		label_3.setBackground(new Color(255, 255, 255));
		label_3.setBounds(319, 178, -307, -162);
		frame.getContentPane().add(label_3);

		Label label_5 = new Label("Changing The Password");
		label_5.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_5.setBackground(new Color(255, 215, 0));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(7, 10, 137, 29);
		frame.getContentPane().add(label_5);

		Label label_4 = new Label("");
		label_4.setBackground(SystemColor.controlHighlight);
		label_4.setBounds(10, 10, 371, 162);
		frame.getContentPane().add(label_4);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
