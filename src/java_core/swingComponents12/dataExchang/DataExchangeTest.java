package java_core.swingComponents12.dataExchang;

import javax.swing.*;
import java.awt.*;

public class DataExchangeTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new DataExchangeFrame();
            frame.setTitle("data exchange test");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
}
