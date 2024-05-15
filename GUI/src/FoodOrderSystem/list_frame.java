package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class list_frame extends JFrame {

	private JPanel contentPane;
	private JButton btnRestaurantList;
	private JButton btnAddToCart;
	private JButton btnBankList;
	private JButton btnLogout;

	Controller c = new Controller();
	private JLabel btn_exit;
	/**
	 * Launch the application.
	 */
	public static void ListMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_frame frame = new list_frame();
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
	public list_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 69, 19), new Color(139, 69, 19), new Color(139, 69, 19), new Color(139, 69, 19)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		
		btnRestaurantList = new JButton("RESTAURANT LIST");
		btnRestaurantList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openRestaurantList();
				list_frame.this.dispose();
			}
		});
		btnRestaurantList.setFont(new Font("Book Antiqua", Font.BOLD, 18));
		btnRestaurantList.setBackground(new Color(255, 222, 173));
		btnRestaurantList.setBounds(53, 326, 224, 35);
		contentPane.add(btnRestaurantList);
		
		btnAddToCart = new JButton("MENU LIST");
		btnAddToCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openMenuList();
				list_frame.this.dispose();
			}
		});
		btnAddToCart.setFont(new Font("Book Antiqua", Font.BOLD, 18));
		btnAddToCart.setBackground(new Color(255, 222, 173));
		btnAddToCart.setBounds(312, 326, 224, 35);
		contentPane.add(btnAddToCart);
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openUserLogin();
				list_frame.this.dispose();
			}
		});
		btnLogout.setFont(new Font("Book Antiqua", Font.BOLD, 18));
		btnLogout.setBackground(new Color(220, 220, 220));
		btnLogout.setBounds(312, 371, 224, 35);
		contentPane.add(btnLogout);
		
		btnBankList = new JButton("BANK LIST");
		btnBankList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openBankList();
				list_frame.this.dispose();
			}
		});
		btnBankList.setBounds(570, 326, 224, 35);
		contentPane.add(btnBankList);
		btnBankList.setFont(new Font("Book Antiqua", Font.BOLD, 18));
		btnBankList.setBackground(new Color(255, 222, 173));
		
		JLabel icon_logo = new JLabel("");
		icon_logo.setBounds(182, 68, 500, 250);
		contentPane.add(icon_logo);
		icon_logo.setIcon(new ImageIcon("img/restaurant.png"));
		
		JLabel lblListMenu = new JLabel("List Menu");
		lblListMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblListMenu.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
		lblListMenu.setBounds(248, 30, 381, 37);
		contentPane.add(lblListMenu);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			c.openUserMenu();
			list_frame.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(18, 389, 93, 25);
		contentPane.add(btnNewButton);
		
		btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					list_frame.this.dispose();
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
		setUndecorated(true);
	}
}
