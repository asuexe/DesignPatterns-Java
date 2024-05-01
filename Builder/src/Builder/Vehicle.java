package Builder;
class Vehicle {
	 String engine;
	 int wheel;
	 int airbags;
	
	public void getEngine() {
		System.out.println(engine);
	}
	public void getWheel() {
		System.out.println(wheel);
	}
	public void getAirbage() {
		System.out.println(airbags);
	}
	Vehicle(vehicleBuilder b) {
		this.engine = b.engine;
		this.wheel = b.wheel;
		this.airbags = b.airbags;
	}

}
