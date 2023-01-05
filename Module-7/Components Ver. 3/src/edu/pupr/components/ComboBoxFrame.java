package edu.pupr.components;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBoxFrame extends JFrame {

	private JPanel contentPane;
	private JComboBox imagesComboBox;
	private JLabel label;

	private static final String NAMES[] = {"Bird.png", "Bull.png", "Camell.png", "Cat.png", "Cow.png", 
			"Dog.png", "Duck.png", "Elephant.png", "Fish.png", "Giraffe.png", "Goose.png", "Horse.png", "Lion.png", 
			"Monkey.png", "Mouse.png", "Rabbit.png", "Tiger.png", "Turtle.png", "Wolf.png", "Zebra.png" };

	private final Icon[] ICONS = {
		new ImageIcon(getClass().getResource(NAMES[0])),
		new ImageIcon(getClass().getResource(NAMES[1])),
		new ImageIcon(getClass().getResource(NAMES[2])),
		new ImageIcon(getClass().getResource(NAMES[3])),
		new ImageIcon(getClass().getResource(NAMES[4])),
		new ImageIcon(getClass().getResource(NAMES[5])),
		new ImageIcon(getClass().getResource(NAMES[6])),
		new ImageIcon(getClass().getResource(NAMES[7])),
		new ImageIcon(getClass().getResource(NAMES[8])),
		new ImageIcon(getClass().getResource(NAMES[9])),
		new ImageIcon(getClass().getResource(NAMES[10])),
		new ImageIcon(getClass().getResource(NAMES[11])),
		new ImageIcon(getClass().getResource(NAMES[12])),
		new ImageIcon(getClass().getResource(NAMES[13])),
		new ImageIcon(getClass().getResource(NAMES[14])),
		new ImageIcon(getClass().getResource(NAMES[15])),
		new ImageIcon(getClass().getResource(NAMES[16])),
		new ImageIcon(getClass().getResource(NAMES[17])),
		new ImageIcon(getClass().getResource(NAMES[18])),
		new ImageIcon(getClass().getResource(NAMES[19]))
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxFrame frame = new ComboBoxFrame();
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
	public ComboBoxFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		imagesComboBox = new JComboBox();
		imagesComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange() == ItemEvent.SELECTED) {
					label.setIcon(ICONS[imagesComboBox.getSelectedIndex()]);
				}
			}
		});
		imagesComboBox.setModel(new DefaultComboBoxModel(new String[] {"Bird", "Bull", "Camell", "Cat", "Cow", 
				"Dog", "Duck", "Elephant", "Fish", "Giraffe", "Goose", "Horse", "Lion", 
				"Monkey", "Mouse", "Rabbit", "Tiger", "Turtle", "Wolf", "Zebra"}));
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(ComboBoxFrame.class.getResource("/edu/pupr/components/Bird.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(imagesComboBox, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(imagesComboBox, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
