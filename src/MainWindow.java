package draw_online;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainWindow
{		
	public static JPanel pl = new JPanel();
	public static JFrame f = new JFrame("Draw_Online");//�½���ܲ����ñ���
	public static JMenuBar menubar = new JMenuBar();
	/*����һ���˵�*/
	public static JMenu fileMenu = new JMenu("�ļ�");
	public static JMenu aboutMenu = new JMenu("����");
	//����һ���˵��Ӳ˵�
	public static JMenuItem newMenuItem = new JMenuItem("�½�");
	//button
	public static Button pen = new Button("��");
	public static void main(String[] args) 
	{
		
		Button button_ClientMode = new Button();
		Button button_MorePeopleMode = new Button();
		f.setSize(1320, 850);//���ÿ�ܴ�С
		f.setVisible(true);//���ÿɼ���
		f.setJMenuBar(menubar);
		//һ���˵���ӵ��˵���
		menubar.add(fileMenu);
		menubar.add(aboutMenu);
		//�Ӳ˵���ӵ�һ���˵�
		fileMenu.add(newMenuItem);
		newMenuItem.addActionListener(new ActionListener());
		button_ClientMode.setLabel("����ģʽ");
		button_MorePeopleMode.setLabel("����ģʽ");
		button_ClientMode.setBounds(500,400, 150, 100);
		button_ClientMode.addActionListener(new ButtonActionListener());
		button_MorePeopleMode.setBounds(500, 500, 150, 100);
		//���¼�
		pen.addActionListener(new penEvent());
		f.add(pl);
		pl.add(button_ClientMode);
		pl.add(button_MorePeopleMode);
		Graphics gra = pl.getGraphics();
		gra.setColor(Color.BLACK);
		gra.drawLine(100, 200,200, 100);

		System.out.println(gra);
		f.addWindowListener(new WindowsEvents());
	}
	
	
	
}