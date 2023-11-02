/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.service.ServiceFactory;
import carrentapplication.service.checkOverDue.CheckOverDueService;
import java.time.LocalDateTime;

/**
 *
 * @author Manidu
 */
public class CheckOverDueController {
    
    CheckOverDueService overDueSerivce =(CheckOverDueService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.OVERDUE);
    public Double getOverDue(LocalDateTime fromDate, LocalDateTime toDate,Double dailyRate, Double hourlyRate, Double currentTotal, Double advance) throws Exception{
            return  overDueSerivce.getOverDue(fromDate, toDate, dailyRate, hourlyRate, currentTotal, advance);
    }
    
}
