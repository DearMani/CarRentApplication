/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.checkOverDue;

import carrentapplication.service.SuperService;
import java.time.LocalDateTime;

/**
 *
 * @author Manidu
 */
public interface CheckOverDueService extends SuperService {
          Double getOverDue(LocalDateTime fromDate, LocalDateTime toDate,Double dailyRate, Double hourlyRate, Double currentTotal, Double advance)throws Exception;
}
