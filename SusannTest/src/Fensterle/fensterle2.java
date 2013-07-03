package Fensterle;

import java.awt.*;
import java.awt.event.*;

public class fensterle2 extends Frame
{
  public fensterle2() 
  {
    setTitle("Java for Blondies, Thermodramatik");  // Fenstertitel setzenxyz
    setSize(800,600);                            	// Fenstergröße einstellen  
    addWindowListener(new MasterWindowListener()); 	// EventListener für das Fenster hinzufügen
                                                 	// (notwendig, damit das Fenster geschlossen werden kann)
    setVisible(true);                            	// Fenster (inkl. Inhalt) sichtbar machen
  }

  class MasterWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      e.getWindow().dispose();                   	// Fenster "killen"
      System.exit(0);                            	// VM "killen" 
    }           
  }

  public static void main (String args[]) 
  {
    new fensterle2();
  }
}