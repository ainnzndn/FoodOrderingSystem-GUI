package FoodOrderSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class review extends JFrame {

	private JPanel contentPane;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void Review() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					review frame = new review();
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
	public review() {
		setBackground(new Color(253, 245, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 550, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(222, 184, 135)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pic_review = new JLabel("");
		pic_review.setBounds(124, 101, 305, 63);
		contentPane.add(pic_review);
		pic_review.setIcon(new ImageIcon("img/review.png"));

		JLabel lblNewLabel = new JLabel("Please leave us a review!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.PLAIN, 24));
		lblNewLabel.setBounds(124, 44, 295, 27);
		contentPane.add(lblNewLabel);

		JLabel pic_review2 = new JLabel("");
		pic_review2.setBounds(124, 225, 305, 63);
		contentPane.add(pic_review2);
		pic_review2.setIcon(new ImageIcon("img/review.png"));
		
		JLabel lbl_text = new JLabel("How do you feel about our restaurant and services?");
		lbl_text.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lbl_text.setForeground(new Color(0, 0, 0));
		lbl_text.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_text.setBounds(122, 83, 305, 13);
		contentPane.add(lbl_text);
		
		JLabel lbl_text2 = new JLabel("How do you feel about our food?");
		lbl_text2.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lbl_text2.setForeground(new Color(0, 0, 0));
		lbl_text2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_text2.setBounds(173, 207, 204, 13);
		contentPane.add(lbl_text2);
		
		JRadioButton rd1 = new JRadioButton("1");	
		rd1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd1.setBackground(new Color(253, 245, 230));
		rd1.setBounds(138, 160, 31, 21);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("2");
		rd2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd2.setBackground(new Color(253, 245, 230));
		rd2.setBounds(200, 160, 31, 21);
		contentPane.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("3");
		rd3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd3.setBackground(new Color(253, 245, 230));
		rd3.setBounds(263, 160, 31, 21);
		contentPane.add(rd3);
		
		JRadioButton rd4 = new JRadioButton("4");
		rd4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd4.setBackground(new Color(253, 245, 230));
		rd4.setBounds(325, 160, 31, 21);
		contentPane.add(rd4);
		
		JRadioButton rd5 = new JRadioButton("5");
		rd5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd5.setBackground(new Color(253, 245, 230));
		rd5.setBounds(388, 160, 31, 21);
		contentPane.add(rd5);
		
		JRadioButton rd1_2 = new JRadioButton("1");
		rd1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd1_2.setBackground(new Color(253, 245, 230));
		rd1_2.setBounds(138, 284, 31, 21);
		contentPane.add(rd1_2);
		
		JRadioButton rd2_2 = new JRadioButton("2");
		rd2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd2_2.setBackground(new Color(253, 245, 230));
		rd2_2.setBounds(200, 284, 31, 21);
		contentPane.add(rd2_2);
		
		JRadioButton rd3_2 = new JRadioButton("3");
		rd3_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd3_2.setBackground(new Color(253, 245, 230));
		rd3_2.setBounds(263, 284, 31, 21);
		contentPane.add(rd3_2);
		
		JRadioButton rd4_2 = new JRadioButton("4");
		rd4_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd4_2.setBackground(new Color(253, 245, 230));
		rd4_2.setBounds(325, 284, 31, 21);
		contentPane.add(rd4_2);
		
		JRadioButton rd5_2 = new JRadioButton("5");
		rd5_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd5_2.setBackground(new Color(253, 245, 230));
		rd5_2.setBounds(388, 284, 31, 21);
		contentPane.add(rd5_2);
		
		JLabel btn_exit = new JLabel("X");
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					review.this.dispose();
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
		btn_exit.setBounds(517, 0, 33, 37);
		contentPane.add(btn_exit);
		
		JButton btn_proceed = new JButton("Proceed");
		btn_proceed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Thank you very much for the review!");
				c.openSplashscreen();
				review.this.dispose();
			}
		});
		btn_proceed.setFont(new Font("Arial", Font.BOLD, 18));
		btn_proceed.setBackground(new Color(220, 220, 220));
		btn_proceed.setBounds(191, 453, 165, 41);
		contentPane.add(btn_proceed);
		
		JLabel pic_review3 = new JLabel("");
		pic_review3.setBounds(124, 350, 305, 63);
		contentPane.add(pic_review3);
		pic_review3.setIcon(new ImageIcon("img/review.png"));
		
		JRadioButton rd1_3 = new JRadioButton("1");
		rd1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd1_3.setBackground(new Color(253, 245, 230));
		rd1_3.setBounds(138, 409, 31, 21);
		contentPane.add(rd1_3);
		
		JRadioButton rd2_3 = new JRadioButton("2");
		rd2_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd2_3.setBackground(new Color(253, 245, 230));
		rd2_3.setBounds(200, 409, 31, 21);
		contentPane.add(rd2_3);
		
		JRadioButton rd3_3 = new JRadioButton("3");
		rd3_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd3_3.setBackground(new Color(253, 245, 230));
		rd3_3.setBounds(263, 409, 31, 21);
		contentPane.add(rd3_3);
		
		JRadioButton rd4_3 = new JRadioButton("4");
		rd4_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd4_3.setBackground(new Color(253, 245, 230));
		rd4_3.setBounds(325, 409, 31, 21);
		contentPane.add(rd4_3);
		
		JRadioButton rd5_3 = new JRadioButton("5");
		rd5_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rd5_3.setBackground(new Color(253, 245, 230));
		rd5_3.setBounds(388, 409, 31, 21);
		contentPane.add(rd5_3);
		
		JLabel lbl_text3 = new JLabel("How do you rate your satisfaction here?");
		lbl_text3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_text3.setForeground(Color.BLACK);
		lbl_text3.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lbl_text3.setBounds(138, 332, 281, 13);
		contentPane.add(lbl_text3);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd1.isSelected()) {
					rd2.setSelected(false);
					rd3.setSelected(false);
					rd4.setSelected(false);
					rd5.setSelected(false);

				}
			}
		});

		rd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd2.isSelected()) {
					rd1.setSelected(false);
					rd3.setSelected(false);
					rd4.setSelected(false);
					rd5.setSelected(false);

				}
			}
		});

		rd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd3.isSelected()) {
					rd1.setSelected(false);
					rd2.setSelected(false);
					rd4.setSelected(false);
					rd5.setSelected(false);

				}
			}
		});
		
		rd4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd4.isSelected()) {
					rd1.setSelected(false);
					rd2.setSelected(false);
					rd3.setSelected(false);
					rd5.setSelected(false);

				}
			}
		});
		
		rd5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd5.isSelected()) {
					rd1.setSelected(false);
					rd2.setSelected(false);
					rd3.setSelected(false);
					rd4.setSelected(false);

				}
			}
		});
		
		rd1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd1_2.isSelected()) {
					rd2_2.setSelected(false);
					rd3_2.setSelected(false);
					rd4_2.setSelected(false);
					rd5_2.setSelected(false);

				}
			}
		});
		
		rd2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd2_2.isSelected()) {
					rd1_2.setSelected(false);
					rd3_2.setSelected(false);
					rd4_2.setSelected(false);
					rd5_2.setSelected(false);

				}
			}
		});
		
		rd3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd3_2.isSelected()) {
					rd2_2.setSelected(false);
					rd1_2.setSelected(false);
					rd4_2.setSelected(false);
					rd5_2.setSelected(false);

				}
			}
		});
		
		rd4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd4_2.isSelected()) {
					rd2_2.setSelected(false);
					rd3_2.setSelected(false);
					rd1_2.setSelected(false);
					rd5_2.setSelected(false);

				}
			}
		});
		
		rd5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd5_2.isSelected()) {
					rd2_2.setSelected(false);
					rd3_2.setSelected(false);
					rd4_2.setSelected(false);
					rd1_2.setSelected(false);

				}
			}
		});
		
		rd1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd1_3.isSelected()) {
					rd2_3.setSelected(false);
					rd3_3.setSelected(false);
					rd4_3.setSelected(false);
					rd5_3.setSelected(false);

				}
			}
		});
		
		rd2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd2_3.isSelected()) {
					rd1_3.setSelected(false);
					rd3_3.setSelected(false);
					rd4_3.setSelected(false);
					rd5_3.setSelected(false);

				}
			}
		});
		
		rd3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd3_3.isSelected()) {
					rd2_3.setSelected(false);
					rd1_3.setSelected(false);
					rd4_3.setSelected(false);
					rd5_3.setSelected(false);

				}
			}
		});
		
		rd4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd4_3.isSelected()) {
					rd2_3.setSelected(false);
					rd3_3.setSelected(false);
					rd1_3.setSelected(false);
					rd5_3.setSelected(false);

				}
			}
		});
		
		rd5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rd5_3.isSelected()) {
					rd2_3.setSelected(false);
					rd3_3.setSelected(false);
					rd4_3.setSelected(false);
					rd1_3.setSelected(false);

				}
			}
		});
	}
}
