package java_core.jar13.preferences;

import javax.swing.*;
import java.awt.*;

public class PreferencesTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            PreferencesFrame frame = new PreferencesFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
