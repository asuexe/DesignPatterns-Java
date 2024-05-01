package abstractFactory2;

public class HP extends Device {
	
	String ram;
	String processor;
	String Gpu;
	
	
	public HP(String ram,String processor,String Gpu) {
		this.ram = ram;
		this.processor = processor;
		this.Gpu = Gpu;
		
	}


	@Override
	public String getDetails(String ram, String processor, String gpu) {
		System.out.println("ram is: "+this.ram+" Processor is: "+this.processor+" Gpu is: "+this.Gpu);
	
		return null;
	}
	

}
