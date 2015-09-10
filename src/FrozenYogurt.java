
public class FrozenYogurt {
    private String coneName;
    private double conePrice;
    private String flavor;
    private int topping;
    private double toppingPrice;
    private String mainIngredient;


    public FrozenYogurt(String coneName, double conePrice, String flavor, int topping, double toppingPrice, String mainIngredient) {
        this.coneName = coneName;
        this.conePrice = conePrice;
        this.flavor = flavor;
        this.topping = topping;
        this.toppingPrice = toppingPrice;
        this.mainIngredient = mainIngredient;
    }



    public double eatFrozenYogurt() {
        double totalPrice = conePrice + toppingPrice;
        return totalPrice;
    }


    public void orderFrozenDessert() {
        System.out.println("The main ingredient in frozen yogurt is " + mainIngredient);
        System.out.println("You asked for " + flavor + " frozen yogurt in a " + coneName);
    }

}
