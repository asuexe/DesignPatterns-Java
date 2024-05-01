package Builder2;
public class StarBucks implements StarBucksPlan {
	private String size;
	private String Drink;
	@Override
	public String SetSize(String size) {
		return this.size = size;
	}
	@Override
	public String SetDrink(String Drink) {
		return this.Drink = Drink;
	}
}
