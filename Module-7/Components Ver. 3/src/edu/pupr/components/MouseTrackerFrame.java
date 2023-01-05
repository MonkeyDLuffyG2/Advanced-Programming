package edu.pupr.components;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.Format;
import java.awt.event.MouseMotionAdapter;

public class MouseTrackerFrame extends JFrame {

	private JPanel contentPane;
	private JPanel mousePanel;
	private JLabel statusBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseTrackerFrame frame = new MouseTrackerFrame();
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
	public MouseTrackerFrame() {
		setTitle("Demonstrating Mouse Events");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		statusBar = new JLabel("Mouse outside JPanel");
		
		mousePanel = new JPanel();
		mousePanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent event) {
				statusBar.setText(String.format("Dragged at (%d, %d)", event.getX(), event.getY()));
			}
			@Override
			public void mouseMoved(MouseEvent event) {
				statusBar.setText(String.format("Moved at (%d, %d)", event.getX(), event.getY()));
			}
		});
		mousePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				statusBar.setText(String.format("Clicked at (%d, %d)", event.getX(), event.getY()));
			}
			@Override
			public void mouseEntered(MouseEvent event) {
				statusBar.setText(String.format("Entered at (%d, %d)", event.getX(), event.getY()));
				mousePanel.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent event) {
				statusBar.setText("Mouse outside JPanel");
				mousePanel.setBackground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent event) {
				statusBar.setText(String.format("Pressed at (%d, %d)", event.getX(), event.getY()));
			}
			@Override
			public void mouseReleased(MouseEvent event) {
				statusBar.setText(String.format("Released at (%d, %d)", event.getX(), event.getY()));
			}
		});
		mousePanel.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(statusBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
				.addComponent(mousePanel, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(mousePanel, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(statusBar, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
