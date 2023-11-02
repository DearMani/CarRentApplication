/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.customer;

import carrentapplication.entity.CustomerEntity;
import carrentapplication.repository.CrudRepository;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
        Integer addCustomer(CustomerEntity customer, Session session) throws Exception;
        CustomerEntity getCustomerByUserName(Session session,String userName)throws Exception;
        Integer getCustomerIDByUserName(String userName)throws Exception;
}
