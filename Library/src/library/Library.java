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
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       TestPrintClass print = new TestPrintClass();
       print.PrintMethod();
       System.out.println("How many books you wanna enter");
       int numberOfBooks = input.nextInt();
       
        for (int i = 0; i < numberOfBooks; i++) {
            
       
        Book book = new Book();
        System.out.println("Enter new book");
        book.setNameOfBook(input.next());
        System.out.println("Enter new Author");
        book.setAuthor(input.next());
        
        System.out.println("Enter new Date");
        book.setDate(input.next());
        System.out.println("Enter price");
        book.setPrice(input.nextDouble());
        System.out.println("Enter book ISBN");
        book.setISBN(input.nextLong());
        
        book.printBookContent();
         } 
    }
}
