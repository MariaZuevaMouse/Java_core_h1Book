package java_core.swingComponents12.slider;


import javax.swing.*;
import java.awt.*;

public class SliderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new SliderFrame();
            frame.setTitle("Slider test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
