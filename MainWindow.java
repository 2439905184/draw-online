package draw_online;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MainWindow
{		
	public static Panel pl = new Panel();
	
	public static void main(String[] args) 
	{
		Frame f = new Frame("Draw_Online");//新建框架并设置标题

		Button button_ClientMode = new Button();
		Button button_MorePeopleMode = new Button();
		f.setSize(1320, 850);//设置框架大小
		f.setVisible(true);//设置可见性
	//	pl.setLayout(null);
   //pl.removeAll();
		button_ClientMode.setLabel("单人模式");
		button_MorePeopleMode.setLabel("多人模式");
		button_ClientMode.setSize(20, 10);
		button_ClientMode.addActionListener(new ButtonActionListener());
		pl.setBackground(Color.gray);
		f.add(pl);
		pl.add(button_ClientMode);
		pl.add(button_MorePeopleMode);
		
		Thread thClientMode= new ClientMode();
		thClientMode.start();
		f.addWindowListener(new WindowsEvents());
	}
	
	
	
}