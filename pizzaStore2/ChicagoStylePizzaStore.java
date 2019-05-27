package pizzaStore2;

public class ChicagoStylePizzaStore extends PizzaStore{
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago style cheese pizza.");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago style clam pizza.");
		}
		
		return pizza;
	}
}
