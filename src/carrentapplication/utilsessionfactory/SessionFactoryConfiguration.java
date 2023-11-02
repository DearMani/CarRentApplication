package carrentapplication.utilsessionfactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import carrentapplication.entity.AccountEntity;
import carrentapplication.entity.CancelRentalDetailEntity;
import carrentapplication.entity.CarCategoryEntity;
import carrentapplication.entity.CarEntity;
import carrentapplication.entity.CustomerEntity;
import carrentapplication.entity.PasswordEntity;
import carrentapplication.entity.RentalDetailEntity;
import carrentapplication.entity.RentsEntity;


public class SessionFactoryConfiguration {
   private static SessionFactoryConfiguration sessionFactoryConfiguration;
   private SessionFactory sessionFactory;

   private SessionFactoryConfiguration(){
       Configuration configuration =new Configuration().configure().
       addAnnotatedClass(AccountEntity.class).
       addAnnotatedClass(CustomerEntity.class).
       addAnnotatedClass(PasswordEntity.class).
       addAnnotatedClass(CarEntity.class).
       addAnnotatedClass(CarCategoryEntity.class).
               addAnnotatedClass(RentsEntity.class).
              addAnnotatedClass(RentalDetailEntity.class).     
               addAnnotatedClass(CancelRentalDetailEntity.class);  
  
               //     addAnnotatedClass(RentsEntity.class).
//       addAnnotatedClass(RentalDetail.class); 
        sessionFactory =configuration.buildSessionFactory();
    
   }

   public static SessionFactoryConfiguration getInstance(){
        if(sessionFactoryConfiguration ==null){
             sessionFactoryConfiguration =new SessionFactoryConfiguration();
        }
        return sessionFactoryConfiguration;
   }
   public Session openSession(){
        return sessionFactory.openSession();
   }

}