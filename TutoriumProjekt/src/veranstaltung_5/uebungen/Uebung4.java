package veranstaltung_5.uebungen;

import java.time.LocalDateTime;

public class Uebung4 {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(2022, 03, 10, 12, 0);
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today.getDayOfMonth() - date.getDayOfMonth());

	}

}
