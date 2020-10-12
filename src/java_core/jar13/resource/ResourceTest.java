package java_core.jar13.resource;

import javax.swing.*;
import java.awt.*;

public class ResourceTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ResourceTestFrame();
            frame.setTitle("Resource test");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
