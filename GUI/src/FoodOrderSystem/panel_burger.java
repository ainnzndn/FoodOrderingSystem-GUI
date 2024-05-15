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
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;

public class panel_burger extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Total;
	private int totalburger;
	private JTable table_Cart;
	Controller c = new Controller();
	private JTextField txtSubtotal;
	private double tot;
	/**
	 * Launch the application.
	 */
	public static void ScreenBurger() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel_burger frame = new panel_burger();
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
	public panel_burger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("Burger Choice :");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblNewLabel.setBounds(149, 260, 119, 33);
		getContentPane().add(lblNewLabel);

		JSpinner spinner_quantity = new JSpinner();
		spinner_quantity.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner_quantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spinner_quantity.setBounds(531, 328, 69, 26);
		getContentPane().add(spinner_quantity);

		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblQuantity.setBounds(452, 325, 81, 33);
		getContentPane().add(lblQuantity);

		JComboBox<String> cmb_burger = new JComboBox<String>();
		cmb_burger.setModel(new DefaultComboBoxModel<String>(new String[] {"(Select your desired menu)", "Beefsteak Burger", "MegaMac Burger", "Cheesy Burger", "FishnMayo Burger", "Chicken Burger"}));
		cmb_burger.setToolTipText("");
		cmb_burger.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_burger.setBounds(265, 262, 337, 28);
		getContentPane().add(cmb_burger);

		JLabel lbl_burger1 = new JLabel("Beefsteak Burger");
		lbl_burger1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_burger1.setBounds(77, 208, 97, 13);
		getContentPane().add(lbl_burger1);

		JLabel lbl_burger2 = new JLabel("MegaMac Burger");
		lbl_burger2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_burger2.setBounds(226, 208, 94, 13);
		getContentPane().add(lbl_burger2);

		JLabel lbl_burger3 = new JLabel("Cheesy Burger");
		lbl_burger3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_burger3.setBounds(385, 208, 87, 13);
		getContentPane().add(lbl_burger3);

		JLabel lbl_burger4 = new JLabel("FishnMayo Burger");
		lbl_burger4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_burger4.setBounds(526, 209, 102, 13);
		getContentPane().add(lbl_burger4);

		JLabel lbl_burger5 = new JLabel("Chicken Burger");
		lbl_burger5.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_burger5.setBounds(685, 209, 91, 13);
		getContentPane().add(lbl_burger5);

		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setBounds(265, 392, 128, 26);
		getContentPane().add(txt_Total);
		txt_Total.setColumns(10);

		JLabel lbl_price1 = new JLabel("RM23.50");
		lbl_price1.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price1.setBounds(93, 226, 63, 13);
		getContentPane().add(lbl_price1);

		JLabel lbl_price2 = new JLabel("RM25.80");
		lbl_price2.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price2.setBounds(241, 227, 63, 13);
		getContentPane().add(lbl_price2);

		JLabel lbl_price3 = new JLabel("RM18.90");
		lbl_price3.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price3.setBounds(395, 227, 63, 13);
		getContentPane().add(lbl_price3);

		JLabel lbl_price4 = new JLabel("RM17.50");
		lbl_price4.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price4.setBounds(546, 227, 63, 13);
		getContentPane().add(lbl_price4);

		JLabel lbl_price5 = new JLabel("RM20.00");
		lbl_price5.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price5.setBounds(695, 227, 63, 13);
		getContentPane().add(lbl_price5);

		JLabel lblSides = new JLabel("Sides :");
		lblSides.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblSides.setBounds(205, 325, 69, 33);
		getContentPane().add(lblSides);

		JComboBox<String> cmb_sides = new JComboBox<String>();
		cmb_sides.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "French Fries", "Curly Fries", "Corn in Cup", "Chocolate Sundae", "Strawberry Sundae", "Apple Pie"}));
		cmb_sides.setToolTipText("");
		cmb_sides.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_sides.setBounds(265, 327, 177, 28);
		getContentPane().add(cmb_sides);

		JLabel lblDrink = new JLabel("Drink :");
		lblDrink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblDrink.setBounds(203, 356, 69, 33);
		getContentPane().add(lblDrink);

		JComboBox<String> cmb_drink = new JComboBox<String>();
		cmb_drink.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "CocaCola", "Sprite", "Milo", "100Plus", "Iced Lemon Tea", "Ribena", "Hot Coffee", "Hot Tea"}));
		cmb_drink.setToolTipText("");
		cmb_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_drink.setBounds(265, 359, 177, 28);
		getContentPane().add(cmb_drink);

		JLabel lblSides_1 = new JLabel("Customize :");
		lblSides_1.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblSides_1.setBounds(167, 293, 106, 33);
		getContentPane().add(lblSides_1);

		JComboBox<String> cmb_custom = new JComboBox<String>();
		cmb_custom.setModel(new DefaultComboBoxModel<String>(new String[] {"(none)", "Patty", "Cheese", "Lettuce", "Tomato", "Pickle", "Onion"}));
		cmb_custom.setToolTipText("");
		cmb_custom.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_custom.setBounds(264, 295, 178, 28);
		getContentPane().add(cmb_custom);

		JSpinner spinner_custom = new JSpinner();
		spinner_custom.setModel(new SpinnerListModel(new String[] {"(Please choose)", "None", "Less", "Regular", "Extra"}));
		spinner_custom.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spinner_custom.setBounds(454, 296, 148, 26);
		getContentPane().add(spinner_custom);

		JButton btn_Total = new JButton("TOTAL (RM) :");
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cmb_burger.getSelectedItem();
				DecimalFormat df = new DecimalFormat ("0.00");
				double total=0.00;
				totalburger =(int)spinner_quantity.getValue();
				JFrame jf = new JFrame();

				if (selectedItem.equals("Beefsteak Burger")) {
					total=total+23.50*totalburger;
				}
				else if (selectedItem.equals("MegaMac Burger")) {
					total=total+25.80*totalburger;
				}
				else if (selectedItem.equals("Cheesy Burger")) {
					total=total+18.90*totalburger;
				}
				else if (selectedItem.equals("FishnMayo Burger")) {
					total=total+17.50*totalburger;
				}
				else if (selectedItem.equals("Chicken Burger")) {
					total=total+20.00*totalburger;
				}
				txt_Total.setText(Double.toString(total));
				txt_Total.setText(df.format(total));

			}
		});
		btn_Total.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Total.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Total.setBackground(new Color(245, 222, 179));
		btn_Total.setBounds(133, 392, 128, 26);
		getContentPane().add(btn_Total);

		JButton btn_Cart = new JButton("Proceed to Payment");
		btn_Cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(txtSubtotal.getText().equals("0.00") || txtSubtotal.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_burger.this.setVisible(true);
				}

				else {
					c.openPayMethod(tot);	
					panel_burger.this.dispose();
				}
			}
		});
		btn_Cart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btn_Cart.setBorderPainted(false);
		btn_Cart.setBackground(Color.RED);
		btn_Cart.setBounds(263, 660, 337, 37);
		getContentPane().add(btn_Cart);

		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					panel_burger.this.dispose();
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
		getContentPane().add(btn_exit);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 3, 3, (Color) new Color(222, 184, 135)));
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(10, 73, 850, 405);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel pic_burger1 = new JLabel("");
		pic_burger1.setBounds(56, 10, 120, 120);
		panel.add(pic_burger1);
		pic_burger1.setIcon(new ImageIcon("img/burger1.jpg"));

		JLabel pic_burger2 = new JLabel("");
		pic_burger2.setBounds(206, 10, 120, 120);
		panel.add(pic_burger2);
		pic_burger2.setIcon(new ImageIcon("img/burger2.jpg"));

		JLabel pic_burger3 = new JLabel("");
		pic_burger3.setBounds(359, 10, 120, 120);
		panel.add(pic_burger3);
		pic_burger3.setIcon(new ImageIcon("img/burger3.jpg"));

		JLabel pic_burger4 = new JLabel("");
		pic_burger4.setBounds(506, 10, 120, 120);
		panel.add(pic_burger4);
		pic_burger4.setIcon(new ImageIcon("img/burger4.jpg"));

		JLabel pic_burger5 = new JLabel("");
		pic_burger5.setBounds(657, 10, 120, 120);
		panel.add(pic_burger5);
		pic_burger5.setIcon(new ImageIcon("img/burger5.jpg"));

		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setColumns(10);
		txt_Total.setBounds(255, 320, 128, 26);
		panel.add(txt_Total);

		JLabel lblOrderId = new JLabel("Order ID :");
		lblOrderId.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblOrderId.setBounds(434, 320, 79, 26);
		panel.add(lblOrderId);

		JLabel order_id = new JLabel("WFB01");
		order_id.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		order_id.setBounds(511, 320, 79, 26);
		panel.add(order_id);

		JButton btn_Add = new JButton("Add to Cart");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_Total.getText().equals("0.0") || txt_Total.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_burger.this.setVisible(true);
				}
				else {
					DefaultTableModel model = (DefaultTableModel) table_Cart.getModel();
					model.addRow(new Object[] { order_id.getText(), cmb_burger.getSelectedItem(), cmb_sides.getSelectedItem(), cmb_drink.getSelectedItem(),
							cmb_custom.getSelectedItem(), spinner_custom.getValue().toString(), spinner_quantity.getValue(), txt_Total.getText(),

					});
				}
			}
		});
		btn_Add.setForeground(Color.BLACK);
		btn_Add.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btn_Add.setBorderPainted(false);
		btn_Add.setBackground(new Color(220, 220, 220));
		btn_Add.setBounds(329, 357, 179, 36);
		panel.add(btn_Add);

		JButton btn_burger = new JButton("WFBurger");
		btn_burger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openBurger();
				panel_burger.this.dispose();
			}
		});
		btn_burger.setForeground(new Color(0, 0, 0));
		btn_burger.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_burger.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_burger.setBorderPainted(false);
		btn_burger.setBackground(new Color(255, 222, 173));
		btn_burger.setBounds(21, 11, 160, 55);
		contentPane.add(btn_burger);
		btn_burger.setIcon(new ImageIcon ("img/burger.png"));		

		JButton btn_pasta = new JButton("GoodPasta");
		btn_pasta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openPasta();
				panel_burger.this.dispose();
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
				panel_burger.this.dispose();
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
				panel_burger.this.dispose();
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
				panel_burger.this.dispose();
			}
		});
		btn_drink.setForeground(new Color(0, 0, 0));
		btn_drink.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_drink.setBorderPainted(false);
		btn_drink.setBackground(new Color(255, 235, 205));
		btn_drink.setBounds(682, 11, 160, 55);
		contentPane.add(btn_drink);
		btn_drink.setIcon(new ImageIcon ("img/drink.png"));		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 488, 850, 126);
		contentPane.add(scrollPane);

		table_Cart = new JTable();
		scrollPane.setViewportView(table_Cart);
		table_Cart.setOpaque(false);
		table_Cart.setRequestFocusEnabled(false);
		table_Cart.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Order ID", "Burger", "Sides", "Drinks", "Custom", "Cust. Size", "Quantity", "Total (RM)"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_Cart.getColumnModel().getColumn(0).setResizable(false);
		table_Cart.getColumnModel().getColumn(1).setResizable(false);
		table_Cart.getColumnModel().getColumn(2).setResizable(false);
		table_Cart.getColumnModel().getColumn(3).setResizable(false);
		table_Cart.getColumnModel().getColumn(4).setResizable(false);
		table_Cart.getColumnModel().getColumn(5).setResizable(false);
		table_Cart.getColumnModel().getColumn(6).setResizable(false);

		JButton btn_Subtotal = new JButton("SUBTOTAL (RM) :");
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

		btn_Subtotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("0.00");
				int row = table_Cart.getRowCount();

				for(int i=0; i<row; i++) {
					double val = Double.valueOf(table_Cart.getValueAt(i, 7).toString());
					tot += val;
				}
				txtSubtotal.setText(Double.toString(tot));
				txtSubtotal.setText(df.format(tot));
			}
		});

		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(839, 496, 21, 118);
		contentPane.add(scrollbar);

	}
}

