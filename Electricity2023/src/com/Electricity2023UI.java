package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.net.URI;

import javax.swing.JTextArea;

public class Electricity2023UI extends JFrame {

	private JPanel contentPane;
	private JTextField elc;
	private final ButtonGroup typeUseElc = new ButtonGroup();
	private final ButtonGroup typeSeason = new ButtonGroup();
	private JTextField name;
	private final ButtonGroup typePay = new ButtonGroup();
	private JTextField money;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electricity2023UI frame = new Electricity2023UI();
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
	public Electricity2023UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 169, 169));
		panel.setBounds(6, 6, 588, 47);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("歡迎來到2023電費試算系統");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panel_1.setBounds(6, 58, 588, 508);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("請選擇身份類別：");
		lblNewLabel_1.setBounds(63, 50, 104, 16);
		panel_1.add(lblNewLabel_1);
		
		JRadioButton shopType = new JRadioButton("營業用電");
		typeUseElc.add(shopType);
		shopType.setBounds(168, 46, 94, 23);
		panel_1.add(shopType);
		
		JTextArea outPay = new JTextArea();
		outPay.setBounds(377, 182, 180, 150);
		panel_1.add(outPay);
		
		JRadioButton peopleType = new JRadioButton("非營業用電（一般民眾）");
		typeUseElc.add(peopleType);
		peopleType.setBounds(274, 46, 180, 23);
		panel_1.add(peopleType);
		
		JButton typeButton = new JButton("身份說明");
		typeButton.addMouseListener(new MouseAdapter() {
			//說明營業＆非營業彈跳視窗@Override
			public void mouseClicked(MouseEvent e) {
				JFrame typeButtonExplane= new JFrame();
				JOptionPane.showMessageDialog(typeButtonExplane, 
						"電費採累進計算\n"
						+ "營業用電共分為5個級距：\n"
						+ "1. 330度以下\n"
						+ "2. 331度到700度\n"
						+ "3. 701度到1500度\n"
						+ "4. 1501度到3000度\n"
						+ "5. 3001度以上\n\n"
						+ "非營業用共分為6個級距：\n"
						+ "1. 120度以下\n"
						+ "2. 121度到330度\n"
						+ "3. 331度到500度\n"
						+ "4. 501度到700度\n"
						+ "5. 701度到1000度\n"
						+ "6. 1001度以上");
				
			}
		});
		typeButton.setBounds(465, 45, 117, 29);
		panel_1.add(typeButton);
		JLabel lblNewLabel_3 = new JLabel("輸入姓名：");
		lblNewLabel_3.setBounds(171, 18, 77, 16);
		panel_1.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBounds(244, 13, 130, 26);
		panel_1.add(name);
		name.setColumns(10);
		
		JTextArea outPut = new JTextArea();
		outPut.setBounds(6, 210, 336, 251);
		panel_1.add(outPut);
		
		JLabel lblNewLabel_1_1 = new JLabel("請選擇季節：");
		lblNewLabel_1_1.setBounds(63, 86, 104, 16);
		panel_1.add(lblNewLabel_1_1);
		
		JRadioButton summer = new JRadioButton("夏季用電");
		typeSeason.add(summer);
		summer.setBounds(168, 82, 94, 23);
		panel_1.add(summer);
		
		JRadioButton winter = new JRadioButton("非夏季用電");
		typeSeason.add(winter);
		winter.setBounds(274, 82, 180, 23);
		panel_1.add(winter);
		
		JButton seasonButton = new JButton("季節說明");
		seasonButton.addMouseListener(new MouseAdapter() {
			//說明夏季非夏季計算方式彈跳視窗@Override
			public void mouseClicked(MouseEvent e) {
				JFrame seasonButtonExplan= new JFrame();
				JOptionPane.showMessageDialog(seasonButtonExplan, 
						"夏季時間為：6月1日～9月30日\n"
						+ "非夏季時間為：10月1日～5月31日");
				
				
			}
		});
		seasonButton.setBounds(465, 81, 117, 29);
		panel_1.add(seasonButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("請輸入度數：");
		lblNewLabel_1_1_1.setBounds(63, 129, 104, 16);
		panel_1.add(lblNewLabel_1_1_1);
		
		elc = new JTextField();
		elc.setBounds(142, 124, 130, 26);
		panel_1.add(elc);
		elc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("度");
		lblNewLabel_2.setBounds(284, 129, 61, 16);
		panel_1.add(lblNewLabel_2);
		
		JButton total = new JButton("送出計算");
		total.setBackground(new Color(255, 228, 181));
		total.addMouseListener(new MouseAdapter() {
			//送出計算所有內容@Override
			public void mouseClicked(MouseEvent e) {
				
;				String Name = name.getText();
				double electricity = Double.parseDouble(elc.getText());
				int Money = Integer.parseInt(money.getText());
		        Electricity2023 electricity2023 = new Electricity2023(Name, electricity, Money);
				
		       
				
				if (shopType.isSelected() && summer.isSelected()) {
					electricity2023.calStoreSummer();
			        outPut.setText("哈囉！"+electricity2023.getName()+"\n"+
			        		"您的用電量為："+elc.getText()+"度"+"\n"+
			        		"營業夏季須繳金額為：" + electricity2023.getStoreSummer()+"元\n");
					//營業用夏季
					
					
				}
				else if (peopleType.isSelected() && summer.isSelected()) {
					 electricity2023.calPeopleSummer();
			         outPut.setText("哈囉！"+electricity2023.getName()+"\n"+
			        		 "您的用電量為："+elc.getText()+"度"+"\n"+
			        		 "非營業夏季須繳金額為：" + electricity2023.getPeopleSummer()+"元");
			         
			         
					//非營業夏季
					
				}
				
				else if (shopType.isSelected() && winter.isSelected()) {
					electricity2023.calStoreWinter();
		            outPut.setText("哈囉！"+electricity2023.getName()+"\n"+
		            		"您的用電量為："+elc.getText()+"度"+"\n"+
		            		"營業非夏季須繳金額為：" + electricity2023.getStoreWinter()+"元");
					//營業非夏季
				
					
					
				}
				else if (peopleType.isSelected() && winter.isSelected()) {
					electricity2023.calPeopleWinter();
		            outPut.setText("哈囉！"+electricity2023.getName()+"\n"+
		            		"您的用電量為："+elc.getText()+"度"+"\n"+
		            		"非營業非夏季須繳金額為：" + electricity2023.getPeopleWinter()+"元");
					//非營業非夏季
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "請選擇類型和季節");

				}
			}
		});
		total.setBounds(73, 157, 228, 41);
		panel_1.add(total);
		
		JButton printAll = new JButton("列印");
		printAll.addMouseListener(new MouseAdapter() {
			//列印視窗@Override
			public void mouseClicked(MouseEvent e) {
				try {
					outPut.print();
				}
				catch (PrinterException ex) {
					ex.printStackTrace();
				}
			}
		});
		printAll.setBounds(16, 473, 64, 29);
		panel_1.add(printAll);
		
		JButton exit = new JButton("結束");
		exit.addMouseListener(new MouseAdapter() {
			//跳出結束@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		exit.setBounds(244, 473, 117, 29);
		panel_1.add(exit);
		
		JButton how = new JButton("電費怎麼算？");
		how.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            Desktop.getDesktop().browse(new URI("https://www.taipower.com.tw/tc/news2_info.aspx?id=6448&chk=eddeb927-6784-4fde-b185-c331c053aa2b&mid=29&param=pn%3d1%26mid%3d29%26key%3d"));
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }

			
		});

		how.setBounds(357, 134, 123, 36);
		panel_1.add(how);
		
		JRadioButton card = new JRadioButton("信用卡付款");
		card.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		typePay.add(card);
		card.setBounds(387, 352, 141, 23);
		panel_1.add(card);
		
		JRadioButton cash = new JRadioButton("現金付款（填下方表格）");
		cash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		typePay.add(cash);
		cash.setBounds(387, 380, 181, 23);
		panel_1.add(cash);
		
		money = new JTextField();
		money.setText("0");
		money.setBounds(416, 420, 94, 26);
		panel_1.add(money);
		money.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("輸入付款金額：");
		lblNewLabel_4.setBounds(416, 403, 99, 16);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("付款確認");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Name = name.getText();
				double electricity = Double.parseDouble(elc.getText());
				int Money = Integer.parseInt(money.getText());
		        Electricity2023 electricity2023 = new Electricity2023(Name, electricity, Money);
				
				
				if (card.isSelected()) {
					outPay.setText("信用卡付款無需找零");
				}
				else {
					if(Money >= 0) {
					if (shopType.isSelected() && summer.isSelected()) {
						electricity2023.calStoreSummer();
						 outPay.setText(
				            		"找零："+(Money-electricity2023.getStoreSummer())+"元"
				            		
				            		
				            		+
				            		"\n1000元："+(((int) (Money-electricity2023.getStoreSummer()) )/1000)%1000+"張"+
				        			"\n500元："+((((int) (Money-electricity2023.getStoreSummer()) )%1000))/500+"張"+
				        			"\n100元："+(((((int) (Money-electricity2023.getStoreSummer()) )%1000))%500)/100+"張"+
				        			"\n50元："+((((((int) (Money-electricity2023.getStoreSummer()) )%1000))%500)%100)/50+"枚"+
				        			"\n10元："+(((((((int) (Money-electricity2023.getStoreSummer()) )%1000))%500)%100)%50)/10+"枚"+
				        			"\n5元："+((((((((int) (Money-electricity2023.getStoreSummer()) )%1000))%500)%100)%50)%10)/5+"枚"+
				        			"\n1元："+((((((((int) (Money-electricity2023.getStoreSummer()) )%1000))%500)%100)%50)%10)%5+"枚"
				        			
);
				       
						
						//營業用夏季
						
						
					}
					else if (peopleType.isSelected() && summer.isSelected()) {
						 electricity2023.calPeopleSummer();
						 outPay.setText(
				            		"找零："+(Money-electricity2023.getPeopleSummer())+"元"
				            		
				            		
				            		+
				            		"\n1000元："+(( (int)(Money-electricity2023.getPeopleSummer()) )/1000)%1000+"張"+
				        			"\n500元："+((((int) (Money-electricity2023.getPeopleSummer()) )%1000))/500+"張"+
				        			"\n100元："+(((( (int)(Money-electricity2023.getPeopleSummer()) )%1000))%500)/100+"張"+
				        			"\n50元："+((((((int) (Money-electricity2023.getPeopleSummer()) )%1000))%500)%100)/50+"張"+
				        			"\n10元："+(((((((int) (Money-electricity2023.getPeopleSummer()) )%1000))%500)%100)%50)/10+"張"+
				        			"\n5元："+((((((( (int)(Money-electricity2023.getPeopleSummer()))%1000))%500)%100)%50)%10)/5+"張"+
				        			"\n1元："+((((((((int) (Money-electricity2023.getPeopleSummer()) )%1000))%500)%100)%50)%10)%5+"張"
				        			
);
						 
				        
				         
				         
						//非營業夏季
						
					}
					
					else if (shopType.isSelected() && winter.isSelected()) {
						electricity2023.calStoreWinter();
						outPay.setText(
			            		"找零："+(Money-electricity2023.getStoreWinter())+"元"
			            		
			            		
			            		+
			            		"\n1000元："+(( (int)(Money-electricity2023.getStoreWinter()) )/1000)%1000+"張"+
			        			"\n500元："+((( (int)(Money-electricity2023.getStoreWinter()) )%1000))/500+"張"+
			        			"\n100元："+(((( (int)(Money-electricity2023.getStoreWinter()))%1000))%500)/100+"張"+
			        			"\n50元："+((((( (int)(Money-electricity2023.getStoreWinter()) )%1000))%500)%100)/50+"張"+
			        			"\n10元："+(((((( (int)(Money-electricity2023.getStoreWinter()) )%1000))%500)%100)%50)/10+"張"+
			        			"\n5元："+((((((((int) (Money-electricity2023.getStoreWinter()) )%1000))%500)%100)%50)%10)/5+"張"+
			        			"\n1元："+((((((((int) (Money-electricity2023.getStoreWinter()) )%1000))%500)%100)%50)%10)%5+"張"
			        			
);
						
						
			          
						//營業非夏季
					
						
						
					}
					else if (peopleType.isSelected() && winter.isSelected()) {
						electricity2023.calPeopleWinter();
			            outPay.setText(
			            		"找零："+(Money-electricity2023.getPeopleWinter())+"元"
			            		
			            		
			            		+
			            		"\n1000元："+(((int) (Money-electricity2023.getPeopleWinter()) )/1000)%1000+"張"+
			        			"\n500元："+((( (int)(Money-electricity2023.getPeopleWinter()) )%1000))/500+"張"+
			        			"\n100元："+(((( (int)(Money-electricity2023.getPeopleWinter()) )%1000))%500)/100+"張"+
			        			"\n50元："+((((((int) (Money-electricity2023.getPeopleWinter()) )%1000))%500)%100)/50+"張"+
			        			"\n10元："+(((((((int) (Money-electricity2023.getPeopleWinter()) )%1000))%500)%100)%50)/10+"張"+
			        			"\n5元："+((((((((int) (Money-electricity2023.getPeopleWinter()) )%1000))%500)%100)%50)%10)/5+"張"+
			        			"\n1元："+((((((( (int)(Money-electricity2023.getPeopleWinter()) )%1000))%500)%100)%50)%10)%5+"張"
			        			
);
						//非營業非夏季
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "請選擇類型和季節");

					}
					
				}
					else {
						outPay.setText("輸入無效金額");
					}
				}
				
			}
		});
		btnNewButton.setBounds(416, 452, 117, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("選擇付款方式");
		lblNewLabel_5.setBounds(363, 333, 117, 16);
		panel_1.add(lblNewLabel_5);
		
		
		
	
	}
}
