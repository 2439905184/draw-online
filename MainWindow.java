package draw_online;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MainWindow
{
	
	public static void main(String[] args) 
	{
		Frame f = new Frame("123");//�½���ܲ����ñ���
		Panel pl = new Panel();
		JLabel lab = new JLabel("hello world");//���ñ�ǩ
		f.setSize(300, 300);//���ÿ�ܴ�С
		f.setVisible(true);//���ÿɼ���
		f.add(pl);
		pl.add(lab);
		
		MainWindow.drawline();
		f.addWindowListener(new WindowsEvents());
	}
	public static void drawline()
	{
		
	}
}