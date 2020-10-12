package java_core.swingComponents12.radioButton;

import javax.swing.*;
import java.awt.*;

public class RadioButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new RadioButtonFrame();
            frame.setTitle("RadioButtonTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
