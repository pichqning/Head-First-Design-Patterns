package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleHawaiianPizza extends Pizza {

    public ChicagoStyleHawaiianPizza() {
        name = "Chicago Style Hawaiian Pizza";
        dough = "Crust";
        sauce = "Chicago sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
        toppings.add("Pineapple");
        toppings.add("Bacon");
        toppings.add("Pork ball");
    }
}
