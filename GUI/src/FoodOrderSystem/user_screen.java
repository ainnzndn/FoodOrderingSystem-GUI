package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class user_screen extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JLabel lbl_message = new JLabel("");
	Controller c = new Controller();
	
	/**
	 * Launch the application.
	 */
	public static void UserLogin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user_screen user = new user_screen();
					user.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public user_screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 500);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel_username = new JPanel();
		panel_username.setBackground(new Color(250, 235, 215));
		panel_username.setBounds(309, 325, 252, 44);
		contentPane.add(panel_username);
		panel_username.setLayout(null);

		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals("")) {
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setBounds(10, 10, 187, 25);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		panel_username.add(txtUsername);
		
		JLabel icon_user = new JLabel("");
		icon_user.setBounds(207, 0, 45, 45);
		panel_username.add(icon_user);
		setLocationRelativeTo(null);
		icon_user.setIcon(new ImageIcon("img/user1.png"));

		JPanel panel_password = new JPanel();
		panel_password.setBackground(new Color(250, 235, 215));
		panel_password.setBounds(309, 367, 252, 44);
		contentPane.add(panel_password);
		panel_password.setLayout(null);

		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
				}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char)0);
				}
			}
		});
		pwdPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setBounds(10, 10, 187, 24);
		pwdPassword.setText("Password");
		panel_password.add(pwdPassword);
		
		JLabel icon_key = new JLabel("");
		icon_key.setBounds(207, 0, 45, 45);
		panel_password.add(icon_key);
		setLocationRelativeTo(null);
		icon_key.setIcon(new ImageIcon("img/key.png"));

		JPanel panel_login = new JPanel();
		panel_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtUsername.getText().equals("user") && pwdPassword.getText().equals("user123")) {
					lbl_message.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful");
					c.openUserMenu();
					dispose();
				}
				else if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || 
						pwdPassword.getText().equals("") || pwdPassword.getText().equals("Password")) {
					lbl_message.setText("Please input all requirements!");
				}
				else {
					lbl_message.setText("No user found!");
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_login.setBackground(new Color(222, 184, 135));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_login.setBackground(new Color(245, 222, 179));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_login.setBackground(new Color(222, 184, 135));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_login.setBackground(new Color(245, 222, 179));
			}
		});
		panel_login.setBackground(new Color(245, 222, 179));
		panel_login.setBounds(309, 442, 252, 37);
		contentPane.add(panel_login);
		panel_login.setLayout(null);

		JLabel lbl_login = new JLabel("LOG IN");
		lbl_login.setBounds(99, 12, 55, 13);
		lbl_login.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_login.setAutoscrolls(true);
		lbl_login.setForeground(new Color(0, 0, 0));
		lbl_login.setFont(new Font("Arial", Font.BOLD, 16));
		panel_login.add(lbl_login);
		setLocationRelativeTo(null);

		JLabel btn_exit = new JLabel("X");
		btn_exit.setForeground(Color.BLACK);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					user_screen.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn_exit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn_exit.setForeground(Color.BLACK);
			}
		});
		btn_exit.setHorizontalAlignment(SwingConstants.CENTER);
		btn_exit.setFont(new Font("Arial", Font.BOLD, 18));
		btn_exit.setBounds(837, 0, 33, 37);
		contentPane.add(btn_exit);

		lbl_message.setForeground(new Color(128, 0, 0));
		lbl_message.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_message.setBounds(305, 420, 253, 13);
		contentPane.add(lbl_message);
		
		JLabel icon_logo = new JLabel("");
		icon_logo.setBounds(185, 66, 500, 250);
		contentPane.add(icon_logo);
		setLocationRelativeTo(null);
		icon_logo.setIcon(new ImageIcon("img/restaurant.png"));
		
		JLabel lbl_message_1 = new JLabel("Hint: user + user123");
		lbl_message_1.setForeground(new Color(0, 0, 0));
		lbl_message_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_message_1.setBounds(369, 311, 123, 13);
		contentPane.add(lbl_message_1);
		
		JLabel lblNewLabel = new JLabel("Customer Login");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(244, 29, 381, 44);
		contentPane.add(lblNewLabel);
	}
}

