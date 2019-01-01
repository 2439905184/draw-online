package draw_online;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MainWindow
{
	
	public static void main(String[] args) 
	{
		Frame f = new Frame("123");//新建框架并设置标题
		Panel pl = new Panel();
		JLabel lab = new JLabel("hello world");//设置标签
		f.setSize(300, 300);//设置框架大小
		f.setVisible(true);//设置可见性
		f.add(pl);
		pl.add(lab);
		
		MainWindow.drawline();
		f.addWindowListener(new WindowsEvents());
	}
	public static void drawline()
	{
		
	}
}