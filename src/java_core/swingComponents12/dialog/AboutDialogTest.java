package java_core.swingComponents12.dialog;

import javax.swing.*;
import java.awt.*;

public class AboutDialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new DialogFrame();
            frame.setTitle("Dialog test");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
