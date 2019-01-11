package draw_online;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ClientMode 
{
	public static Button PenButton = new Button("penbutton");
	public static Graphics pen;
	public Canvas canvas;
	public void canvas ()
	{
		//canvas.addMouseListener(new penListenter());
	}
	
	public static void main(String[] args)
	{
		PenButton.setBounds(500, 200, 200, 200);
		PenButton.addActionListener(new PenButtonActionEvent());
	}
}
