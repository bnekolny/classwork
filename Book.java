/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author Bill
 */
public class Book {
    
    //class definition
    String name;
    boolean isIn;
    
    //constructor?  YES, needed
    Book (String bookname){
        name = bookname;
        isIn = true;

    }
    
    public void Book(String bookTitle){

        Book a = new Book(name);
//        a.name = bookTitle;
        
    }    

    /**
     *
     */

            public void WhatBook(){
            System.out.println("Title: " + name);
//            System.out.println("And the book number is " + booknumber);

        }
            public void CheckAvailable(){
                System.out.println("Is it available? " + isIn);
            }
            //Check-in method, may need to go in Library class
            public void CheckIn(){
                if (isIn == false){
                    isIn=true;
//                    System.out.println(name + " has been checked into the library.");
//                }else
//                    System.out.println(name + " is not checked out.");
            }
            }
            
            //Check-out method, may need to go in Library Class
            public void CheckOut(){
                if (isIn == true){
                    isIn = false;
//                    System.out.println(name + " has been checked out of the library.");
//                }else
//                    System.out.println(name + " is already checked out.");
            }
            }
    
    
    
    
    
public static void main(String[] arguments){
//    Book CatinHat = new Book("Cat in the Hat");
    Book AtlasShrugged = new Book("Atlas Shrugged");
//    Book HungerGames = new Book("Hunger Games");
//    CatinHat.WhatBook();
    AtlasShrugged.WhatBook();
    AtlasShrugged.CheckAvailable();
//    CatinHat.CheckAvailable();
//    HungerGames.CheckAvailable();
    //cant return total number of book instances, i would have to call out an instance to return a value.
    //System.out.println(book.length);

    //CatinHat.CheckIn();

    //AtlasShrugged.CheckIn();
    //CatinHat.CheckOut();
    AtlasShrugged.CheckOut();
    AtlasShrugged.CheckAvailable();
    AtlasShrugged.CheckIn();
    AtlasShrugged.CheckAvailable();
    //AtlasShrugged.CheckOut();
    
//    Book TheDaVinciCode = new Book("The Da Vinci Code");
//    Book LePetitPrince = new Book("Le Petit Prince");
//    Book ATaleofTwoCities = new Book("A Tale of Two Cities");
//    Book TheLordofTheRings = new Book("The Lord of The Rings");
//    TheDaVinciCode.WhatBook();
//    LePetitPrince.WhatBook();
    
}
}

