package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView ctv; 
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("xx");
		String src = e.getActionCommand();
		if(src.equals("UP")) 
			this.ctv.increment();
		else if(src.equals("DOWM"))
			this.ctv.decrement();
			
	}

}
