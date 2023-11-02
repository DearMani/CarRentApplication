package carrentapplication.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
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
@Table(name ="customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(nullable =false, unique =true)
    private Integer customerID;
    private Name name; //composite attribute
    @Column(nullable =false)
    private Integer age;
    @Column(length =100,nullable =false)
    private String address;

    @Column(length =20,nullable =false)
    private String phoneNumber;  
    @Column(length =100,nullable =false)
    private String email;
    
    @Enumerated(EnumType.STRING)
   // @Size(min =4)
    @Column(length =10)
    private GenderType type; //composite attribute
    

    @OneToOne(mappedBy = "customerEntity",cascade = CascadeType.ALL,targetEntity = AccountEntity.class)
    private AccountEntity accountEntity;
   @OneToMany(mappedBy ="customer", cascade =CascadeType.ALL, targetEntity =RentsEntity.class)
    private List<RentsEntity> rents =new ArrayList<>();
    
    ////////////////////// addvalidations

     //validate data of customer
     public void validate(){
           //validation name
           if((name ==null || name.getFirstName() ==null) || !isValidName(name)){
               throw new IllegalArgumentException("Invalid Name Format");
           }
           //validation age
          if(age ==null || age <0 || age>80){
               throw new IllegalArgumentException("Invalid Age Range");
          }

           //email isnot appropiate for all
         if(email !=null && !isValidEmail(email)){
              throw new IllegalArgumentException("Invalid Email Format");
          }


         if(address ==null){
               throw new IllegalArgumentException("Invalid Address Format");
         }

         if(phoneNumber ==null || !isValidPhoneNumber(phoneNumber)){
               throw new IllegalArgumentException("Invalid phone number");
         }

         if(type ==null){
             throw new IllegalArgumentException("Gender Type Empty");
         }


     }

     private boolean isValidName(Name name){
         String nameRegularex ="^[^\\d]+$";
         if(name.getLastName() !=null){
            return (Pattern.matches(nameRegularex, name.getFirstName()) && Pattern.matches(nameRegularex, name.getLastName()));
         }
           return (Pattern.matches(nameRegularex,name.getFirstName())); 
           

     }

     private boolean isValidEmail(String email){
          String emailRegularex ="^[A-Za-z0-9+_.-]+@(.+)$";
          return (Pattern.matches(emailRegularex, email));
    }

     private boolean isValidPhoneNumber(String phoneNumber){
           String phoneRegularex ="94\\+\\d{9}";
           return (Pattern.matches(phoneRegularex, phoneNumber));
     }
    
     private boolean isValidAddress(String address){
          String addressRegularex ="\\d+[A-Za-z ]+,[A-Za-z ]+,[A-Za-z ]+";
          return (Pattern.matches(addressRegularex, address));
     } 

  ////////////////////////////////////////////////////////////////////////////////////////////////////
     
    //enum
    public enum GenderType{
       MALE,FEMALE;

      //convert enumToString
     public static String AsString(GenderType TYPE){
           try {
           GenderType enumValue =TYPE;
           String  TYPEinString =enumValue.toString();
           return TYPEinString;
               
          } catch (IllegalArgumentException e) {
               throw new IllegalArgumentException("Invalid Account Type "+TYPE);
           }
         
      }
     
      //convert String into enum
     public static GenderType AsEnum(String stringValue){
            try {
                GenderType enumValue =GenderType.valueOf(stringValue);
                return enumValue;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid Account Type "+stringValue);               
            }
      }
  }

    public List<RentsEntity> getRents() {
        return rents;
    }

    public void setRents(List<RentsEntity> rents) {
        this.rents = rents;
    }
  

 
}