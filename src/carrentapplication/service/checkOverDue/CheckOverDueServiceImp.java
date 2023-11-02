/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.checkOverDue;

import carrentapplication.service.ServiceFactory;
import carrentapplication.service.timehandle.TimeHandleService;
import java.time.LocalDateTime;

/**
 *
 * @author Manidu
 */
public class CheckOverDueServiceImp implements CheckOverDueService {
      TimeHandleService timeHandle =(TimeHandleService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.TIMEHADLE);

    @Override
    public Double getOverDue(LocalDateTime fromDate, LocalDateTime toDate, Double dailyRate, Double hourlyRate,Double currentTotal , Double advance) throws Exception {
              
         if(toDate ==LocalDateTime.now().withMinute(0).withSecond(0).withNano(0)){
                return 0.0;     
         }
         
         else if(toDate.isBefore(LocalDateTime.now().withMinute(0).withSecond(0).withNano(0))){
                long days =timeHandle.calculateFullDaysBetween(toDate,LocalDateTime.now().withMinute(0).withSecond(0).withNano(0) );
                long hours =timeHandle.calculateRemainingHours(toDate, LocalDateTime.now().withMinute(0).withSecond(0).withNano(0));
                 
                return  (days*dailyRate + hours*hourlyRate);
             
         }   else if(fromDate.isBefore(LocalDateTime.now().withMinute(0).withSecond(0).withNano(0) )   && toDate.isAfter(LocalDateTime.now().withMinute(0).withSecond(0).withNano(0))    ){
             
             long days =timeHandle.calculateFullDaysBetween( LocalDateTime.now().withMinute(0).withSecond(0).withNano(0), fromDate);
             long hours =timeHandle.calculateRemainingHours( LocalDateTime.now().withMinute(0).withSecond(0).withNano(0), fromDate);
             
             return (-(days*dailyRate + hours*hourlyRate));
             
             
         } else  {
                throw new  IllegalArgumentException("not support cancelling rents");
         }
        
        
        
    }
    
}
