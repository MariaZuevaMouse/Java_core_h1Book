package java_core.swing.fonts;

import java.awt.*;

public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        for(String fontName :fontNames){
            System.out.println(fontName);
        }
        Font harrington14 = new Font("Harrington", Font.BOLD,14);
        Font sansbold14 = new Font("SansSerif", Font.BOLD, 14);
    }
}
