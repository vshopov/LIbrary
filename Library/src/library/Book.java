/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
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
    

  
    public void setAuthor(String Author){
        this.author = Author;
    }
    
    public void setPrice(double Price){
        this.price = Price;
    }
    
    public void setDate(String Date){
        this.date = Date;
    }
    
    public void setISBN(long ISBN){
        this.ISBN = ISBN;
    }
    
    
}
