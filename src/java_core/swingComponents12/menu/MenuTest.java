package java_core.swingComponents12.menu;

import javax.swing.*;
import java.awt.*;

public class MenuTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new MenuFrame();
            frame.setTitle("menu test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
}
