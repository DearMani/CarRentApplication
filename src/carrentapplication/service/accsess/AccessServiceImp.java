/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.accsess;

import carrentapplication.dto.AccountDto;
import carrentapplication.dto.CustomerDto;
import carrentapplication.dto.PasswordDto;
import carrentapplication.entity.AccountEntity;
import carrentapplication.entity.CustomerEntity;
import carrentapplication.entity.Name;
import carrentapplication.entity.PasswordEntity;
import carrentapplication.repository.RepositoryFactory;
import carrentapplication.repository.account.AccountRepository;
import carrentapplication.repository.customer.CustomerRepository;
import carrentapplication.repository.password.PasswordRepository;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Manidu
 */
public class AccessServiceImp {
        AccountRepository accountRepository =(AccountRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.ACCOUNT);
        CustomerRepository customerRepository =(CustomerRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
        PasswordRepository passwordRepository =(PasswordRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.PASSWORD);
    
    
         public String signUp(CustomerDto customerdto ,AccountDto accountdto ,PasswordDto passworddto){
             Session session =SessionFactoryConfiguration.getInstance().openSession();
             Transaction transaction =session.beginTransaction();
                try {
                    
                     AccountEntity account =new AccountEntity();
                    CustomerEntity customer =new CustomerEntity();
                   PasswordEntity password =new PasswordEntity();
                   Name name =new Name();
                   name.setFirstName(customerdto.getFirstName());
                   name.setLastName(customerdto.getLastName());
                   customer.setName(name);
                   customer.setAge(customerdto.getAge());
                   customer.setAddress(customerdto.getAddress());
                   customer.setPhoneNumber(customerdto.getPhoneNumber());
                   customer.setEmail(customerdto.getEmail());
                   customer.setType(CustomerEntity.GenderType.AsEnum(customerdto.getGenderType()));
                   
                   account.setUserName(accountdto.getUserName());
                   account.setAccountType(AccountEntity.AccountType.AsEnum(accountdto.getAccountType()));
                   
                   password.setHasshedPassword(passworddto.getPassword());
                   
                   account.setCustomerEntity(customer);
                   account.setPasswordEntity(password);
                   
               //    customer.setAccountEntity(account);
                   
              //     password.setAccountEntity(account);
                   
                   account.validation();
                   customer.validate();
                   password.validation();
                   
                   Integer accountid =accountRepository.addAccount(account, session);
                   if(accountid  !=-1){
                          
                          Integer customerid =customerRepository.addCustomer(customer, session);
                            if(customerid !=-1){
                                Integer passwordid =passwordRepository.addPassword(password, session);
                                if(passwordid !=-1){
                                        transaction.commit();
                                        return "create Account Successfully";
                                }   else{
                                        transaction.rollback();
                                        return "Password Save Error";
                                }
                                     
                            }  else {
                                  transaction.rollback();
                                  return "Customer save Error";
                            }
                            
                   } else{
                          transaction.rollback();
                          return "Account save Error";
                   }
                                   
                 
             } catch (Exception e) {
                 transaction.rollback();
                 e.printStackTrace();
                 return e.getMessage();
             }
             
               
         }
         
         public boolean handleLogin(String userName, String accountType, String password ) throws Exception{
                   return passwordRepository.userAuthentication(userName, accountType, password);
         }
         
         
         
}
