/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.dto;

import java.time.LocalDateTime;
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
@Getter 
@Setter
@ToString

public class RentDetailDto {
    
    private String v_no;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private String nic;
    private Double total;
    private Double advance;
    private Double remain;
    
    
}
