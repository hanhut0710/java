package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {
	public ViDu_FlowLayout( ) {
		this.setTitle("Huynh anh Nhut");
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		
//		FlowLayout fl = new FlowLayout();
//		FlowLayout f2 = new FlowLayout(FlowLayout.RIGHT);
//		FlowLayout f3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		 
//		GridLayout glt = new GridLayout(4, 5);
		BorderLayout blt = new BorderLayout();
		BorderLayout blt1 = new BorderLayout(50, 100);
//		this.setLayout(fl);
		this.setLayout(blt1);
//		this.setLayout(f3);
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		
		this.add(jb1, BorderLayout.NORTH);
		this.add(jb2, BorderLayout.WEST);
		this.add(jb3, BorderLayout.SOUTH);
		this.add(jb4, BorderLayout.EAST);
		this.add(jb5, BorderLayout.CENTER);
//		
//		this.add(jb1);
//		this.add(jb2);
//		this.add(jb3);
//		
//		for(int i=0; i<20; i++)
//		{
//			JButton jb = new JButton(i+"");
//			this.add(jb);
//		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		 ViDu_FlowLayout vidu = new ViDu_FlowLayout();
	}
} 
