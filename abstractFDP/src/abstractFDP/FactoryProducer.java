package abstractFDP;
public class FactoryProducer {
	  public static AbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedshapeFactory();         
	      }else{
	         return new ShapeFactory();
	      }
	   }
}
