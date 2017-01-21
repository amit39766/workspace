package amit.diu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;

public class frontUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontUI frame = new frontUI();
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
	public frontUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Sylfaen", Font.BOLD, 21));
		textField.setBounds(10, 32, 289, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 98, 67, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(94, 98, 75, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(196, 98, 67, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(10, 132, 67, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(196, 132, 67, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(10, 166, 67, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(94, 166, 75, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(196, 166, 67, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBounds(10, 200, 67, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.setBounds(206, 235, 57, 23);
		contentPane.add(btnNewButton_10);
		
		JButton button = new JButton("5");
		button.setBounds(94, 132, 75, 23);
		contentPane.add(button);
		
		JButton btnNewButton_4 = new JButton(".");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(94, 200, 75, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setBounds(10, 235, 46, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.setBounds(196, 200, 67, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBounds(73, 235, 46, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("x");
		btnNewButton_14.setBounds(141, 235, 46, 23);
		contentPane.add(btnNewButton_14);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 309, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Functions");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
	}
}
