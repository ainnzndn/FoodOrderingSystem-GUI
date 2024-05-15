package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;

public class panel_cake extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Total;
	private int totalcakes;
	private JTable table_Cart;
	private JTextField txtSubtotal;
	private String sprinkles, addon;
	private double tot;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void ScreenCake() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel_cake frame = new panel_cake();
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
	public panel_cake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JButton btn_Cart = new JButton("Proceed to Payment");
		btn_Cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(txtSubtotal.getText().equals("0.00") || txtSubtotal.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_cake.this.setVisible(true);
				}

				else {

					c.openPayMethod(tot);
					panel_cake.this.dispose();
				}
			}
		});
		btn_Cart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btn_Cart.setBorderPainted(false);
		btn_Cart.setBackground(Color.RED);
		btn_Cart.setBounds(264, 663, 337, 37);
		getContentPane().add(btn_Cart);


		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					panel_cake.this.dispose();
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

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(10, 73, 850, 405);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel pic_cake1 = new JLabel("");
		pic_cake1.setBounds(53, 10, 120, 120);
		panel_1.add(pic_cake1);
		pic_cake1.setIcon(new ImageIcon("img/cake1.jpg"));

		JLabel pic_cake2 = new JLabel("");
		pic_cake2.setBounds(203, 10, 120, 120);
		panel_1.add(pic_cake2);
		pic_cake2.setIcon(new ImageIcon("img/cake2.jpg"));

		JLabel pic_cake3 = new JLabel("");
		pic_cake3.setBounds(356, 10, 120, 120);
		panel_1.add(pic_cake3);
		pic_cake3.setIcon(new ImageIcon("img/cake3.jpg"));

		JLabel pic_cake4 = new JLabel("");
		pic_cake4.setBounds(503, 10, 120, 120);
		panel_1.add(pic_cake4);
		pic_cake4.setIcon(new ImageIcon("img/cake4.jpg"));

		JLabel pic_cake5 = new JLabel("");
		pic_cake5.setBounds(654, 10, 120, 120);
		panel_1.add(pic_cake5);
		pic_cake5.setIcon(new ImageIcon("img/cake5.jpg"));

		JButton btn_Add = new JButton("Add to Cart");
		btn_Add.setForeground(Color.BLACK);
		btn_Add.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btn_Add.setBorderPainted(false);
		btn_Add.setBackground(new Color(220, 220, 220));
		btn_Add.setBounds(334, 359, 179, 36);
		panel_1.add(btn_Add);

		JLabel lbl_cake1 = new JLabel("NewYork Cheesecake");
		lbl_cake1.setBounds(53, 130, 126, 13);
		panel_1.add(lbl_cake1);
		lbl_cake1.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lbl_price1 = new JLabel("S: RM12.50");
		lbl_price1.setBounds(55, 148, 120, 13);
		panel_1.add(lbl_price1);
		lbl_price1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price1.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_price11 = new JLabel("W: RM120.00");
		lbl_price11.setBounds(55, 165, 120, 13);
		panel_1.add(lbl_price11);
		lbl_price11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price11.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_price2 = new JLabel("W: RM125.00");
		lbl_price2.setBounds(204, 165, 120, 13);
		panel_1.add(lbl_price2);
		lbl_price2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price2.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_price3 = new JLabel("S: RM13.00");
		lbl_price3.setBounds(204, 148, 120, 13);
		panel_1.add(lbl_price3);
		lbl_price3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price3.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_cake2 = new JLabel("Tiramisu Cake");
		lbl_cake2.setBounds(224, 130, 87, 13);
		panel_1.add(lbl_cake2);
		lbl_cake2.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lbl_price5 = new JLabel("S: RM10.50");
		lbl_price5.setBounds(355, 149, 120, 13);
		panel_1.add(lbl_price5);
		lbl_price5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price5.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_price4 = new JLabel("W: RM101.00");
		lbl_price4.setBounds(355, 166, 120, 13);
		panel_1.add(lbl_price4);
		lbl_price4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price4.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_cake3 = new JLabel("Fruit Cake");
		lbl_cake3.setBounds(388, 130, 63, 13);
		panel_1.add(lbl_cake3);
		lbl_cake3.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lbl_price7 = new JLabel("S: RM11.50");
		lbl_price7.setBounds(505, 149, 120, 13);
		panel_1.add(lbl_price7);
		lbl_price7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price7.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_price6 = new JLabel("W: RM110.50");
		lbl_price6.setBounds(505, 166, 120, 13);
		panel_1.add(lbl_price6);
		lbl_price6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price6.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_cake4 = new JLabel("Black Forest Cake");
		lbl_cake4.setBounds(515, 131, 102, 13);
		panel_1.add(lbl_cake4);
		lbl_cake4.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lbl_cake5 = new JLabel("Indulgence Cake");
		lbl_cake5.setBounds(670, 131, 93, 13);
		panel_1.add(lbl_cake5);
		lbl_cake5.setFont(new Font("Arial", Font.PLAIN, 12));

		JLabel lbl_price9 = new JLabel("S: RM13.50");
		lbl_price9.setBounds(655, 150, 120, 13);
		panel_1.add(lbl_price9);
		lbl_price9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price9.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_price8 = new JLabel("W: RM130.00");
		lbl_price8.setBounds(655, 167, 120, 13);
		panel_1.add(lbl_price8);
		lbl_price8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price8.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lbl_cake = new JLabel("Cake Choice :");
		lbl_cake.setBounds(90, 193, 119, 33);
		panel_1.add(lbl_cake);
		lbl_cake.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JComboBox<String> cmb_cakes = new JComboBox<String>();
		cmb_cakes.setBounds(218, 195, 337, 28);
		panel_1.add(cmb_cakes);
		cmb_cakes.setModel(new DefaultComboBoxModel<String>(new String[] {"(Select your desired menu)", "NewYork Cheesecake (S)", "NewYork Cheesecake (W)", "Tiramisu Cake (S)", "Tiramisu Cake (W)", "Fruit Cake (S)", "Fruit Cake (W)", "Black Forest Cake (S)", "Black Forest Cake (W)", "Indulgence Cake (S)", "Indulgence Cake (W)"}));
		cmb_cakes.setToolTipText("");
		cmb_cakes.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JLabel lblDrink = new JLabel("Drink :");
		lblDrink.setBounds(90, 226, 69, 33);
		panel_1.add(lblDrink);
		lblDrink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JComboBox<String> cmb_drink = new JComboBox<String>();
		cmb_drink.setBounds(218, 228, 244, 28);
		panel_1.add(cmb_drink);
		cmb_drink.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "Mineral Water", "Hot Tea", "Hot Coffee", "Iced Tea", "Iced Coffee"}));
		cmb_drink.setToolTipText("");
		cmb_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JLabel lblSizeChoice = new JLabel("Sprinkle Choice :");
		lblSizeChoice.setBounds(90, 261, 119, 26);
		panel_1.add(lblSizeChoice);
		lblSizeChoice.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JRadioButton rdbtnRainbow = new JRadioButton("Rainbow");
		rdbtnRainbow.setBounds(218, 262, 93, 21);
		panel_1.add(rdbtnRainbow);
		rdbtnRainbow.setBackground(new Color(253, 245, 230));
		rdbtnRainbow.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JRadioButton rdbtnStars = new JRadioButton("Golden Stars");
		rdbtnStars.setBounds(313, 262, 119, 21);
		panel_1.add(rdbtnStars);
		rdbtnStars.setBackground(new Color(253, 245, 230));
		rdbtnStars.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JRadioButton rdbtnHearts = new JRadioButton("Cute Hearts");
		rdbtnHearts.setBounds(434, 262, 107, 21);
		panel_1.add(rdbtnHearts);
		rdbtnHearts.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		rdbtnHearts.setBackground(new Color(253, 245, 230));

		JSpinner spinner_quantity = new JSpinner();
		spinner_quantity.setBounds(218, 290, 69, 26);
		panel_1.add(spinner_quantity);
		spinner_quantity.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner_quantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setBounds(90, 290, 81, 26);
		panel_1.add(lblQuantity);
		lblQuantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));

		JButton btn_Total = new JButton("TOTAL (RM) :");
		btn_Total.setBounds(83, 323, 128, 26);
		panel_1.add(btn_Total);
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cmb_cakes.getSelectedItem();
				DecimalFormat df = new DecimalFormat ("0.00");
				double total=0.00;
				totalcakes =(int)spinner_quantity.getValue();

				if (selectedItem.equals("NewYork Cheesecake (S)")) {
					total=total+12.50*totalcakes;
				}
				else if (selectedItem.equals("NewYork Cheesecake (W)")) {
					total=total+120.00*totalcakes;
				}
				else if (selectedItem.equals("Tiramisu Cake (S)")) {
					total=total+13.00*totalcakes;
				}
				else if (selectedItem.equals("Tiramisu Cake (W)")) {
					total=total+125.00*totalcakes;
				}
				else if (selectedItem.equals("Fruit Cake (S)")) {
					total=total+10.90*totalcakes;
				}
				else if (selectedItem.equals("Fruit Cake (W)")) {
					total=total+101.00*totalcakes;
				}
				else if (selectedItem.equals("Black Forest Cake (S)")) {
					total=total+11.50*totalcakes;
				}
				else if (selectedItem.equals("Black Forest Cake (W)")) {
					total=total+110.50*totalcakes;
				}
				else if (selectedItem.equals("Indulgence Cake (S)")) {
					total=total+13.50*totalcakes;
				}
				else if (selectedItem.equals("Indulgence Cake (W)")) {
					total=total+130.00*totalcakes;
				}
				txt_Total.setText(Double.toString(total));
				txt_Total.setText(df.format(total));

			}
		});
		btn_Total.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Total.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Total.setBackground(new Color(253, 245, 230));

		txt_Total = new JTextField();
		txt_Total.setBounds(218, 323, 128, 26);
		panel_1.add(txt_Total);
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setColumns(10);

		JPanel rdbtn_group = new JPanel();
		rdbtn_group.setBackground(new Color(253, 245, 230));
		rdbtn_group.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_group.setBounds(214, 257, 327, 30);
		panel_1.add(rdbtn_group);
		GroupLayout gl_rdbtn_group = new GroupLayout(rdbtn_group);
		gl_rdbtn_group.setHorizontalGroup(
				gl_rdbtn_group.createParallelGroup(Alignment.LEADING)
				.addGap(0, 351, Short.MAX_VALUE)
				);
		gl_rdbtn_group.setVerticalGroup(
				gl_rdbtn_group.createParallelGroup(Alignment.LEADING)
				.addGap(0, 36, Short.MAX_VALUE)
				);
		rdbtn_group.setLayout(gl_rdbtn_group);

		JPanel panel = new JPanel();
		panel.setBounds(615, 196, 148, 153);
		panel_1.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(255, 235, 205));

		JLabel lblProteinOfChoice = new JLabel("Add-ons :");
		lblProteinOfChoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblProteinOfChoice.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		lblProteinOfChoice.setBounds(10, 6, 128, 25);
		panel.add(lblProteinOfChoice);

		JCheckBox add1 = new JCheckBox("Candles");
		add1.setForeground(Color.BLACK);
		add1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add1.setBackground(new Color(255, 235, 205));
		add1.setBounds(6, 37, 105, 21);
		panel.add(add1);

		JCheckBox add2 = new JCheckBox("Birthday Wishes");
		add2.setForeground(Color.BLACK);
		add2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add2.setBackground(new Color(255, 235, 205));
		add2.setBounds(6, 61, 124, 21);
		panel.add(add2);

		JCheckBox add3 = new JCheckBox("Butter Cream");
		add3.setForeground(Color.BLACK);
		add3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add3.setBackground(new Color(255, 235, 205));
		add3.setBounds(6, 85, 124, 21);
		panel.add(add3);

		JCheckBox add4 = new JCheckBox("Confetti");
		add4.setForeground(Color.BLACK);
		add4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add4.setBackground(new Color(255, 235, 205));
		add4.setBounds(6, 109, 105, 21);
		panel.add(add4);

		JLabel lblOrderId = new JLabel("Order ID :");
		lblOrderId.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblOrderId.setBounds(399, 323, 79, 26);
		panel_1.add(lblOrderId);

		JLabel order_id = new JLabel("LLC01");
		order_id.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		order_id.setBounds(476, 323, 79, 26);
		panel_1.add(order_id);

		add1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add1.isSelected()) {
					add2.setSelected(false);
					add3.setSelected(false);
					add4.setSelected(false);
				}
			}
		});

		add2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add2.isSelected()) {
					add1.setSelected(false);
					add3.setSelected(false);
					add4.setSelected(false);
				}
			}
		});

		add3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add3.isSelected()) {
					add1.setSelected(false);
					add2.setSelected(false);
					add4.setSelected(false);
				}
			}
		});

		add4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (add4.isSelected()) {
					add1.setSelected(false);
					add2.setSelected(false);
					add3.setSelected(false);
				}
			}
		});

		rdbtnHearts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnHearts.isSelected()) {
					rdbtnStars.setSelected(false);
					rdbtnRainbow.setSelected(false);
				}
			}
		});

		rdbtnStars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnStars.isSelected()) {
					rdbtnRainbow.setSelected(false);
					rdbtnHearts.setSelected(false);
				}
			}
		});

		rdbtnRainbow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnRainbow.isSelected()) {
					rdbtnStars.setSelected(false);
					rdbtnHearts.setSelected(false);
				}
			}
		});

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
						"Order ID", "Cake", "Drink", "Sprinkles", "Quantity", "Add-ons", "Total (RM)"
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
		table_Cart.getColumnModel().getColumn(2).setResizable(false);
		table_Cart.getColumnModel().getColumn(3).setResizable(false);
		table_Cart.getColumnModel().getColumn(4).setResizable(false);
		table_Cart.getColumnModel().getColumn(5).setResizable(false);

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
				panel_cake.this.dispose();
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
				panel_cake.this.dispose();
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
				panel_cake.this.dispose();
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
				panel_cake.this.dispose();
			}
		});
		btn_cake.setForeground(new Color(0, 0, 0));
		btn_cake.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_cake.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_cake.setBorderPainted(false);
		btn_cake.setBackground(new Color(255, 222, 173));
		btn_cake.setBounds(517, 11, 160, 55);
		contentPane.add(btn_cake);
		btn_cake.setIcon(new ImageIcon ("img/cake.png"));		

		JButton btn_drink = new JButton("Koolcup");
		btn_drink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openDrink();
				panel_cake.this.dispose();
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

		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_Total.getText().equals("0.0") || txt_Total.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_cake.this.setVisible(true);
				}

				else { DefaultTableModel model = (DefaultTableModel) table_Cart.getModel();
				if (rdbtnHearts.isSelected()) { 
					sprinkles = "Cute Hearts";
				}
				else if (rdbtnRainbow.isSelected()) {
					sprinkles = "Rainbows";
				}
				else if (rdbtnStars.isSelected()) {
					sprinkles = "Golden Stars";
				}

				if (add1.isSelected()) {
					addon = "Candles";
				}
				else if (add2.isSelected()) {
					addon = "Birthday Wishes";
				}
				else if (add3.isSelected()) {
					addon = "Butter Cream";
				}
				else if (add4.isSelected()) {
					addon = "Confetti";
				}

				model.addRow(new Object[] {order_id.getText(), cmb_cakes.getSelectedItem(), cmb_drink.getSelectedItem(), sprinkles, addon, 
						spinner_quantity.getValue().toString(),txt_Total.getText(), 
				});
				}
			}
		});

	}
}
