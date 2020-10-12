package java_core.swingComponents12.gridBag;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->           {
            JFrame frame = new FontFrame();
            frame.setTitle("GridBagLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
