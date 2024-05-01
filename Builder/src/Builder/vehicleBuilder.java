package Builder;

public class vehicleBuilder {
	String engine;
	int wheel;
	int airbags;
	public vehicleBuilder setAirbags(int airbag) {
		this.airbags = airbag;
		return this;
	}
	private Vehicle build() {
		return new Vehicle(this);
	}
	
} 
