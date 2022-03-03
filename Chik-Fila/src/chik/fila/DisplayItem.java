/*
 * Observer Pattern
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chik.fila;

/**
 * Display items is an interface used to display our favorite 
 *  items from our customer profile. Our itemName will be our menu
 *  items such as the different sandwiches and sides.
 * 
 * @author Kenecia
 */
public interface DisplayItem {
    public void display(String itemName);
}
