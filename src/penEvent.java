package draw_online;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class penEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		System.out.println("pen!");
		MainWindow.pl.addMouseMotionListener(new MouseEvent());
	}

}
