package veranstaltung_5;

import java.util.ArrayList;
import java.util.List;

public class Listen {

	
	/**
	 * Das ist eine Javadoc
	 * @since 1.0.1
	 * @category irgendeine Kathegorie
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> stringListe = new ArrayList<>();
		stringListe.add("Das ist der erste String");
		stringListe.add("Das ist der zweite String");
		stringListe.add("Das ist der dritte String");
		for(String s : stringListe) {
			System.out.println(s);
		}
	}

}
