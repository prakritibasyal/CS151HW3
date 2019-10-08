import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.Icon;
import javax.swing.event.*;

public class CarShape implements Icon
{

    public CarShape( int width)
    {
        this.width = width;
    }

    public CarShape(int x, int y, int width)
    {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void setWidth(int aWidth)
    {
        width = aWidth;
    }

    public int getWidth()
    {
        return width;
    }


    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body
                = new Rectangle2D.Double(x, y + width / 6,
                width - 1, width / 6);
        g2.fill(body);
        Ellipse2D.Double frontTire
                = new Ellipse2D.Double(x + width / 6, y + width / 3,
                width / 6, width / 6);
        Ellipse2D.Double rearTire
                = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,
                width / 6, width / 6);

        // The bottom of the front windshield
        Point2D.Double r1
                = new Point2D.Double(x + width / 6, y + width / 6);
        // The front of the roof
        Point2D.Double r2
                = new Point2D.Double(x + width / 3, y);
        // The rear of the roof
        Point2D.Double r3
                = new Point2D.Double(x + width * 2 / 3, y);
        // The bottom of the rear windshield
        Point2D.Double r4
                = new Point2D.Double(x + width * 5 / 6, y + width / 6);
        Line2D.Double frontWindshield
                = new Line2D.Double(r1, r2);
        Line2D.Double roofTop
                = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield
                = new Line2D.Double(r3, r4);

        g2.fill(frontTire);
        g2.fill(rearTire);
        g2.draw(body);
       
        g2.fill(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }

    private int x;
    private int y;
    private int width;

  
    public void paintIcon(Component c, Graphics g2, int x, int y) {
        Rectangle2D.Double body
                = new Rectangle2D.Double(x, y + width / 6,
                width - 1, width / 6);
     
        Ellipse2D.Double frontTire
                = new Ellipse2D.Double(x + width / 6, y + width / 3,
                width / 6, width / 6);
        Ellipse2D.Double rearTire
                = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,
                width / 6, width / 6);

        // The bottom of the front windshield
        Point2D.Double r1
                = new Point2D.Double(x + width / 6, y + width / 6);
        // The front of the roof
        Point2D.Double r2
                = new Point2D.Double(x + width / 3, y);
        // The rear of the roof
        Point2D.Double r3
                = new Point2D.Double(x + width * 2 / 3, y);
        // The bottom of the rear windshield
        Point2D.Double r4
                = new Point2D.Double(x + width * 5 / 6, y + width / 6);
        Line2D.Double frontWindshield
                = new Line2D.Double(r1, r2);
        Line2D.Double roofTop
                = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield
                = new Line2D.Double(r3, r4);

        
        ((Graphics2D) g2).fill(frontTire);
        ((Graphics2D) g2).fill(rearTire);
        g2.setColor(Color.GREEN);
        ((Graphics2D) g2).draw(body);
        ((Graphics2D) g2).fill(body);
        g2.setColor(Color.GRAY);
        ((Graphics2D) g2).draw(frontTire);
        ((Graphics2D) g2).draw(rearTire);
        ((Graphics2D) g2).draw(frontWindshield);
        ((Graphics2D) g2).draw(roofTop);
        ((Graphics2D) g2).draw(rearWindshield);

    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return (width/3)*2;
    }

}