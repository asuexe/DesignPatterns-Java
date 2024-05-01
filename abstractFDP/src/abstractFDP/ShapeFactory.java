package abstractFDP;
public class ShapeFactory extends AbstractFactory {
	@Override
	public shape getShape(String str) {
		if(str.contentEquals("ractangle")) {
			return new ractangle();
		}
		return null;
	}
}
