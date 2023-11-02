/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service;

import carrentapplication.service.account.AccountServiceImp;
import carrentapplication.service.car.CarServiceImp;
import carrentapplication.service.carcategory.CarCategoryServiceImp;
import carrentapplication.service.carrentService.CarRentSeviceImp;
import carrentapplication.service.checkOverDue.CheckOverDueServiceImp;
import carrentapplication.service.customer.CustomerServiceImp;

import carrentapplication.service.password.PasswordServiceImp;
import carrentapplication.service.rentaldetail.RentalDetailServiceImp;
import carrentapplication.service.timehandle.TimeHandleServiceImp;

/**
 *
 * @author Manidu
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;

    private ServiceFactory(){
        
    }
    public static ServiceFactory getInstance(){
         if(serviceFactory ==null){
              serviceFactory =new ServiceFactory();
         }
         return serviceFactory;
    }

    public SuperService getService(ServiceType service){
       
        switch(service){
            case ACCOUNT : return new AccountServiceImp();
            case CUSTOMER : return new CustomerServiceImp();
            case PASSWORD : return new PasswordServiceImp();
            case CARCATEGORY : return new CarCategoryServiceImp();
            case CAR : return new CarServiceImp();
            case TIMEHADLE : return new TimeHandleServiceImp();
            case CARRENT : return  new CarRentSeviceImp();
            case RENTDETAIL : return new RentalDetailServiceImp();
            case OVERDUE : return new CheckOverDueServiceImp();
           
            default : break;
        }
           return null;
    }


    public enum ServiceType{
          ACCOUNT,CUSTOMER,PASSWORD,CARCATEGORY,CAR,TIMEHADLE,CARRENT,RENTDETAIL, OVERDUE
    }

    
    
    
}
