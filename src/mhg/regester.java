package mhg;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class regester {
	String s;
	public FileInputStream is = null;
	public FileInputStream iss = null;
	public File imagea = null;
	public boolean seted = false;
	private JFrame framea;
	private JTextField textField;
	private JTextField textField_1;

	// private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regester window = new regester();
					window.framea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public regester() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		framea = new JFrame();
		framea.setBounds(100, 100, 450, 300);
		framea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framea.getContentPane().setLayout(null);
		// btnNewButton_1.setBounds(57, 147, 200, 50);
		// framea.getContentPane().add(btnNewButton_1);

		final JLabel label = new JLabel("");
		label.setBounds(70, 11, 310, 122);
		framea.getContentPane().add(label);
		JButton btnNewButton = new JButton("save");

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					Class.forName("com.mysql.jdbc.Driver");
					Connection cona = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/test", "root", "");

					PreparedStatement ps = (PreparedStatement) cona
							.prepareStatement("INSERT INTO fuck (name,age,pic) VALUES (?,?,?)");
					FileInputStream is = new FileInputStream(s);

					ps.setString(1, textField.getText());

					ps.setString(2, textField_1.getText());

					ps.setBlob(3, is);
					System.out.println("hell yeahq");
					ps.executeUpdate();

					System.out.println("hell yeah");
				} catch (Exception ex) {
					System.out.println("h");
				}

				// try {
				// Class.forName("com.mysql.jdbc.Driver");
				// Connection con = DriverManager.getConnection(
				// "jdbc:mysql://localhost:3306/test", "root", "");
				// PreparedStatement statement = (PreparedStatement) con
				// .prepareStatement("INSERT INTO names (?,?) VALUES (?,?)");
				// statement.setString(1, fname);
				// statement.setString(2, lname);
				// statement.close();
				// con.close();
				// } catch (Exception e) {
				// System.out.println("mother fucker");
				// }

			}
		});
		btnNewButton.setBounds(70, 203, 310, 50);
		framea.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("b");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System
						.getProperty("user.home")));
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"*.IMAGE", "jpg", "gif", "png");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					String path = selectedFile.getAbsolutePath();
					// ImageIcon icon = new ImageIcon("" + path + "");

					label.setIcon(ResizeImage(path));

					s = path;
					File imagea = new File(path);
					// System.out.println(imagea);
					seted = true;
				} else if (result == JFileChooser.CANCEL_OPTION) {
					System.out.println("No Data");
				}

			}

			public ImageIcon ResizeImage(String imgPath) {
				ImageIcon MyImage = new ImageIcon(imgPath);
				Image img = MyImage.getImage();
				Image newImage = img.getScaledInstance(label.getWidth(),
						label.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImage);
				return image;

			}
		});
		btnNewButton_2.setBounds(70, 142, 310, 50);
		framea.getContentPane().add(btnNewButton_2);

		textField = new JTextField();
		textField.setBounds(10, 122, 86, 20);
		framea.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 91, 86, 20);
		framea.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		// btnNewButton_1 = new JButton("New button");
		// btnNewButton_1.addActionListener(new ActionListener() {

	}
}
