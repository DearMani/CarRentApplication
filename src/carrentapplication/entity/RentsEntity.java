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
@Table(name ="Rents")
public class RentsEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(nullable =false, unique =true)
    private Integer rentID;
    @Column(nullable =false)
    private LocalDateTime rentDate =LocalDateTime.now();
    @ManyToOne(targetEntity =CustomerEntity.class)
    @JoinColumn(name ="customerID")
    private CustomerEntity customer;
    @OneToOne(mappedBy ="rent",targetEntity =RentalDetailEntity.class)
    private RentalDetailEntity rentalDetail;

    public RentsEntity(CustomerEntity customer) {
        this.customer = customer;
   //     this.rentalDetail = rentalDetail;
    }
    
    
    
    
    
   
}