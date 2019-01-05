package draw_online;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("create new activity");
		MainWindow.pl.removeAll();
		MainWindow.pl.add(ClientMode.buttoon);
		MainWindow.pl.add(ClientMode.PenButton);
	}

}
