
public class App {

	public static void main(String[] args) {
			IceCream basic1 = new SimpleIceCream();
			System.out.println(basic1.makeIceCream());
			IceCream nut1 = new NuttyDecorator(basic1);
			System.out.println(nut1.makeIceCream());
			IceCream nutRas1 = new RaspberrySauceDecorator(nut1);
			System.out.println(nutRas1.makeIceCream());
	}

}
