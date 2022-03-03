package chik.fila;

public class JamaicanChickenSandwich extends Sandwich {

    public String prepare() {
        return "Jamaican Chicken Sandwich: $6.99 added to Order";
    }

    public double returnCost() {
        return 6.99;
    }
}
