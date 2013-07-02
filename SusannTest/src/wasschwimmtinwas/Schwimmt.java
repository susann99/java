package wasschwimmtinwas;
import javax.swing.*;

public class Schwimmt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] stoffe = {
				  "Kork", "Gold","Wasser","Polystyrol","Alkohol","Milch","Olivenoel"
		};
		int[] dichte = {
				  480, 19302,1000,1040,789,1030,910
		};
		int zufall2;
		int zufall1 = (int)(Math.random()*6)+1;
		do {
			zufall2 = (int)(Math.random()*6)+1;
		} while (zufall2==zufall1);
		int antwort = eingabe("Schwimmt "+stoffe[zufall1]+" in "+stoffe[zufall2]);
		String ausgabesatz = vergleichen(antwort,dichte[zufall1],dichte[zufall2]);
		JOptionPane.showMessageDialog(null, ausgabesatz);
	}
	
	static int eingabe (String satz){
		int wert = JOptionPane.showOptionDialog(null, satz,"Optionsdialog",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE, null, 
                new String[]{"ja", "nein"}, "ja");
		return wert;
	}
	
	static String vergleichen (int antwort,int stoff1,int stoff2) {
		int loesung = 1;
		if(stoff1 < stoff2){
			loesung = 0;
		}
		if(loesung==antwort){
			return "Richtig";
		} else {
			return "Falsch";
		}
	}

}