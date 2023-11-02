/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.rentaldetail;

import carrentapplication.entity.CalculationsRent;
import carrentapplication.entity.CancelRentalDetailEntity;
import carrentapplication.entity.RentalDetailEntity;
import carrentapplication.repository.RepositoryFactory;
import carrentapplication.repository.cancelrentdetail.CancelRentDetailRepository;
import carrentapplication.repository.rentaldetail.RentalDetailRepository;
import carrentapplication.service.ServiceFactory;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Manidu
 */
public class RentalDetailServiceImp implements RentalDetailService {
       RentalDetailRepository rentaldetailRepository =(RentalDetailRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RENTALDETAIL);
       CancelRentDetailRepository cancelRentaldetailRepository =(CancelRentDetailRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CANCELRENT);
    
    
    @Override
    public boolean checkDurationAvailabilityOfRent(String userName,String v_No, LocalDateTime pickupDate, LocalDateTime returnDate) throws Exception {
               return  rentaldetailRepository.checkDurationAvailabilityOfRent(userName,v_No, pickupDate, returnDate);
    }

    @Override
    public List<Object[]> getRentDetail(String state, String userName) throws Exception {
        return rentaldetailRepository.getCustID_RentID_OrderDetailID_fromDate_ToDate_total_remain_advance(state, userName);
    }

    @Override
    public List<Object[]> getAllRentDetail(String state) throws Exception {
         return  rentaldetailRepository.getCustID_RentID_OrderDetailID_fromDate_ToDate_total_remain_advanceAll(state);
    }

    @Override
    public boolean updateRentDetail(Integer orderID, boolean isReturn, Double overDue) throws Exception {
           RentalDetailEntity ent =rentaldetailRepository.get(orderID);
          // System.out.println(ent.getId());
           CalculationsRent rent =ent.getCalculationsRent();
           rent.setRemain(0.0);
           ent.setReturn(isReturn);
           ent.setOverDue(overDue);
           ent.setBorrowCarDate(LocalDateTime.now());
           ent.setCalculationsRent(rent);
           
             System.out.println(orderID);
           return rentaldetailRepository.update(ent);
           
    }

    @Override
    public String deleteRent(String custId, String rentID, String orderID, Double advance) {
        Session session =SessionFactoryConfiguration.getInstance().openSession();
        Transaction transaction =session.beginTransaction();
        try {
            CancelRentalDetailEntity cancelRent =new CancelRentalDetailEntity(custId, rentID, orderID, advance);
            Integer id =cancelRentaldetailRepository.add(cancelRent);
            if(id>0){
                boolean state =rentaldetailRepository.delete(Integer.valueOf(rentID));
                if(state){
                    transaction.commit();
                    return "cancel order successfully";
                } else{
                       transaction.rollback();
                       return "error while delete orderDetail";
                }
                
            } else{
                transaction.rollback();
                return "error while save cancelrentdetail";
            }
            
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return  e.getMessage();
        } finally {
            session.close();
        }
        //CancelRentalDetailEntity ent =new CancelRentalDetailEntity(custId, rentID, orderID, advance);
          
        
    }

    @Override
    public List<Double> getIncomeWithInRange(LocalDateTime t1, LocalDateTime t2) throws Exception {
           return  rentaldetailRepository.getIncomeWithInTimeRange(t1, t2);
    }
    
    
    
    
    
}
