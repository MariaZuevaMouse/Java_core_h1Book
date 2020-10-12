package java_core.swing.sizedFrame;

import javax.swing.*;
import java.awt.*;

public class SizedFrame extends JFrame {

    public SizedFrame() throws HeadlessException {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2, screenHeight/2);
        setLocationByPlatform(true);

        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);

    }


}
