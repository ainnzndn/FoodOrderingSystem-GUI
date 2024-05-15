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

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.SpinnerListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class panel_pizza extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Total;
	private int totalpizza;
	private double price = 0;
	double totaladdon, total=0.00;
	private JTable table_Cart;
	private JTextField txtSubtotal;
	private String protein1, protein2, protein3, protein4, protein5, protein6, protein7, protein8;
	private JTable table_Addon;
	private double tot;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void ScreenPizza() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel_pizza frame = new panel_pizza();
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
	public panel_pizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 700);
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
					panel_pizza.this.dispose();
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
		panel.setLayout(null);
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(10, 73, 850, 395);
		contentPane.add(panel);

		JLabel lbl_cake = new JLabel("Choice of Pizza :");
		lbl_cake.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lbl_cake.setBounds(95, 184, 119, 33);
		panel.add(lbl_cake);

		JComboBox<String> cmb_pizza = new JComboBox<String>();
		cmb_pizza.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose your desired menu)", "Extravaganzza", "Ultimate Hawaiian", "Smoky Pepperoni", "Simply Cheese", "Smoky Beef & Chick"}));
		cmb_pizza.setToolTipText("");
		cmb_pizza.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_pizza.setBounds(214, 184, 326, 28);
		panel.add(cmb_pizza);

		JLabel lbl_pizza1 = new JLabel("Extravaganza");
		lbl_pizza1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pizza1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pizza1.setBounds(75, 135, 97, 13);
		panel.add(lbl_pizza1);

		JLabel lbl_pizza2 = new JLabel("Ultimate Hawaiian");
		lbl_pizza2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_pizza2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pizza2.setBounds(223, 135, 104, 13);
		panel.add(lbl_pizza2);

		JLabel lbl_pizza3 = new JLabel("Smoky Pepperoni");
		lbl_pizza3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_pizza3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pizza3.setBounds(377, 135, 97, 13);
		panel.add(lbl_pizza3);

		JLabel lbl_pizza4 = new JLabel("Simply Cheese");
		lbl_pizza4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_pizza4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pizza4.setBounds(531, 136, 88, 13);
		panel.add(lbl_pizza4);

		JLabel lbl_pizza5 = new JLabel("Smoky Beef & Chick");
		lbl_pizza5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pizza5.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pizza5.setBounds(662, 136, 120, 13);
		panel.add(lbl_pizza5);

		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setColumns(10);
		txt_Total.setBounds(215, 316, 132, 26);
		panel.add(txt_Total);

		JLabel lbl_price1 = new JLabel("RM35.90");
		lbl_price1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price1.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price1.setBounds(85, 153, 82, 13);
		panel.add(lbl_price1);

		JLabel lbl_price2 = new JLabel("RM36.90");
		lbl_price2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price2.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price2.setBounds(237, 153, 70, 13);
		panel.add(lbl_price2);

		JLabel lbl_price3 = new JLabel("RM33.90");
		lbl_price3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_price3.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price3.setBounds(391, 153, 68, 13);
		panel.add(lbl_price3);

		JLabel lbl_price4 = new JLabel("RM32.90");
		lbl_price4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_price4.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price4.setBounds(543, 152, 58, 13);
		panel.add(lbl_price4);

		JLabel lbl_price5 = new JLabel("RM35.90");
		lbl_price5.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_price5.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price5.setBounds(692, 152, 64, 13);
		panel.add(lbl_price5);

		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblQuantity.setBounds(95, 279, 70, 33);
		panel.add(lblQuantity);

		JLabel lblCrust = new JLabel("Choice of Crust :");
		lblCrust.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblCrust.setBounds(93, 217, 132, 33);
		panel.add(lblCrust);

		JComboBox<String> cmb_crust = new JComboBox<String>();
		cmb_crust.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "Hand Tossed", "Pan Crust", "Thin Crust", "New York Crust"}));
		cmb_crust.setToolTipText("");
		cmb_crust.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_crust.setBounds(214, 217, 240, 28);
		panel.add(cmb_crust);

		JSpinner spinner_quantity = new JSpinner();
		spinner_quantity.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner_quantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spinner_quantity.setBounds(214, 283, 73, 26);
		panel.add(spinner_quantity);

		JLabel lblDrink = new JLabel("Side Order :");
		lblDrink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblDrink.setBounds(95, 250, 132, 33);
		panel.add(lblDrink);

		JComboBox<String> cmb_sides = new JComboBox<String>();
		cmb_sides.setModel(new DefaultComboBoxModel(new String[] {"(Please choose)", "Garlic Bread", "GarlicStix", "CinnaStix", "Mushroom Soup", "BBQ Meatball"}));
		cmb_sides.setToolTipText("");
		cmb_sides.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_sides.setBounds(213, 250, 241, 28);
		panel.add(cmb_sides);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBounds(566, 184, 217, 140);
		panel.add(panel_1);

		JLabel lblProteinOfChoice = new JLabel("Add-ons (RM2 each) :");
		lblProteinOfChoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblProteinOfChoice.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		lblProteinOfChoice.setBounds(31, 6, 158, 25);
		panel_1.add(lblProteinOfChoice);

		JCheckBox chckbxMincedChick = new JCheckBox("Minced Chicken");
		chckbxMincedChick.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxMincedChick.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});		
		chckbxMincedChick.setForeground(Color.BLACK);
		chckbxMincedChick.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxMincedChick.setBackground(new Color(255, 235, 205));
		chckbxMincedChick.setBounds(6, 37, 105, 21);
		panel_1.add(chckbxMincedChick);

		JCheckBox chckbxMincedBeef = new JCheckBox("Minced Beef");
		chckbxMincedBeef.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxMincedBeef.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxMincedBeef.setForeground(Color.BLACK);
		chckbxMincedBeef.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxMincedBeef.setBackground(new Color(255, 235, 205));
		chckbxMincedBeef.setBounds(6, 85, 105, 21);
		panel_1.add(chckbxMincedBeef);

		JCheckBox chckbxBeefPepperoni = new JCheckBox("Beef Pepperoni");
		chckbxBeefPepperoni.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxBeefPepperoni.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxBeefPepperoni.setForeground(Color.BLACK);
		chckbxBeefPepperoni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxBeefPepperoni.setBackground(new Color(255, 235, 205));
		chckbxBeefPepperoni.setBounds(6, 109, 105, 21);
		panel_1.add(chckbxBeefPepperoni);

		JCheckBox chckbxMozzarella = new JCheckBox("Mozzarella");
		chckbxMozzarella.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxMozzarella.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxMozzarella.setForeground(Color.BLACK);
		chckbxMozzarella.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxMozzarella.setBackground(new Color(255, 235, 205));
		chckbxMozzarella.setBounds(128, 37, 105, 21);
		panel_1.add(chckbxMozzarella);

		JCheckBox chckbxOlives = new JCheckBox("Olives");
		chckbxOlives.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxOlives.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxOlives.setForeground(Color.BLACK);
		chckbxOlives.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxOlives.setBackground(new Color(255, 235, 205));
		chckbxOlives.setBounds(128, 61, 105, 21);
		panel_1.add(chckbxOlives);

		JCheckBox chckbxAnchovies = new JCheckBox("Anchovies");
		chckbxAnchovies.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxAnchovies.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxAnchovies.setForeground(Color.BLACK);
		chckbxAnchovies.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxAnchovies.setBackground(new Color(255, 235, 205));
		chckbxAnchovies.setBounds(128, 85, 105, 21);
		panel_1.add(chckbxAnchovies);

		JCheckBox chckbxPineapple = new JCheckBox("Pineapple");
		chckbxPineapple.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxPineapple.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxPineapple.setForeground(Color.BLACK);
		chckbxPineapple.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxPineapple.setBackground(new Color(255, 235, 205));
		chckbxPineapple.setBounds(128, 109, 105, 21);
		panel_1.add(chckbxPineapple);

		JCheckBox chckbxChickenPepperoni = new JCheckBox("Chicken Pepperoni");
		chckbxChickenPepperoni.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxChickenPepperoni.isSelected()) {
					price += 2;
					total += price;
				} else {
					price -= 2;
					total -= price;
				}
			}
		});
		chckbxChickenPepperoni.setForeground(Color.BLACK);
		chckbxChickenPepperoni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxChickenPepperoni.setBackground(new Color(255, 235, 205));
		chckbxChickenPepperoni.setBounds(6, 61, 131, 21);
		panel_1.add(chckbxChickenPepperoni);

		JButton btn_Total = new JButton("TOTAL (RM) :");
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cmb_pizza.getSelectedItem();
				DecimalFormat df = new DecimalFormat ("0.00");
				totalpizza =(int)spinner_quantity.getValue();

				if (selectedItem.equals("Extravaganzza")) {
					total=(35.90*totalpizza)+price;
				}
				else if (selectedItem.equals("Ultimate Hawaiian")) {
					total=(36.90*totalpizza)+price;
				}
				else if (selectedItem.equals("Smoky Pepperoni")) {
					total=(33.90*totalpizza)+price;
				}
				else if (selectedItem.equals("Simply Cheese")) {
					total=(32.90*totalpizza)+price;
				}
				else if (selectedItem.equals("Simply Beef & Chick")) {
					total=(35.90*totalpizza)+price;

				}
				txt_Total.setText(Double.toString(total));
				txt_Total.setText(df.format(total));

			}
		});
		btn_Total.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Total.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Total.setBackground(new Color(245, 222, 179));
		btn_Total.setBounds(85, 316, 128, 26);
		panel.add(btn_Total);

		JLabel pic_pizza1 = new JLabel("");
		pic_pizza1.setBounds(62, 10, 120, 120);
		panel.add(pic_pizza1);
		pic_pizza1.setIcon(new ImageIcon("img/pizza1.jpg"));

		JLabel pic_pizza2 = new JLabel("");
		pic_pizza2.setBounds(213, 10, 120, 120);
		panel.add(pic_pizza2);
		pic_pizza2.setIcon(new ImageIcon("img/pizza2.jpg"));

		JLabel pic_pizza3 = new JLabel("");
		pic_pizza3.setBounds(364, 10, 120, 120);
		panel.add(pic_pizza3);
		pic_pizza3.setIcon(new ImageIcon("img/pizza3.jpg"));

		JLabel pic_pizza4 = new JLabel("");
		pic_pizza4.setBounds(512, 10, 120, 120);
		panel.add(pic_pizza4);
		pic_pizza4.setIcon(new ImageIcon("img/pizza4.jpg"));

		JLabel pic_pizza5 = new JLabel("");
		pic_pizza5.setBounds(663, 10, 120, 120);
		panel.add(pic_pizza5);
		pic_pizza5.setIcon(new ImageIcon("img/pizza5.jpg"));

		JLabel lblOrderId = new JLabel("Order ID :");
		lblOrderId.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblOrderId.setBounds(384, 316, 79, 26);
		panel.add(lblOrderId);

		JLabel order_id = new JLabel("MPZ01");
		order_id.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		order_id.setBounds(461, 316, 79, 26);
		panel.add(order_id);

		JButton btn_Add = new JButton("Add to Cart");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_Total.getText().equals("0.0") || txt_Total.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_pizza.this.setVisible(true);
				}
				else {
					DefaultTableModel model = (DefaultTableModel) table_Cart.getModel();
					DefaultTableModel model2 = (DefaultTableModel) table_Addon.getModel();

					if (chckbxMincedChick.isSelected()) { 
						protein1 = "Minced Chicken";
					}
					if (chckbxMincedBeef.isSelected()) {
						protein2 = "Minced Beef";
					}
					if (chckbxBeefPepperoni.isSelected()) {
						protein3 = "Beef Pepperoni";
					}
					if (chckbxChickenPepperoni.isSelected()) {
						protein4 = "ChickenPepperoni";
					}
					if (chckbxAnchovies.isSelected()) {
						protein5 = "Anchovies";
					}
					if (chckbxPineapple.isSelected()) {
						protein6 = "Pineapple";
					}
					if (chckbxOlives.isSelected()) {
						protein7 = "Olives";
					}
					if (chckbxMozzarella.isSelected()) {
						protein8 = "Mozzarella";
					}

					model.addRow(new Object[] {order_id.getText(), cmb_pizza.getSelectedItem(), cmb_crust.getSelectedItem(), cmb_sides.getSelectedItem(),
							spinner_quantity.getValue().toString(),txt_Total.getText()
					});

					model2.addRow(new Object[] {protein1, protein2, protein3, protein4, protein5, protein6, protein7, protein8 
					});
				}
			}
		});
		btn_Add.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btn_Add.setForeground(new Color(0, 0, 0));
		btn_Add.setBorderPainted(false);
		btn_Add.setBackground(new Color(220, 220, 220));
		btn_Add.setBounds(340, 351, 179, 36);
		panel.add(btn_Add);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 478, 850, 62);
		contentPane.add(scrollPane);

		table_Cart = new JTable();
		scrollPane.setViewportView(table_Cart);
		table_Cart.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Order ID", "Pizza", "Crust", "Side", "Quantity", "Total (RM)"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					true, true, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_Cart.getColumnModel().getColumn(4).setResizable(false);
		table_Cart.setRequestFocusEnabled(false);
		table_Cart.setOpaque(false);

		JButton btn_Subtotal = new JButton("SUBTOTAL (RM) :");
		btn_Subtotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("0.00");
				int row = table_Cart.getRowCount();

				for(int i=0; i<row; i++) {
					double val = Double.valueOf(table_Cart.getValueAt(i, 5).toString());
					tot += val;
				}
				txtSubtotal.setText(Double.toString(tot));
				txtSubtotal.setText(df.format(tot));
			}
		});
		btn_Subtotal.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Subtotal.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Subtotal.setBackground(new Color(245, 222, 179));
		btn_Subtotal.setBounds(293, 617, 148, 26);
		contentPane.add(btn_Subtotal);

		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Arial", Font.BOLD, 15));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(444, 617, 128, 26);
		contentPane.add(txtSubtotal);

		JButton btn_Cart = new JButton("Proceed to Payment");
		btn_Cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(txtSubtotal.getText().equals("0.00") || txtSubtotal.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_pizza.this.setVisible(true);
				}

				else {
					c.openPayMethod(tot);	
					panel_pizza.this.dispose();
				}
			}
		});
		btn_Cart.setBounds(265, 651, 337, 37);
		contentPane.add(btn_Cart);
		btn_Cart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btn_Cart.setBorderPainted(false);
		btn_Cart.setBackground(Color.RED);


		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 547, 850, 60);
		contentPane.add(scrollPane_1);

		table_Addon = new JTable();
		scrollPane_1.setViewportView(table_Addon);
		table_Addon.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Add-on", "Add-on", "Add-on", "Add-on", "Add-on", "Add-on", "Add-on", "Add-on"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_Addon.getColumnModel().getColumn(0).setResizable(false);
		table_Addon.getColumnModel().getColumn(1).setResizable(false);
		table_Addon.getColumnModel().getColumn(2).setResizable(false);
		table_Addon.getColumnModel().getColumn(3).setResizable(false);
		table_Addon.getColumnModel().getColumn(4).setResizable(false);
		table_Addon.getColumnModel().getColumn(5).setResizable(false);
		table_Addon.getColumnModel().getColumn(6).setResizable(false);
		table_Addon.getColumnModel().getColumn(7).setResizable(false);
		table_Addon.setRequestFocusEnabled(false);
		table_Addon.setOpaque(false);

		JButton btn_burger = new JButton("WFBurger");
		btn_burger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openBurger();
				panel_pizza.this.dispose();
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
				panel_pizza.this.dispose();
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
				panel_pizza.this.dispose();
			}
		});
		btn_pizza.setForeground(new Color(0, 0, 0));
		btn_pizza.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_pizza.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_pizza.setBorderPainted(false);
		btn_pizza.setBackground(new Color(255, 222, 173));
		btn_pizza.setBounds(352, 11, 160, 55);
		contentPane.add(btn_pizza);
		btn_pizza.setIcon(new ImageIcon ("img/pizza.png"));		

		JButton btn_cake = new JButton("Lily Cakes");
		btn_cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openCake();
				panel_pizza.this.dispose();
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
				panel_pizza.this.dispose();
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

		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
