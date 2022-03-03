package chik.fila;

public class FriedChickenSandwich extends Sandwich {

    public String prepare() {

        return "Fried Chicken Sandwich: $4.99 added to Order";
    }


    public double returnCost() {
        return 4.99;
    }
}
