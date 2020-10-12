package java_core.swingComponents12.EventTracer;

import javax.swing.*;
import java.awt.*;

public class EventTracerFrame extends JFrame {
    public EventTracerFrame() throws HeadlessException {
        add(new JSlider(), BorderLayout.NORTH);
        add(new JButton("TEST"), BorderLayout.SOUTH);

        EventTracer tracer = new EventTracer();
        tracer.add(this);
        pack();
    }
}
