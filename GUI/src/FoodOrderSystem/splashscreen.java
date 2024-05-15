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
public class splashscreen extends JFrame {
	
	private JPanel contentPane;
	private JLabel lbl_message = new JLabel("");
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void Splashscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					splashscreen frame = new splashscreen();
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
	public splashscreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);

		JLabel btn_exit = new JLabel("X");
		btn_exit.setForeground(Color.BLACK);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					splashscreen.this.dispose();
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
		btn_exit.setBounds(817, 0, 33, 37);
		contentPane.add(btn_exit);
		setLocationRelativeTo(null);
		
		JPanel panel_takeout = new JPanel();
		panel_takeout.setBackground(new Color(255, 235, 205));
		panel_takeout.setBounds(430, 328, 161, 45);
		contentPane.add(panel_takeout);
		panel_takeout.setLayout(null);
		panel_takeout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_takeout.setBackground(new Color(255, 235, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_takeout.setBackground(new Color(255, 235, 205));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_takeout.setBackground(new Color(255, 235, 205));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_takeout.setBackground(new Color(255, 235, 205));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openMenu();
				dispose();
			}
		});
		
		setLocationRelativeTo(null);

		JLabel lbl_takeaway = new JLabel("Take Away");
		lbl_takeaway.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lbl_takeaway.setBounds(12, 14, 96, 19);
		panel_takeout.add(lbl_takeaway);
		
		JLabel icon_takeaway = new JLabel("");
		icon_takeaway.setBounds(116, 0, 45, 45);
		panel_takeout.add(icon_takeaway);
		icon_takeaway.setIcon(new ImageIcon("img/takeaway.png"));

		JLabel lblNewLabel = new JLabel("Make Order");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setBounds(250, 34, 350, 61);
		contentPane.add(lblNewLabel);
		
		JLabel icon_logo = new JLabel("");
		icon_logo.setBounds(177, 81, 500, 250);
		contentPane.add(icon_logo);
		icon_logo.setIcon(new ImageIcon("img/restaurant.png"));

				JPanel panel_eatin = new JPanel();
				panel_eatin.setBackground(new Color(255, 235, 205));
				panel_eatin.setBounds(259, 328, 161, 45);
				contentPane.add(panel_eatin);
				panel_eatin.setLayout(null);
				panel_eatin.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						panel_eatin.setBackground(new Color(255, 235, 205));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						panel_eatin.setBackground(new Color(255, 235, 205));
					}

					@Override
					public void mousePressed(MouseEvent e) {
						panel_eatin.setBackground(new Color(255, 228, 181));
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						panel_eatin.setBackground(new Color(255, 235, 205));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						c.openMenu();
						dispose();
					}
				});
				JLabel lbl_dine = new JLabel("Dine In");
				lbl_dine.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
				lbl_dine.setBounds(10, 14, 110, 17);
				panel_eatin.add(lbl_dine);
				
				JLabel icon_dinein = new JLabel("");
				icon_dinein.setIcon(new ImageIcon("img/dine.png"));
				icon_dinein.setBounds(116, 0, 45, 45);
				panel_eatin.add(icon_dinein);
				
				JButton btnNewButton = new JButton("Back");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						c.openUserMenu();
						splashscreen.this.dispose();
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
				
	}
}
