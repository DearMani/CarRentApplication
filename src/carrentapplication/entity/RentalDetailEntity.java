package carrentapplication.entity;



import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name ="rentdetail")
public class RentalDetailEntity {
     @Id
     @GeneratedValue(strategy =GenerationType.IDENTITY)
     @Column(nullable =false,unique =true)
     private Integer id;
     @OneToOne(cascade =CascadeType.ALL,targetEntity =RentsEntity.class)
     @JoinColumn(name ="rentID")
     private RentsEntity rent;
     private Dates date;
     //calculation rent
     private CalculationsRent calculationsRent;
     @Column(columnDefinition = "boolean default false")
     private boolean isReturn =false;
     @Column(name ="Identy_Number",nullable =false)
     private String identification_Number;
    @ManyToOne( targetEntity =CarEntity.class)
    @JoinColumn(name ="carID")
     private CarEntity car;
    
    private Double overDue;
    private LocalDateTime borrowCarDate;

    public RentalDetailEntity(Dates date, CalculationsRent calculationsRent, String identification_Number, CarEntity car) {
      
        this.date = date;
        this.calculationsRent = calculationsRent;
        this.identification_Number = identification_Number;
        this.car = car;
    }
    
     public void validate(){
          if(date ==null || date.getPickUpDateTime() ==null || date.getReturnDateTime() ==null){
             throw new IllegalArgumentException("Invalid LocalDateTime format");
          }

          if(calculationsRent ==null || calculationsRent.getTotal() ==0.0 || calculationsRent.getAdvance() ==0.0){
              throw new IllegalArgumentException("invalid Calculations Formats");
          }

          if(identification_Number ==null || !isValidIdentyNumber(identification_Number)){
                 throw new IllegalArgumentException("Invalid identification number format");
          }

     }

     private boolean isValidIdentyNumber(String id){
         String digitsPart =id.substring(0, 9);
         if(id.length() ==9 && digitsPart.matches("\\d+")){
               return true;
         }  
         char optionalV =id.charAt(id.length()-1);
          if(id.length() ==10 && digitsPart.matches("\\d+") && (optionalV =='V' || optionalV =='v')) {
               return true;
         }

          return false;
     }





}