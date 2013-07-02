package rumpfgeschwindigkeit;
import javax.swing.*;

public class RumpfV {

	/**
	 * Berechnung der Rumpfgeschwindigkeit = wurzel[Kiellänge ("denn Länge läuft")]*4,5 km/h
	 * Länge/Eingabe: l
	 * 4.5/Konstante: k
	 * zeichenkette: zk
	 * Rumpfgeschwindikeit/Ergebnis: rv
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		float k = (float)4.5;
		float l = eingabe("Schiffslänge in Meter:");
		float rv = RVRechnen(l,k);
		ausgabe(l,rv);
	}
	static float eingabe (String zk){
		float l = Float.parseFloat(JOptionPane.showInputDialog(zk));
		return l;
	}
	static float RVRechnen (float l,float k) {
		float rv = (float)Math.round((k*Math.sqrt(l))*100)/100;
		return rv;
	}
	static void ausgabe (float l, float rv){
		JOptionPane.showMessageDialog(null,"Dein Schiff ist "+l+" Meter lang.\nDie Rumpfgeschwindigkeit beträgt: "+rv+" km/h");
	}
		
}
