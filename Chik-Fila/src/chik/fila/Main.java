package chik.fila;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/*
User looks to customized favorite meals with sides with in Chik Fila mobile application device. Example: Monterey Cheese Chicken Sandwich (fried) with a side of Mac-N-Cheese. This app looks to improve and solve a fictional problem with Chik Fila’s ordering menu. This will incorporate new features by applying a customize menu by users in the company’s mobile application. With incorporating this new feature, customers will be allowed to mix and match different menu items with the ability to save items under their profile.
*/
public class Main {

    public static void chickenmenu(){
        System.out.println("Welcome to Chik-Fila, what kind of Sandwhich can we get you?");
        System.out.println("");
        System.out.println("MENU");
        System.out.println("----------");
        System.out.println("fried - Fried Chicken Sandwich\n" +
                "grilled - Grilled Chicken Sandwich\n" +
                "bbq - BBQ Sandwich\n" +
                "southwestern - SouthWestern Chicken Sandwich\n" +
                "jamaican - Jamaican Jerk Chicken Sandwich \n" +
                "\n" +
                "Input You Selection Below:");

    }

    public static  void sidesmenu(){
        //Ask for Sides
        System.out.println("What kind of side would you like?");
        System.out.println("fruitcup - Fruit Cup\n" +
                "fries - French Fries\n" +
                "macncheese - Mac N Cheese\n" +
                "\n" +
                "Input You Selection Below:");
    }
    
    public static  void favorites(){
        //Ask our customer to save any items as favorites must type yes or no
        System.out.println("Would you like to save to your favorites? Type Yes or No? ");
    }
        
    public static  void favoritesmenu(){
        //Input favorites customer can type in selection
        System.out.println("Input You Selection Below:");
    }
    
    public static  void morefavorites(){
        //Ask to save MORE favorites must type yes or no
        System.out.println("Would you like to save more to your favorites? Type Yes or No? ");
    }
    
