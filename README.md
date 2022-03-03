# OOD-Pattern-Project---Chik-Fila
Problem Statement: User looks to customized favorite meals with sides with in Chik Fila mobile application device. Example: Monterey Cheese Chicken Sandwich (fried) with a side of Mac-N-Cheese. This app looks to improve and solve a fictional problem with Chik Fila’s ordering menu. This will incorporate new features by applying a customize menu by users in the company’s mobile application. With incorporating this new feature, customers will be allowed to mix and match different menu items with the ability to save items under their profile.

Users and Stakeholders: The Users for this project will be fictional Chik Fila customers and fictional Chik Fila product design managers. Managers will be able to scale this product to meet whatever design needs for future usage.

Scope: The scope of this new menu ordering app will allow customers to mix and match products while savin\’\’g exact totals for *special* requests and any combinations of menu items. The scope of this app is to employ flexibility in scaling different selections without having to be fixed to only Fried or Grilled Sandwiches. 

Patterns - 

* Abstract/Strategy - performs selection of sandwich & sides with in the Chikfila store
* Observer - perform updates to our list of favorite items.

* Display items is an interface used to display our favorite 
 *  items from our customer profile. Our itemName will be out menu
 *  items such as sandwich and sides.

 * FaveOrder is considered our subject in the observer pattern. This gives us 
 *  the ability to add, delete or notify our favorite list (objects which in this
 *  case is the menu items).

* CustomerProfile is our concrete subject that implements FaveOrder interface.
 * We are able to create our Array of favorites which will add, delete or notify
 *  our object using the methods created.
