package carrentapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name ="car_category")
public class CarCategoryEntity {
      @Id
      @Column(nullable =false, unique =true)
      @GeneratedValue(strategy =GenerationType.IDENTITY)
      private Integer typeID;
      @Column(length =100,unique =true,nullable =false)
      private String carType ="Unknown";
      @Column(nullable =false)
      private Double dailyrate =0.0;  // validate at panel
      private Double hourlyrate =0.0;
      @OneToMany(mappedBy ="carCategoryEntity", cascade =CascadeType.ALL ,targetEntity =CarEntity.class)
      private List<CarEntity> cars =new ArrayList<>();   
      
      
      
      
      
      
      public void validation(){
              if(carType ==null){
                  throw new IllegalArgumentException("Invalid CarType");
              }
              if(dailyrate <=0.0 || dailyrate ==null ){
                    throw new IllegalArgumentException("Invalid Rate");
              }
      }


}