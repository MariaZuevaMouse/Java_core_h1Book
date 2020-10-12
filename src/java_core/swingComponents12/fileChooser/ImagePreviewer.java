package java_core.swingComponents12.fileChooser;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImagePreviewer extends JLabel {
    public ImagePreviewer(JFileChooser chooser) {
        setPreferredSize(new Dimension(100, 100));
        setBorder(BorderFactory.createEtchedBorder());

        chooser.addPropertyChangeListener(e->{
            if(e.getPropertyName() ==
            JFileChooser.SELECTED_FILE_CHANGED_PROPERTY){
                File f = (File) e.getNewValue();
                if(f==null){
                    setIcon(null);
                    return;
                }
                ImageIcon icon = new ImageIcon(f.getPath());

                if(icon.getIconWidth()>getWidth())
                    icon = new ImageIcon((icon.getImage().
                            getScaledInstance(getWidth(), -1,
                                    Image.SCALE_DEFAULT)));

                setIcon(icon);
            }
        });



    }
}
