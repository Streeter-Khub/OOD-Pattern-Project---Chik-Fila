package chik.fila;

/*

*/

public class ChikFilaSandwich extends ChickFilaStore{


    public double sandtotal = 0;
    public double sidestotal = 0;

    public void getSandWichTotal(Sandwich x) {
       sandtotal+= x.returnCost();
        System.out.println("Current total " + sandtotal);
    }

    public void getSidesTotal(Sides x) {
        sidestotal += x.returnCost();
        System.out.println("Current total " + (sidestotal + sandtotal));
    }


    public Sandwich createSandwich(String type) {
        //create sandwhich acts as our factory function that determines the object type to be returned. 

        Sandwich sandwich = null;

        if (type.equals("fried")) {
            sandwich = new FriedChickenSandwich();
        } else if (type.equals("grilled")) {
            sandwich = new GrilledSandwich();

        } else if (type.equals("southwestern")) {
             sandwich = new SouthwesternSandwich();
        } else if (type.equals("jamaican")){
            sandwich = new JamaicanChickenSandwich();
    }else if(type.equals("bbq")){
            sandwich = new BBQChickenSandwich();
        }
        else{
            return null;
        }

        getSandWichTotal(sandwich);
        return sandwich;

    }

    public Sides createSides(String type){

        Sides sides = null;

        if(type.equals("macncheese")){
            sides = new MacNCheese();
        }else if(type.equals("fruitcup")){
            sides = new FruitCup();
        }else if(type.equals("fries")){
            sides = new Fries();
        }else{

        }

        getSidesTotal(sides);

        return sides;
    }


}
