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
	public static JFrame f = new JFrame("Draw_Online");//新建框架并设置标题
	public static JMenuBar menubar = new JMenuBar();
	/*创建一级菜单*/
	public static JMenu fileMenu = new JMenu("文件");
	public static JMenu aboutMenu = new JMenu("关于");
	//创建一级菜单子菜单
	public static JMenuItem newMenuItem = new JMenuItem("新建");
	//button
	public static Button pen = new Button("笔");
	public static void main(String[] args) 
	{
		
		Button button_ClientMode = new Button();
		Button button_MorePeopleMode = new Button();
		f.setSize(1320, 850);//设置框架大小
		f.setVisible(true);//设置可见性
		f.setJMenuBar(menubar);
		//一级菜单添加到菜单栏
		menubar.add(fileMenu);
		menubar.add(aboutMenu);
		//子菜单添加到一级菜单
		fileMenu.add(newMenuItem);
		newMenuItem.addActionListener(new ActionListener());
		button_ClientMode.setLabel("单人模式");
		button_MorePeopleMode.setLabel("多人模式");
		button_ClientMode.setBounds(500,400, 150, 100);
		button_ClientMode.addActionListener(new ButtonActionListener());
		button_MorePeopleMode.setBounds(500, 500, 150, 100);
		//笔事件
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