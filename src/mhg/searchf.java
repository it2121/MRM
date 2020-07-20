package mhg;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.toedter.calendar.JDateChooser;

public class searchf {
	public Image ii;
	public ImageIcon i;
	public static String fname;
	public static String mname;
	public static String lname;
	public static String birth;
	public static String gender;
	public static String mar;
	public static String ad;
	public static String blood;
	public static String phone;
	public static String email;
	public static String o;
	public ImageIcon imagea = null;
	public static BufferedImage pic = null;
	public static JFrame frame;
	public static String cheifcomplaints;
	public static String HPCs;
	public static String PHs;
	public static String SHs;
	public static String DHs;
	public static String pathis = null;
	public boolean imgsets = false;
	public static int seid;
	public static final JButton btnEdit = new JButton("Edit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchf window = new searchf();
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
	public searchf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);

		final JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 8));
		label.setBackground(SystemColor.windowBorder);
		label.setBounds(10, 11, 196, 149);
		frame.getContentPane().add(label);

		final TextField textField = new TextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

				// evt = null;
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))
						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}

			}
		});
		textField.setEditable(false);
		textField.setBounds(214, 97, 83, 18);
		frame.getContentPane().add(textField);

		Label label_1 = new Label("First name");
		label_1.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_1.setBackground(new Color(250, 250, 210));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(215, 74, 82, 18);
		frame.getContentPane().add(label_1);

		Label label_2 = new Label("Identity");
		label_2.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_2.setBackground(new Color(255, 215, 0));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(209, 10, 100, 32);
		frame.getContentPane().add(label_2);

		final TextField textField_1 = new TextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

				// evt = null;
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))
						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}

			}
		});
		textField_1.setEditable(false);
		textField_1.setBounds(340, 97, 83, 18);
		frame.getContentPane().add(textField_1);

		Label label_3 = new Label("Mid name");
		label_3.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_3.setBackground(new Color(250, 250, 210));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(341, 74, 82, 18);
		frame.getContentPane().add(label_3);

		final TextField textField_2 = new TextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {

				// evt = null;
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))
						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}

			}
		});
		textField_2.setEditable(false);
		textField_2.setBounds(465, 97, 82, 18);
		frame.getContentPane().add(textField_2);

		final Label label_4 = new Label("Last name");
		label_4.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_4.setBackground(new Color(250, 250, 210));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(466, 74, 81, 18);
		frame.getContentPane().add(label_4);

		final TextField textField_3 = new TextField();
		textField_3.setEditable(false);
		textField_3.setBounds(215, 392, 332, 18);
		frame.getContentPane().add(textField_3);

		final Label label_5 = new Label("Address");
		label_5.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_5.setBackground(new Color(250, 250, 210));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(214, 368, 82, 18);
		frame.getContentPane().add(label_5);

		final Label label_6 = new Label("Contact");
		label_6.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_6.setBackground(new Color(255, 215, 0));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(209, 304, 100, 32);
		frame.getContentPane().add(label_6);

		final TextField textField_4 = new TextField();
		textField_4.setEditable(false);
		textField_4.setBounds(214, 439, 333, 18);
		frame.getContentPane().add(textField_4);

		final Label label_7 = new Label("Email");
		label_7.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_7.setBackground(new Color(250, 250, 210));
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(214, 416, 82, 18);
		frame.getContentPane().add(label_7);

		final Label label_8 = new Label("Phone Number");
		label_8.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_8.setBackground(new Color(250, 250, 210));
		label_8.setAlignment(Label.CENTER);
		label_8.setBounds(214, 463, 82, 18);
		frame.getContentPane().add(label_8);

		final TextField textField_5 = new TextField();
		textField_5.addKeyListener(new KeyAdapter() {
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
		textField_5.setEditable(false);
		textField_5.setBounds(215, 482, 332, 18);
		frame.getContentPane().add(textField_5);

		final Choice choice = new Choice();
		choice.setBounds(465, 197, 82, 20);
		frame.getContentPane().add(choice);

		final Label label_9 = new Label("Blood Group");
		label_9.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_9.setBackground(new Color(250, 250, 210));
		label_9.setAlignment(Label.CENTER);
		label_9.setBounds(465, 174, 82, 18);
		frame.getContentPane().add(label_9);

		final Choice choice_1 = new Choice();
		choice_1.setBounds(465, 145, 82, 20);
		frame.getContentPane().add(choice_1);

		final Label label_10 = new Label("Gender");
		label_10.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_10.setBackground(new Color(250, 250, 210));
		label_10.setAlignment(Label.CENTER);
		label_10.setBounds(467, 121, 81, 18);
		frame.getContentPane().add(label_10);

		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(214, 138, 209, 22);
		frame.getContentPane().add(dateChooser);
		dateChooser.setVisible(false);
		final Label label_11 = new Label("Birth Date");
		label_11.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_11.setBackground(new Color(250, 250, 210));
		label_11.setAlignment(Label.CENTER);
		label_11.setBounds(216, 121, 82, 18);
		frame.getContentPane().add(label_11);

		final Label label_12 = new Label("Marital Status");
		label_12.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_12.setBackground(new Color(250, 250, 210));
		label_12.setAlignment(Label.CENTER);
		label_12.setBounds(216, 175, 81, 18);
		frame.getContentPane().add(label_12);

		final Choice choice_2 = new Choice();
		choice_2.setBounds(215, 197, 208, 20);
		frame.getContentPane().add(choice_2);
		choice_2.setVisible(false);
		choice_1.setVisible(false);
		choice.setVisible(false);
		final Label label_13 = new Label("Occupation");
		label_13.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_13.setBackground(new Color(250, 250, 210));
		label_13.setAlignment(Label.CENTER);
		label_13.setBounds(215, 223, 81, 18);
		frame.getContentPane().add(label_13);

		final TextField textField_6 = new TextField();
		textField_6.setEditable(false);
		textField_6.setBounds(215, 248, 332, 18);
		frame.getContentPane().add(textField_6);

		final TextField textField_7 = new TextField();
		textField_7.setEditable(false);
		textField_7.setBounds(10, 174, 120, 18);
		frame.getContentPane().add(textField_7);

		final Button button_1 = new Button("Browse ");
		button_1.addActionListener(new ActionListener() {
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
					pathis = selectedFile.getAbsolutePath();
					// ImageIcon icon = new ImageIcon("" + path + "");
					textField_7.setText(pathis);
					imgsets = true;
					// setpath = true;

					i = new ImageIcon(pathis);

					ii = i.getImage();
					conne.resize(label.getWidth(), label.getHeight(),
							i.getIconWidth(), i.getIconHeight());
					Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
							Image.SCALE_SMOOTH);

					imagea = new ImageIcon(newImage);
					label.setIcon(imagea);

				}
			}
		});
		button_1.setBounds(136, 174, 70, 18);
		frame.getContentPane().add(button_1);
		button_1.setVisible(false);
		textField_7.setVisible(false);
		final TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(568, 193, 400, 48);
		frame.getContentPane().add(textArea);

		final Label label_15 = new Label("Past History");
		label_15.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_15.setBackground(new Color(250, 250, 210));
		label_15.setAlignment(Label.CENTER);
		label_15.setBounds(568, 174, 150, 18);
		frame.getContentPane().add(label_15);

		final TextArea textArea_1 = new TextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(568, 97, 400, 53);
		frame.getContentPane().add(textArea_1);

		final Label label_16 = new Label("Cheif Complaint");
		label_16.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_16.setBackground(new Color(250, 250, 210));
		label_16.setAlignment(Label.CENTER);
		label_16.setBounds(568, 74, 150, 18);
		frame.getContentPane().add(label_16);

		final TextArea textArea_2 = new TextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(568, 272, 400, 53);
		frame.getContentPane().add(textArea_2);

		final Label label_17 = new Label(
				"History Of \r\nPriseinting\r\n Complaint");
		label_17.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_17.setBackground(new Color(250, 250, 210));
		label_17.setAlignment(Label.CENTER);
		label_17.setBounds(568, 248, 212, 18);
		frame.getContentPane().add(label_17);

		final Label label_18 = new Label("Social History");
		label_18.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_18.setBackground(new Color(250, 250, 210));
		label_18.setAlignment(Label.CENTER);
		label_18.setBounds(568, 330, 212, 18);
		frame.getContentPane().add(label_18);

		final TextArea textArea_3 = new TextArea();
		textArea_3.setEditable(false);
		textArea_3.setForeground(Color.BLACK);
		textArea_3.setBounds(568, 354, 400, 53);
		frame.getContentPane().add(textArea_3);

		final TextArea textArea_4 = new TextArea();
		textArea_4.setEditable(false);
		textArea_4.setForeground(Color.BLACK);
		textArea_4.setBounds(568, 447, 400, 53);
		frame.getContentPane().add(textArea_4);
		final Label label_21 = new Label("");

		final Label label_23 = new Label("");
		final Label label_22 = new Label("");

		final Label label_19 = new Label("Drug History");
		label_19.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_19.setBackground(new Color(250, 250, 210));
		label_19.setAlignment(Label.CENTER);
		label_19.setBounds(568, 424, 212, 18);
		frame.getContentPane().add(label_19);
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				conne.deleteall(seid);
				JOptionPane.showMessageDialog(null, "Deleted successfully.");
				searcher s = new searcher();
				s.frmSearch.setVisible(true);
				frame.setVisible(false);
				conne.fname = "";

			}
		});

		final Label label_20 = new Label("Medical Record");
		label_20.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_20.setBackground(new Color(255, 215, 0));
		label_20.setAlignment(Label.CENTER);
		label_20.setBounds(563, 10, 168, 32);
		frame.getContentPane().add(label_20);
		final Label label_14 = new Label("");
		final JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (logp.fromep == true) {
					homev s = new homev();
					s.frame.setVisible(true);
					frame.setVisible(false);
				} else {
					searcher s = new searcher();
					s.frmSearch.setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		button.setForeground(new Color(240, 255, 255));
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(10, 523, 104, 30);
		frame.getContentPane().add(button);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (textField.getText().equals("")
						|| textField_1.getText().equals("")
						|| textField_2.getText().equals("")
						|| textField_3.getText().equals("")
						|| textField_4.getText().equals("")
						|| textField_5.getText().equals("")
						|| textField_6.getText().equals("")

						|| textArea.getText().equals("")
						|| textArea_1.getText().equals("")
						|| textArea_2.getText().equals("")
						|| textArea_3.getText().equals("")
						|| textArea_4.getText().equals("")
						|| choice.getSelectedIndex() == 0
						|| choice_1.getSelectedIndex() == 0
						|| choice_2.getSelectedIndex() == 0
						|| dateChooser.getDate() == null) {
					JOptionPane.showMessageDialog(null,
							"Don't Leave The Search Field Empty.");

				} else {
					if (textField_7.getText().equals("")) {
						Date bin1 = dateChooser.getDate();
						// System.out.println(bin1);
						String bin = bin1.toString();
						conne.updatepidwothoutpic(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								bin, choice.getSelectedItem(),
								textField_6.getText(),
								choice_2.getSelectedItem(),
								textField_3.getText(),
								choice_1.getSelectedItem(),
								textField_5.getText(), textField_4.getText(),
								seid);
						conne.updatemh(textArea_1.getText(),
								textArea.getText(), textArea_2.getText(),
								textArea_3.getText(), textArea_4.getText(),
								seid);
						JOptionPane.showMessageDialog(null,
								"saved successfully.");
						textField.setEditable(false);
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						label_14.setVisible(true);
						label_22.setVisible(true);
						label_21.setVisible(true);
						textField_3.setEditable(false);
						label_23.setVisible(true);
						textField_5.setEditable(false);
						textField_4.setEditable(false);
						textField_6.setEditable(false);
						textArea.setEditable(false);
						textArea_1.setEditable(false);
						textArea_2.setEditable(false);
						textArea_3.setEditable(false);
						textArea_4.setEditable(false);
						dateChooser.setVisible(false);
						choice.setVisible(false);
						choice_1.setVisible(false);
						choice_2.setVisible(false);
						button_1.setVisible(false);
						textField_7.setVisible(false);
						btnSave.setVisible(false);
						btnDelete.setVisible(false);
						label_14.setText(bin);
						label_21.setText(choice_2.getSelectedItem());
						label_22.setText(choice_1.getSelectedItem());
						label_23.setText(choice.getSelectedItem());

					} else if (textField_7.getText().equals("") == false) {

						Date bin1 = dateChooser.getDate();
						// System.out.println(bin1);
						String bin = bin1.toString();
						String po = textField_7.getText();
						conne.updatepid(textField.getText(),
								textField_1.getText(), textField_2.getText(),
								bin, choice.getSelectedItem(),
								textField_6.getText(),
								choice_2.getSelectedItem(),
								textField_3.getText(),
								choice_1.getSelectedItem(),
								textField_5.getText(), textField_4.getText(),
								po, seid);
						conne.updatemh(textArea_1.getText(),
								textArea.getText(), textArea_2.getText(),
								textArea_3.getText(), textArea_4.getText(),
								seid);
						JOptionPane.showMessageDialog(null,
								"saved successfully.");
						textField.setEditable(false);
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						label_14.setVisible(true);
						label_22.setVisible(true);
						label_21.setVisible(true);
						textField_3.setEditable(false);
						label_23.setVisible(true);
						textField_5.setEditable(false);
						textField_4.setEditable(false);
						textField_6.setEditable(false);
						textArea.setEditable(false);
						textArea_1.setEditable(false);
						textArea_2.setEditable(false);
						textArea_3.setEditable(false);
						textArea_4.setEditable(false);
						dateChooser.setVisible(false);
						choice.setVisible(false);
						choice_1.setVisible(false);
						choice_2.setVisible(false);
						button_1.setVisible(false);
						textField_7.setVisible(false);
						btnSave.setVisible(false);
						btnDelete.setVisible(false);
						label_14.setText(bin);
						label_21.setText(choice_2.getSelectedItem());
						label_22.setText(choice_1.getSelectedItem());
						label_23.setText(choice.getSelectedItem());

					}

				}

			}
		});

		label_14.setBackground(Color.WHITE);
		label_14.setBounds(214, 145, 211, 18);
		frame.getContentPane().add(label_14);

		label_21.setBackground(Color.WHITE);
		label_21.setBounds(212, 199, 211, 18);
		frame.getContentPane().add(label_21);
		label_22.setBackground(Color.WHITE);
		label_22.setBounds(465, 146, 83, 18);
		frame.getContentPane().add(label_22);
		btnSave.setVisible(false);
		btnDelete.setVisible(false);

		label_23.setBackground(Color.WHITE);
		label_23.setBounds(465, 197, 82, 18);
		frame.getContentPane().add(label_23);
		choice.addItem("------------------------");
		choice.addItem("A+");
		choice.addItem("A-");
		choice.addItem("B+");
		choice.addItem("B-");
		choice.addItem("AB+");
		choice.addItem("AB-");
		choice.addItem("O+");
		choice.addItem("O-");
		choice_2.addItem("------------------------------------------------------------");

		choice_2.addItem("Married");
		choice_2.addItem("Divorced");
		choice_2.addItem("Single");
		choice_2.addItem("Widowed");
		choice_1.addItem("------------------------");
		choice_1.addItem("Male");
		choice_1.addItem("Female");

		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);

				label_14.setVisible(false);
				label_22.setVisible(false);
				label_21.setVisible(false);
				textField_3.setEditable(true);
				label_23.setVisible(false);
				textField_5.setEditable(true);
				textField_4.setEditable(true);
				textField_6.setEditable(true);
				textArea.setEditable(true);
				textArea_1.setEditable(true);
				textArea_2.setEditable(true);
				textArea_3.setEditable(true);
				textArea_4.setEditable(true);
				dateChooser.setVisible(true);
				choice.setVisible(true);
				choice_1.setVisible(true);
				choice_2.setVisible(true);
				button_1.setVisible(true);
				textField_7.setVisible(true);
				btnSave.setVisible(true);
				if (!(cc.cc == true)) {
					btnDelete.setVisible(true);
				}
			}
		});
		btnEdit.setBackground(new Color(0, 153, 255));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEdit.setBounds(834, 530, 70, 23);
		frame.getContentPane().add(btnEdit);

		btnSave.setForeground(new Color(173, 255, 47));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSave.setBackground(new Color(0, 153, 255));
		btnSave.setBounds(741, 530, 83, 23);
		frame.getContentPane().add(btnSave);

		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBackground(new Color(0, 153, 255));
		btnDelete.setBounds(648, 530, 83, 23);
		frame.getContentPane().add(btnDelete);

		Label label_24 = new Label("");
		label_24.setBackground(SystemColor.controlShadow);
		label_24.setBounds(212, 302, 350, 209);
		frame.getContentPane().add(label_24);

		Label label_25 = new Label("");
		label_25.setBackground(SystemColor.controlShadow);
		label_25.setBounds(565, 11, 417, 500);
		frame.getContentPane().add(label_25);

		Label label_26 = new Label("");
		label_26.setBackground(SystemColor.controlShadow);
		label_26.setBounds(212, 11, 350, 285);
		frame.getContentPane().add(label_26);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JFrame yourComponent = new JFrame();
				PrinterJob pjob = PrinterJob.getPrinterJob();
				PageFormat preformat = pjob.defaultPage();
				preformat.setOrientation(PageFormat.LANDSCAPE);
				PageFormat postformat = pjob.pageDialog(preformat);
				// If user does not hit cancel then print.
				if (preformat != postformat) {
					// Set print component
					pjob.setPrintable(new Printer(frame), postformat);
					if (pjob.printDialog()) {
						try {
							pjob.print();
						} catch (PrinterException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		});
		btnPrint.setForeground(SystemColor.control);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPrint.setBackground(new Color(0, 153, 255));
		btnPrint.setBounds(914, 530, 70, 23);
		frame.getContentPane().add(btnPrint);
		/*
		 * public static String fname; public static String mname; public static
		 * String lname; public static String birth; public static String
		 * gender; public static String mar; public static String ad; public
		 * static String blood; public static String phone; public static String
		 * email; public static String o; public static BufferedImage pic =
		 * null;
		 */
		if (conne.fname.equals("")) {
		} else {
			textField.setText(fname);
			textField_1.setText(mname);
			textField_2.setText(lname);

			label_14.setText(birth);
			label_22.setText(gender);
			label_21.setText(mar);
			textField_3.setText(ad);
			label_23.setText(blood);
			textField_5.setText(phone);
			textField_4.setText(email);
			textField_6.setText(o);
			ii = conne.ims.getImage();
			conne.resize(label.getWidth(), label.getHeight(),
					conne.ims.getIconWidth(), conne.ims.getIconHeight());
			Image newImage = ii.getScaledInstance(conne.fiw, conne.fih,
					Image.SCALE_SMOOTH);

			imagea = new ImageIcon(newImage);
			label.setIcon(imagea);
			// public static String cheifcomplaints;
			// public static String HPCs;
			// public static String PHs;
			// public static String SHs;
			// public static String DHs;

			textArea.setText(HPCs);
			textArea_1.setText(cheifcomplaints);
			textArea_2.setText(PHs);
			textArea_3.setText(SHs);
			textArea_4.setText(DHs);

		}
		frame.setResizable(false);
		// *****************
		frame.setLocationRelativeTo(null);
	}

	// public void printComponenet() {
	//
	// PrinterJob pj = PrinterJob.getPrinterJob();
	// pj.setJobName(" Print Component ");
	//
	// pj.setPrintable(new Printable() {
	// public int print(Graphics pg, PageFormat pf, int pageNum) {
	// if (pageNum > 0) {
	// return Printable.NO_SUCH_PAGE;
	// }
	//
	// Graphics2D g2 = (Graphics2D) pg;
	// g2.translate(pf.getImageableX(), pf.getImageableY());
	// frame.paintAll(pg);
	// return Printable.PAGE_EXISTS;
	// }
	// });
	// if (pj.printDialog() == false)
	// return;
	//
	// try {
	// pj.print();
	// } catch (PrinterException ex) {
	// // handle exception
	// }
	// }

	public static class Printer implements Printable {
		final Component comp;

		public Printer(Component comp) {
			this.comp = comp;
		}

		@Override
		public int print(Graphics g, PageFormat format, int page_index)
				throws PrinterException {
			if (page_index > 0) {
				return Printable.NO_SUCH_PAGE;
			}

			// get the bounds of the component
			Dimension dim = comp.getSize();
			double cHeight = dim.getHeight();
			double cWidth = dim.getWidth();

			// get the bounds of the printable area
			double pHeight = format.getImageableHeight();
			double pWidth = format.getImageableWidth();

			double pXStart = format.getImageableX();
			double pYStart = format.getImageableY();

			double xRatio = pWidth / cWidth;
			double yRatio = pHeight / cHeight;

			Graphics2D g2 = (Graphics2D) g;
			g2.translate(pXStart, pYStart);
			g2.scale(xRatio, yRatio);
			comp.paintAll(g2);

			return Printable.PAGE_EXISTS;
		}
	}

}
