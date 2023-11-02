/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.customer;

import carrentapplication.entity.CustomerEntity;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Manidu
 */
public class CustomerRepositoryImp implements CustomerRepository {

    @Override
    public Integer addCustomer(CustomerEntity customer, Session session) throws Exception {
          Integer id =(Integer)session.save(customer);
          return  id;
    }

    @Override
    public Integer add(CustomerEntity t) throws Exception {
       Session session =SessionFactoryConfiguration.getInstance().openSession();
       Integer id =(Integer)session.save(t);
       session.close();
       return id;
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
         Session session =SessionFactoryConfiguration.getInstance().openSession();
           Transaction transaction =session.beginTransaction();
        try {
                session.update(t);
              session.flush();
              transaction.commit();      
              return true; 
        } catch (Exception e) {
                 e.printStackTrace();
                 transaction.rollback();
        } finally {
             session.close();
             
        }
        return false;
         
     

     
    }

    @Override
    public boolean delete(Integer id) throws Exception {
               Session session =SessionFactoryConfiguration.getInstance().openSession();
               Transaction trasaction =session.beginTransaction();                
          try {
             
               session.delete(get(id));
               session.flush();
               trasaction.commit();
              return true;
        } catch (Exception e) {
               trasaction.rollback();
            e.printStackTrace();
            throw e;
         
      }  finally {
                  session.close();
          }
          
    }

    @Override
    public CustomerEntity get(Integer id) throws Exception {
               Session session =SessionFactoryConfiguration.getInstance().openSession();
               Transaction tr =session.beginTransaction();
               CustomerEntity customer  =session.get(CustomerEntity.class, id);
                 tr.commit();
                 session.close();
                 return  customer;
             
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
           
        Session session =SessionFactoryConfiguration.getInstance().openSession();
        Transaction transaction =session.beginTransaction();
        CriteriaBuilder criteriaBuilder =session.getCriteriaBuilder();
        CriteriaQuery<CustomerEntity> criteriaQuery =criteriaBuilder.createQuery(CustomerEntity.class);
        Root<CustomerEntity> root =criteriaQuery.from(CustomerEntity.class);
        criteriaQuery.select(root);
        List<CustomerEntity> customers =session.createQuery(criteriaQuery).getResultList();
        transaction.commit();
        session.close();
        return (ArrayList<CustomerEntity>)customers;
        
       
    }

    @Override
    public CustomerEntity getCustomerByUserName(Session session,String userName) throws Exception {
        
             
                
                 String sql ="select c.customerID from "+
                                    "customer c "+
                                     "inner join account a "+
                                      "on a.customerID = c.customerID "+
                                      "where a.userName =:userName";
                 Query<Integer> query =session.createSQLQuery(sql);
                 query.setParameter("userName", userName);
                  Integer id =query.uniqueResult();
          
                CustomerEntity customer =get(id);
                if(customer ==null){
                         throw new NullPointerException("customer object is null");
                }
                      return customer;
    }

    @Override
    public Integer getCustomerIDByUserName(String userName) throws Exception {
               Session session =SessionFactoryConfiguration.getInstance().openSession();
                Transaction transaction =session.beginTransaction();
                
                try {
                    
                    String sql ="select c.customerID from "+
                            "customer c "+
                            "inner join "+
                            "account a "+
                            "on a.customerID = c.customerID "+
                            "where a.userName = :userName";
              Query<Integer> query  =session.createSQLQuery(sql);
              query.setParameter("userName", userName);
             
              Integer id = query.uniqueResult();
               transaction.commit();
               return id;
              
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            throw e;
        } finally {
                    session.close();
        }
                
                
                
    }
    
    
    
    
    
    
}
