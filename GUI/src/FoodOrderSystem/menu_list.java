package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class menu_list extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JLabel btn_exit;
	private JLabel lblNewLabel;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void MenuList() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_list frame = new menu_list();
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
	public menu_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
		scrollPane.setBounds(70, 90, 560, 332);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"BeefSteak Burger", "RM23.50"},
					{"MegaMac Burger", "RM25.80"},
					{"Cheesy Burger", "RM18.90"},
					{"FishnMayo Burger", "RM17.50"},
					{"Chicken Burger", "RM20.00"},

					{"Bolognese Meatball Pasta", "RM21.90"},
					{"Creamy Alfredo Pasta", "RM22.90"},
					{"Parmesan Aglio Olio Pasta", "RM24.90"},
					{"Beef Bacon Carbonara Pasta", "RM23.90"},
					{"Cheesy Lasagna Pasta", "RM18.90"},

					{"Extravaganzza Pizza", "RM35.90"},
					{"Ultimate Hawaiian Pizza", "RM36.90"},
					{"Smoky Pepperoni Pizza", "RM33.90"},
					{"Simply Cheese Pizza", "RM32.90"},
					{"Smoky Beef & Chick Pizza", "RM35.90"},

					{"NewYork Cheesecake (S)", "RM12.50"},
					{"NewYork Cheesecake (W)", "RM120.00"},
					{"Tiramisu Cake (S)", "RM13.00"},
					{"Tiramisu Cake (W)", "RM125.00"},
					{"Fruit Cake (S)", "RM10.50"},
					{"Fruit Cake (W)", "RM101.00"},
					{"Black Forest Cake (S)", "RM11.50"},
					{"Black Forest Cake (W)", "RM110.50"},
					{"Indulgence Cake (S)", "RM13.50"},
					{"Indulgence Cake (Q)", "RM130.00"},

					{"Boba Tea: Fresh Milk", "RM16.90"},
					{"Boba Tea: Chocolate Milk", "RM16.90"},
					{"Boba Tea: Thai Milk Tea", "RM16.90"},
					{"Boba Tea: Thai Green Tea", "RM16.90"},
					{"Boba Tea: Strawberry Milk", "RM16.90"},
					{"Smoothies: Vanilla Smoothie", "RM18.90"},
					{"Smoothies: Chocolate Smoothie", "RM18.90"},
					{"Smoothies: Strawberry Smoothie", "RM18.90"},
					{"Smoothies: MaltyMilk Smoothie", "RM18.90"},
					{"Smoothies: CookiesNCream Smoothie", "RM18.90"},
					{"Fruit Juice: Orange Juice", "RM15.90"},
					{"Fruit Juice: Watermelon Juice", "RM15.90"},
					{"Fruit Juice: Mango Juice", "RM15.90"},
					{"Fruit Juice: Apple Juice", "RM15.90"},
					{"Fruit Juice: Guava Juice", "RM15.90"},
					{"Fizzy Drink: Wild Berry & Mint", "RM16.90"},
					{"Fizzy Drink: Lemon & Mint", "RM16.90"},
					{"Fizzy Drink: Peach & Lemon", "RM16.90"},
					{"Fizzy Drink: Blue Island Mint", "RM16.90"},
					{"Fizzy Drink: Mango & Pineapple", "RM16.90"},
					{"Crafted Coffee: Hazelnut Latte", "RM17.90"},
					{"Crafted Coffee: Cappucinno", "RM17.90"},
					{"Crafted Coffee: Caramel Macchiato", "RM17.90"},
					{"Crafted Coffee: White Mocha", "RM17.90"},
					{"Crafted Coffee: Americano", "RM17.90"},

				},
				new String[] {
						"Menu List", "Menu Price (RM)"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(50);
		table.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));

		btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openListMenu();
				menu_list.this.dispose();
			}
		});
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 432, 98, 28);
		contentPane.add(btnNewButton);

		btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					menu_list.this.dispose();
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

		lblNewLabel = new JLabel("Menu List");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel.setBounds(267, 32, 164, 48);
		contentPane.add(lblNewLabel);
		setUndecorated(true);
	}

}
