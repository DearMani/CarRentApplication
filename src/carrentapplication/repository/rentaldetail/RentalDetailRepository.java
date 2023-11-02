/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.rentaldetail;

import carrentapplication.entity.RentalDetailEntity;
import carrentapplication.repository.CrudRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.bouncycastle.util.Exceptions;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface RentalDetailRepository extends CrudRepository<RentalDetailEntity, Integer>{
       Integer add(Session session,RentalDetailEntity t)throws Exception;
       boolean delete(Session session , Integer orderID)throws Exception;
       boolean checkDurationAvailabilityOfRent(String userName,String v_No,LocalDateTime pickupDate, LocalDateTime returnDate)throws Exception;
       List<Object[]>getCustID_RentID_OrderDetailID_fromDate_ToDate_total_remain_advance(String state,String userName)throws Exception;
       List<Object[]>getCustID_RentID_OrderDetailID_fromDate_ToDate_total_remain_advanceAll(String state)throws Exception;
       List<Double>getIncomeWithInTimeRange(LocalDateTime t1 , LocalDateTime t2)throws Exception;
       
       
}
