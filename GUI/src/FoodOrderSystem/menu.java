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
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	Controller c = new Controller();
	/**
	 * Launch the application.
	 */
	public static void ScreenMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 870, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel btn_exit = new JLabel("X");
		btn_exit.setForeground(Color.BLACK);
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this system?", "Confirmation Message", JOptionPane.YES_NO_OPTION)==0) {
					menu.this.dispose();
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
		panel.setBounds(10, 73, 850, 417);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openSplashscreen();
				menu.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(10, 382, 92, 25);
		panel.add(btnNewButton);
		
		JButton btn_burger = new JButton("WFBurger");
		btn_burger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openBurger();
				menu.this.dispose();
			}
		});
		btn_burger.setForeground(new Color(0, 0, 0));
		btn_burger.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_burger.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
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
				menu.this.dispose();
			}
		});
		btn_pasta.setForeground(new Color(0, 0, 0));
		btn_pasta.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_pasta.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		btn_pasta.setBorderPainted(false);
		btn_pasta.setBackground(new Color(255, 235, 205));
		btn_pasta.setBounds(187, 11, 160, 55);
		contentPane.add(btn_pasta);
		btn_pasta.setIcon(new ImageIcon ("img/pasta.png"));		
		
		JButton btn_pizza = new JButton("MyPizza");
		btn_pizza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openPizza();
				menu.this.dispose();
			}
		});
		btn_pizza.setForeground(new Color(0, 0, 0));
		btn_pizza.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_pizza.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		btn_pizza.setBorderPainted(false);
		btn_pizza.setBackground(new Color(255, 235, 205));
		btn_pizza.setBounds(351, 11, 160, 55);
		contentPane.add(btn_pizza);
		btn_pizza.setIcon(new ImageIcon ("img/pizza.png"));		
		
		JButton btn_cake = new JButton("Lily Cakes");
		btn_cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openCake();
				menu.this.dispose();
			}
		});
		btn_cake.setForeground(new Color(0, 0, 0));
		btn_cake.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_cake.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		btn_cake.setBorderPainted(false);
		btn_cake.setBackground(new Color(255, 235, 205));
		btn_cake.setBounds(515, 11, 160, 55);
		contentPane.add(btn_cake);
		btn_cake.setIcon(new ImageIcon ("img/cake.png"));		

		JButton btn_drink = new JButton("Koolcup");
		btn_drink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c.openDrink();
				menu.this.dispose();
			}
		});
		btn_drink.setForeground(new Color(0, 0, 0));
		btn_drink.setHorizontalAlignment(SwingConstants.RIGHT);
		btn_drink.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		btn_drink.setBorderPainted(false);
		btn_drink.setBackground(new Color(255, 235, 205));
		btn_drink.setBounds(679, 11, 165, 55);
		contentPane.add(btn_drink);
		btn_drink.setIcon(new ImageIcon ("img/drink.png"));		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
	}

	
}
