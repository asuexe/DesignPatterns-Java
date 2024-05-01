 package abstractFDP;
public class execute {
	public static void main(String[] args) {
		AbstractFactory sf = FactoryProducer.getFactory(false);
		shape s = sf.getShape("ractangle");
		s.draw();
		AbstractFactory sf2 = FactoryProducer.getFactory(true);
		shape s2 = sf2.getShape("ractangle");
		s2.draw();
	}
}
