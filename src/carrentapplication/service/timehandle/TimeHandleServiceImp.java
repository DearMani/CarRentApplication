/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.timehandle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Manidu
 */
public class TimeHandleServiceImp implements TimeHandleService{

    @Override
    public LocalDateTime convertLocalDateTime(Date date, Integer hour) throws Exception {
        Calendar calender =Calendar.getInstance();  //singleton design pattern
         calender.setTime(date);
         calender.set(Calendar.HOUR_OF_DAY,hour);
         LocalDateTime localDateTime =LocalDateTime.ofInstant(calender.toInstant(), ZoneId.systemDefault());
         localDateTime =localDateTime.withMinute(0).withSecond(0).withNano(0);
         return localDateTime;
    }

      @Override
    public long calculateFullDaysBetween(LocalDateTime fromDate, LocalDateTime toDate) throws Exception {
            Duration duration = Duration.between(fromDate, toDate);
            long days =duration.toDays();
            return days;
    }

    @Override
    public long calculateRemainingHours(LocalDateTime fromDate, LocalDateTime toDate) throws Exception {
        Duration duration =Duration.between(fromDate, toDate);
        long  days =duration.toDays();
        long hours =duration.toHours();
        long remaininghours =hours -(days*24);
        return remaininghours;
    }
    
}
