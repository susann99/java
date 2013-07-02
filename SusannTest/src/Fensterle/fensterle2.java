package Fensterle;

import java.awt.*;
import javax.swing.*;


public class fensterle2 {
    public static void main (String[] args) {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Datei Manager");
        fc.showOpenDialog(null);
    }
}