package Fensterle;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class fensterle3 {
    public static void main (String [] args) {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Datei Manager");
        fc.setFileFilter(new FileFilter() {
        	//Vorauswahl
                public boolean accept(File f) {
                    return f.getName().toLowerCase().endsWith(".png") || f.isDirectory();
                }
                public String getDescription() {
                    return "Grafikdatei(*.png)";
                }
            });
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            System.out.println(file.getName());
        }
        else System.out.println("Keine Auswahl :-(");
        System.exit(0);
    }
}