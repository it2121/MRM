package mhg;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class mhh1 {
	final TextArea textArea = new TextArea();
	final TextArea textArea_1 = new TextArea();
	final TextArea textArea_2 = new TextArea();
	final TextArea textArea_3 = new TextArea();
	final TextArea textArea_4 = new TextArea();
	public String s1;
	public String s2;
	public String s3;
	public String s4;
	public String s5;
	public long s11;
	// public long s22;
	public long s33;
	public long s44;
	public long s55;
	public boolean os = false;
	public static String att;
	public static ImageIcon asas = null;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					mhh1 window = new mhh1();
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
	public mhh1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.getContentPane().setLayout(null);

		final JLabel label = new JLabel("");

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 8));
		label.setBackground(SystemColor.windowBorder);
		label.setBounds(10, 11, 196, 149);

		label.setIcon(asas);
		frame.getContentPane().add(label);

		textArea.setBounds(367, 71, 599, 65);
		frame.getContentPane().add(textArea);

		textArea_1.setBounds(367, 149, 599, 65);
		frame.getContentPane().add(textArea_1);

		textArea_2.setBounds(367, 229, 599, 65);
		frame.getContentPane().add(textArea_2);

		textArea_3.setForeground(Color.BLACK);
		textArea_3.setBounds(367, 309, 599, 65);
		frame.getContentPane().add(textArea_3);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// add u = new add();
				add.frame.setVisible(true);
				frame.setVisible(false);

			}
		});
		btnBack.setForeground(new Color(240, 255, 255));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBackground(new Color(30, 144, 255));
		btnBack.setBounds(48, 510, 104, 30);
		frame.getContentPane().add(btnBack);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conne.insertid(add.fnn, add.min, add.lnn, add.bin, add.gen,
						add.ocn, add.man, add.adn, add.bln, add.phn, add.em,
						add.picn, add.pass);

				s1 = textArea.getText();
				s2 = textArea_1.getText();
				s3 = textArea_2.getText();
				s4 = textArea_3.getText();
				s5 = textArea_4.getText();
				if (os == true) {
					conne.insertthefuck(s1, s2, s3, s4, s5, att);
				} else {
					conne.insertthefuckw(s1, s2, s3, s4, s5);
				}
				// System.out.println(s1 + s2 + s3 + s4 + s5 + att);
				JOptionPane.showMessageDialog(null,
						"the record have has been saved successfully");
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
		btnSave.setForeground(new Color(124, 252, 0));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSave.setBackground(new Color(30, 144, 255));
		btnSave.setBounds(862, 510, 104, 30);
		frame.getContentPane().add(btnSave);
		final JLabel label_8 = new JLabel("");
		final Label label_1 = new Label("Medical Record");
		label_1.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
		label_1.setBackground(new Color(255, 215, 0));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(204, 11, 168, 32);
		frame.getContentPane().add(label_1);
		label_8.setVisible(false);
		Label label_2 = new Label("Cheif Complaint");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		label_2.setBackground(new Color(250, 250, 210));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(212, 72, 150, 18);
		frame.getContentPane().add(label_2);

		Label label_3 = new Label("History Of \r\nPriseinting\r\n Complaint");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 9));
		label_3.setBackground(new Color(250, 250, 210));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(212, 230, 150, 22);
		frame.getContentPane().add(label_3);

		Label label_4 = new Label("Past History");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		label_4.setBackground(new Color(250, 250, 210));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(212, 150, 150, 18);
		frame.getContentPane().add(label_4);

		Label label_5 = new Label("Social History");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 10));
		label_5.setBackground(new Color(250, 250, 210));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(211, 312, 151, 18);
		frame.getContentPane().add(label_5);

		textArea_4.setForeground(Color.BLACK);
		textArea_4.setBounds(367, 392, 599, 65);
		frame.getContentPane().add(textArea_4);

		Label label_6 = new Label("Drug History");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 10));
		label_6.setBackground(new Color(250, 250, 210));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(211, 395, 151, 18);
		frame.getContentPane().add(label_6);

		Button button = new Button("Browse ");
		button.setVisible(false);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System
						.getProperty("user.home")));
				int result = fileChooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					String pathi = selectedFile.getAbsolutePath();
					label_8.setText(pathi);
					att = pathi;
					os = true;
				}

			}
		});
		button.setBounds(374, 473, 70, 18);
		frame.getContentPane().add(button);

		Label label_7 = new Label("Add Attachment");
		label_7.setFont(new Font("Dialog", Font.ITALIC, 11));
		label_7.setBackground(SystemColor.controlShadow);
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(257, 473, 104, 18);
		frame.getContentPane().add(label_7);
		label_7.setVisible(false);
		JLabel lblNewLabel = new JLabel("         ( optional )");
		lblNewLabel.setBounds(257, 497, 104, 14);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setVisible(false);
		label_8.setBounds(450, 473, 237, 14);
		frame.getContentPane().add(label_8);

		Label label_9 = new Label("");
		label_9.setBackground(SystemColor.controlHighlight);
		label_9.setBounds(212, 11, 774, 471);
		frame.getContentPane().add(label_9);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		// *****************
		frame.setLocationRelativeTo(null);
		// *********
	}
}
