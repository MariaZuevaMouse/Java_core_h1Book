package java_core.swingComponents12.fileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileView;
import java.io.File;

public class FileIconViewer extends FileView {
    private FileFilter filter;
    private Icon icon;

    public FileIconViewer(FileFilter filter, Icon icon) {
        this.filter = filter;
        this.icon = icon;
    }

//    public FileIconViewer(FileNameExtensionFilter filter, ImageIcon imageIcon) {
//    }

    public Icon getIcon(File f){
        if(!f.isDirectory()&& filter.accept(f) ) return icon;
        else return null;
    }
}
