/*
 * Observer Pattern
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chik.fila;

/**
 *This is our 3rd favorite item from Chik-Fil-A!
 * 
 * We will updated this class the same by using case #2! 
 * @author Kenecia
 */
public class FavoriteItem3 implements Observer, DisplayItem {
    private int item_Num;
    private String itemName;
    private CustomerProfile customerProfile;
    
    public FavoriteItem3(int item_Num, String itemName){
        this.setItem_Num(item_Num);
        this.itemName = itemName;
    }

    public void update(){
        switch (customerProfile.getData())
        { // case # 2
            case 2: itemName = "Favorite 3: " + customerProfile.getName(); 
                break;
            case 1: // #2 
            case 0: // #1
                itemName = "Favorites unavailable";
                break;
        }
        display(itemName);
    }
    
    public void setData(String itemName){
        this.itemName = itemName;
    }
  
    public void display(String itemName){
        System.out.println( "Favorite Item #3 " + itemName + " saved to your Menu Favorites");
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
