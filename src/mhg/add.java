package mhg;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.toedter.calendar.JDateChooser;

public class add {
	public static boolean setpath = false;
	public String pathi = null;
	public ImageIcon i;
	public static JFrame frame;
	public ImageIcon imagea = null;
	public boolean imgset = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());

					add window = new add();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */

	public add() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public Image ii;
	public JLabel label;
	public static String fnn;
	public static String lnn;
	public static String min;
	public static String lan;
	public static String bin;
	public static String gen;
	public static String ocn;
	public static String man;
	public static String adn;
	public static String bln;
	public static String phn;
	public static String pass;
	public static String em;
	public static String picn;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public void initialize() {
		final TextField textField_4 = new TextField();
		textField_4.setEditable(false);
		final TextField textField_3 = new TextField();
		final TextField textField_2 = new TextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}
			}
		});
		final TextField textField_1 = new TextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}
			}
		});
		final TextField textField = new TextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}
			}
		});
		final TextField textField_7 = new TextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();
				if (!(Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}
			}
		});
		final TextField textField_5 = new TextField();
		passwordField = new JPasswordField();

		passwordField_1 = new JPasswordField();
		final TextField textField_6 = new TextField();
		final JDateChooser dateChooser = new JDateChooser();
		final Choice choice = new Choice();
		final Choice choice_1 = new Choice();
		final Choice choice_2 = new Choice();
		i = new ImageIcon(
				"C:\\Users\\Mohammad\\Desktop\\add-new-plus-user-icon--icon-search-engine-32.png");
		conne.getimage("1");
		ii = conne.imm.getImage();

		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		// *****************
		frame.setLocationRelativeTo(null);
		// *********

		label = new JLabel("");
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				// conne.getimage("4");
			}
		});
		label.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System
						.getProperty("user.home")));

				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"*.IMAGE", "jpg", "gif", "png");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					pathi = selectedFile.getAbsolutePath();
					// ImageIcon icon = new ImageIcon("" + path + "");

					setpath = true;

					i = new ImageIcon(pathi);

					ii = i.getImage();
					conne.resize(label.getWidth(), label.getHeight(),
							i.getIconWidth(), i.getIconHeight());
					Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
							Image.SCALE_SMOOTH);

					imagea = new ImageIcon(newImage);
					label.setIcon(imagea);
					mhh1.asas = imagea;
				}

				textField_4.setText(pathi);
				imgset = true;

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				if ((textField_4.getText().equals(""))) {
					conne.getimage("4");
					ii = conne.imm.getImage();
					conne.resize(label.getWidth(), label.getHeight(),
							conne.imm.getIconWidth(), conne.imm.getIconHeight());
					Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
							Image.SCALE_SMOOTH);

					imagea = new ImageIcon(newImage);
					label.setIcon(imagea);
				}
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				if ((textField_4.getText().equals(""))) {
					conne.getimage("1");
					ii = conne.imm.getImage();
					conne.resize(label.getWidth(), label.getHeight(),
							conne.imm.getIconWidth(), conne.imm.getIconHeight());
					Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
							Image.SCALE_SMOOTH);

					imagea = new ImageIcon(newImage);
					label.setIcon(imagea);
				}
			}
		});
		label.setForeground(SystemColor.windowText);
		label.setBackground(SystemColor.windowBorder);
		label.setFont(new Font("Tahoma", Font.PLAIN, 8));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 11, 196, 149);
		// int w = label.getWidth();
		// int h = label.getHeight();
		// int iw = i.getIconWidth();
		// int ih = i.getIconHeight();
		// while (iw > w || ih > h) {
		// iw--;
		// ih--;
		//
		// }

		conne.resize(label.getWidth(), label.getHeight(),
				conne.imm.getIconWidth(), conne.imm.getIconHeight());
		Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
				Image.SCALE_SMOOTH);

		imagea = new ImageIcon(newImage);
		label.setIcon(imagea);
		mhh1.asas = imagea;

		frame.getContentPane().add(label);

		Label label_1 = new Label("First name");
		label_1.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_1.setAlignment(Label.CENTER);
		label_1.setBackground(new Color(250, 250, 210));
		label_1.setBounds(240, 74, 82, 18);
		frame.getContentPane().add(label_1);

		Label label_4 = new Label("Identity");
		label_4.setAlignment(Label.CENTER);
		label_4.setBackground(new Color(255, 215, 0));
		label_4.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_4.setBounds(222, 21, 100, 32);
		frame.getContentPane().add(label_4);

		Label label_2 = new Label("Mid name");
		label_2.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_2.setBackground(new Color(250, 250, 210));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(366, 74, 82, 18);
		frame.getContentPane().add(label_2);

		Label label_3 = new Label("Last name");
		label_3.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_3.setBackground(new Color(250, 250, 210));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(491, 74, 81, 18);
		frame.getContentPane().add(label_3);

		textField.setBounds(239, 97, 83, 18);
		frame.getContentPane().add(textField);

		textField_1.setBounds(365, 97, 83, 18);
		frame.getContentPane().add(textField_1);

		textField_2.setBounds(490, 97, 82, 18);
		frame.getContentPane().add(textField_2);

		dateChooser.setBounds(238, 174, 209, 22);
		frame.getContentPane().add(dateChooser);

		Label label_5 = new Label("Birth Date");
		label_5.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_5.setBackground(new Color(250, 250, 210));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(240, 152, 82, 18);
		frame.getContentPane().add(label_5);

		Label label_6 = new Label("Gender");
		label_6.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_6.setBackground(new Color(250, 250, 210));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(491, 152, 81, 18);
		frame.getContentPane().add(label_6);

		choice.setBounds(490, 177, 82, 20);
		frame.getContentPane().add(choice);

		Label label_7 = new Label("Marital Status");
		label_7.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_7.setBackground(new Color(250, 250, 210));
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(241, 239, 81, 18);
		frame.getContentPane().add(label_7);

		choice_1.setBounds(239, 261, 208, 20);
		frame.getContentPane().add(choice_1);

		choice_2.setBounds(489, 261, 82, 20);
		frame.getContentPane().add(choice_2);

		Label label_8 = new Label("Blood Group");
		label_8.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_8.setBackground(new Color(250, 250, 210));
		label_8.setAlignment(Label.CENTER);
		label_8.setBounds(490, 238, 82, 18);
		frame.getContentPane().add(label_8);

		Label label_9 = new Label("Occupation");
		label_9.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_9.setBackground(new Color(250, 250, 210));
		label_9.setAlignment(Label.CENTER);
		label_9.setBounds(241, 322, 81, 18);
		frame.getContentPane().add(label_9);

		textField_3.setBounds(241, 347, 332, 18);
		frame.getContentPane().add(textField_3);

		textField_4.setBounds(242, 402, 251, 18);
		frame.getContentPane().add(textField_4);

		Button button = new Button("Browse ");
		button.addActionListener(new ActionListener() {
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
					pathi = selectedFile.getAbsolutePath();
					// ImageIcon icon = new ImageIcon("" + path + "");
					textField_4.setText(pathi);
					imgset = true;
					// setpath = true;

					i = new ImageIcon(pathi);

					ii = i.getImage();
					conne.resize(label.getWidth(), label.getHeight(),
							i.getIconWidth(), i.getIconHeight());
					Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
							Image.SCALE_SMOOTH);

					imagea = new ImageIcon(newImage);
					label.setIcon(imagea);
					mhh1.asas = imagea;
				}
			}
		}

		);
		button.setBounds(505, 402, 70, 18);
		frame.getContentPane().add(button);

		Label label_10 = new Label("Image");
		label_10.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_10.setBackground(new Color(250, 250, 210));
		label_10.setAlignment(Label.CENTER);
		label_10.setBounds(240, 378, 81, 18);
		frame.getContentPane().add(label_10);

		Label label_11 = new Label("Contact");
		label_11.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_11.setBackground(new Color(255, 215, 0));
		label_11.setAlignment(Label.CENTER);
		label_11.setBounds(639, 21, 100, 32);
		frame.getContentPane().add(label_11);

		Label label_12 = new Label("Address");
		label_12.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_12.setBackground(new Color(250, 250, 210));
		label_12.setAlignment(Label.CENTER);
		label_12.setBounds(655, 74, 82, 18);
		frame.getContentPane().add(label_12);

		Label label_13 = new Label("Email");
		label_13.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_13.setBackground(new Color(250, 250, 210));
		label_13.setAlignment(Label.CENTER);
		label_13.setBounds(655, 140, 82, 18);
		frame.getContentPane().add(label_13);

		Label label_14 = new Label("Phone Number");
		label_14.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_14.setBackground(new Color(250, 250, 210));
		label_14.setAlignment(Label.CENTER);
		label_14.setBounds(655, 208, 82, 18);
		frame.getContentPane().add(label_14);

		textField_5.setBounds(656, 98, 288, 18);
		frame.getContentPane().add(textField_5);

		textField_6.setBounds(655, 163, 288, 18);
		frame.getContentPane().add(textField_6);

		textField_7.setBounds(655, 230, 288, 18);
		frame.getContentPane().add(textField_7);

		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				home1 assa = new home1();
				cc ada = new cc();
				home aaa = new home();
				// System.out.println(level);
				if (searcher.level == 3) {
					// red = 3;

					aaa.frame.setVisible(true);

				} else if (searcher.level == 2) {
					// red = 2;

					assa.frame.setVisible(true);
				} else if (searcher.level == 1) {
					// red = 1;

					ada.frame.setVisible(true);
				}
				// home aa = new home();
				// aa.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(240, 255, 255));
		btnNewButton.setBounds(24, 525, 104, 30);
		frame.getContentPane().add(btnNewButton);

		JButton btnHome = new JButton("Next");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(textField_2.getText());
				// textField.getInputContext()

				if (textField.getSelectionEnd() == 0
						|| textField_1.getSelectionEnd() == 0
						|| textField_2.getSelectionEnd() == 0
						|| textField_3.getSelectionEnd() == 0

						|| textField_5.getSelectionEnd() == 0
						|| textField_6.getSelectionEnd() == 0
						|| textField_7.getSelectionEnd() == 0
						|| dateChooser.getDate() == null
						|| choice.getSelectedIndex() <= 0
						|| choice_1.getSelectedIndex() <= 0
						|| choice_2.getSelectedIndex() <= 0) {
					JOptionPane.showMessageDialog(null,
							"Plase Don't Leave Any Field Empty");

				} else {
					if (passwordField.getText().equals(
							passwordField_1.getText())) {

						mhh1 h = new mhh1();
						h.frame.setVisible(true);

						frame.setVisible(false);
						fnn = textField.getText();
						lnn = textField_2.getText();
						min = textField_1.getText();

						Date bin1 = dateChooser.getDate();
						// System.out.println(bin1);
						bin = bin1.toString();
						gen = choice.getSelectedItem();

						ocn = textField_3.getText();
						man = choice_1.getSelectedItem();
						adn = textField_5.getText();
						bln = choice_2.getSelectedItem();
						phn = textField_7.getText();
						em = textField_6.getText();
						picn = textField_4.getText();
						pass = passwordField.getText();
						// = new JPasswordField();passwordField_1 = new
						// JPasswordField();

					} else {
						JOptionPane.showMessageDialog(null,
								"The Passwords Do NoT Mach");
					}
				}
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHome.setBackground(new Color(30, 144, 255));
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBounds(868, 525, 104, 30);
		frame.getContentPane().add(btnHome);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// i = new ImageIcon(
				// "C:\\Users\\Mohammad\\Desktop\\add-new-plus-user-icon--icon-search-engine-32.png");

				ii = conne.imm.getImage();
				conne.resize(label.getWidth(), label.getHeight(),
						conne.imm.getIconWidth(), conne.imm.getIconHeight());
				Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
						Image.SCALE_SMOOTH);

				imagea = new ImageIcon(newImage);
				label.setIcon(imagea);
				textField_4.setText("");
				mhh1.asas = imagea;
			}
		});
		btnNewButton_1.setBackground(new Color(135, 206, 235));
		btnNewButton_1.setBounds(67, 175, 82, 22);
		frame.getContentPane().add(btnNewButton_1);

		final Label label_15 = new Label("");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				// label_15.setBackground(SystemColor.controlHighlight);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// label_15.setBackground(SystemColor.controlDkShadow);
			}
		});
		label_15.setBackground(SystemColor.controlHighlight);
		label_15.setBounds(226, 21, 367, 434);
		frame.getContentPane().add(label_15);

		Label label_16 = new Label("");
		label_16.setBackground(SystemColor.controlHighlight);
		label_16.setBounds(643, 25, 329, 260);
		frame.getContentPane().add(label_16);

		Label label_17 = new Label("Password");
		label_17.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_17.setBackground(new Color(255, 215, 0));
		label_17.setAlignment(Label.CENTER);
		label_17.setBounds(639, 304, 100, 32);
		frame.getContentPane().add(label_17);

		passwordField.setBounds(773, 358, 178, 18);
		frame.getContentPane().add(passwordField);

		passwordField_1.setBounds(773, 401, 178, 18);
		frame.getContentPane().add(passwordField_1);

		Label label_19 = new Label("The Password ");
		label_19.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_19.setBackground(new Color(250, 250, 210));
		label_19.setAlignment(Label.CENTER);
		label_19.setBounds(646, 359, 121, 18);
		frame.getContentPane().add(label_19);

		Label label_20 = new Label("re-write The Password");
		label_20.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_20.setBackground(new Color(250, 250, 210));
		label_20.setAlignment(Label.CENTER);
		label_20.setBounds(647, 403, 121, 18);
		frame.getContentPane().add(label_20);

		Label label_18 = new Label("");
		label_18.setBackground(SystemColor.controlHighlight);
		label_18.setBounds(644, 305, 329, 149);
		frame.getContentPane().add(label_18);

		// JMonthChooser monthChooser = new JMonthChooser();
		// monthChooser.setBounds(79, 345, 94, 20);
		// frame.getContentPane().add(monthChooser);

		// JYearChooser yearChooser = new JYearChooser();
		// yearChooser.setBounds(89, 378, 44, 20);
		// frame.getContentPane().add(yearChooser);

		// JDayChooser dayChooser = new JDayChooser();
		// dayChooser.setBounds(27, 224, 196, 140);
		// frame.getContentPane().add(dayChooser);
		choice.addItem("------------------------");
		choice.addItem("Male");
		choice.addItem("Female");
		choice_1.addItem("------------------------------------------------------------");

		choice_1.addItem("Married");
		choice_1.addItem("Divorced");
		choice_1.addItem("Single");
		choice_1.addItem("Widowed");
		choice_2.addItem("------------------------");
		choice_2.addItem("A+");
		choice_2.addItem("A-");
		choice_2.addItem("B+");
		choice_2.addItem("B-");
		choice_2.addItem("AB+");
		choice_2.addItem("AB-");
		choice_2.addItem("O+");
		choice_2.addItem("O-");
	}
}
