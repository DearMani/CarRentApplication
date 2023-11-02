/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.car;

import carrentapplication.entity.CarEntity;
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
public class CarRepositoryImp implements CarRepository {

    @Override
    public Integer add(CarEntity t) throws Exception {
            Session session =SessionFactoryConfiguration.getInstance().openSession();
            Transaction transaction =session.beginTransaction();
            try {
                 Integer id =(Integer)session.save(t);
                 transaction.commit();
                 return id;
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
                session.close();
        }
            return -1;
                    
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
           Session session =SessionFactoryConfiguration.getInstance().openSession();
            Transaction transaction =session.beginTransaction();
            try {
                  session.update(t);
                 transaction.commit();
                 return true;
                 
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
                session.close();
        }
            return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
          Session session =SessionFactoryConfiguration.getInstance().openSession();
            Transaction transaction =session.beginTransaction();
            try {
                 session.delete(get(id));
                 transaction.commit();
                 return true;
                 
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
                session.close();
        }
            return false;
        
         
    }

    @Override
    public CarEntity get(Integer id) throws Exception {
              Session session =SessionFactoryConfiguration.getInstance().openSession();
            Transaction transaction =session.beginTransaction();
            try {
                 CarEntity carEnt =session.get(CarEntity.class, id);
                 transaction.commit();
                 return carEnt;
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
                session.close();
        }
            return  null;
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
        Session session =SessionFactoryConfiguration.getInstance().openSession();
        Transaction transaction =session.beginTransaction();
        CriteriaBuilder criteriaBuilder =session.getCriteriaBuilder();
        CriteriaQuery<CarEntity> criteriaQuery =criteriaBuilder.createQuery(CarEntity.class);
        Root<CarEntity> root =criteriaQuery.from(CarEntity.class);
        criteriaQuery.select(root);
        
        List<CarEntity> carsEntity =session.createQuery(criteriaQuery).getResultList();
        transaction.commit();
        return (ArrayList<CarEntity>) carsEntity;
      
    }

    @Override
    public CarEntity getCarByV_No(Session session,String v_No) throws Exception {
     
          String hql ="select c.carID "+
                  "from CarEntity c "+
                  "where c.v_No =:v_No";
          Query<Integer> query =session.createQuery(hql);
          query.setParameter("v_No", v_No);
          Integer id =query.uniqueResult();
        
          CarEntity car =get(id);
          if(car ==null){
                 throw new NullPointerException("car Object is null");
          }
          return car;
          
    }
    
}
