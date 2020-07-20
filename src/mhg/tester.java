package mhg;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class tester {

	private JFrame frame;
	private static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tester window = new tester();
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
	public tester() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			private KeyEvent evt;

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
		textField.setBounds(180, 46, 242, 118);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// System.out.println(a);

			}
		});
		button.setBounds(208, 250, 200, 50);
		frame.getContentPane().add(button);
		InputVerifier a = textField.getInputVerifier();
		// System.out.println(a);
		//
	}
}