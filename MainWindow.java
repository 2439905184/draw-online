package draw_online;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MainWindow
{
	
	public static void main(String[] args) 
	{
		Frame f = new Frame("Draw_Online");//新建框架并设置标题
		Panel pl = new Panel();
		Button button = new Button();
		JLabel lab = new JLabel("hello world");//设置标签
		f.setSize(1320, 850);//设置框架大小
		f.setVisible(true);//设置可见性
		
		button.setName("mybutton");
		button.setSize(20, 200);
		pl.setBackground(Color.gray);
		f.add(pl);
		pl.add(lab);
		pl.add(button);
		
		Graphics pen = pl.getGraphics();
		pen.setColor(Color.RED);
		pen.drawLine(0, 0, 0, 200);
		
		f.addWindowListener(new WindowsEvents());
	}
	
}