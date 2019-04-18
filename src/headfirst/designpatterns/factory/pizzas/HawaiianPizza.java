package headfirst.designpatterns.factory.pizzas;

public class HawaiianPizza extends Pizza{

    public HawaiianPizza() {
        name = "Hawaiian Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
        toppings.add("Pineapple");
        toppings.add("Bacon");
        toppings.add("Pork ball");
    }
}
