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
        public void Test(){
        
            newBook.setAuthor("asdasd");
        }
//       public void  newBook.setAuthor("asdasd");{}
//       {
//        newBook.setDate("212112");
//        newBook.setISBN(151515151);
//        newBook.setNameOfBook("Name of Book");
//        newBook.setPrice(12.44);
//        System.out.println("Complete");
//       }
}