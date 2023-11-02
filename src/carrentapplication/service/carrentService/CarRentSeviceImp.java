/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.carrentService;

import carrentapplication.dto.RentDetailDto;
import carrentapplication.entity.CalculationsRent;
import carrentapplication.entity.CarEntity;
import carrentapplication.entity.CustomerEntity;
import carrentapplication.entity.Dates;
import carrentapplication.entity.RentalDetailEntity;
import carrentapplication.entity.RentsEntity;
import carrentapplication.repository.RepositoryFactory;
import carrentapplication.repository.car.CarRepository;
import carrentapplication.repository.customer.CustomerRepository;
import carrentapplication.repository.rentaldetail.RentalDetailRepository;
import carrentapplication.repository.rents.RentsRepository;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Manidu
 */
public class CarRentSeviceImp implements CarRentService {
    CustomerRepository customerRepository =(CustomerRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
    RentsRepository  rentsRepository =(RentsRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RENTS);
    RentalDetailRepository rentalDetailRepository =(RentalDetailRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RENTALDETAIL);
    CarRepository carRepository =(CarRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CAR);

    @Override
    public String rentCar(String userName,RentDetailDto dto) throws Exception {
             Session session =SessionFactoryConfiguration.getInstance().openSession();
             Transaction transaction =session.beginTransaction();
          try {
              
              CustomerEntity customer =customerRepository.getCustomerByUserName(session, userName);
              CarEntity car =carRepository.getCarByV_No(session, dto.getV_no());
              Dates date =new Dates(dto.getFromDate(), dto.getToDate());
              CalculationsRent calculation =new CalculationsRent(dto.getTotal(), dto.getAdvance(), dto.getRemain());
              
              RentalDetailEntity rentDetail =new RentalDetailEntity( date, calculation, dto.getNic(), car);
              RentsEntity rents =new RentsEntity(customer);
               rentDetail.setRent(rents);
               date.validation();
          //     customer.getRents().add(rents);
          //     car.getRentdetails().add(rentDetail);
              
              
              Integer id =rentsRepository.add(session,rents);
              if(id !=null){
                    Integer id1 =rentalDetailRepository.add(session, rentDetail);
                    
                      if(id1 !=null){
                             transaction.commit();
                             return "successfull rent a car";
                      } else{
                           transaction.rollback();
                           return "rental detail save error";
                      }
                  
                  
              }   else{
                  transaction.rollback();
                  return  "rent save error";
              }
            
        } catch (Exception e) {
          transaction.rollback();
          e.printStackTrace();
          throw e;
        } finally {
           session.close();
        }
          
    }

   
    
}
