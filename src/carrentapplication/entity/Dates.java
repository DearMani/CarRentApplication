/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.entity;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Manidu
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@Embeddable
public class Dates implements Serializable {
    private LocalDateTime pickUpDateTime;
    private LocalDateTime returnDateTime;

    public void validation()  {
         
      if(pickUpDateTime.isBefore(returnDateTime)){
           System.out.println("pickupDateTime before returnDateTime");
           System.out.println("validation successfull");
      }
       if(pickUpDateTime.isEqual(returnDateTime)){
           throw new  IllegalArgumentException("returnDateTime equal to pickupTime");
      } 
       if(pickUpDateTime.isBefore(LocalDateTime.now()) || pickUpDateTime.isAfter(LocalDateTime.now().plusDays(3))){
                 throw new IllegalArgumentException(" invalid pickup range ");
       }
       
       
       if(Duration.between(pickUpDateTime, returnDateTime).toDays()  > 30){
               throw new  IllegalArgumentException("returnDateTime equal to pickupTime");
       }
     
      else{
          throw new IllegalArgumentException("invalid pickUpDateTime / returnDateTime");
      }      

    }

}
