/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository;

import carrentapplication.repository.account.AccountRepositoryImp;
import carrentapplication.repository.cancelrentdetail.CancelRentDetailRepositoryImp;
import carrentapplication.repository.car.CarRepositoryImp;
import carrentapplication.repository.carcategory.CarCategoryRepositoryImp;
import carrentapplication.repository.customer.CustomerRepositoryImp;
import carrentapplication.repository.password.PasswordRepositoryImp;
import carrentapplication.repository.rentaldetail.RentalDetailRepositoryImp;
import carrentapplication.repository.rents.RentsRepositoryImp;

/**
 *
 * @author Manidu
 */
public class RepositoryFactory {
    
       private static RepositoryFactory factory;
      private RepositoryFactory(){

      }

      public static RepositoryFactory getInstance(){
           if(factory ==null){
              factory =new RepositoryFactory();
           }
           return factory;
      }

      public SuperRepository getRepository(RepositoryType TYPE){
             switch(TYPE){
                  case CUSTOMER : return new CustomerRepositoryImp();
                  case ACCOUNT : return new AccountRepositoryImp();
                  case PASSWORD : return new PasswordRepositoryImp();
                  case CARCATEGORY : return new CarCategoryRepositoryImp();
                  case CAR : return new CarRepositoryImp();
                  case RENTS : return new RentsRepositoryImp();
                  case RENTALDETAIL : return new RentalDetailRepositoryImp();
                  case CANCELRENT : return new CancelRentDetailRepositoryImp();
                  default : break;
             }
             return null;
      }

      public enum RepositoryType{
           CUSTOMER,ACCOUNT,PASSWORD,CARCATEGORY,CAR,RENTS,RENTALDETAIL,CANCELRENT;
      }
    
    
    
    
}
