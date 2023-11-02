package carrentapplication.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.mindrot.jbcrypt.BCrypt;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor

@ToString

@Entity
@Table(name ="password")
public class PasswordEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(nullable =false, unique =true)
    private Integer passID;
   // @Column(name ="Salt")
    private String salt;
    @Column(nullable =false,unique =true)
    private String hasshedPassword;
    
    @OneToOne(mappedBy ="passwordEntity" ,targetEntity =AccountEntity.class)
    private AccountEntity accountEntity;

    public void validation(){
           if(salt ==null){
               new IllegalArgumentException("Invalid salt");
           }
           if(hasshedPassword ==null){
                new IllegalArgumentException("Invalid Password");
           }
    }


    //overloading
    private String getSalt(){
         // Random random =new Random();
        //  Integer randomInRange =random.nextInt(10);
          this.salt =BCrypt.gensalt();
           return salt;
    }

    public void setHasshedPassword(String textPassword){
       this.hasshedPassword =BCrypt.hashpw(textPassword,getSalt());
    
    }

    public void setAccountEntity(AccountEntity account){
           this.accountEntity =account; 
    }

}