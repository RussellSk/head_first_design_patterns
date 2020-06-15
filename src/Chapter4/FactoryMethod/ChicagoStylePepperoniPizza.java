package Chapter4.FactoryMethod;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
