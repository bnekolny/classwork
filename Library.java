/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Library;

/**
 *
 * @author Bill
 */

import java.util.ArrayList;

public class Library {
    static String hours;
    String address;
    ArrayList<Book> catalog;
    int booknumber;
    
    
    Library (String whereisit){
        catalog = new ArrayList<Book>();
        address = whereisit;
        hours = "9am to 5pm";
    }
    
    

    public void addBook(String newbook){
        Book a = new Book(newbook);
        a.name = newbook;
        catalog.add(a);
    }
    
    public void borrowBook(String somebook){
        for (Book book : catalog) {
            if (somebook.equals(book.name)) {
                if (book.isIn == true) {
                    book.isIn = false;
                    System.out.println("You successfully borrowed "+ book.name);
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
            } else {
                System.out.println("Sorry, this book is not in our catalog.");
            }
        }
    }


public static void main(String[] args){

//Create two libraries
Library firstlibrary = new Library("10 Main St.");
Library secondlibrary = new Library("228 Liberty St.");


//firstlibrary.addBook("Le Petit Prince");
firstlibrary.addBook("A Tale of Two Cities");
firstlibrary.addBook("The Lord of The Rings");

//print addresses and hours
System.out.println("Library hours:");
System.out.println("Libraries are open from " + Library.hours);
System.out.println("Library addresses:");
System.out.println(firstlibrary.address);
System.out.println(secondlibrary.address);


//test borrowBook method
firstlibrary.borrowBook("The Lord of The Rings");
firstlibrary.borrowBook("The Lord of The Rings");
secondlibrary.borrowBook("The Lord of The Rings");


}
}
