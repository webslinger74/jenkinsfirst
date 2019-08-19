
public class RaspberrySauceDecorator extends IceCreamDecorator {

	public RaspberrySauceDecorator(IceCream basicIceCream) {
		super(basicIceCream);  // this will set the property on the super abstract class.
	}
	public String makeIceCream() {
		return iceCream.makeIceCream() + getRaspberry();
		
	}
	
	public String getRaspberry() {
		return "added the sauce!!!";
	}
}
