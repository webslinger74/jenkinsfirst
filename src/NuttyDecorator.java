
public class NuttyDecorator extends IceCreamDecorator {
	
	public NuttyDecorator(IceCream basicIceCream) {
		super(basicIceCream);
	}
	
	public String makeIceCream() {
		return iceCream.makeIceCream() + getNuts();
	}
	
	public String getNuts() {
		return  " with some lovely nuts on it!!!!";
	}
}
