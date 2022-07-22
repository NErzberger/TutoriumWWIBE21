package programmierungI.veranstaltung_3.uebungen;

public class Uebung_2 {
	
	public static void main(String[] args) {
		
		Auto a = new Auto();
		Auto b = new Auto();
		Auto c = new Auto();
		
		a.preis = 40000;
		b.preis = 50000;
		c.preis = 40000;
		
		a.farbe = "schwarz";
		b.farbe = "wei�";
		c.farbe = "schwarz";
		
		if(a.equals(b)) {
			System.out.println("a=b");
		} else {
			System.out.println("a!=b");
		}
		
		if(b.equals(c)) {
			System.out.println("b=c");
		} else {
			System.out.println("b!=c");
		}
		
		if(c.equals(a)) {
			System.out.println("a=c");
		} else {
			System.out.println("a!=c");
		}
		
		Auto[] autos = {a, b, c};
		
		for(int i = 0; i < autos.length; i++) {
			if(autos[i] instanceof Auto) {
				System.out.println(i + ". Objekt ist ein Auto!");
			}
		}
		
	}

}
