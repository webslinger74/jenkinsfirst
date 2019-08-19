
public abstract class IceCreamDecorator implements IceCream {
	
	protected IceCream iceCream;

	@Override
	public String makeIceCream() {
	
		return iceCream.makeIceCream();  // this will return "making a basic icecream from SimleIcecream.java
	}
	
	
	public IceCreamDecorator(IceCream basicIceCream) {
		this.iceCream = basicIceCream;
	}

}
