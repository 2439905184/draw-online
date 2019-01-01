package draw_online;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowsEvents extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
