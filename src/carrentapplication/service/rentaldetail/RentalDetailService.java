/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.rentaldetail;

import carrentapplication.service.SuperService;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Manidu
 */
public interface RentalDetailService extends SuperService{
           boolean checkDurationAvailabilityOfRent(String userName,String v_No,LocalDateTime pickupDate, LocalDateTime returnDate)throws Exception;
           List<Object[]> getRentDetail(String state, String userName)throws Exception;
            List<Object[]> getAllRentDetail(String state)throws Exception;
            boolean updateRentDetail(Integer orderID,boolean isReturn , Double overDue)throws Exception;
            String deleteRent(String custId, String rentID, String orderID,Double advance);
            List<Double> getIncomeWithInRange(LocalDateTime t1 , LocalDateTime t2)throws Exception;
           
}
