package edu.pupr.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JCheckBox boldCheckBox;
	private JCheckBox ItalicCheckBox;
	private JCheckBox italicCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxFrame frame = new CheckBoxFrame();
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
	public CheckBoxFrame() {
		setTitle("JCheckBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		textField.setText("Watch the Font Style Change");
		textField.setColumns(10);
		
		boldCheckBox = new JCheckBox("Bold");
		boldCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				itemStateHandler(event);
			}
		});
	
		
		italicCheckBox = new JCheckBox("Italic");
		italicCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				itemStateHandler(event);
			}
		});
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(boldCheckBox, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(italicCheckBox, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(italicCheckBox)
						.addComponent(boldCheckBox))
					.addContainerGap(194, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	private void itemStateHandler(ItemEvent event) {
			Font font = null;
			if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC ,14);
			}
			else if(boldCheckBox.isSelected()) {
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if (italicCheckBox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			}
			textField.setFont(font);
	}
}
