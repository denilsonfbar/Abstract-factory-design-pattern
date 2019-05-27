package pizzaStore;

public class Test {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYStylePizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		
	}
}
