package java_core.swingComponents12.comboBox;

import javax.swing.*;
import java.awt.*;

public class ComboBoxTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ComboBoxFrame();
            frame.setTitle("Combo box test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
