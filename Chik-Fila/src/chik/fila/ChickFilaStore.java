package chik.fila;

import java.io.*;
import java.sql.Timestamp;
import java.util.Date;

/*
Chik-Fila Store decides which sub-class of our abstract class Sandwhich/Side to generate
*/

public abstract class ChickFilaStore {

    PrintWriter writer;
    Date date= new Date();
    long time = date.getTime();
    Timestamp ts = new Timestamp(time);

    abstract Sandwich createSandwich(String type);
    abstract Sides createSides(String type);


    public void orderSandwich(String type) throws IOException {

        Sandwich sandwich;

        sandwich = createSandwich(type);

        writer = new PrintWriter(new FileWriter("output.txt", true));

        writer.println(sandwich.prepare());

        //Adding Time Stamp
        writer.println(": Current Time Stamp: "+ts);
        writer.close();



    }


    //Order Sides Method
    public void orderSides(String type) throws IOException {

        Sides sides;

        sides = createSides(type);

        writer = new PrintWriter(new FileWriter("output.txt", true));

        writer.println(sides.prepare());

        writer.println(": Current Time Stamp: "+ts);
        writer.close();

    }


}
