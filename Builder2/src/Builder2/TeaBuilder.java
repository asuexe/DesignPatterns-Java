package Builder2;
public class TeaBuilder implements StarBucksBuilder {
	private StarBucks s;
	public TeaBuilder(){
		this.s = new StarBucks();
	}
	public void GetDrink() {
		s.SetDrink("elichai");
	}
	public void GetSize() {
		s.SetSize("large");	
	}
	public StarBucks GetTea() {
		return this.s;
	}
}
