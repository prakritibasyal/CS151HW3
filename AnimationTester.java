
import java.awt.*;

import javax.swing.*;

public class AnimationTester {
 static int width = 400;

    public static void main(String[] args) {
     
        JFrame f = new JFrame();
        CarShape car = new CarShape(width);
        JLabel j = new JLabel(car);

        JButton zoomIn = new JButton("Zoom In");
        JButton zoomOut = new JButton("Zoom out");
        f.setLayout(new FlowLayout());

        f.add(j);
   
       f.setLayout(new BorderLayout(2,1));
     f.add(j , BorderLayout.SOUTH);

        f.add(zoomIn, BorderLayout.WEST);
       
        f.add(zoomOut,BorderLayout.EAST);
       
        zoomIn.addActionListener((e) -> {
        	 if(width>=800) {
                 JOptionPane.showMessageDialog(
                           null,
                           "",
                           "You hit the maximum width.Please Zoom Out ",
                           JOptionPane.INFORMATION_MESSAGE,
                           new CarShape(50));
                
              }
              else {
         width +=50;
         car.setWidth(width);
         car.translate(width+50, width+50);
           j.repaint();
          System.out.println (width);}
         
 });
       
        zoomOut.addActionListener((e) -> {
         if(width<40) {
            JOptionPane.showMessageDialog(
                      null,
                      "",
                      "The width is less than zero. Please zoom In ",
                      JOptionPane.INFORMATION_MESSAGE,
                      new CarShape(50));
           
         }
         else {
         width -=50;
         car.setWidth(width);
         car.translate(width-50, width-50);
         j.repaint();
         }
 });
       
     

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.pack();
      f.setVisible(true);

    }

}