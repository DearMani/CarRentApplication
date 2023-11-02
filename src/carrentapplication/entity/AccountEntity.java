package carrentapplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.validation.constraints.Size;

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
@Table(name ="account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(nullable =false,unique =true)
     private Integer accountId;
     @Column(nullable =false, unique =true)
     @Size(min =3, max =50, message ="userName between 3 to 50 character")
     private String userName;
     @Column(columnDefinition ="boolean default false")
     private boolean active =false;

     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private AccountType accountType;

     @OneToOne(targetEntity = CustomerEntity.class)
      @JoinColumn(name ="customerID")
     private CustomerEntity customerEntity;
     
     @OneToOne(cascade =CascadeType.ALL ,targetEntity = PasswordEntity.class)
     @JoinColumn(name ="passID")
     private PasswordEntity passwordEntity;
     
     public void validation(){
          if(userName ==null){
             throw new IllegalArgumentException("Invalid UserName"); 
          }
          if(accountType ==null){
               throw new IllegalArgumentException("Invalid AccountType");
          }
     }
     
     public enum AccountType {
        CUSTOMER,ADMIN;
        
        //convert enumToString
        public static String AsString(AccountType TYPE){
             try {
             AccountType enumValue =TYPE;
             String  TYPEinString =enumValue.toString();
             return TYPEinString;
                  
             } catch (IllegalArgumentException e) {
                  throw new IllegalArgumentException("Invalid Account Type "+TYPE);
             }
            
        }
        
        //convert String into enum
        public static AccountType AsEnum(String stringValue){
              try {
                  AccountType enumValue =AccountType.valueOf(stringValue);
                  return enumValue;
              } catch (IllegalArgumentException e) {
                  throw new IllegalArgumentException("Invalid Account Type "+stringValue);               
              }
        }
   }
  
}