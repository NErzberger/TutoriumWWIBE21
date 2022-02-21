package veranstaltung_2;

public class BoolscherAusdruck {

	public static void main(String[] args) {
		// Direkter Zahlenvergleich
		if(5 == 5) {}
		
		// Vergleich von Variablen
		int var1 = 5;
		int var2 = 5;		
		if(var1 == var2) {}
		if(var1 == 5) {}
		
		// über Variablen des Typs boolean
		boolean variableDieStimmt = true;
		if(variableDieStimmt) {}
		
		if((var1 == var2) && (var1 == 5)) {} 
		
	}
}
