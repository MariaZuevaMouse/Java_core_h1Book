package java_core.threads14.swingWorker;

import java_core.threads14.swing.SwingThreadFrame;

import javax.swing.*;
import java.awt.*;

public class SwingWorkerTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new SwingWorkerFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
