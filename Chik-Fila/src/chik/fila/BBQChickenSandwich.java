package chik.fila;

public class BBQChickenSandwich extends Sandwich {

    public String prepare() {
        return "BBQChickenSandwich: $6.99 added to Order";
    }

    public double returnCost() {
        return 6.99;
    }
}
