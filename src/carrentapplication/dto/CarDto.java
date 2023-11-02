/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.dto;

import java.time.Year;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Manidu
 * 
 * 
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class CarDto {
    private Integer id;
    private String v_No;
    private String model;
    private String brand;
    private String color;
    private Integer num_ofsheets;
    private String fuelType;
    private boolean airBags ;
    private Year year;
    private String carType;

    public CarDto(String v_No, String model, String brand, String color, Integer num_ofsheets, String fuelType,boolean airBags, Year year) {
        this.v_No = v_No;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.num_ofsheets = num_ofsheets;
        this.fuelType = fuelType;
        this.airBags =airBags;
        this.year = year;
    }

    public CarDto(Integer id, String v_No, String model, String brand, String color, Integer num_ofsheets, String fuelType, boolean airBags, Year year) {
        this.id = id;
        this.v_No = v_No;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.num_ofsheets = num_ofsheets;
        this.fuelType = fuelType;
        this.airBags = airBags;
        this.year = year;
    }
    
    
    
    
    
    
    
    
}
