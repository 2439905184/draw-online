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
		Frame f = new Frame("Draw_Online");//�½���ܲ����ñ���

		Button button_ClientMode = new Button();
		Button button_MorePeopleMode = new Button();
		f.setSize(1320, 850);//���ÿ�ܴ�С
		f.setVisible(true);//���ÿɼ���
	//	pl.setLayout(null);
   //pl.removeAll();
		button_ClientMode.setLabel("����ģʽ");
		button_MorePeopleMode.setLabel("����ģʽ");
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