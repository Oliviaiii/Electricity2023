package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Electricity2023UI2 extends JFrame {

	private JPanel contentPane;
	private JTextField account;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electricity2023UI2 frame = new Electricity2023UI2();
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
	public Electricity2023UI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("輸入身分證字號：");
		lblNewLabel.setBounds(93, 51, 104, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼：");
		lblNewLabel_1.setBounds(158, 79, 39, 16);
		contentPane.add(lblNewLabel_1);
		
		account = new JTextField();
		account.setBounds(196, 46, 130, 26);
		contentPane.add(account);
		account.setColumns(10);
		
		password = new JTextField();
		password.setBounds(196, 74, 130, 26);
		contentPane.add(password);
		password.setColumns(10);
		
		/*
		JFrame jf= new JFrame();
		JOptionPane.showMessageDialog(jf, "jo test");
		*/
		
		JButton login = new JButton("登入");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				String enteredAccount = account.getText();
		        String enteredPassword = password.getText();
		        
		        if (enteredAccount.equals("A123456789") && enteredPassword.equals("19870808")) {
		            Electricity2023UI EUI1 = new Electricity2023UI();
		            EUI1.setVisible(true);
		            dispose();
		        } else {
		        	ElectricityUIclose EUIclose = new ElectricityUIclose();
			         EUIclose.setVisible(true);
			         dispose();

			         
		           // JOptionPane.showMessageDialog(contentPane, "帳號或密碼輸入錯誤！", "錯誤", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		login.setBounds(206, 107, 117, 29);
		contentPane.add(login);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(93, 6, 266, 33);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("台灣電力公司簡易電費試算");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(0, 0, 139));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("帳號預設為：A123456789");
		lblNewLabel_3.setBounds(138, 199, 202, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("密碼預設為：19870808");
		lblNewLabel_4.setBounds(138, 219, 148, 16);
		contentPane.add(lblNewLabel_4);
	}
}
