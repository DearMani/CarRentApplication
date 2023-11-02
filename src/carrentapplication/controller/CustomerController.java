/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.dto.CustomerDto;
import carrentapplication.service.ServiceFactory;
import carrentapplication.service.customer.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Manidu
 */
public class CustomerController {
             CustomerService customerService =(CustomerService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
             
             public ArrayList<CustomerDto> getAllCustomers() throws Exception{
                       return  customerService.getAllCustomers();
             }
             
             public CustomerDto getCustomer(String id)throws Exception{
                        return  customerService.getCustomer(id);
             }
             
             public boolean deleteCustomer(String id) throws Exception{
                 return customerService.deleteCustomer(id);
             }
             
             public boolean updateCustomer(CustomerDto customerdto)throws Exception{
                   return customerService.updateCustomer(customerdto);
             }
             
}