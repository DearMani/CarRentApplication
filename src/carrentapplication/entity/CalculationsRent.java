/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.entity;

import java.io.Serializable;
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
public class CalculationsRent implements Serializable{
    private double total;
    private double advance;
    private double remain;

    CalculationsRent(double total, double advance){
          this.total =total;
          this.advance =advance;
          this.remain =(total - advance);
    }
   
    public void validation(){
          if(total >advance){
                System.out.println("valid successfull");
          }
          else if(total ==advance){
               System.out.println("valid sucessfull");
          }
          else{
               throw new IllegalArgumentException("Invalid Contrast total and advance");
          }
    }


}
