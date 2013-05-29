/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*; 
import library.Book;
import java.util.*;

/**
 *
 * @author miroslav.metodiev
 */
public class TestLibrary {
    
    public TestLibrary() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
      
    // @Test
    // public void hello() {}
    
         
        Book newBook = new Book();
        @Test
        public void TestBook(){
        
            newBook.setAuthor("asdasd");
             System.out.println("Complete author ");
            newBook.setNameOfBook("as4das45d4a5s54da54s4da45s4da54s@#$%^&(*&(4da54sd54a54sd");
             System.out.println("Complete Name of book");
             newBook.setDate("212112");
              System.out.println("Complete Date");
            newBook.setISBN(151515151);
             System.out.println("Complete ISBN");
            newBook.setNameOfBook("Name of Book");
             System.out.println("Complete");
            newBook.setPrice(12.455555555555554);
            System.out.println("Complete price");
            
            
        }
        
}