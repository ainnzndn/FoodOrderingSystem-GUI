package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class pay_fpx_screen extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwdTac;
	Controller c = new Controller();
	DecimalFormat df = new DecimalFormat("0.00");
	/**
	 * Launch the application.
	 * @param tot 
	 */
	public static void FPXPayment(double tot) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay_fpx_screen frame = new pay_fpx_screen(tot);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static double tot=0.00;

	public pay_fpx_screen(double tot) {
		this.tot = tot;
		pay_fpx_screen();
	}

	/**
	 * Create the frame.
	 */
	public void pay_fpx_screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 545, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					pay_fpx_screen.this.dispose();
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

		JLabel lblUsername = new JLabel("Amount");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername.setBounds(99, 105, 156, 17);
		contentPane.add(lblUsername);

		JButton btn_proceed = new JButton("Proceed");
		btn_proceed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pwdTac.getText().isBlank() || pwdTac.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please input TAC Number to continue.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					c.openPaymentBill(tot);
					pay_fpx_screen.this.dispose();
				}
			}
		});
		btn_proceed.setFont(new Font("Arial", Font.BOLD, 18));
		btn_proceed.setBackground(new Color(220, 220, 220));
		btn_proceed.setBounds(190, 300, 165, 41);
		contentPane.add(btn_proceed);

		JLabel lblUsername_1 = new JLabel("TAC No :");
		lblUsername_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_1.setBounds(99, 252, 74, 23);
		contentPane.add(lblUsername_1);

		pwdTac = new JPasswordField();
		pwdTac.setText("");
		pwdTac.setBounds(186, 252, 107, 23);
		contentPane.add(pwdTac);

		JLabel lblNewLabel = new JLabel("FPX Payment");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(107, 40, 330, 53);
		contentPane.add(lblNewLabel);

		JLabel lblUsername_2 = new JLabel("Account ");
		lblUsername_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_2.setBounds(99, 124, 156, 17);
		contentPane.add(lblUsername_2);

		JLabel amount_1 = new JLabel(": 4928 1928 2093");
		amount_1.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_1.setBounds(265, 124, 166, 17);
		contentPane.add(amount_1);

		JLabel lblUsername_3 = new JLabel("To 3rd Party Account No");
		lblUsername_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_3.setBounds(99, 165, 156, 17);
		contentPane.add(lblUsername_3);

		JLabel amount_2 = new JLabel(": 2222 5555 8888");
		amount_2.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_2.setBounds(265, 165, 166, 17);
		contentPane.add(amount_2);

		JLabel lblUsername_4 = new JLabel("Account Holder Name:");
		lblUsername_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_4.setBounds(99, 186, 156, 17);
		contentPane.add(lblUsername_4);

		JLabel amount_3 = new JLabel(": La Italien Restaurant");
		amount_3.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_3.setBounds(265, 186, 166, 17);
		contentPane.add(amount_3);

		JLabel lblUsername_5 = new JLabel("Effective Date:");
		lblUsername_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_5.setBounds(99, 208, 156, 17);
		contentPane.add(lblUsername_5);

		JLabel amount_4 = new JLabel(": Today");
		amount_4.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_4.setBounds(265, 208, 166, 17);
		contentPane.add(amount_4);

		JLabel lbl_message = new JLabel("");
		lbl_message.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_message.setForeground(new Color(255, 0, 0));
		lbl_message.setBounds(185, 277, 233, 13);
		contentPane.add(lbl_message);

		JLabel lblUsername_5_1 = new JLabel("Description of Transaction");
		lblUsername_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_5_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_5_1.setBounds(99, 231, 156, 17);
		contentPane.add(lblUsername_5_1);

		JLabel amount_4_1 = new JLabel(": La Italien Food & Beverages");
		amount_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_4_1.setBounds(265, 231, 166, 17);
		contentPane.add(amount_4_1);
		setUndecorated(true);

		JLabel text4 = new JLabel("");
		text4.setText(String.valueOf(df.format(tot)));
		text4.setFont(new Font("Arial", Font.BOLD, 13));
		text4.setBounds(296, 104, 134, 19);
		contentPane.add(text4);

		JLabel amount_4_2 = new JLabel(": RM");
		amount_4_2.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_4_2.setBounds(265, 105, 33, 17);
		contentPane.add(amount_4_2);

		JButton btn_TAC = new JButton("Request TAC");
		btn_TAC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_message.setText("TAC Number has been sent to +601*******79");
			}
		});
		btn_TAC.setBounds(297, 253, 121, 21);
		contentPane.add(btn_TAC);
		
		JLabel lblUsername_3_1 = new JLabel("Transfer Type");
		lblUsername_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_3_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblUsername_3_1.setBounds(99, 145, 156, 17);
		contentPane.add(lblUsername_3_1);
		
		JLabel amount_2_1 = new JLabel(": Funds Transfer");
		amount_2_1.setFont(new Font("Arial", Font.PLAIN, 13));
		amount_2_1.setBounds(265, 145, 166, 17);
		contentPane.add(amount_2_1);
	}
}
