package Fensterle;

import java.awt.*;
import javax.swing.*;

public class festerle extends Frame {
    public static void main (String [] args) {
    	festerle dt = new festerle();
        dt.setLocation(300,300);
        dt.setSize(800,400);
        dt.setTitle("Benutzereingaben - Optionen");
        dt.show();
        String [] optionen = {"Linux", "Windows", "MacOS"};
        int wahl = JOptionPane.showOptionDialog(dt,  
                                                "Option wählen:",  
                                                "Betriebssysteme u.a.", 
                                                JOptionPane.YES_NO_CANCEL_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, 
                                                null, 
                                                optionen, optionen[0]); 
        if (wahl == JOptionPane.YES_OPTION) System.out.println("Linux - source does matter ;-)");
        if (wahl == JOptionPane.NO_OPTION) System.out.println("hm - viel Taschengeld übrig???");
        if (wahl == JOptionPane.CANCEL_OPTION) System.out.println("Unix, Usability & Grafik - WOW!");
        System.exit(0);
    }
}