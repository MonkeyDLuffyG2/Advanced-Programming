package edu.pupr.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;

public class TextFieldFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFieldFrame frame = new TextFieldFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextFieldFrame() {
		setTitle("Testing JTextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField1 = new JTextField();
		textField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TextFieldHandler(event);
			}
		});
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TextFieldHandler(event);TextFieldHandler(event);
			}
		});
		textField2.setText("Enter text here");
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TextFieldHandler(event);
			}
		});
		textField3.setEditable(false);
		textField3.setText("Uneditable Text Field");
		textField3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				TextFieldHandler(event);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(textField3))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(passwordField)
						.addComponent(textField3, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void TextFieldHandler(ActionEvent event) {
		String string;
		
		if (event.getSource() == textField1) {
			string = String.format("textField1: %s", event.getActionCommand());
		} else if (event.getSource() == textField2) {
			string = String.format("textField2: %s", event.getActionCommand());
		} else if (event.getSource() == textField3) {
			string = String.format("textField3: %s", event.getActionCommand());
		} else {
			string = String.format("passwordField: %s", event.getActionCommand());
		}
		
		JOptionPane.showMessageDialog(null, string);
	}
}
