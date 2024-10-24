package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{
	public MyCalculator() {
		this.setTitle("MyCalculator");
		
		this.setSize(400, 600);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jtd = new JTextField();
		JPanel jp_head = new JPanel();
		jp_head.setLayout(new BorderLayout());
		jp_head.add(jtd, BorderLayout.CENTER);
		
		
		JButton jb1 = new JButton("0");
		JButton jb2 = new JButton("1");
		JButton jb3 = new JButton("2");
		JButton jb4 = new JButton("3");
		JButton jb5 = new JButton("4");
		JButton jb6 = new JButton("5");
		JButton jb7 = new JButton("6");
		JButton jb8 = new JButton("7");
		JButton jb9 = new JButton("8");
		JButton jb10 = new JButton("9");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("x");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton("=");
		
		JPanel jp_buttons = new JPanel();
		jp_buttons.setLayout(new GridLayout(5,3));
		
		jp_buttons.add(jb1);
		jp_buttons.add(jb2);
		jp_buttons.add(jb3);
		jp_buttons.add(jb4);
		jp_buttons.add(jb5);
		jp_buttons.add(jb6);
		jp_buttons.add(jb7);
		jp_buttons.add(jb8);
		jp_buttons.add(jb9);
		jp_buttons.add(jb10);
		jp_buttons.add(jb11);
		jp_buttons.add(jb12);
		jp_buttons.add(jb13);
		jp_buttons.add(jb14);
		jp_buttons.add(jb15);
		
		this.setLayout(new BorderLayout());
		this.add(jp_head, BorderLayout.NORTH);
		this.add(jp_buttons, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
