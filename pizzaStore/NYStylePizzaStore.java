package pizzaStore;

public class NYStylePizzaStore extends PizzaStore{
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York style cheese pizza.");
		} 
		
		return pizza;
	}
}
