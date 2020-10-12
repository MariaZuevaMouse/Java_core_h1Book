package java_core.swingAction11.mouse;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class MouseComponent extends JComponent {
    private static final int DEFAULT_WIDTH= 500;
    private static final int DEFAULT_HEIGHT = 350;

    private static final int SIDE_LENGTH =10;
    private ArrayList<Rectangle2D> squares;
    private Rectangle2D current;

    public MouseComponent() {
        squares = new ArrayList<>();
        current = null;

        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseMotionHandler2());
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        for(Rectangle2D r : squares){
            g2.draw(r);
        }
    }

    public Rectangle2D find(Point2D p){
        for(Rectangle2D r :squares){
            if(r.contains(p)) return r;
        }
        return null;
    }
    public void add(Point2D p){
        double x = p.getX();
        double y = p.getY();

        current = new Rectangle2D.Double(x -SIDE_LENGTH/2,
                y - SIDE_LENGTH/2, SIDE_LENGTH, SIDE_LENGTH);

        squares.add(current);
        repaint();
    }

    public void remove(Rectangle2D s){
        if(s == null) return;
        if(s == current) current= null;
        squares.remove(s);
        repaint();
    }

    private class MouseHandler extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            current = find(e.getPoint());
            if(current == null) add(e.getPoint());
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            current = find(e.getPoint());
            if(current != null && e.getClickCount() >=2){
                remove(current);
            }
        }

    }
    private class MouseMotionHandler2 implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
            if(current != null){
                int x = e.getX();
                int y = e.getY();

                current.setFrame(x - SIDE_LENGTH/2,
                        y - SIDE_LENGTH/2, SIDE_LENGTH, SIDE_LENGTH);
                repaint();
            }
        }


        @Override
        public void mouseMoved(MouseEvent e) {
            if(find(e.getPoint())== null)
                setCursor(Cursor.getDefaultCursor());
            else setCursor(
                    Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

        }
    }
}
