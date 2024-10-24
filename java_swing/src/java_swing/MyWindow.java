package java_swing;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showWindow() {
		this.setVisible(true);
	}
	
	public void showWindow(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showWindow(String title, int width, int height) {
		this.setTitle(title);
		this.setLocation(width, height);
		this.setVisible(true);
	} 
	
	public static void main(String[] args) {
		MyWindow mwd = new MyWindow();
		mwd.showWindow();
		MyWindow mwd2 = new MyWindow();
		mwd2.showWindow("HuynhAnhNhut");
		MyWindow mwd3 = new MyWindow();
	}
}
