/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Manidu
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name ="cancelrentdetail")
public class CancelRentalDetailEntity implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Integer id; 
   private String custID;
   private String rentID;
   private String orderDetailID;
   private  Double advance;
   private LocalDateTime cancelDate =LocalDateTime.now();
  

    public CancelRentalDetailEntity(String custID, String rentID, String orderDetailID, Double advance) {
        this.custID = custID;
        this.rentID = rentID;
        this.orderDetailID = orderDetailID;
        this.advance = advance;
    }
    
   
    
    
}
