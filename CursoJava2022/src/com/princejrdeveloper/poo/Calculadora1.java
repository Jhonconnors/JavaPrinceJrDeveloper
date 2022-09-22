package com.princejrdeveloper.poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Calculadora1 extends JFrame {
	
	int num1, num2;
	String signo;

	private JPanel contentPane;
	private JTextField CajaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora1 frame = new Calculadora1();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora1() {
		setBackground(new Color(247, 236, 172));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CajaResultado.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 68, 49, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Integer.parseInt(CajaResultado.getText());
				signo="/";
				CajaResultado.setText("");
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(69, 68, 49, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("X");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Integer.parseInt(CajaResultado.getText());
				signo="*";
				CajaResultado.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(128, 68, 49, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(CajaResultado.getText());
				signo="-";
				CajaResultado.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(187, 68, 49, 35);
		contentPane.add(btnNewButton_2);
		
		CajaResultado = new JTextField();
		CajaResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		CajaResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		CajaResultado.setBounds(10, 11, 226, 33);
		contentPane.add(CajaResultado);
		CajaResultado.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"7");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(10, 114, 49, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"8");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(69, 114, 49, 35);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_4_1 = new JButton("9");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"9");
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_1.setBounds(128, 114, 49, 35);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_2_1 = new JButton("+");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(CajaResultado.getText());
				signo="+";
				CajaResultado.setText("");
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(187, 114, 49, 82);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"4");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(10, 160, 49, 35);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"5");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(69, 160, 49, 35);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_4_2 = new JButton("6");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"6");
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_2.setBounds(128, 160, 49, 35);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"1");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setBounds(10, 206, 49, 35);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"2");
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_3.setBounds(69, 206, 49, 35);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_4_3 = new JButton("3");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+"3");
			}
		});
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4_3.setBounds(128, 206, 49, 35);
		contentPane.add(btnNewButton_4_3);
		
		JButton btnNewButton_1_4 = new JButton("0");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CajaResultado.setText(CajaResultado.getText()+"0");
				
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_4.setBounds(10, 252, 167, 35);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_4 = new JButton("=");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=Integer.parseInt(CajaResultado.getText());
				
				switch (signo) {
				case "+":
					CajaResultado.setText(Integer.toString(num1+num2));
					break;
				case "-":
					CajaResultado.setText(Integer.toString(num1-num2));
					break;
				case "*":
					CajaResultado.setText(Integer.toString(num1*num2));
					break;	
				case "/":
					CajaResultado.setText(Integer.toString(num1/num2));
					break;	
				default:
					CajaResultado.setText("ERROR");
					break;
				}
			}
		});
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_4.setBounds(187, 207, 49, 80);
		contentPane.add(btnNewButton_2_4);
	}

}
