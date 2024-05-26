import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class SpaceShip extends JPanel{
    int x= 0;
    int y= 0;
    private Image SpaceShipImage;
    SpaceShip()
    {
        super();
        try {
            SpaceShipImage = ImageIO.read(new File("./ship.png"));
        }
 catch(IOException e) {
            System.out.println(e);
        }
    }


    public void moveLeft(){
        x = x-20;
        repaint();
    }
    public void moveRight(){
        x = x+20;
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        //g.fillRect(x, y, 100, 100);
        g.drawImage(SpaceShipImage, x, y,100, 100, this);
}
}