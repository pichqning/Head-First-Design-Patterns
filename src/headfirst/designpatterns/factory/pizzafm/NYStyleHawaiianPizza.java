package headfirst.designpatterns.factory.pizzafm;

public class NYStyleHawaiianPizza extends Pizza {

    public NYStyleHawaiianPizza () {
        name = "NY Style Hawaiian Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";

        toppings.add("Grated parmesan cheese");
        toppings.add("Pineapple");
        toppings.add("Bacon");
        toppings.add("Pork ball");
    }
}
