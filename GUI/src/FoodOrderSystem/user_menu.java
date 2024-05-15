package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class user_menu extends JFrame {

	private JPanel contentPane;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void UserMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user_menu frame = new user_menu();
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
	public user_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 850, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					user_menu.this.dispose();
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
		btn_exit.setForeground(Color.BLACK);
		btn_exit.setFont(new Font("Arial", Font.BOLD, 18));
		btn_exit.setBounds(817, 0, 33, 37);
		contentPane.add(btn_exit);

		JPanel panel_list = new JPanel();
		panel_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openListMenu();
				user_menu.this.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				panel_list.setBackground(new Color(255, 235, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_list.setBackground(new Color(255, 235, 205));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				panel_list.setBackground(new Color(255, 228, 181));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_list.setBackground(new Color(255, 235, 205));
			}

		});
		panel_list.setLayout(null);
		panel_list.setBackground(new Color(255, 235, 205));
		panel_list.setBounds(433, 328, 161, 45);
		contentPane.add(panel_list);

		JLabel lbl_list = new JLabel("List Menu");
		lbl_list.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lbl_list.setBounds(12, 14, 96, 19);
		panel_list.add(lbl_list);

		JLabel icon_menu = new JLabel("");
		icon_menu.setBounds(116, 0, 45, 45);
		panel_list.add(icon_menu);
		icon_menu.setIcon(new ImageIcon("img/order.png"));

		JLabel lblNewLabel = new JLabel("Welcome to La Italien!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setBounds(233, 33, 383, 61);
		contentPane.add(lblNewLabel);

		JLabel icon_logo = new JLabel("");
		icon_logo.setBounds(177, 81, 500, 250);
		contentPane.add(icon_logo);
		icon_logo.setIcon(new ImageIcon("img/restaurant.png"));

		JPanel panel_order = new JPanel();
		panel_order.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openSplashscreen();
				user_menu.this.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				panel_order.setBackground(new Color(255, 235, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_order.setBackground(new Color(255, 235, 205));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				panel_order.setBackground(new Color(255, 228, 181));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_order.setBackground(new Color(255, 235, 205));
			}
		});
		panel_order.setLayout(null);
		panel_order.setBackground(new Color(255, 235, 205));
		panel_order.setBounds(262, 328, 161, 45);
		contentPane.add(panel_order);

		JLabel lbl_order = new JLabel("Make Order");
		lbl_order.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lbl_order.setBounds(10, 14, 110, 17);
		panel_order.add(lbl_order);

		JLabel icon_order = new JLabel("");
		icon_order.setBounds(116, 0, 45, 45);
		panel_order.add(icon_order);
		icon_order.setIcon(new ImageIcon("img/dine.png"));

		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openUserLogin();
				user_menu.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(10, 392, 95, 25);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 222, 173)));
		panel_1.setBackground(new Color(245, 222, 179));
		panel_1.setBounds(10, 10, 191, 71);
		contentPane.add(panel_1);
		
		JLabel icon_reward = new JLabel("");
		icon_reward.setBounds(0, 2, 63, 66);
		panel_1.add(icon_reward);
		icon_reward.setIcon(new ImageIcon("img/reward.png"));

		JLabel lblNewLabel_1 = new JLabel("Your Rewards");
		lblNewLabel_1.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(73, 25, 118, 19);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblPoints = new JLabel("189 Points");
		lblPoints.setFont(new Font("Book Antiqua", Font.BOLD, 18));
		lblPoints.setBounds(73, 49, 118, 19);
		panel_1.add(lblPoints);
		
		JLabel user_id = new JLabel("A01");
		user_id.setFont(new Font("Book Antiqua", Font.BOLD, 14));
		user_id.setBounds(73, 2, 118, 19);
		panel_1.add(user_id);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
