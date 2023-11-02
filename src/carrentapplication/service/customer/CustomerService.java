/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.customer;
import carrentapplication.service.SuperService;
import carrentapplication.dto.CustomerDto;
import java.util.ArrayList;


/**
 *
 * @author Manidu
 */


public interface CustomerService  extends SuperService {
           Integer addCustomer(CustomerDto customerdto) throws Exception;
           boolean updateCustomer(CustomerDto customerdto) throws Exception;
           boolean deleteCustomer(String Id) throws Exception;
           CustomerDto getCustomer(String id) throws Exception;
           ArrayList<CustomerDto> getAllCustomers() throws Exception;
       
}
