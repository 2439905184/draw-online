package draw_online;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseMotionListener;

public class MouseEvent implements MouseMotionListener {

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("mouseMoved");
		PointerInfo Pinfo = MouseInfo.getPointerInfo();
		Point p = Pinfo.getLocation();
		double mx = p.getX();
		double my = p.getY();
		System.out.println("x:"+mx+"y:"+my);
		
	}

}
