package mhg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class searcher {

	public static JFrame frmSearch;
	public static int level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searcher window = new searcher();
					window.frmSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public searcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearch = new JFrame();
		frmSearch
				.setIconImage(Toolkit
						.getDefaultToolkit()
						.getImage(
								"C:\\Users\\Mohammad\\Desktop\\all\\Untsrhnsrndtmditled-3.png"));
		frmSearch.setTitle("Search");
		frmSearch.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmSearch.getContentPane().setLayout(null);
		final TextField textField_3 = new TextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();
				if ((Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}
			}
		});
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
		final JRadioButton rdbtnByFullName = new JRadioButton("By Full Name");
		final JRadioButton rdbtnById = new JRadioButton("By ID");
		final TextField textField = new TextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					if (rdbtnById.isSelected() == true) {

						if (textField.getText().equals("")) {

							JOptionPane.showMessageDialog(null,
									"Don't Leave The Search Field Empty.");

						} else {
							conne.selectpic(textField.getText());
							conne.selectmh(textField.getText());
							if (conne.fname.equals("")) {
								JOptionPane.showMessageDialog(null,
										"The Record Dos Not Exist.");
							} else {
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

								searchf l = new searchf();
								l.frame.setVisible(true);
								frmSearch.setVisible(false);
							}

						}

					} else if (rdbtnByFullName.isSelected() == true) {

						conne.selectfnl(textField_1.getText(),
								textField_2.getText(), textField_3.getText());
						if (conne.fname.equals("")) {
							JOptionPane.showMessageDialog(null,
									"The Record Dos Not Exist.");
						} else {
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
							searchf l = new searchf();
							l.frame.setVisible(true);
							frmSearch.setVisible(false);
						}

					} else {
						conne.selectpic(textField.getText());
						conne.selectmh(textField.getText());
						if (conne.fname.equals("")) {
							JOptionPane.showMessageDialog(null,
									"The Record Dos Not Exist.");
						} else {
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

							searchf l = new searchf();
							l.frame.setVisible(true);
							// searchf.main(null);
							frmSearch.setVisible(false);
						}
					}

				}

			}

			@Override
			public void keyTyped(KeyEvent evt) {
				char vchar = evt.getKeyChar();
				if (!(Character.isDigit(vchar))

						|| (vchar == KeyEvent.VK_BACK_SPACE || (vchar == KeyEvent.VK_DELETE))) {
					evt.consume();
				}
			}
		});
		textField.setBounds(40, 31, 306, 21);
		frmSearch.getContentPane().add(textField);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtnById.isSelected() == true) {

					if (textField.getText().equals("")) {

						JOptionPane.showMessageDialog(null,
								"Don't Leave The Search Field Empty.");

					} else {
						conne.selectpic(textField.getText());
						conne.selectmh(textField.getText());
						if (conne.fname.equals("")) {
							JOptionPane.showMessageDialog(null,
									"The Record Dos Not Exist.");
						} else {
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

							searchf l = new searchf();
							l.frame.setVisible(true);
							frmSearch.setVisible(false);
						}

					}

				} else if (rdbtnByFullName.isSelected() == true) {

					conne.selectfnl(textField_1.getText(),
							textField_2.getText(), textField_3.getText());
					if (conne.fname.equals("")) {
						JOptionPane.showMessageDialog(null,
								"The Record Dos Not Exist.");
					} else {
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
						searchf l = new searchf();
						l.frame.setVisible(true);
						frmSearch.setVisible(false);
					}

				} else {
					conne.selectpic(textField.getText());
					conne.selectmh(textField.getText());
					if (conne.fname.equals("")) {
						JOptionPane.showMessageDialog(null,
								"The Record Dos Not Exist.");
					} else {
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

						searchf l = new searchf();
						l.frame.setVisible(true);
						// searchf.main(null);
						frmSearch.setVisible(false);
					}
				}

			}
		});
		btnNewButton.setBounds(374, 31, 91, 21);
		frmSearch.getContentPane().add(btnNewButton);
		final Label label_3 = new Label("Last name");
		final Label label_2 = new Label("Mid name");
		final Label label_1 = new Label("First name");
		final Label label = new Label("ID");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBounds(40, 9, 62, 22);
		frmSearch.getContentPane().add(label);

		textField_1.setBounds(40, 31, 98, 21);
		frmSearch.getContentPane().add(textField_1);

		textField_2.setBounds(144, 31, 98, 21);
		frmSearch.getContentPane().add(textField_2);

		textField_3.setBounds(248, 31, 98, 21);
		frmSearch.getContentPane().add(textField_3);
		label_1.setVisible(false);
		textField_1.setVisible(false);
		label_2.setVisible(false);
		textField_2.setVisible(false);
		label_3.setVisible(false);
		textField_3.setVisible(false);

		rdbtnById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				label.setVisible(true);
				textField.setVisible(true);
				label_1.setVisible(false);
				textField_1.setVisible(false);
				label_2.setVisible(false);
				textField_2.setVisible(false);
				label_3.setVisible(false);
				textField_3.setVisible(false);

			}
		});
		rdbtnById.setBackground(Color.LIGHT_GRAY);
		rdbtnById.setBounds(40, 66, 105, 21);
		frmSearch.getContentPane().add(rdbtnById);

		rdbtnByFullName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				label.setVisible(false);
				textField.setVisible(false);
				label_1.setVisible(true);
				textField_1.setVisible(true);
				label_2.setVisible(true);
				textField_2.setVisible(true);
				label_3.setVisible(true);
				textField_3.setVisible(true);

			}
		});
		final ButtonGroup group = new ButtonGroup();
		group.add(rdbtnById);
		group.add(rdbtnByFullName);

		rdbtnByFullName.setBackground(Color.LIGHT_GRAY);
		rdbtnByFullName.setBounds(40, 90, 200, 21);
		frmSearch.getContentPane().add(rdbtnByFullName);

		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(40, 9, 98, 22);
		frmSearch.getContentPane().add(label_1);

		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Dialog", Font.BOLD, 14));
		label_2.setBounds(144, 9, 98, 22);
		frmSearch.getContentPane().add(label_2);

		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Dialog", Font.BOLD, 14));
		label_3.setBounds(248, 9, 98, 22);
		frmSearch.getContentPane().add(label_3);

		JButton btnBack = new JButton("Back ");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(30, 144, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				home1 ass = new home1();
				cc ad = new cc();
				home aa = new home();
				// System.out.println(level);
				if (level == 3) {
					// red = 3;

					aa.frame.setVisible(true);

				} else if (level == 2) {
					// red = 2;

					ass.frame.setVisible(true);
				} else if (level == 1) {
					// red = 1;

					ad.frame.setVisible(true);
				}
				// home aa = new home();
				// aa.frame.setVisible(true);
				frmSearch.setVisible(false);
			}
		});
		btnBack.setBounds(374, 90, 91, 21);
		frmSearch.getContentPane().add(btnBack);
		frmSearch.setBounds(100, 100, 516, 159);
		frmSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearch.setResizable(false);
		// *****************
		frmSearch.setLocationRelativeTo(null);
	}
}
