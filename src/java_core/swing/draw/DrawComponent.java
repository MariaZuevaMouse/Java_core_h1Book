package java_core.swing.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        //прямоугольник

        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);

        //ellipse

        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);

        // diagonal line

        g2.draw(new Line2D.Double(leftX, topY, leftX+width, topY+height));

        //окружность с тем же центором

        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX +radius, centerY +radius);
        g2.draw(circle);

    }
    public Dimension getPrefferedSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }


}
