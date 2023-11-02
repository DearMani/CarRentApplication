package carrentapplication.entity;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Convert;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@Entity
@Table(name ="car")
public class CarEntity {
    @Id
    @Column(nullable =false, unique = true)
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer carID;
    @Column(length =30,nullable =false, unique =true)
    private String v_No;
    @Column(nullable =false,length =100)
   // @ColumnDefault(value = "UnKnown")
    private String model ="UnKnown";
    @Column(nullable =false,length =100)
   // @ColumnDefault(value ="UnKnown")
    private String brand ="UnKnown";
    @Column(length =50)
    private String color ="UnKnown";
    @Column(nullable =false)
    private Integer numOfSheets; //combobox
    @Enumerated(EnumType.STRING)
   // @Column(length =20,nullable =false)
    private FuelType fuelType;
    @Column(columnDefinition ="boolean default false")
    private boolean airBags; //check box

    @Column(nullable =false)
    @Convert(converter =YearConverter.class)
    private Year year ; 

    @ManyToOne(targetEntity =CarCategoryEntity.class)
    @JoinColumn(name ="typeID")
    private CarCategoryEntity carCategoryEntity;
    
    
    @OneToMany(mappedBy ="car",cascade =CascadeType.ALL, targetEntity =RentalDetailEntity.class)
    private List<RentalDetailEntity> rentdetails =new ArrayList<>();

    // validations for cardata
    public void validation(){
         if(v_No ==null || !isValidV_No(v_No) ){
             throw new IllegalArgumentException("Invalid vehical Number Format");
         }

         if(fuelType ==null){
             throw new IllegalArgumentException("Invalid Fuel Type");
         }
         if(year.isAfter(Year.now())){
               throw new IllegalArgumentException("Invalid Year");    
         }    
    }

    public boolean isValidV_No(String v_No){
          String v_NoRegEx ="^[a-z]{2}-[A-Z]{2}-\\d{4}$";
          return (Pattern.matches(v_NoRegEx, v_No));
    }

    public enum FuelType{
        PETROL,DIESEL;


         //convert enumToString
     public static String AsString(FuelType TYPE){
           try {
           FuelType enumValue =TYPE;
           String  TYPEinString =enumValue.toString();
           return TYPEinString;
               
          } catch (IllegalArgumentException e) {
               throw new IllegalArgumentException("Invalid Account Type "+TYPE);
           }
         
      }
     
      //convert String into enum
     public static FuelType AsEnum(String stringValue){
            try {
                FuelType enumValue =FuelType.valueOf(stringValue);
                return enumValue;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid Account Type "+stringValue);               
            }
      }
    }   
}

