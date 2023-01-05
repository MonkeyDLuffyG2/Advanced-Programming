package edu.pupr.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioButtonFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton plainRadioButton;
	private JRadioButton boldRadioButton;
	private JRadioButton italicRadioButton;
	private JRadioButton boldItalicRadioButton;

	private final Font plainFont;
	private final Font boldFont;
	private final Font italicFont;
	private final Font boldItalicFont;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonFrame frame = new RadioButtonFrame();
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
	public RadioButtonFrame() {
		setTitle("RadioButton Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		textField.setText("Watch the font style change");
		textField.setColumns(10);
		
		plainRadioButton = new JRadioButton("Plain");
		plainRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				radioButtonHandler(event);
			}
		});
		plainRadioButton.setSelected(true);
		buttonGroup.add(plainRadioButton);
		
		boldRadioButton = new JRadioButton("Bold");
		boldRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				radioButtonHandler(event);
			}
		});
		buttonGroup.add(boldRadioButton);
		
		italicRadioButton = new JRadioButton("Italic");
		italicRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				radioButtonHandler(event);
			}
		});
		buttonGroup.add(italicRadioButton);
		
		boldItalicRadioButton = new JRadioButton("Bold/Italic");
		boldItalicRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				radioButtonHandler(event);
			}
		});
		buttonGroup.add(boldItalicRadioButton);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(plainRadioButton)
							.addGap(38)
							.addComponent(boldRadioButton)
							.addGap(38)
							.addComponent(italicRadioButton)
							.addGap(42)
							.addComponent(boldItalicRadioButton)
							.addGap(41))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(boldRadioButton)
						.addComponent(plainRadioButton)
						.addComponent(italicRadioButton)
						.addComponent(boldItalicRadioButton))
					.addContainerGap(194, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void radioButtonHandler(ItemEvent event) {		
		if (event.getSource() == boldItalicRadioButton){
			textField.setFont(boldItalicFont);
		}
		else if (event.getSource() == boldRadioButton) {
			textField.setFont(boldFont);
		}
		else if (event.getSource() == italicRadioButton) {
			textField.setFont(italicFont);
		}
		else {
			textField.setFont(plainFont);
		}
	}
}
