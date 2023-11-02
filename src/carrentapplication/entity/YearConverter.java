/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.entity;

import java.io.Serializable;
import java.time.Year;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Manidu
 */
@Converter(autoApply =true)
public class  YearConverter implements AttributeConverter<Year,Integer>,Serializable{

  @Override
  public Integer convertToDatabaseColumn(Year year) {
      return (year !=null) ? year.getValue() : null;
  }

  @Override
  public Year convertToEntityAttribute(Integer yearValue) {
     return (yearValue !=null) ? Year.of(yearValue) :null;
  }
    
} 
