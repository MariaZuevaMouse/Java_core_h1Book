package java_core.swingComponents12.EventTracer;

import javax.swing.*;
import java.awt.*;

public class EventTracerTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new EventTracerFrame();
            frame.setTitle("EventTracerTest");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
