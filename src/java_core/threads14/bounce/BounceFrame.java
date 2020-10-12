package java_core.threads14.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BounceFrame extends JFrame {
    private  BallComponent comp;
    public static  final int STEPS = 1000;
    public static final int DELAY = 3;

    public BounceFrame() throws HeadlessException {
        setTitle("Bounce test");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event-> addBall());
        addButton(buttonPanel, "Close", event-> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    private void addBall() {
        Ball ball = new Ball();
        comp.add(ball);
        for(int i = 1; i<= STEPS; i++){
            ball.move(comp.getBounds());
            comp.paint(comp.getGraphics());
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addButton(Container c, String title, ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }
}
