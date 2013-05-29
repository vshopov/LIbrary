/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.lang.Character;
/**
 *
 * @author miroslav.metodiev
 */
public class Book {
    
    private String author;
    private double price;
    private String date;
    private long ISBN;
    
//    public Book (String Author, double Price, String Date, double ISBN){
//    
//        this.author = Author;
//        this.price = Price;
//        this.date = Date;
//        this.ISBN = ISBN;
//    }
   
    public void setAuthor(String Author)
        throws IllegalArgumentException {
         //isDigit(Author[0]);
        if (Author == null ) {
           throw new IllegalArgumentException("Invalid Author");
        }
           this.author = Author;
     
    }
    
    public void setPrice(double Price){
        if (Price ==0 ) {
            throw new IllegalArgumentException("Invalid Price");
            
        }
        
        this.price = Price;
    }
    
    public void setDate(String Date){
        if (Date == null) {
            throw new IllegalArgumentException("Invalid Date ");        
        }
        this.date = Date;
    }
    
    public void setISBN(long ISBN){
        if (ISBN == 0) {
            throw new IllegalArgumentException("Ivalid ISBN it must be at leat 13 characers");
            
        }
        this.ISBN = ISBN;
    }

}
