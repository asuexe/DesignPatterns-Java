package vivek;


class StarbucksOrder {
	   private String drink;
	   private String size;
	   private boolean withMilk;
	   private boolean withSugar;

	   private StarbucksOrder(Builder builder) {
	      this.drink = builder.drink;
	      this.size = builder.size;
	      this.withMilk = builder.withMilk;
	      this.withSugar = builder.withSugar;
	   }

	   public static class Builder {
	      private final String drink;
	      private final String size;
	      private boolean withMilk;
	      private boolean withSugar;

	      public Builder(String drink, String size) {
	         this.drink = drink;
	         this.size = size;
	      }

	      public Builder withMilk(boolean withMilk) {
	         this.withMilk = withMilk;
	         return this;
	      }

	      public Builder withSugar(boolean withSugar) {
	         this.withSugar = withSugar;
	         return this;
	      }

	      public StarbucksOrder build() {
	         return new StarbucksOrder(this);
	      }
	   }

	   public String getDrink() {
	      return drink;
	   }

	   public String getSize() {
	      return size;
	   }

	   public boolean isWithMilk() {
	      return withMilk;
	   }

	   public boolean isWithSugar() {
	      return withSugar;
	   }
	}


