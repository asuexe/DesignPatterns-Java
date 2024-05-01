package abstractFDP;
public class RoundedshapeFactory extends AbstractFactory {
	public shape getShape(String str) {
		if(str.equalsIgnoreCase("ractangle")){
			return new roundedractangle();
		}
		else {
			return null;
		}
	}
}
