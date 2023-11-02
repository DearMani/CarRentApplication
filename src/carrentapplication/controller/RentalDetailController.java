/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.service.ServiceFactory;
import carrentapplication.service.rentaldetail.RentalDetailService;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Manidu
 */
public class RentalDetailController {
        RentalDetailService rentalDetailService =(RentalDetailService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENTDETAIL);
        
        public boolean checkAvailabilityTimeDuration(String userNme,String v_N0, LocalDateTime fromDate,LocalDateTime toDate) throws Exception{
                     return rentalDetailService.checkDurationAvailabilityOfRent(userNme,v_N0, fromDate, toDate);
        }
        
        public List<Object[]> getRentDetail(String state, String userName) throws Exception{
              return  rentalDetailService.getRentDetail(state, userName);
        }
        
        public List<Object[]> getAllRentDetail(String state) throws Exception{
                return  rentalDetailService.getAllRentDetail(state);
        }
        
        public boolean  borrowCar(Integer orderID, boolean isReturn, Double overDue) throws Exception{
             // System.out.println(orderID);
                return rentalDetailService.updateRentDetail(orderID, isReturn, overDue);
        } 
        
        public String CancelRent(String custID, String RentD, String orderID, Double advance ){
             return  rentalDetailService.deleteRent(custID, RentD, orderID, advance);
        }
        
        public List<Double> getIncomeGivenRange(LocalDateTime t1, LocalDateTime t2) throws Exception{
               return  rentalDetailService.getIncomeWithInRange(t1, t2);
        }
}
