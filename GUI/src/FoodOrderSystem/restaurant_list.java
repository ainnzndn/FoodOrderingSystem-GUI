package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class restaurant_list extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Controller c = new Controller();
	
	/**
	 * Launch the application.
	 */
	public static void RestaurantList() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restaurant_list frame = new restaurant_list();
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
	@SuppressWarnings("serial")
	public restaurant_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRestaurantList = new JLabel("Restaurant List");
		lblRestaurantList.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblRestaurantList.setBounds(224, 34, 249, 48);
		contentPane.add(lblRestaurantList);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openListMenu();
				restaurant_list.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setBounds(10, 434, 98, 28);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"La Italien Restaurant"},
				{"WFBurger"},
				{"GoodPasta"},
				{"MyPizza"},
				{"Lily Cakes"},
				{"Koolcup"},
			},
			new String[] {
				"Restaurant List"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(67, 92, 560, 332);
		contentPane.add(table);
		
		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					restaurant_list.this.dispose();
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
		btn_exit.setBounds(667, 0, 33, 37);
		contentPane.add(btn_exit);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
