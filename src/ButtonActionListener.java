package draw_online;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		MainWindow.pl.removeAll();
		MainWindow.pl.add(MainWindow.pen);
		MainWindow.pl.validate();
	}

}
