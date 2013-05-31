package library;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Miroslav.Metodiev
 */
@WebService
public class WebServiceTest1
{
   @WebMethod
   public String greetClient(String userName)
   {
	  
      return "Greeting " + userName + "! Have a nice day...";
      
      
   }
}	