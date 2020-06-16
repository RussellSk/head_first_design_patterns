package Chapter4.AbstractFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new CalmPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            default:
                return null;
        }
        return pizza;
    }
}
