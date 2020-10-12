package java_core.swingComponents12.optionDialog;

import javax.swing.*;
import java.awt.*;

public class OptionDialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new OptionDialogFrame();
            frame.setTitle("Test option dialogs");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
