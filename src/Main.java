/**
 * Created by Sugarcoder on 9/8/2015.
 */

public class Main {

    public static void main(String[] args) {
        FrozenYogurt frozenYogurt = new FrozenYogurt("Regular cone", 1.00, "Strawberry", 1, 0.50, "yogurt");
        System.out.println("The total price for frozen yogurt is " + frozenYogurt.eatFrozenYogurt());
        frozenYogurt.orderFrozenDessert();


        IceCream iceCream = new IceCream("sugar cone", 2.00, "Chocolate", 2, 1.00, "cream");
        System.out.println("The total price of ice cream is " + iceCream.eatFrozenYogurt());
        iceCream.orderFrozenDessert();


        sorbet sorbet = new sorbet("Waffle cone", 3.00, "French vanilla", 3, 1.50, "sweetened water");
        System.out.println("The total price of sorbet is " + sorbet.eatFrozenYogurt());
        sorbet.orderFrozenDessert();

    }

}
