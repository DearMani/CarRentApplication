/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.timehandle;

import carrentapplication.service.SuperService;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Manidu
 */
public interface TimeHandleService extends SuperService {
     LocalDateTime convertLocalDateTime(Date date, Integer hour)throws Exception;
      long calculateFullDaysBetween(LocalDateTime fromDate, LocalDateTime toDate)throws Exception;
       long calculateRemainingHours(LocalDateTime fromDate, LocalDateTime toDate)throws Exception;
}
