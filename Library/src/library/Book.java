/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.lang.Long;
import java.lang.Double;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author miroslav.metodiev
 */
public class Book {
    
    private ArrayList<String> nameOfBook = new ArrayList<String>();
    private ArrayList<String> author = new ArrayList<String>();
    private ArrayList<Double> price = new ArrayList<Double>();
    private ArrayList<String> date = new ArrayList<String>();
    private ArrayList<Long> ISBN = new ArrayList<Long>();
   
    
//    public Book (String Author, double Price, String Date, double ISBN){
//    
//        this.author = Author;
//        this.price = Price;
//        this.date = Date;
//        this.ISBN = ISBN;
//    }
    

    public void setNameOfBook(String NameOfBook) 
    throws IllegalArgumentException{
        if (NameOfBook == null) {
            throw new IllegalArgumentException("Invalid Name");
            
        }
        
        this.nameOfBook.add(NameOfBook);
    }
    
//    public ArrayList<this.nameOfBook> getNameOfBook()throws IllegalStateException{
//        
//         return this.nameOfBook.
//      }
    
    public void setAuthor(String Author)
        throws IllegalArgumentException {
         //isDigit(Author[0]);
        if (Author == null ) {
           throw new IllegalArgumentException("Invalid Author");
        }
           this.author.add(Author);
    }
    
//    public String getAuthor() throws IllegalStateException{
//        return this.author;
//    }
    
    public void setPrice(double Price){
        if (Price ==0 ) {
            throw new IllegalArgumentException("Invalid Price");
            
        }
        
            this.price.add(Price);
    }
    
//    public double  getPrice() throws IllegalStateException{
//        return this.price;
//    }
    
    public void setDate(String Date){
        if (Date == null) {
            throw new IllegalArgumentException("Invalid Date ");        
        }
        this.date.add(Date);
    }
    
//    public String getDate() throws IllegalStateException{ 
//        return this.date;
//    }
    
    
    public void setISBN(long ISBN){
        if (ISBN == 0) {
            throw new IllegalArgumentException("Ivalid ISBN it must be at leat 13 characers");
        }
       this.ISBN.add(ISBN);
    }
    
//    public long getISBN() throws IllegalStateException{
//        return this.ISBN;
//    }
//    
    public void printBookContent(){
       
        for (String s : this.nameOfBook) {
            System.out.println(s);
        }
        
        for (String s : this.author) {
            System.out.println(s);
        }
        
        for (double s : this.price) {
            System.out.println(s);
        }
        
        
        for (String s : this.date) {
            System.out.println(s);
        }
        
        
         for (long s : this.ISBN) {
            System.out.println(s);
        }
    }
    
    public String SearchBook(String search){
         String returnStr = null;
        for (String s : this.nameOfBook) {
           
            System.out.println(s);
            if (s.equals(search)) {
                System.out.println("Searched book is find ");
                returnStr = s;
            }
            
            else 
            {
                returnStr = "Not Fount Book";
            }
        }
        
        return returnStr;
    }

}
