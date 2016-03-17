package creator.images;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageFramework {

	 public static BufferedImage loadImage(String filename) {
	        try {
	            // Create a new BufferedImage from the file that supports transparency.
	            BufferedImage bi = ImageIO.read(ImageFramework.class.getResource(filename));
	            BufferedImage buffer = new BufferedImage(bi.getWidth(), bi.getHeight(), BufferedImage.TYPE_INT_ARGB);
	            Graphics2D g2d = (Graphics2D)buffer.createGraphics();
	            g2d.drawImage(bi, 0, 0, null);
	            g2d.dispose();
	            return buffer;
	        } catch(IOException io) {
	            System.out.println(io.getMessage());
	            System.out.println("Error reading file: " + filename);
	            return null;
	        }
	    }
	
}
