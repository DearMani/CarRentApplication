/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.entity;

import java.io.Serializable;
import javax.persistence.Column;
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

public class Name implements Serializable {
  
  
       @Column(length =100,name ="First_Name",nullable =false)
       private String firstName;
       @Column(length =100,name ="Last_Name")
       private String lastName;
  
}
