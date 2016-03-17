package creator.core;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.util.Random;

public class Player extends Applet{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = (int) screenSize.getWidth();
	static int height = (int) screenSize.getHeight();
	
	public void init(){
		
		this.setSize(width, height);
		
	}
	
	public void paint(Graphics g){
		drawStuff(g);
	}
	
	public void drawStuff(Graphics g){
		int i;
		int count = 0;
		   
		
		String[] images = {"blue\\Blue_Arm.png",
							"red\\Red_Arms.png", 
                			"green\\Green_Arms.png"};
		long startTime = System.currentTimeMillis();
		
		for(i = 0; i < 7325941; i++){
			Random ran = new Random();
			int img_x = ran.nextInt(width);
			int img_y = ran.nextInt(height);
			int random = ran.nextInt(images.length);
			Image img = getImage(getCodeBase(), images[random]);
			g.drawImage(img, img_x, img_y, this);
			count++;
			System.out.println(count);
			
		}
		
		System.out.println("The Process took: " + ((System.currentTimeMillis() - startTime) / 1000));
	}
}
