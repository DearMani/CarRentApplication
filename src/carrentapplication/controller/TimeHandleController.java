/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.service.ServiceFactory;
import carrentapplication.service.timehandle.TimeHandleService;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Manidu
 */
public class TimeHandleController {
      TimeHandleService timeHandle =(TimeHandleService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.TIMEHADLE);
    
          public long calculateFullDaysBetween(LocalDateTime fromDate, LocalDateTime toDate) throws Exception{
                  return timeHandle.calculateFullDaysBetween(fromDate, toDate);
         }
         
         public long calculateRemainingHours(LocalDateTime fromDate, LocalDateTime toDate) throws Exception{
                    return  timeHandle.calculateRemainingHours(fromDate, toDate);
         }
         
            public LocalDateTime  localDateTimeConverter(Date date, Integer hour) throws Exception{
              return timeHandle.convertLocalDateTime(date, hour);
    }
    
    
}
