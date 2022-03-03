/*
 * Observer Pattern
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chik.fila;

import java.util.*;

/**
 * CustomerProfile is our concrete subject that implements FaveOrder interface.
 * We are able to create our Array of favorites which will add, delete or notify
 *  our object using the methods created.
 * 
 * 
 * @author Kenecia
 */
public class CustomerProfile implements FaveOrder {
    private List<Observer> favorites = new ArrayList<Observer>(); // favorite list
    private String itemName; // each menu item (i.e. sandwich or side)
    private int item_Num; // number of favorites
    
    public CustomerProfile(String itemName){ 
        this.itemName = itemName;
    } 
    //lets add methods from our FaveOrder interface
    public void addObserver(Observer o){
        favorites.add(o);
    }
   
    public void deleteObserver (Observer o){
        int i = favorites.indexOf(o);
        if (i >= 0){
            favorites.remove(i);
        }
    }
    @Override
    public void notifyObserver(){
        for (int i = 0; i < favorites.size(); i++){
            Observer observer = favorites.get(i);
            observer.update();
        }
    }
    // when/if data is changed we will use this method to notify our array  
    public void dataChanged(){
        notifyObserver();
    }
    // in our main class, our data is set using the item Name selected
    // and the data is changed
    public void setData(String itemName){
        this.itemName = itemName;     
                
        dataChanged();
    }
    // display the item name from our profile
    public String display(){
         return itemName;      
    }
    // we need the name of the menu item
    public String getName(){
          return itemName;
      }
    // we need the number for this favorite - can only save up to 3 items
    // will have the ability to expand this selection.
    public int getData(){
        return item_Num;
     }
}
