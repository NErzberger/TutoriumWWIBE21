package veranstaltung_5;

public enum Car {

	Audi(150000), 
	Mercedes(80000), 
	BMW(75000), 
	VW(50000), 
	Opel(35000), 
	Seat(20000); 
	
	private final double price;
	
	Car(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}	
}
