package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class bank_list extends JFrame {

	private JPanel contentPane;
	Controller c = new Controller();
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void BankList() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank_list frame = new bank_list();
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
	public bank_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openListMenu();
				bank_list.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setBounds(10, 432, 98, 28);
		contentPane.add(btnNewButton);

		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					bank_list.this.dispose();
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

		JLabel lblBankList = new JLabel("Bank List");
		lblBankList.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblBankList.setBounds(270, 17, 155, 48);
		contentPane.add(lblBankList);
		
		table = new JTable();
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Maybank Berhad"},
				{"CIMB Bank"},
				{"Hong Leong Bank"},
				{"Bank Islam"},
				{"RHB Bank"},
				{"Public Bank"},
				{"Bank Rakyat"},
				{"Bank Simpanan Nasional"},
			},
			new String[] {
				"Bank List"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(67, 75, 560, 332);
		contentPane.add(table);
		setUndecorated(true);
	}
}
