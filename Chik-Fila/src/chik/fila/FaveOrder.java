/*
 * Observer Pattern
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chik.fila;

/**
 * FaveOrder is considered our subject in the observer pattern. This gives us 
 *  the ability to add, delete or notify our favorite list (objects which in this
 *  case is the menu items).
 * 
 * @author Kenecia
 */
public interface FaveOrder {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObserver();
    
}
