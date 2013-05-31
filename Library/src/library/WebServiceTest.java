import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Miroslav.Metodiev
 */
@WebService
public class WebServiceTest
{
   @WebMethod
   public String greetClient(String userName)
   {
	  
      return "Greeting " + userName + "! Have a nice day...";
      
      
   }
}	