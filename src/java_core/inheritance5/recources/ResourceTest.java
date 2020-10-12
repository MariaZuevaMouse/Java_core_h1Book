package java_core.inheritance5.recources;
/*
 javac resource/ResourceTest.java
jar cvfe ResourceTest.jar resources.Resourceтest \
resources/*.class resources/*.qif
resources/data/*.txt corejava/*.txt
java -jar Resourceтest.jar
* */

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ResourceTest {
    public static void main(String[] args) throws IOException {
        Class cl = ResourceTest.class;
        URL aboutURL = cl.getResource("about.gif");
        ImageIcon icon = new ImageIcon(aboutURL);

        InputStream stream = cl.getResourceAsStream("data/about.txt");
        //String about = new String(stream.read(), "UTF-8"); //String(stream.readAllBytes(), "UTF-8");

        InputStream stream2 = cl.getResourceAsStream("/corejava/title.txt");
        //String title = new String(stream2.read(), "UTF-8").trim();

        //JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);





    }
}
