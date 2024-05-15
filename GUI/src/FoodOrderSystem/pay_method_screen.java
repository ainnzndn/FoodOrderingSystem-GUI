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

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class pay_method_screen extends JFrame {

	DecimalFormat df = new DecimalFormat("0.00");
	private JPanel contentPane;
	Controller c = new Controller();		
	/**
	 * Launch the application.
	 * @param tot 
	 */
	public static void ScreenPayment(double tot) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay_method_screen frame = new pay_method_screen(tot);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	static double tot=0.00;
	
	public pay_method_screen(double tot) {
		this.tot = tot;
		pay_method_screen();
	}

	/**
	 * Create the frame.
	 */
	public void pay_method_screen() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Payment Method");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.PLAIN, 40));
		lblNewLabel.setBounds(108, 33, 322, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose preferred online banking:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(139, 84, 267, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btn_proceed = new JButton("Proceed");
		btn_proceed.setBackground(new Color(220, 220, 220));
		btn_proceed.setFont(new Font("Arial", Font.BOLD, 18));
		btn_proceed.setBounds(190, 282, 165, 41);
		contentPane.add(btn_proceed);
		
		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					pay_method_screen.this.dispose();
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
		btn_exit.setBounds(512, 0, 33, 37);
		contentPane.add(btn_exit);
		
		JLabel lblNewLabel_2 = new JLabel("Online Banking               :");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(98, 215, 175, 25);
		contentPane.add(lblNewLabel_2);
		
		JComboBox<String> cmb_bank = new JComboBox<String>();
		cmb_bank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bankName = cmb_bank.getSelectedItem().toString();
			}
		});
		cmb_bank.setBackground(new Color(255, 255, 255));
		cmb_bank.setModel(new DefaultComboBoxModel<String>(new String[] {"Maybank", "CIMB Bank", "Hong Leong Bank", "Bank Islam", "RHB Bank", "Public Bank", "Bank Rakyat", "Bank Simpanan Nasional"}));
		cmb_bank.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		cmb_bank.setBounds(266, 215, 185, 25);
		contentPane.add(cmb_bank);
		
		JLabel lblUsername = new JLabel("Amount");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblUsername.setBounds(99, 125, 103, 25);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel_3 = new JLabel(": La Italien #INV014412");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(261, 167, 209, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(": La Italien Sdn. Bhd.");
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_3_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_1.setBounds(261, 144, 209, 25);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblPayTo = new JLabel("Pay to ");
		lblPayTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPayTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPayTo.setBounds(98, 146, 103, 25);
		contentPane.add(lblPayTo);
		
		JLabel lblPaymentOf = new JLabel("Payment of");
		lblPaymentOf.setHorizontalAlignment(SwingConstants.LEFT);
		lblPaymentOf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPaymentOf.setBounds(98, 167, 103, 25);
		contentPane.add(lblPaymentOf);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setText(String.valueOf(df.format(tot)));
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_4.setBounds(296, 125, 175, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_2 = new JLabel(": RM");
		lblNewLabel_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(262, 124, 202, 25);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblPaymentOf_1 = new JLabel("Payment Description");
		lblPaymentOf_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPaymentOf_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPaymentOf_1.setBounds(98, 190, 165, 25);
		contentPane.add(lblPaymentOf_1);
		
		JLabel lblNewLabel_3_3 = new JLabel(": P128239310");
		lblNewLabel_3_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(261, 190, 209, 25);
		contentPane.add(lblNewLabel_3_3);
		
		JCheckBox terms = new JCheckBox("Accept Terms and Condition");
		terms.setHorizontalAlignment(SwingConstants.CENTER);
		terms.setBackground(new Color(253, 245, 230));
		terms.setFont(new Font("Arial", Font.BOLD, 12));
		terms.setBounds(160, 258, 225, 21);
		contentPane.add(terms);
		
		btn_proceed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!terms.isSelected()) {
							JOptionPane.showMessageDialog(null, "Please accept Terms and Conditions to proceed!", "Warning", JOptionPane.WARNING_MESSAGE);
						}
				
				else {
				c.openFPX(tot);
				pay_method_screen.this.dispose();
				}
			}
		});
		
	}
}
