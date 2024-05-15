package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class panel_pasta extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Total;
	private JTable table_Cart;
	private JTextField txtSubtotal;
	private int totalpasta;
	private String protein;
	private double tot;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void ScreenPasta() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel_pasta frame = new panel_pasta();
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
	public panel_pasta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_cake = new JLabel("Pasta of Choice :");
		lbl_cake.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lbl_cake.setBounds(69, 261, 119, 33);
		contentPane.add(lbl_cake);

		JComboBox<String> cmb_pasta = new JComboBox<String>();
		cmb_pasta.setModel(new DefaultComboBoxModel(new String[] {"(Choose your desired menu)", "Bolognese Meatball", "Creamy Alfredo", "Parmesan Aglio Olio", "Beef Bacon Carbonara", "Cheesy Lasagna"}));
		cmb_pasta.setBackground(new Color(255, 255, 255));
		cmb_pasta.setToolTipText("");
		cmb_pasta.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_pasta.setBounds(197, 263, 337, 28);
		contentPane.add(cmb_pasta);

		JLabel lbl_pasta1 = new JLabel("Bolognese  Meatball");
		lbl_pasta1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pasta1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pasta1.setBounds(71, 208, 115, 13);
		contentPane.add(lbl_pasta1);

		JLabel lbl_pasta2 = new JLabel("Creamy Alfredo");
		lbl_pasta2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pasta2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pasta2.setBounds(218, 208, 120, 13);
		contentPane.add(lbl_pasta2);

		JLabel lbl_pasta3 = new JLabel("Parmesan Aglio Olio");
		lbl_pasta3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pasta3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pasta3.setBounds(369, 208, 120, 13);
		contentPane.add(lbl_pasta3);

		JLabel lbl_pasta4 = new JLabel(" Beef Bacon Carbonara");
		lbl_pasta4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_pasta4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pasta4.setBounds(514, 209, 132, 13);
		contentPane.add(lbl_pasta4);

		JLabel lbl_pasta5 = new JLabel("Cheesy Lasagna");
		lbl_pasta5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pasta5.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pasta5.setBounds(675, 209, 99, 13);
		contentPane.add(lbl_pasta5);

		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Arial", Font.BOLD, 15));
		txt_Total.setColumns(10);
		txt_Total.setBounds(197, 393, 128, 26);
		contentPane.add(txt_Total);

		JLabel lbl_price1 = new JLabel("RM21.90");
		lbl_price1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price1.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price1.setBounds(69, 226, 120, 13);
		contentPane.add(lbl_price1);

		JLabel lbl_price2 = new JLabel("RM22.90");
		lbl_price2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price2.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price2.setBounds(218, 226, 120, 13);
		contentPane.add(lbl_price2);

		JLabel lbl_price3 = new JLabel("RM24.90");
		lbl_price3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price3.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price3.setBounds(369, 227, 120, 13);
		contentPane.add(lbl_price3);

		JLabel lbl_price4 = new JLabel("RM23.90");
		lbl_price4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price4.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price4.setBounds(519, 227, 120, 13);
		contentPane.add(lbl_price4);

		JLabel lbl_price5 = new JLabel("RM18.90");
		lbl_price5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price5.setFont(new Font("Arial", Font.BOLD, 14));
		lbl_price5.setBounds(669, 227, 120, 13);
		contentPane.add(lbl_price5);

		JLabel lblToppings = new JLabel("Spice Level :");
		lblToppings.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblToppings.setBounds(69, 359, 101, 33);
		contentPane.add(lblToppings);

		JLabel lblAddons = new JLabel("Type of Pasta :");
		lblAddons.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblAddons.setBounds(69, 294, 107, 33);
		contentPane.add(lblAddons);

		JComboBox<String> cmb_type = new JComboBox<String>();
		cmb_type.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "Spaghetti", "Fettuccine", "Angel Hair", "Penne", "Spiral"}));
		cmb_type.setToolTipText("");
		cmb_type.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_type.setBounds(197, 296, 210, 28);
		contentPane.add(cmb_type);

		JLabel lblDrink = new JLabel("Drink :");
		lblDrink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblDrink.setBounds(69, 326, 51, 33);
		contentPane.add(lblDrink);

		JComboBox<String> cmb_drink = new JComboBox<String>();
		cmb_drink.setModel(new DefaultComboBoxModel<String>(new String[] {"(Please choose)", "Hot Tea", "Hot Coffee", "Iced Tea", "Iced Coffee", "Orange Juice", "Mineral Water"}));
		cmb_drink.setToolTipText("");
		cmb_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		cmb_drink.setBounds(197, 328, 188, 28);
		contentPane.add(cmb_drink);

		JSpinner spinner_spice = new JSpinner();
		spinner_spice.setModel(new SpinnerListModel(new String[] {"(Please choose)", "None", "Mild", "Regular ", "Spicy", "Extra Spicy"}));
		spinner_spice.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spinner_spice.setBounds(197, 362, 139, 26);
		contentPane.add(spinner_spice);

		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblQuantity.setBounds(345, 359, 72, 33);
		contentPane.add(lblQuantity);

		JSpinner spinner_quantity = new JSpinner();
		spinner_quantity.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner_quantity.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		spinner_quantity.setBounds(427, 362, 107, 26);
		contentPane.add(spinner_quantity);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(550, 262, 239, 156);
		contentPane.add(panel);

		JRadioButton rdMincC = new JRadioButton("Minced Chicken");
		rdMincC.setForeground(Color.BLACK);
		rdMincC.setFont(new Font("Arial", Font.PLAIN, 12));
		rdMincC.setBackground(new Color(255, 235, 205));
		rdMincC.setBounds(3, 33, 128, 21);
		panel.add(rdMincC);

		JLabel lblProteinOfChoice = new JLabel("Protein of Choice :");
		lblProteinOfChoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblProteinOfChoice.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		lblProteinOfChoice.setBounds(10, 4, 219, 25);
		panel.add(lblProteinOfChoice);

		JRadioButton rdMincB = new JRadioButton("Minced Beef");
		rdMincB.setForeground(Color.BLACK);
		rdMincB.setFont(new Font("Arial", Font.PLAIN, 12));
		rdMincB.setBackground(new Color(255, 235, 205));
		rdMincB.setBounds(130, 33, 109, 21);
		panel.add(rdMincB);

		JRadioButton rdCSlice = new JRadioButton("Chicken Slices");
		rdCSlice.setForeground(Color.BLACK);
		rdCSlice.setFont(new Font("Arial", Font.PLAIN, 12));
		rdCSlice.setBackground(new Color(255, 235, 205));
		rdCSlice.setBounds(3, 58, 128, 21);
		panel.add(rdCSlice);

		JRadioButton rdBSlice = new JRadioButton("Beef Slices");
		rdBSlice.setForeground(Color.BLACK);
		rdBSlice.setFont(new Font("Arial", Font.PLAIN, 12));
		rdBSlice.setBackground(new Color(255, 235, 205));
		rdBSlice.setBounds(130, 58, 109, 21);
		panel.add(rdBSlice);

		JRadioButton rdBPepperoni = new JRadioButton("Beef Pepperoni");
		rdBPepperoni.setForeground(Color.BLACK);
		rdBPepperoni.setFont(new Font("Arial", Font.PLAIN, 12));
		rdBPepperoni.setBackground(new Color(255, 235, 205));
		rdBPepperoni.setBounds(130, 83, 109, 21);
		panel.add(rdBPepperoni);

		JRadioButton rdCPepperoni = new JRadioButton("Chicken Pepperoni");
		rdCPepperoni.setForeground(Color.BLACK);
		rdCPepperoni.setFont(new Font("Arial", Font.PLAIN, 12));
		rdCPepperoni.setBackground(new Color(255, 235, 205));
		rdCPepperoni.setBounds(3, 83, 128, 21);
		panel.add(rdCPepperoni);

		rdMincC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdMincC.isSelected()) {
					rdMincB.setSelected(false);
					rdCSlice.setSelected(false);
					rdBSlice.setSelected(false);
					rdCPepperoni.setSelected(false);
					rdBPepperoni.setSelected(false);

				}
			}
		});

		rdMincB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdMincB.isSelected()) {
					rdMincC.setSelected(false);
					rdCSlice.setSelected(false);
					rdBSlice.setSelected(false);
					rdCPepperoni.setSelected(false);
					rdBPepperoni.setSelected(false);				
				}
			}
		});

		rdCSlice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdCSlice.isSelected()) {
					rdMincC.setSelected(false);
					rdMincB.setSelected(false);
					rdBSlice.setSelected(false);
					rdCPepperoni.setSelected(false);
					rdBPepperoni.setSelected(false);				
				}
			}
		});

		rdBSlice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdBSlice.isSelected()) {
					rdMincC.setSelected(false);
					rdMincB.setSelected(false);
					rdCSlice.setSelected(false);
					rdCPepperoni.setSelected(false);
					rdBPepperoni.setSelected(false);				
				}
			}
		});

		rdCPepperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdCPepperoni.isSelected()) {
					rdMincC.setSelected(false);
					rdMincB.setSelected(false);
					rdCSlice.setSelected(false);
					rdBSlice.setSelected(false);
					rdBPepperoni.setSelected(false);				
				}
			}
		});

		rdBPepperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdBPepperoni.isSelected()) {
					rdMincC.setSelected(false);
					rdMincB.setSelected(false);
					rdCSlice.setSelected(false);
					rdBSlice.setSelected(false);
					rdCPepperoni.setSelected(false);				
				}
			}
		});

		JButton btn_Total = new JButton("TOTAL (RM) :");
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cmb_pasta.getSelectedItem();
				DecimalFormat df = new DecimalFormat ("0.00");
				double total=0.00;
				totalpasta =(int)spinner_quantity.getValue();
				JFrame jf = new JFrame();

				if (selectedItem.equals("Bolognese Meatball")) {
					total=total+21.90*totalpasta;
				}
				else if (selectedItem.equals("Creamy Alfredo")) {
					total=total+22.90*totalpasta;
				}
				else if (selectedItem.equals("Parmesan Aglio Olio")) {
					total=total+24.90*totalpasta;
				}
				else if (selectedItem.equals("Beef Bacon Carbonara")) {
					total=total+23.90*totalpasta;
				}
				else if (selectedItem.equals("Cheesy Lasagna")) {
					total=total+18.90*totalpasta;
				}
				txt_Total.setText(Double.toString(total));
				txt_Total.setText(df.format(total));

			}
		});
		btn_Total.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Total.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Total.setBackground(new Color(245, 222, 179));
		btn_Total.setBounds(65, 393, 128, 26);
		contentPane.add(btn_Total);

		JLabel pic_pasta1 = new JLabel("");
		pic_pasta1.setBounds(62, 85, 120, 120);
		getContentPane().add(pic_pasta1);
		pic_pasta1.setIcon(new ImageIcon("img/pasta1.jpg"));

		JLabel pic_pasta2 = new JLabel("");
		pic_pasta2.setBounds(213, 85, 120, 120);
		getContentPane().add(pic_pasta2);
		pic_pasta2.setIcon(new ImageIcon("img/pasta2.jpg"));

		JLabel pic_pasta3 = new JLabel("");
		pic_pasta3.setBounds(364, 85, 120, 120);
		getContentPane().add(pic_pasta3);
		pic_pasta3.setIcon(new ImageIcon("img/pasta3.jpg"));

		JLabel pic_pasta4 = new JLabel("");
		pic_pasta4.setBounds(512, 85, 120, 120);
		getContentPane().add(pic_pasta4);
		pic_pasta4.setIcon(new ImageIcon("img/pasta4.jpg"));

		JLabel pic_pasta5 = new JLabel("");
		pic_pasta5.setBounds(663, 85, 120, 120);
		getContentPane().add(pic_pasta5);
		pic_pasta5.setIcon(new ImageIcon("img/pasta5.jpg"));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(10, 73, 850, 405);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblOrderId = new JLabel("Order ID :");
		lblOrderId.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblOrderId.setBounds(334, 321, 79, 26);
		panel_1.add(lblOrderId);

		JLabel order_id = new JLabel("GP01");
		order_id.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		order_id.setBounds(411, 321, 79, 26);
		panel_1.add(order_id);

		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					panel_pasta.this.dispose();
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

		JButton btn_Add = new JButton("Add to Cart");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_Total.getText().equals("0.0") || txt_Total.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_pasta.this.setVisible(true);
				}
				else {
					DefaultTableModel model = (DefaultTableModel) table_Cart.getModel();

					if (rdMincC.isSelected()) { 
						protein = "Minced Chicken";
					}
					else if (rdCSlice.isSelected()) {
						protein = "Chicken Slice";
					}
					else if (rdCPepperoni.isSelected()) {
						protein = "Chicken Pepperoni";
					}
					else if (rdMincB.isSelected()) {
						protein = "Minced Beef";
					}
					else if (rdBSlice.isSelected()) {
						protein = "Beef Slice";
					}
					else if (rdBPepperoni.isSelected()) {
						protein = "Beef Pepperoni";

					}
					model.addRow(new Object[] { order_id.getText(), cmb_pasta.getSelectedItem(), cmb_type.getSelectedItem(), cmb_drink.getSelectedItem(),
							protein, spinner_spice.getValue().toString(), spinner_quantity.getValue(), txt_Total.getText(),

					});
				}
			}
		});
		btn_Add.setForeground(Color.BLACK);
		btn_Add.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btn_Add.setBorderPainted(false);
		btn_Add.setBackground(new Color(220, 220, 220));
		btn_Add.setBounds(334, 359, 179, 36);
		panel_1.add(btn_Add);

		JButton btn_Cart = new JButton("Proceed to Payment");
		btn_Cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(txtSubtotal.getText().equals("0.00") || txtSubtotal.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"Please choose a menu to continue");
					panel_pasta.this.setVisible(true);
				}

				else {
					c.openPayMethod(tot);
					panel_pasta.this.dispose();
				}
			}
		});
		btn_Cart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		btn_Cart.setBorderPainted(false);
		btn_Cart.setBackground(Color.RED);
		btn_Cart.setBounds(264, 648, 337, 37);
		contentPane.add(btn_Cart);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 488, 850, 114);
		contentPane.add(scrollPane);

		table_Cart = new JTable();
		scrollPane.setViewportView(table_Cart);
		table_Cart.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Order ID", "Pasta", "Type", "Drink", "Protein", "Spice Level", "Quantity", "Total (RM)"
				}
				));
		table_Cart.setRequestFocusEnabled(false);
		table_Cart.setOpaque(false);

		JButton btn_Subtotal = new JButton("SUBTOTAL (RM) :");
		btn_Subtotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("0.00");
				int row = table_Cart.getRowCount();

				for(int i=0; i<row; i++) {
					double val = Double.valueOf(table_Cart.getValueAt(i,7).toString());
					tot += val;
				}
				txtSubtotal.setText(Double.toString(tot));
				txtSubtotal.setText(df.format(tot));
			}
		});
		btn_Subtotal.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Subtotal.setFont(new Font("Book Antiqua", Font.BOLD, 13));
		btn_Subtotal.setBackground(new Color(245, 222, 179));
		btn_Subtotal.setBounds(293, 612, 148, 26);
		contentPane.add(btn_Subtotal);

		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Arial", Font.BOLD, 15));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(444, 612, 128, 26);
		contentPane.add(txtSubtotal);

		JButton btn_burger = new JButton("WFBurger");
		btn_burger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openBurger();
				panel_pasta.this.dispose();
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
				panel_pasta.this.dispose();
			}
		});
		btn_pasta.setForeground(new Color(0, 0, 0));
		btn_pasta.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_pasta.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btn_pasta.setBorderPainted(false);
		btn_pasta.setBackground(new Color(255, 222, 173));
		btn_pasta.setBounds(186, 11, 160, 55);
		contentPane.add(btn_pasta);
		btn_pasta.setIcon(new ImageIcon ("img/pasta.png"));		

		JButton btn_pizza = new JButton("MyPizza");
		btn_pizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openPizza();
				panel_pasta.this.dispose();
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
				panel_pasta.this.dispose();
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
				panel_pasta.this.dispose();
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
