/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;
/**
 *
 * @author Vasil.Shopov
 */
public class Library {
  
    public static void Menu(){
        
        System.out.println("\t Menu:");
        System.out.println(" 1. Enter book:");
        System.out.println(" 2. Search book:");
        System.out.println(" 3. Read book from file:");
        System.out.println(" Enter a choice");
    }
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
       TestPrintClass print = new TestPrintClass();
       print.PrintMethod();
       Menu(); 
       int choice = input.nextInt();
       System.out.println("How many books you wanna enter");
       int numberOfBooks = input.nextInt();
         Book book = new Book();
       
       
        
        switch(choice){
            
                case 1:
                for (int i = 0; i < numberOfBooks; i++) {
                book.setNameOfBook(input.next());
                book.setAuthor(input.next());
                book.setDate(input.next());
                book.setPrice(input.nextDouble());
                book.setISBN(input.nextLong());
                book.printBookContent();

                break;
                 } 

                case 2: 
                //isEmpty(book.setAuthor())
                   
                    if ( numberOfBooks == 0 ) {
                       System.out.println("Error");
                       break;
                    } 
                    else {
                        book.SearchBook(input.next());
                     }
                    
                    break;
                case 3 :break;

                default : 
                    System.out.println("Incorrect choice:");
                    break;

    }
    }

}