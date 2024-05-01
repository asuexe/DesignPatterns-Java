package vivek;

public class execute2  {
	   public static void main(String[] args) {
	      StarbucksOrder order = new StarbucksOrder.Builder("Latte", "Venti")
	         .withMilk(true)
	         .withSugar(false)
	         .build();

	      System.out.println("Drink: " + order.getDrink());
	      System.out.println("Size: " + order.getSize());
	      System.out.println("With Milk: " + order.isWithMilk());
	      System.out.println("With Sugar: " + order.isWithSugar());
	   }
	}