import com.sreenutech.model.CustomerDetails;
import com.sreenutech.service.CustomerService;

import java.util.concurrent.ExecutionException;
// hey made changes
public class CustomerMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CustomerService service= new CustomerService();
       CustomerDetails details= service.getCustomerDetails("12");
       System.out.println(details);
    }
}
