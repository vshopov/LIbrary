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
       
        Book book = new Book();
        System.out.println("Enter new book");
        System.out.println("Enter new Author");
        book.setAuthor(input.next());
        System.out.println("Enter new Date");
        book.setDate(input.next());
        System.out.println("Enter price");
        book.setPrice(input.nextDouble());
        System.out.println("Enter book ISBN");
        book.setISBN(input.nextLong());
        
        
       
       
    }
}
