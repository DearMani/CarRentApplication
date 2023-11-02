/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.customer;

import carrentapplication.dto.CustomerDto;
import carrentapplication.entity.CustomerEntity;
import carrentapplication.entity.Name;
import carrentapplication.repository.RepositoryFactory;
import carrentapplication.repository.customer.CustomerRepository;
import java.util.ArrayList;

/**
 *
 * @author Manidu
 */
public class CustomerServiceImp implements CustomerService {
        
    CustomerRepository customerRepository =(CustomerRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
    

    @Override
    public Integer addCustomer(CustomerDto customerdto) throws Exception {
        CustomerEntity customer =new CustomerEntity();
         return customerRepository.add(customer);
    }

    @Override
    public boolean updateCustomer(CustomerDto customerdto) throws Exception {
            CustomerEntity customerEntity =customerRepository.get(customerdto.getId());
            
            customerEntity.getName().setFirstName(customerdto.getFirstName());
            customerEntity.getName().setLastName(customerdto.getLastName());
            customerEntity.setAge(customerdto.getAge());
            customerEntity.setAddress(customerdto.getAddress());
            customerEntity.setPhoneNumber(customerdto.getPhoneNumber());
            customerEntity.setEmail(customerdto.getEmail());
            customerEntity.setType(CustomerEntity.GenderType.AsEnum(customerdto.getGenderType()));
            return customerRepository.update(customerEntity);
         
    }

    @Override
    public boolean deleteCustomer(String Id) throws Exception {
         return customerRepository.delete(Integer.valueOf(Id));
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
          CustomerEntity customerEntity  =customerRepository.get(Integer.valueOf(id));
          return new CustomerDto(customerEntity.getCustomerID(),
                  customerEntity.getName().getFirstName(),
                  customerEntity.getName().getLastName(),
                  customerEntity.getAge(),
                  customerEntity.getAddress(),
                  customerEntity.getPhoneNumber(),
                  customerEntity.getEmail(),
                  CustomerEntity.GenderType.AsString(customerEntity.getType()));
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
              ArrayList<CustomerEntity> customers =customerRepository.getAll();
              ArrayList<CustomerDto> customersdto =new ArrayList<CustomerDto>();
              for(CustomerEntity customer : customers){
                     CustomerDto customerdto =new CustomerDto(customer.getCustomerID(),
                             customer.getName().getFirstName(), 
                             customer.getName().getLastName(), 
                             customer.getAge(), 
                             customer.getAddress(), 
                             customer.getPhoneNumber(),
                             customer.getEmail(), 
                             CustomerEntity.GenderType.AsString(customer.getType()) );
                     
                             customersdto.add(customerdto);        
              }
             return  customersdto;
    }
    
}
