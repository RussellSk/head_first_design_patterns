package Chapter4.AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "clam":
                pizza = new CalmPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            default:
                return null;
        }

        return pizza;
    }
}
