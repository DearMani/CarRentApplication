/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.dto;

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


public class CarCategoryDto {
          private Integer id;
          private String carType;
          private Double dailyRate;
          private Double hourlyRate;

    public CarCategoryDto(String carType, Double dailyRate, Double hourlyRate) {
        this.carType = carType;
        this.dailyRate = dailyRate;
        this.hourlyRate = hourlyRate;
    }
          
}
