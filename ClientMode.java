package draw_online;

import java.awt.Button;
import java.awt.Frame;

public class ClientMode extends Thread
{
	public static Frame f = new Frame();
	public static Button buttoon = new Button("mytest");
	public static Button PenButton = new Button("penbutton");
	
	public static void main(String[] args)
	{
		PenButton.addActionListener(new PenButtonActionEvent());
	}

}
