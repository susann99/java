package diedichte;

import javax.swing.JOptionPane;

public class DieDichte {

	/**
	 * Dichte = Masse kg / Volumen m³
	 * ρ(dichte) = m / V
	 * Mensch = 80kg/0.0849m³ = 942kg/m³
	 * @param args
	 */
	public static void main(String[] args) {
		float m = eingabe("Masse in kg:");
		float v = eingabe("Volumen in m³:");
		float dichte = DichteRechnen(m,v);
		ausgabe(m,v,dichte);
	}
	static float eingabe (String zk){
		float wert = Float.parseFloat(JOptionPane.showInputDialog(zk));
		return wert;
	}
	static float DichteRechnen (float m,float v) {
		float wert = (float)Math.round((m/v)*100)/100;
		return wert;
	}
	static void ausgabe (float m, float v, float dichte){
		JOptionPane.showMessageDialog(null,"Der Körper hat eine Masse von "+m+" kg und ein Volumen von "+v+" m³.\nDie Dichte beträgt: "+dichte+" kg/m³");
	}
	

}