    public static  void addMoreFavorites(){
        //Input favorites customer can type in selection
        System.out.println("Input You Selection Below:");
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

        //base Order created
        ChikFilaSandwich order1 = new ChikFilaSandwich();

        //Scanner Created
        Scanner scanner1 = new Scanner(System.in);

        //display Menu
        chickenmenu();

        //Input assigned to variable
        String sandwhichChoice = scanner1.nextLine();

//loop until correct input
    while(!sandwhichChoice.equals("fried") || sandwhichChoice.equals("grilled")|| sandwhichChoice.equals("bbq") ||
            sandwhichChoice.equals("southwestern") || sandwhichChoice.equals("jamaican") ){

        //sandwhichChoice = scanner1.nextLine();

        if(sandwhichChoice.equals("fried") || sandwhichChoice.equals("grilled")|| sandwhichChoice.equals("bbq") ||
                sandwhichChoice.equals("southwestern") || sandwhichChoice.equals("jamaican")){
            break;
        }
        else{
            System.out.println("Sorry Please Input the correct menu item:");
        }

    }//end of loop


// Type of order1 created below

            if (sandwhichChoice.equals("fried")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("grilled")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("bbq")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("southwestern")) {
                order1.orderSandwich(sandwhichChoice);
            } else if (sandwhichChoice.equals("jamaican")) {
                order1.orderSandwich(sandwhichChoice);
            }

            
            
            //Sides Menu Displayed
        System.out.println("-------------");
        sidesmenu();
        //Get Input for Sides
        Scanner scan = new Scanner(System.in);
        String userinput = scan.nextLine();

        //check for correct input
        while(!userinput.equals("fruitcup") || userinput.equals("fries") || userinput.equals("macncheese")){
            //Get Input for Sides

            //userinput = scan.nextLine();

            if(userinput.equals("fruitcup") || userinput.equals("fries") || userinput.equals("macncheese")){
                break;
            }else{
                System.out.println("Sorry Please Input the correct menu item:");

            }
        }//end of loop



            //Loop for sides selection
            if (userinput.equals("fruitcup")) {

                order1.orderSides("fruitcup");

            } else if (userinput.equals("fries")) {

                order1.orderSides("fries");

            } else if (userinput.equals("macncheese")) {

                order1.orderSides("macncheese");

            }
                else {
                    System.out.println("Order Complete");
            }

        //Favorites list for items, lets print out our favorite list!
        PrintWriter out = new PrintWriter("faveListoutput.txt");
        
        out.println("Chick-Fil-A - My Menu Favorites" + '\n');
        
        favorites();
        
        String scananswer = scanner1.nextLine();
        
        if (!scananswer.equals("yes")){ // no favorites to save? no problem!           
            out.println("Thank You for your order, see you tomorrow!");
            System.out.println("Thank You for your order, see you tomorrow!");
        } else{         // here we start to save our 1st favorite item!  
            System.out.println("-------------");  
            out.println("-------------");
            
            favoritesmenu(); //saving favorite #1 here we go!
                        
            String favoriteChoice = scanner1.nextLine(); // customer enters favorite choice
            
            while(!favoriteChoice.equals("fried") || favoriteChoice.equals("grilled") ||
                    favoriteChoice.equals("bbq") ||
                    favoriteChoice.equals("southwestern") || favoriteChoice.equals("jamaican") ||
                    favoriteChoice.equals("fruitcup") || favoriteChoice.equals("fries") || 
                    favoriteChoice.equals("macncheese")){
                                
                if(favoriteChoice.equals("fried") || favoriteChoice.equals("grilled")||
                        favoriteChoice.equals("bbq") ||
                        favoriteChoice.equals("southwestern") || favoriteChoice.equals("jamaican") ||
                        favoriteChoice.equals("fruitcup") ||
                        favoriteChoice.equals("fries") || favoriteChoice.equals("macncheese"))
                    {
                    break;
                } 
                    else{
                    System.out.println("Sorry Please Input the correct menu item:");
                } 
            }
            
            CustomerProfile item1 = new CustomerProfile("Favorite Item #1 : ");
            // item 1 is created from our customer profile, customer selection 
            // entered will be our favorite choice!
            // FavoriteItem 1 uses the value 1 and the favoriteChoice to drive
            //this update
            
            FavoriteItem1 fave1 = new FavoriteItem1(1, favoriteChoice);
            item1.setData(favoriteChoice);  
            fave1.display(favoriteChoice);           

            //output our favorite 1 to our fave list
            out.println("Favorite Item #1 : ");
            System.out.println(item1.display());
            out.println(item1.display());
            
            //want to add more to favorite? Favorite Item 2
            // have another favortie? yummy!
            
            System.out.println("-------------");    
            morefavorites();        
            
            String scananswer2 = scanner1.nextLine();
        
            if (!scananswer2.equals("yes")){   // only one favorite? thats ok         
                System.out.println("Menu items saved to your favorites, ");
                out.println("Menu items saved to your favorites, ");
            } else{    //here we enter our 2nd favorite choice!       
                System.out.println("-------------");   
                out.println("-------------");
                
                addMoreFavorites();
                
                String favoriteChoice2 = scanner1.nextLine();//customers enter 2nd favorite choice
            
                while(!favoriteChoice2.equals("fried") || favoriteChoice2.equals("grilled") ||
                        favoriteChoice2.equals("bbq") ||
                        favoriteChoice2.equals("southwestern") || favoriteChoice2.equals("jamaican") ||
                        favoriteChoice2.equals("fruitcup") || favoriteChoice2.equals("fries") || 
                        favoriteChoice2.equals("macncheese")){
                                
                    if(favoriteChoice2.equals("fried") || favoriteChoice2.equals("grilled")||
                            favoriteChoice2.equals("bbq") ||
                            favoriteChoice2.equals("southwestern") || favoriteChoice2.equals("jamaican") ||
                            favoriteChoice2.equals("fruitcup") ||
                            favoriteChoice2.equals("fries") || favoriteChoice2.equals("macncheese"))
                        {
                        break;
                    } 
                        else{
                        System.out.println("Sorry Please Input the correct menu item:");
                    }   
                    }
                
                        CustomerProfile item2 = new CustomerProfile("Favorite Item #2 : ");
                   
                        // item 2 is created from our customer profile, customer selection 
                        // entered will be our favorite choice!
                        // FavoriteItem2 uses the value 2 and the favoriteChoice to drive
                        //this update
                        
                        FavoriteItem2 fave2 = new FavoriteItem2(2, favoriteChoice2);
                        item2.setData(favoriteChoice2);
                        fave2.display(favoriteChoice2);
                        
                        //output for favorite 2
                        out.println("Favorite Item #2 : ");
                        System.out.println(item2.display());
                        out.println(item2.display());
            
                            //want to add more to favorite? Favorite Item 3
        
                            System.out.println("-------------");    
                            morefavorites();
        
                            String scananswer3 = scanner1.nextLine();
        
                            if (!scananswer3.equals("yes")){// only 2 favorites? ok!            
                                System.out.println("Menu items saved to your favorites!");
                                out.println("Menu items saved to your favorites!");
                            } else{           //Here we start favorite 3
                                System.out.println("-------------");    
                                out.println("-------------");
                                
                                addMoreFavorites();

                                String favoriteChoice3 = scanner1.nextLine();// customer enters 3rd favorite choice!
            
                                while(!favoriteChoice3.equals("fried") || favoriteChoice3.equals("grilled") ||
                                       favoriteChoice3.equals("bbq") ||
                                       favoriteChoice3.equals("southwestern") || favoriteChoice3.equals("jamaican") ||
                                       favoriteChoice3.equals("fruitcup") || favoriteChoice3.equals("fries") || 
                                       favoriteChoice3.equals("macncheese")){
                
                                    if(favoriteChoice3.equals("fried") || favoriteChoice3.equals("grilled")||
                                       favoriteChoice3.equals("bbq") ||
                                       favoriteChoice3.equals("southwestern") || favoriteChoice3.equals("jamaican") ||
                                       favoriteChoice3.equals("fruitcup") ||
                                       favoriteChoice3.equals("fries") || favoriteChoice3.equals("macncheese"))
                                    {
                                    break;
                                    } 
                                    else{
                                        System.out.println("Sorry Please Input the correct menu item:");
                                    }   
                                }
                                
                                    CustomerProfile item3 = new CustomerProfile("Favorite Item #3 : ");
                                    // item 3 is created from our customer profile, customer selection 
                                    // entered will be our favorite choice!
                                    // Favorite Item 3 uses the value 3 and the favoriteChoice to drive
                                    //this update
                                    
                                    FavoriteItem3 fave3 = new FavoriteItem3(3, favoriteChoice3);
                                    item3.setData(favoriteChoice3);
                                    fave3.display(favoriteChoice3);
                                    
                                    //output for favorite 3
                                    out.println("Favorite Item #3 : ");
                                    System.out.println(item3.display());
                                    out.println(item3.display());
                                }
            }
            // end of our run, we enjoy excellent customers and customer service!
            out.println("Thank You for your order, see you tomorrow!");
            System.out.println("Thank You for your order, see you tomorrow!");
            
            out.close();
        }    
    } // end of main

} // end of class
