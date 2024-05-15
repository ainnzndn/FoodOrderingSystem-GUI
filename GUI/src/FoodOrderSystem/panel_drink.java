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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class panel_drink extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int totaldrinks;
	private JTextField txt_Total;
	private JTable table_Cart;
	private JTextField txtSubtotal;
	private String addon1, addon2, addon3, addon4, addon5, addon6, addon7, addon8;
	private double tot;
	Controller c = new Controller();

	/**
	 * Launch the application.
	 */
	public static void ScreenDrink() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel_drink frame = new panel_drink();
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
	public panel_drink() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JLabel lbl_drink = new JLabel("Menu Selection :");
		lbl_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lbl_drink.setBounds(159, 260, 133, 33);
		getContentPane().add(lbl_drink);

		JSpinner spinner_quantity = new JSpinner();
		spinner_quantity.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner_quantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spinner_quantity.setBounds(302, 359, 128, 26);
		getContentPane().add(spinner_quantity);

		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblQuantity.setBounds(159, 356, 99, 33);
		getContentPane().add(lblQuantity);

		JComboBox<String> cmb_drinks = new JComboBox<String>();
		cmb_drinks.setModel(new DefaultComboBoxModel(new String[] {"(Choose your desired menu)", "Boba Tea", "Smoothies", "Fruit Juice", "Fizzy Drink", "Crafted Coffee"}));
		cmb_drinks.setToolTipText("");
		cmb_drinks.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_drinks.setBounds(302, 260, 297, 28);
		getContentPane().add(cmb_drinks);

		JLabel lbl_drinks1 = new JLabel("Boba Tea");
		lbl_drinks1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_drinks1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_drinks1.setBounds(64, 208, 126, 13);
		getContentPane().add(lbl_drinks1);

		JLabel lbl_drinks2 = new JLabel("Smoothies");
		lbl_drinks2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_drinks2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_drinks2.setBounds(225, 208, 97, 13);
		getContentPane().add(lbl_drinks2);

		JLabel lbl_drinks3 = new JLabel("Fruit Juice");
		lbl_drinks3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_drinks3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_drinks3.setBounds(381, 208, 90, 13);
		getContentPane().add(lbl_drinks3);

		JLabel lbl_drinks4 = new JLabel("Fizzy Drink");
		lbl_drinks4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_drinks4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_drinks4.setBounds(526, 209, 102, 13);
		getContentPane().add(lbl_drinks4);

		JLabel lbl_drinks5 = new JLabel("Crafted Coffee");
		lbl_drinks5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_drinks5.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_drinks5.setBounds(681, 209, 93, 13);
		getContentPane().add(lbl_drinks5);

		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setBackground(new Color(255, 255, 255));
		txt_Total.setColumns(10);
		txt_Total.setBounds(302, 391, 128, 26);
		getContentPane().add(txt_Total);

		JLabel lbl_price1 = new JLabel("RM16.90");
		lbl_price1.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price1.setBounds(95, 226, 63, 13);
		getContentPane().add(lbl_price1);

		JLabel lbl_price2 = new JLabel("RM18.90");
		lbl_price2.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price2.setBounds(245, 226, 63, 13);
		getContentPane().add(lbl_price2);

		JLabel lbl_price3 = new JLabel("RM15.90");
		lbl_price3.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price3.setBounds(396, 227, 63, 13);
		getContentPane().add(lbl_price3);

		JLabel lbl_price4 = new JLabel("RM16.90");
		lbl_price4.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price4.setBounds(547, 227, 63, 13);
		getContentPane().add(lbl_price4);

		JLabel lbl_price5 = new JLabel("RM17.90");
		lbl_price5.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price5.setBounds(695, 227, 63, 13);
		getContentPane().add(lbl_price5);

		JLabel lblMilkChoice = new JLabel("Sugar Level :");
		lblMilkChoice.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblMilkChoice.setBounds(159, 324, 102, 33);
		getContentPane().add(lblMilkChoice);

		JComboBox<String> cmb_sugar = new JComboBox<String>();
		cmb_sugar.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "No Sugar", "Slight Sugar", "Less Sugar", "Half Sugar", "Regular Sugar"}));
		cmb_sugar.setToolTipText("");
		cmb_sugar.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_sugar.setBounds(302, 326, 145, 28);
		getContentPane().add(cmb_sugar);

		JButton btn_Cart = new JButton("Proceed to Payment");
		btn_Cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(txtSubtotal.getText().equals("0.00") || txtSubtotal.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_drink.this.setVisible(true);
				}

				else {
					c.openPayMethod(tot);
					panel_drink.this.dispose();
				}
			}
		});
		btn_Cart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btn_Cart.setBorderPainted(false);
		btn_Cart.setBackground(Color.RED);
		btn_Cart.setBounds(262, 660, 337, 37);
		getContentPane().add(btn_Cart);

		JButton btn_Total = new JButton("TOTAL (RM) :");
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cmb_drinks.getSelectedItem();
				DecimalFormat df = new DecimalFormat ("0.00");
				double total=0.00;
				totaldrinks =(int)spinner_quantity.getValue();

				if (selectedItem.equals("Boba Tea")) {
					total=total+16.90*totaldrinks;
				}
				else if (selectedItem.equals("Smoothies")) {
					total=total+18.90*totaldrinks;
				}
				else if (selectedItem.equals("Fruit Juice")) {
					total=total+15.90*totaldrinks;
				}
				else if (selectedItem.equals("Fizzy Drink")) {
					total=total+16.90*totaldrinks;
				}
				else if (selectedItem.equals("Crafted Coffee")) {
					total=total+17.90*totaldrinks;
				}
				txt_Total.setText(Double.toString(total));
				txt_Total.setText(df.format(total));

			}
		});
		btn_Total.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Total.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Total.setBackground(new Color(245, 222, 179));
		btn_Total.setBounds(147, 391, 128, 26);
		getContentPane().add(btn_Total);

		JLabel pic_drink1 = new JLabel("");
		pic_drink1.setBounds(75, 83, 100, 120);
		getContentPane().add(pic_drink1);
		pic_drink1.setIcon(new ImageIcon("img/drinks1.jpg"));

		JLabel pic_drink2 = new JLabel("");
		pic_drink2.setBounds(226, 83, 100, 120);
		getContentPane().add(pic_drink2);
		pic_drink2.setIcon(new ImageIcon("img/drinks2.jpg"));

		JLabel pic_drink3 = new JLabel("");
		pic_drink3.setBounds(377, 83, 100, 120);
		getContentPane().add(pic_drink3);
		pic_drink3.setIcon(new ImageIcon("img/drinks3.jpg"));

		JLabel pic_drink4 = new JLabel("");
		pic_drink4.setBounds(525, 83, 100, 120);
		getContentPane().add(pic_drink4);
		pic_drink4.setIcon(new ImageIcon("img/drinks4.jpg"));

		JLabel pic_drink5 = new JLabel("");
		pic_drink5.setBounds(676, 83, 100, 120);
		getContentPane().add(pic_drink5);
		pic_drink5.setIcon(new ImageIcon("img/drinks5.jpg"));

		JLabel lbl_cake_1 = new JLabel("Drink of Choice :");
		lbl_cake_1.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lbl_cake_1.setBounds(159, 293, 133, 33);
		getContentPane().add(lbl_cake_1);

		JComboBox<String> cmb_select = new JComboBox<String>();
		cmb_select.setToolTipText("");
		cmb_select.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_select.setBounds(302, 293, 297, 28);
		getContentPane().add(cmb_select);

		JLabel lblIceLevel = new JLabel("Ice Level :");
		lblIceLevel.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblIceLevel.setBounds(467, 324, 78, 33);
		getContentPane().add(lblIceLevel);

		JComboBox<String> cmb_ice = new JComboBox<String>();
		cmb_ice.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "No Ice", "Less Ice", "Half Ice", "Regular Ice"}));
		cmb_ice.setToolTipText("");
		cmb_ice.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_ice.setBounds(555, 326, 141, 28);
		getContentPane().add(cmb_ice);

		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setColumns(10);
		txt_Total.setBackground(Color.WHITE);
		txt_Total.setBounds(302, 391, 128, 26);
		contentPane.add(txt_Total);

		JLabel btn_exit = new JLabel("X");
		btn_exit.setForeground(Color.BLACK);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					panel_drink.this.dispose();
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
		btn_exit.setBounds(837, 0, 33, 37);
		contentPane.add(btn_exit);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(10, 73, 850, 405);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblOrderId = new JLabel("Order ID :");
		lblOrderId.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblOrderId.setBounds(456, 318, 79, 26);
		panel.add(lblOrderId);

		JLabel order_id = new JLabel("KC01");
		order_id.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		order_id.setBounds(533, 318, 79, 26);
		panel.add(order_id);

		JButton btn_Add = new JButton("Add to Cart");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_Total.getText().equals("0.0") || txt_Total.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_drink.this.setVisible(true);
				}

				else{
					DefaultTableModel model = (DefaultTableModel) table_Cart.getModel();

					model.addRow(new Object[] {order_id.getText(), cmb_drinks.getSelectedItem(), cmb_select.getSelectedItem(), cmb_sugar.getSelectedItem(), 
							cmb_ice.getSelectedItem(), spinner_quantity.getValue().toString(), txt_Total.getText(), 
					});
				}
			}
		});
		btn_Add.setForeground(Color.BLACK);
		btn_Add.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btn_Add.setBorderPainted(false);
		btn_Add.setBackground(new Color(220, 220, 220));
		btn_Add.setBounds(335, 360, 179, 36);
		panel.add(btn_Add);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 488, 850, 126);
		contentPane.add(scrollPane);

		table_Cart = new JTable();
		scrollPane.setViewportView(table_Cart);
		table_Cart.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Order ID", "Drink", "Main Selection", "Sugar Level", "Ice Level", "Quantity", "Total (RM)"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_Cart.getColumnModel().getColumn(0).setResizable(false);
		table_Cart.getColumnModel().getColumn(1).setResizable(false);
		table_Cart.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_Cart.getColumnModel().getColumn(2).setResizable(false);
		table_Cart.getColumnModel().getColumn(2).setPreferredWidth(65);
		table_Cart.getColumnModel().getColumn(3).setResizable(false);
		table_Cart.getColumnModel().getColumn(3).setPreferredWidth(65);
		table_Cart.getColumnModel().getColumn(4).setResizable(false);
		table_Cart.getColumnModel().getColumn(5).setResizable(false);
		table_Cart.setRequestFocusEnabled(false);
		table_Cart.setOpaque(false);

		JButton btn_Subtotal = new JButton("SUBTOTAL (RM) :");
		btn_Subtotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("0.00");
				int row = table_Cart.getRowCount();

				for(int i=0; i<row; i++) {
					double val = Double.valueOf(table_Cart.getValueAt(i, 6).toString());
					tot += val;
				}
				txtSubtotal.setText(Double.toString(tot));
				txtSubtotal.setText(df.format(tot));
			}
		});
		btn_Subtotal.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Subtotal.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Subtotal.setBackground(new Color(245, 222, 179));
		btn_Subtotal.setBounds(293, 624, 148, 26);
		contentPane.add(btn_Subtotal);

		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Arial", Font.BOLD, 15));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(444, 624, 128, 26);
		contentPane.add(txtSubtotal);

		JButton btn_burger = new JButton("WFBurger");
		btn_burger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openBurger();
				panel_drink.this.dispose();
			}
		});
		btn_burger.setForeground(new Color(0, 0, 0));
		btn_burger.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_burger.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_burger.setBorderPainted(false);
		btn_burger.setBackground(new Color(255, 235, 205));
		btn_burger.setBounds(21, 11, 160, 55);
		contentPane.add(btn_burger);
		btn_burger.setIcon(new ImageIcon ("img/burger.png"));		

		JButton btn_pasta = new JButton("GoodPasta");
		btn_pasta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openPasta();
				panel_drink.this.dispose();
			}
		});
		btn_pasta.setForeground(new Color(0, 0, 0));
		btn_pasta.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_pasta.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_pasta.setBorderPainted(false);
		btn_pasta.setBackground(new Color(255, 235, 205));
		btn_pasta.setBounds(186, 11, 160, 55);
		contentPane.add(btn_pasta);
		btn_pasta.setIcon(new ImageIcon ("img/pasta.png"));		

		JButton btn_pizza = new JButton("MyPizza");
		btn_pizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openPizza();
				panel_drink.this.dispose();
			}
		});
		btn_pizza.setForeground(new Color(0, 0, 0));
		btn_pizza.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_pizza.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_pizza.setBorderPainted(false);
		btn_pizza.setBackground(new Color(255, 235, 205));
		btn_pizza.setBounds(352, 11, 160, 55);
		contentPane.add(btn_pizza);
		btn_pizza.setIcon(new ImageIcon ("img/pizza.png"));		

		JButton btn_cake = new JButton("Lily Cakes");
		btn_cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openCake();
				panel_drink.this.dispose();
			}
		});
		btn_cake.setForeground(new Color(0, 0, 0));
		btn_cake.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_cake.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_cake.setBorderPainted(false);
		btn_cake.setBackground(new Color(255, 235, 205));
		btn_cake.setBounds(517, 11, 160, 55);
		contentPane.add(btn_cake);
		btn_cake.setIcon(new ImageIcon ("img/cake.png"));		

		JButton btn_drink = new JButton("Koolcup");
		btn_drink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openDrink();
				panel_drink.this.dispose();
			}
		});
		btn_drink.setForeground(new Color(0, 0, 0));
		btn_drink.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_drink.setBorderPainted(false);
		btn_drink.setBackground(new Color(255, 222, 173));
		btn_drink.setBounds(682, 11, 160, 55);
		contentPane.add(btn_drink);
		btn_drink.setIcon(new ImageIcon ("img/drink.png"));		

		cmb_drinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel model = (DefaultComboBoxModel) cmb_select.getModel();
				model.removeAllElements();
				if (cmb_drinks.getSelectedItem().equals("Boba Tea")) {
					cmb_select.setSelectedItem(null);
					cmb_select.addItem("Fresh Milk");
					cmb_select.addItem("Chocolate Milk");
					cmb_select.addItem("Thai Milk Tea");
					cmb_select.addItem("Thai Green Tea");
					cmb_select.addItem("Strawberry Milk");
				}
				else if (cmb_drinks.getSelectedItem().equals("Smoothies")) {
					cmb_select.setSelectedItem(null);
					cmb_select.addItem("Vanilla Smoothie");
					cmb_select.addItem("Chocolate Smoothie");
					cmb_select.addItem("Strawberry Smoothie");
					cmb_select.addItem("MaltyMilk Smoothie");
					cmb_select.addItem("CookiesNCream Smoothie");
				}
				else if (cmb_drinks.getSelectedItem().equals("Fruit Juice")) {
					cmb_select.setSelectedItem(null);
					cmb_select.addItem("Orange Juice");
					cmb_select.addItem("Watermelon Juice");
					cmb_select.addItem("Mango Juice");
					cmb_select.addItem("Apple Juice");
					cmb_select.addItem("Guava Juice");
				}
				else if (cmb_drinks.getSelectedItem().equals("Fizzy Drink")) {
					cmb_select.setSelectedItem(null);
					cmb_select.addItem("Wild Berry & Mint");
					cmb_select.addItem("Lemon & Mint");
					cmb_select.addItem("Peach & Lemon");
					cmb_select.addItem("Blue Island Mint");
					cmb_select.addItem("Mango & Pineapple");
				}
				else if (cmb_drinks.getSelectedItem().equals("Fizzy Drink")) {
					cmb_select.setSelectedItem(null);
					cmb_select.addItem("Wild Berry & Mint");
					cmb_select.addItem("Lemon & Mint");
					cmb_select.addItem("Peach & Lemon");
					cmb_select.addItem("Strawberry & Mint");
					cmb_select.addItem("Mango & Pineapple");
				}
				else if (cmb_drinks.getSelectedItem().equals("Crafted Coffee")) {
					cmb_select.setSelectedItem(null);
					cmb_select.addItem("Hazelnut Latte");
					cmb_select.addItem("Cappuccino");
					cmb_select.addItem("Caramel Macchiato");
					cmb_select.addItem("White Mocha");
					cmb_select.addItem("Americano");
				}
				cmb_select.repaint();
				cmb_select.revalidate();

			}
		});
	}
}

