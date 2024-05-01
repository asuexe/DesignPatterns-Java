package Builder2;

public class CoffeeBuilder implements StarBucksBuilder {
	private StarBucks s;
	public CoffeeBuilder(){
		this.s = new StarBucks();
	}
	public void GetDrink() {
		s.SetDrink("Latte");
	}
	public void GetSize() {
		s.SetSize("large");	
	}
	public StarBucks GetCoffee() {
		return s;
	}
}
