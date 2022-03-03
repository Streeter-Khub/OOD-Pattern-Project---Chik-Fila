/*Observer Pattern
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chik.fila;

/**
* Our first favorite item from Chik-Fil-A!
 * 
 * This class implements Observer (update object) and DisplayItem (display object)
 *  to pass data and update the customer's profile.
 * @author Kenecia
 */
public class FavoriteItem1 implements Observer, DisplayItem {
   
    private int item_Num; // number of items, this would be #1
    private String itemName; // menu item name
    private CustomerProfile customerProfile; // concrete subject 
    
    public FavoriteItem1(int item_Num, String itemName){
        this.setItem_Num(item_Num);
        this.itemName = itemName;
    }

    public void update(){ // only want to update our first favorite lited
        switch (customerProfile.getData())
        {
            case 0: itemName = "Favorite 1: " + customerProfile.getName();
            // pass the name of the menu item selected from our profile
                break;
            case 1: case 2: // only favorite #1 is needed, 
                itemName = "Favorites unavailable";
                break;
        }
        display(itemName); // display item name using out display method
    }
    
    public void setData(String itemName){
        this.itemName = itemName;
    }
    
    public void display(String itemName){ // process is complete for favorite #1
        System.out.println( "Favorite Item #1 " + itemName + " saved to your Menu Favorites");
    }

	/**
	 * @return the item_Num
	 */
	public int getItem_Num() {
		return item_Num;
	}

	/**
	 * @param item_Num the item_Num to set
	 */
	public void setItem_Num(int item_Num) {
		this.item_Num = item_Num;
	}
}
