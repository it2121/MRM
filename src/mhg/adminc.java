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
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class adminc {
	public static String connection;
	public static String usernamea;
	public static String password;
	public static int type;
	public static int id;
	public static JFrame frmAdminsControlPanel;
	public static JTable table;
	public JPasswordField passwordField;
	public JPasswordField passwordField_1;
	public static String usera;
	public static String passa;
	public static int level;
	public static String namea;
	public static String addra;
	public static String ad;
	public static String na;
	public static String userset = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		table = new JTable();
		final DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {

					adminc window = new adminc();
					adminc.frmAdminsControlPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/admins", "root", "");

					Statement stmt = con.createStatement();
					ResultSet rsw = stmt.executeQuery("SELECT * from admins");
					int ii = 0;
					int ji = 0;
					int iu = 0;
					int ju = 1;
					int ip = 0;
					int jp = 2;
					int it = 0;
					int jt = 3;
					int ia = 0;
					int ja = 4;
					int in = 0;
					int jn = 5;

					String typee = null;
					while (rsw.next()) {

						id = rsw.getInt("id");

						usernamea = rsw.getString("username");
						password = rsw.getString("passsword");
						type = rsw.getInt("level");
						ad = rsw.getString("addr");
						na = rsw.getString("name");
						table.setValueAt(id, ii, ji);

						ii++;
						table.setValueAt(usernamea, iu, ju);
						iu++;
						table.setValueAt(password, ip, jp);
						ip++;
						if (type == 1) {
							typee = "Clinic";
						}
						if (type == 2) {
							typee = "Manager ";
						}
						if (type == 3) {
							typee = "Admin ";
						}

						table.setValueAt(typee, it, jt);
						it++;
						table.setValueAt(ad, ia, ja);
						ia++;
						table.setValueAt(na, in, jn);
						in++;

					}

					// con.close();

				} catch (Exception e) {
					System.out.println(e);

				}

				for (int f = 0; f <= 5; f++) {
					table.getColumnModel().getColumn(f)
							.setCellRenderer(centerRenderer);
				}
			}

		});
	}

	/**
	 * Create the application.
	 */
	public adminc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAdminsControlPanel = new JFrame();
		frmAdminsControlPanel
				.setIconImage(Toolkit
						.getDefaultToolkit()
						.getImage(
								"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frmAdminsControlPanel.setTitle("Admins  Control Panel");
		frmAdminsControlPanel.getContentPane().setBackground(
				SystemColor.controlShadow);
		frmAdminsControlPanel.getContentPane().setLayout(null);
		final Label label_11 = new Label("");

		label_11.setBackground(SystemColor.control);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(10, 41, 972, 512);
		frmAdminsControlPanel.getContentPane().add(tabbedPane);
		// a
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("View Admins", null, panel_1, null);

		table.setBounds(2, 11, 947, 714);

		String a = "{ null, null, null, null }, ";
		table.setModel(new DefaultTableModel(new Object[][] { { null, null,
				null, null, null, null }, }, new String[] { "ID", "Username",
				"Password", "Type ", "Address",
				"The Name of  Hospital / Clinic " }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class,
					String.class, String.class, Object.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		}

		);
		table.getColumnModel().getColumn(0).setPreferredWidth(156);
		table.getColumnModel().getColumn(0).setMinWidth(156);
		table.getColumnModel().getColumn(1).setPreferredWidth(156);
		table.getColumnModel().getColumn(1).setMinWidth(156);
		table.getColumnModel().getColumn(2).setPreferredWidth(156);
		table.getColumnModel().getColumn(2).setMinWidth(156);
		table.getColumnModel().getColumn(3).setPreferredWidth(156);
		table.getColumnModel().getColumn(3).setMinWidth(156);
		table.getColumnModel().getColumn(4).setPreferredWidth(156);
		table.getColumnModel().getColumn(4).setMinWidth(156);
		table.getColumnModel().getColumn(5).setPreferredWidth(156);
		table.getColumnModel().getColumn(5).setMinWidth(156);
		conne.maxid();
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(conne.maxid); // though I would use some variable here
		table.setModel(dtm);
		panel_1.setLayout(null);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		// table.setModel(model);
		table.enable(false);
		// DefaultTableCellRenderer centerRenderer = new
		// DefaultTableCellRenderer();
		// centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		//
		// // table.setAlignmentX(Component.CENTER_ALIGNMENT);
		// for (int f = 0; f < conne.maxid; f++) {
		// table.getColumnModel().getColumn(f).setCellRenderer(centerRenderer);
		// }
		/*
		 * table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		 * table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		 * table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		 */
		panel_1.add(table);

		// table.setBounds(100, 100, 900, 550);
		final TextField textField_5 = new TextField();
		final TextField textField_4 = new TextField();
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 947, 414);

		panel_1.add(scrollPane);

		JButton button_5 = new JButton("Home");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home y = new home();
				y.frame.setVisible(true);
				frmAdminsControlPanel.setVisible(false);
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setBackground(new Color(32, 178, 170));
		button_5.setBounds(10, 453, 107, 23);
		panel_1.add(button_5);

		JButton button_6 = new JButton("Print");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// JFrame yourComponent = new JFrame();
				PrinterJob pjob = PrinterJob.getPrinterJob();
				PageFormat preformat = pjob.defaultPage();
				preformat.setOrientation(PageFormat.LANDSCAPE);
				PageFormat postformat = pjob.pageDialog(preformat);
				// If user does not hit cancel then print.
				if (preformat != postformat) {
					// Set print component
					pjob.setPrintable(new Printer(frmAdminsControlPanel),
							postformat);
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
		button_6.setForeground(SystemColor.control);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setBackground(new Color(0, 153, 255));
		button_6.setBounds(887, 453, 70, 23);
		panel_1.add(button_6);
		final ButtonGroup group = new ButtonGroup();
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Add Admin", null, panel, null);
		panel.setLayout(null);

		final TextField textField = new TextField();
		textField.setBounds(78, 76, 175, 20);
		panel.add(textField);

		Label label_1 = new Label("Username");
		label_1.setBackground(SystemColor.control);
		label_1.setBounds(78, 54, 62, 22);
		panel.add(label_1);

		Label label_2 = new Label("Password");
		label_2.setBackground(SystemColor.control);
		label_2.setBounds(78, 108, 62, 22);
		panel.add(label_2);

		Label label_3 = new Label("RewriteTthe Password");
		label_3.setBackground(SystemColor.control);
		label_3.setBounds(78, 166, 152, 22);
		panel.add(label_3);
		// passwordField_1 = new JPasswordField();
		passwordField = new JPasswordField();
		passwordField.setBounds(77, 135, 175, 20);
		panel.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(77, 193, 175, 20);
		panel.add(passwordField_1);

		Label label_4 = new Label("Type Of Account");
		label_4.setBackground(SystemColor.control);
		label_4.setBounds(310, 55, 132, 22);
		panel.add(label_4);

		final TextField textField_1 = new TextField();
		textField_1.setBounds(79, 343, 175, 20);
		panel.add(textField_1);

		final TextField textField_2 = new TextField();
		textField_2.setBounds(286, 343, 175, 20);
		panel.add(textField_2);

		Label label_5 = new Label("The Hospital / Clinic Details");
		label_5.setBackground(new Color(240, 230, 140));
		label_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_5.setBounds(53, 248, 177, 22);
		panel.add(label_5);

		Label label_6 = new Label("The Name of  Hospital / Clinic ");
		label_6.setBackground(SystemColor.control);
		label_6.setBounds(79, 321, 175, 22);
		panel.add(label_6);

		Label label_7 = new Label("The Address");
		label_7.setBackground(SystemColor.control);
		label_7.setBounds(286, 321, 175, 22);
		panel.add(label_7);

		Label label_8 = new Label("Account Details");
		label_8.setBackground(new Color(240, 230, 140));
		label_8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_8.setBounds(53, 16, 177, 22);
		panel.add(label_8);

		Label label_9 = new Label("");
		label_9.setBounds(399, 234, 62, -21);
		panel.add(label_9);

		Label label_10 = new Label("\r\n");
		label_10.setBackground(SystemColor.control);
		label_10.setForeground(SystemColor.menu);
		label_10.setBounds(64, 249, 838, 156);
		panel.add(label_10);

		final Choice choice = new Choice();
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (choice.getSelectedIndex() == 2) {
					label_11.setText("The possibility of modify and \r\n add and delete the records.");
				} else if (choice.getSelectedIndex() == 3) {
					label_11.setText("The possibility of showing the records and modifying without the ability of deleting .");
				} else if (choice.getSelectedIndex() == 1) {
					label_11.setText("The possibility to access\r\n to the  admins control panel\r\n and add, modify and \r\nclarify records.");
				} else {
					label_11.setText("");
				}
			}
		});
		choice.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {

			}

			public void inputMethodTextChanged(InputMethodEvent arg0) {
			}
		});
		choice.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent arg0) {
				//
			}
		});
		choice.setBounds(310, 76, 132, 20);
		choice.addItem("-----------------------------------------------");
		choice.addItem("Admin");
		choice.addItem("Manager");
		choice.addItem("Clinic");

		panel.add(choice);
		label_11.setBounds(310, 102, 434, 23);
		panel.add(label_11);

		Label label_12 = new Label("\r\n");
		label_12.setForeground(Color.WHITE);
		label_12.setBackground(SystemColor.control);
		label_12.setBounds(64, 16, 838, 213);
		panel.add(label_12);

		Label label = new Label("Admins  Control Panel");
		label.setBackground(new Color(255, 215, 0));
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		label.setAlignment(Label.CENTER);
		label.setBounds(0, 10, 150, 22);
		frmAdminsControlPanel.getContentPane().add(label);
		frmAdminsControlPanel.setBounds(100, 100, 1000, 600);
		frmAdminsControlPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			// @SuppressWarnings("deprecation")
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				int a;
				int b;
				a = passwordField.getSelectionEnd();
				b = passwordField_1.getSelectionEnd();
				conne.usercheck(textField.getText());
				String c1 = conne.userc;
				// System.out.println(c1);
				if (c1 == null) {

					if (passwordField.getText().equals(
							passwordField_1.getText())) {
						if (textField.getSelectionEnd() == 0
								|| textField_1.getSelectionEnd() == 0
								|| textField_2.getSelectionEnd() == 0
								|| choice.getSelectedIndex() <= 0
								|| passwordField.getSelectionEnd() == 0) {
							JOptionPane.showMessageDialog(null,
									"Plase Don't Leave Any Field Empty");
						} else {

							usera = textField.getText();
							passa = passwordField.getText();

							if (choice.getSelectedIndex() == 1) {
								level = 3;
							} else if (choice.getSelectedIndex() == 2) {
								level = 2;

							} else if (choice.getSelectedIndex() == 3) {
								level = 1;
							}

							namea = textField_1.getText();
							addra = textField_2.getText();
							conne.setadmin(usera, passa, level, namea, addra);
							JOptionPane
									.showMessageDialog(null,
											"the record have has been saved successfully");
							frmAdminsControlPanel.setVisible(false);
							adminc.main(null);
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"the passwords do not match");
					}
				} else {
					JOptionPane
							.showMessageDialog(null, "the username is taken");
					c1 = null;
					conne.userc = null;

				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(417, 447, 132, 29);
		panel.add(btnNewButton);

		JButton button_3 = new JButton("Home");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				home y = new home();
				y.frame.setVisible(true);
				frmAdminsControlPanel.setVisible(false);
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(32, 178, 170));
		button_3.setBounds(10, 453, 107, 23);
		panel.add(button_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Update / Delet Admins", null, panel_2, null);
		panel_2.setLayout(null);

		Label label_13 = new Label("Account Details");
		label_13.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_13.setBackground(new Color(240, 230, 140));
		label_13.setBounds(49, 74, 177, 22);
		panel_2.add(label_13);

		Label label_14 = new Label("Username");
		label_14.setBackground(SystemColor.control);
		label_14.setBounds(64, 117, 62, 22);
		panel_2.add(label_14);

		final TextField textField_3 = new TextField();
		textField_3.setEditable(false);
		textField_3.setBounds(64, 139, 175, 20);
		panel_2.add(textField_3);

		Label label_15 = new Label("Password");
		label_15.setBackground(SystemColor.control);
		label_15.setBounds(64, 171, 62, 22);
		panel_2.add(label_15);
		final TextField textField_7 = new TextField();
		final Button button_1 = new Button("Save");
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setForeground(new Color(153, 255, 0));
		button_1.setBackground(new Color(30, 144, 255));
		final Choice choice_1 = new Choice();
		choice_1.setBounds(296, 141, 132, 20);
		panel_2.add(choice_1);
		choice_1.setVisible(false);
		choice_1.addItem("-----------------------------------------------");
		choice_1.addItem("Admin");
		choice_1.addItem("Manager");
		choice_1.addItem("Clinic");
		final Label label_24 = new Label("");
		Label label_17 = new Label("Type Of Account");
		label_17.setBackground(SystemColor.control);
		label_17.setBounds(296, 118, 132, 22);
		panel_2.add(label_17);

		Label label_19 = new Label("The Hospital / Clinic Details");
		label_19.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_19.setBackground(new Color(240, 230, 140));
		label_19.setBounds(49, 278, 177, 22);
		panel_2.add(label_19);

		Label label_21 = new Label("The Name of  Hospital / Clinic ");
		label_21.setBackground(SystemColor.control);
		label_21.setBounds(64, 329, 175, 22);
		panel_2.add(label_21);
		final Button button_2 = new Button("Delete");
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.setForeground(new Color(255, 51, 51));
		button_2.setBackground(new Color(30, 144, 255));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				conne d = new conne();
				d.delete(conne.searchid);
				button_1.setVisible(false);
				button_2.setVisible(false);
				textField_3.setEditable(false);
				choice_1.setVisible(false);
				textField_7.setEditable(false);
				label_24.setVisible(true);
				textField_5.setEditable(false);
				textField_4.setEditable(false);
				label_24.setText("");
				textField_3.setText("");
				textField_7.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int leve = 1;
				if (choice_1.getSelectedIndex() == 1) {
					leve = 3;
				} else if (choice_1.getSelectedIndex() == 2) {
					leve = 2;

				} else if (choice_1.getSelectedIndex() == 3) {
					leve = 1;
				}
				// conne.upload(textField_3.getText(), textField_7.getText(),
				// leve, textField_4.getText(), textField_5.getText(),
				// userset);
				String a1 = textField_3.getText();
				String a2 = textField_7.getText();
				String a3 = textField_4.getText();
				String a4 = textField_5.getText();
				conne.usercheck(a1);
				conne i = new conne();
				String check = conne.userc;
				boolean f = false;

				if (a1.equals(conne.searchuser)) {

					i.upload(a1, a2, leve, a3, a4, userset);

					if (leve == 1) {
						label_24.setText("Clinic");
					}
					if (leve == 2) {
						label_24.setText("Manager");
					}
					if (leve == 3) {
						label_24.setText("Admin");
					}
					button_1.setVisible(false);
					button_2.setVisible(false);
					textField_3.setEditable(false);
					choice_1.setVisible(false);
					textField_7.setEditable(false);
					label_24.setVisible(true);
					textField_5.setEditable(false);
					textField_4.setEditable(false);
				} else if (conne.usercb == false) {
					i.upload(a1, a2, leve, a3, a4, userset);

					if (leve == 1) {
						label_24.setText("Clinic");
					}
					if (leve == 2) {
						label_24.setText("Manager");
					}
					if (leve == 3) {
						label_24.setText("Admin");
					}
					button_1.setVisible(false);
					button_2.setVisible(false);
					textField_3.setEditable(false);
					choice_1.setVisible(false);
					textField_7.setEditable(false);
					label_24.setVisible(true);
					textField_5.setEditable(false);
					textField_4.setEditable(false);
				} else {
					JOptionPane.showMessageDialog(null,
							"The username is taken .");
				}
			}
		});
		Label label_22 = new Label("The Address");
		label_22.setBackground(SystemColor.control);
		label_22.setBounds(271, 329, 175, 22);
		panel_2.add(label_22);
		final Label label_23 = new Label("ID");
		final JRadioButton rdbtnNewRadioButton = new JRadioButton(
				"Search By ID");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				label_23.setText("ID");

			}
		});
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(65, 19, 109, 23);
		panel_2.add(rdbtnNewRadioButton);

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(
				"Search By Username");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				label_23.setText("Username");
			}
		});
		rdbtnNewRadioButton_1.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_1.setBounds(65, 45, 152, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);

		final TextField textField_6 = new TextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();// char a = '+';
				if (rdbtnNewRadioButton.isSelected() == true) {

					if (!(Character.isDigit(vchar))

							|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
						evt.consume();
					}
				} else if (rdbtnNewRadioButton_1.isSelected() == true) {

				} else {
					if (!(Character.isDigit(vchar))

							|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
						evt.consume();
					}
				}
			}

		});
		textField_6.setBounds(223, 34, 195, 18);
		panel_2.add(textField_6);

		label_23.setFont(new Font("Dialog", Font.BOLD, 14));
		label_23.setBounds(223, 9, 176, 22);
		panel_2.add(label_23);

		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (textField_6.getSelectionEnd() != 0) {

					if (rdbtnNewRadioButton.isSelected() == true) {

						conne.searchid(textField_6.getText());
						if (conne.searchpass1 == null) {
							JOptionPane.showMessageDialog(null,
									"The Record Dos Not Exist.");

							label_24.setText("");
							textField_3.setText("");
							textField_7.setText("");
							textField_4.setText("");
							textField_5.setText("");

						} else {
							int u = conne.searchlevel;
							if (u == 1) {
								label_24.setText("Clinic");
							}
							if (u == 2) {
								label_24.setText("Manager");
							}
							if (u == 3) {
								label_24.setText("Admin");
							}
							textField_3.setText(conne.searchuser);
							textField_7.setText(conne.searchpass1);
							textField_4.setText(conne.searchname);
							textField_5.setText(conne.searchadd);
							userset = conne.searchuser;
							conne.searchpass1 = null;
						}

					} else if (rdbtnNewRadioButton_1.isSelected() == true) {
						conne.searchusername(textField_6.getText());
						if (conne.searchpass1 == null) {
							JOptionPane.showMessageDialog(null,
									"The Record Dos Not Exist.");

							label_24.setText("");

							textField_3.setText("");
							textField_7.setText("");
							textField_4.setText("");
							textField_5.setText("");
						} else {

							int u = conne.searchlevel;
							if (u == 1) {
								label_24.setText("Clinic");
							}
							if (u == 2) {
								label_24.setText("Manager");
							}
							if (u == 3) {
								label_24.setText("Admin");
							}
							textField_3.setText(conne.searchuser);
							textField_7.setText(conne.searchpass1);
							textField_4.setText(conne.searchname);
							textField_5.setText(conne.searchadd);
							userset = conne.searchuser;
							conne.searchpass1 = null;
						}

					} else {
						conne.searchid(textField_6.getText());
						if (conne.searchpass1 == null) {
							JOptionPane.showMessageDialog(null,
									"The Record Dos Not Exist.");

							label_24.setText("");
							textField_3.setText("");
							textField_7.setText("");
							textField_4.setText("");
							textField_5.setText("");
						} else {
							int u = conne.searchlevel;
							if (u == 1) {
								label_24.setText("Clinic");
							}
							if (u == 2) {
								label_24.setText("Manager");
							}
							if (u == 3) {
								label_24.setText("Admin");
							}
							textField_3.setText(conne.searchuser);
							textField_7.setText(conne.searchpass1);
							textField_4.setText(conne.searchname);
							textField_5.setText(conne.searchadd);
							userset = conne.searchuser;
							conne.searchpass1 = null;
						}

					}

				} else {
					JOptionPane.showMessageDialog(null,
							"Don't Leave The Search Field Empty.");
				}
			}

		});
		btnNewButton_1.setBounds(424, 35, 75, 19);
		panel_2.add(btnNewButton_1);

		Button button = new Button("Edit");
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		button.setBackground(new Color(30, 144, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Plase Make a Search First.");

				} else {
					button_1.setVisible(true);
					button_2.setVisible(true);
					textField_3.setEditable(true);
					choice_1.setVisible(true);
					textField_7.setEditable(true);
					label_24.setVisible(false);
					textField_5.setEditable(true);
					textField_4.setEditable(true);

				}
			}
		});
		button.setBounds(838, 33, 70, 22);
		panel_2.add(button);

		button_1.setBounds(762, 33, 70, 22);
		panel_2.add(button_1);
		button_1.setVisible(false);

		button_2.setBounds(686, 34, 70, 22);
		panel_2.add(button_2);
		button_2.setVisible(false);
		// Label label_24 = new Label("");
		label_24.setFont(new Font("Dialog", Font.BOLD, 14));
		label_24.setBackground(SystemColor.control);
		label_24.setBounds(296, 139, 132, 22);
		panel_2.add(label_24);

		textField_7.setEditable(false);
		textField_7.setBounds(64, 199, 175, 20);
		panel_2.add(textField_7);

		textField_4.setEditable(false);
		textField_4.setBounds(64, 357, 175, 20);
		panel_2.add(textField_4);

		textField_5.setEditable(false);
		textField_5.setBounds(271, 357, 175, 20);
		panel_2.add(textField_5);

		Label label_16 = new Label("\r\n");
		label_16.setForeground(Color.WHITE);
		label_16.setBackground(SystemColor.control);
		label_16.setBounds(59, 74, 849, 182);
		panel_2.add(label_16);

		Label label_18 = new Label("\r\n");
		label_18.setForeground(Color.WHITE);
		label_18.setBackground(SystemColor.control);
		label_18.setBounds(59, 278, 849, 130);
		panel_2.add(label_18);

		JButton button_4 = new JButton("Home");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home y = new home();
				y.frame.setVisible(true);
				frmAdminsControlPanel.setVisible(false);
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(32, 178, 170));
		button_4.setBounds(10, 453, 107, 23);
		panel_2.add(button_4);
		frmAdminsControlPanel.setLocationRelativeTo(null);
		frmAdminsControlPanel.setResizable(false);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub

	}

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
