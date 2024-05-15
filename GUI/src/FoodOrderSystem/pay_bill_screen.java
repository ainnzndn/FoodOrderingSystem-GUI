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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class pay_bill_screen extends JFrame {
	
	private JPanel contentPane;
	Controller c = new Controller();
	DecimalFormat df = new DecimalFormat("0.00");
	/**
	 * Launch the application.
	 * @param tot 
	 */
	
	public static void PaymentBill(double tot) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay_bill_screen frame = new pay_bill_screen(tot);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static double tot;

	public pay_bill_screen(double tot) {
		this.tot = tot;
		pay_bill_screen();
	}

	/**
	 * Create the frame.
	 */
	public void pay_bill_screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 545, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Bill");
		lblNewLabel.setBounds(125, 35, 295, 44);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Status");
		label.setFont(new Font("Arial", Font.PLAIN, 13));
		label.setBounds(103, 100, 85, 13);
		contentPane.add(label);
		
		JLabel label1 = new JLabel("Reference Number");
		label1.setFont(new Font("Arial", Font.PLAIN, 13));
		label1.setBounds(103, 121, 113, 13);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Transaction Date");
		label2.setFont(new Font("Arial", Font.PLAIN, 13));
		label2.setBounds(103, 143, 113, 13);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Amount ");
		label3.setFont(new Font("Arial", Font.PLAIN, 13));
		label3.setBounds(103, 165, 113, 13);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("From Account");
		label4.setFont(new Font("Arial", Font.PLAIN, 13));
		label4.setBounds(103, 187, 113, 13);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("To 3rd Party Account No");
		label5.setFont(new Font("Arial", Font.PLAIN, 13));
		label5.setBounds(103, 209, 150, 13);
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("Account Holder Name");
		label6.setFont(new Font("Arial", Font.PLAIN, 13));
		label6.setBounds(103, 231, 150, 13);
		contentPane.add(label6);
		
		JLabel label7 = new JLabel("Description of Transaction");
		label7.setFont(new Font("Arial", Font.PLAIN, 13));
		label7.setBounds(103, 254, 160, 13);
		contentPane.add(label7);
		
		JLabel text = new JLabel("Successful");
		text.setFont(new Font("Arial", Font.PLAIN, 13));
		text.setForeground(new Color(50, 205, 50));
		text.setBounds(290, 100, 150, 13);
		contentPane.add(text);
		
		JLabel text2 = new JLabel(": 202323847");
		text2.setFont(new Font("Arial", Font.PLAIN, 13));
		text2.setBounds(282, 121, 159, 13);
		contentPane.add(text2);
		
		JLabel text3 = new JLabel(": 3 Feb 2022 19:28");
		text3.setFont(new Font("Arial", Font.PLAIN, 13));
		text3.setBounds(282, 143, 159, 13);
		contentPane.add(text3);
		
		JLabel text4 = new JLabel("");
		text4.setText(String.valueOf(df.format(tot)));
		text4.setFont(new Font("Arial", Font.BOLD, 13));
		text4.setBounds(314, 163, 127, 17);
		contentPane.add(text4);
		
		JLabel text5 = new JLabel(": 4928 1928 2093");
		text5.setFont(new Font("Arial", Font.PLAIN, 13));
		text5.setBounds(282, 187, 159, 13);
		contentPane.add(text5);
		
		JLabel text6 = new JLabel(": 2222 5555 8888");
		text6.setFont(new Font("Arial", Font.PLAIN, 13));
		text6.setBounds(282, 209, 159, 13);
		contentPane.add(text6);
		
		JLabel text7 = new JLabel(": La Italien Restaurant");
		text7.setFont(new Font("Arial", Font.PLAIN, 13));
		text7.setBounds(282, 231, 159, 13);
		contentPane.add(text7);
		
		JLabel text8 = new JLabel(": La Italien Food & Beverages");
		text8.setFont(new Font("Arial", Font.PLAIN, 13));
		text8.setBounds(282, 254, 175, 13);
		contentPane.add(text8);
		
		JLabel lbl_note = new JLabel("Note: This receipt is computer generated and no signature is required.");
		lbl_note.setForeground(new Color(128, 128, 128));
		lbl_note.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl_note.setBounds(103, 277, 354, 13);
		contentPane.add(lbl_note);
		
		JButton btn_proceed = new JButton("Proceed");
		btn_proceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openReview();
				pay_bill_screen.this.dispose();
			}
		});
		btn_proceed.setFont(new Font("Arial", Font.BOLD, 18));
		btn_proceed.setBackground(new Color(220, 220, 220));
		btn_proceed.setBounds(190, 300, 165, 41);
		contentPane.add(btn_proceed);
		
		JLabel text1 = new JLabel(":");
		text1.setFont(new Font("Arial", Font.PLAIN, 13));
		text1.setBounds(282, 100, 159, 13);
		contentPane.add(text1);
		
		JLabel text1_1 = new JLabel(": RM");
		text1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		text1_1.setBounds(282, 165, 159, 13);
		contentPane.add(text1_1);
		
		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					pay_bill_screen.this.dispose();
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
		setUndecorated(true);
		setLocationRelativeTo(null);
	}

}
