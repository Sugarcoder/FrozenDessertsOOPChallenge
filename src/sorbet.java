
public class sorbet extends FrozenYogurt {

    private String mainIngredient;
    private String flavor;
    private String coneName;

    public sorbet(String coneName, double conePrice, String flavor, int topping, double toppingPrice, String mainIngredient) {
        super(coneName, conePrice, flavor, topping, toppingPrice, mainIngredient);
        this.mainIngredient = mainIngredient;
        this.flavor = flavor;
        this.coneName = coneName;
    }

    @Override
    public double eatFrozenYogurt() {
        return super.eatFrozenYogurt();
    }

    @Override
    public void orderFrozenDessert() {
        System.out.println("The main ingredient in sorbet is " + mainIngredient);
        System.out.println("You asked for " + flavor + " ice cream in a " + coneName);
    }
}
