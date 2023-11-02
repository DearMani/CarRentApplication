/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.carcategory;

import carrentapplication.entity.CarCategoryEntity;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
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
public class CarCategoryRepositoryImp implements CarCategoryRepository {

    @Override
    public Integer add(CarCategoryEntity t) throws Exception {
                     Session session  =SessionFactoryConfiguration.getInstance().openSession();
                    Transaction transaction =session.beginTransaction();
                     try {
                               Integer id  =(Integer)session.save(t);
                                transaction.commit();
                                return id;
                         
                           } catch (Exception e) {
                               e.printStackTrace();
                               transaction.rollback();
                               
            
                             } finally {
                                  
                         session.close();
                              }
                     return -1;
    }

    @Override
    public boolean update(CarCategoryEntity t) throws Exception {
             Session session  =SessionFactoryConfiguration.getInstance().openSession();
                    Transaction transaction =session.beginTransaction();
                     try {
                                session.update(t);
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
                    Session session  =SessionFactoryConfiguration.getInstance().openSession();
                    Transaction transaction =session.beginTransaction();
                     try {
                                session.delete(get(id));
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
    public CarCategoryEntity get(Integer id) throws Exception {
           
            Session session  =SessionFactoryConfiguration.getInstance().openSession();
            Transaction transaction =session.beginTransaction();
            try {
                CarCategoryEntity carCategoryEntity =session.get(CarCategoryEntity.class, id);
                transaction.commit();
                return carCategoryEntity;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
               session.close();
        }
         return null;  
    }

    @Override
    public ArrayList<CarCategoryEntity> getAll() throws Exception {
           Session session =SessionFactoryConfiguration.getInstance().openSession();
           Transaction transaction =session.beginTransaction();
             try {
                 CriteriaBuilder criteriaBuilder =session.getCriteriaBuilder();
                 CriteriaQuery<CarCategoryEntity> criteriaQuery =criteriaBuilder.createQuery(CarCategoryEntity.class);
                 Root<CarCategoryEntity> root =criteriaQuery.from(CarCategoryEntity.class);
                 criteriaQuery.select(root);
                 List<CarCategoryEntity> carCategories =session.createQuery(criteriaQuery).getResultList();
                 transaction.commit();
                 return (ArrayList<CarCategoryEntity>)carCategories;
                        
        } catch (Exception e) {
                 e.printStackTrace();
                 transaction.rollback();
            
        } finally {
                session.close();
        }
             return null;
  
    }
    
   


    @Override
    public List<String> getAllCarCategory() throws Exception{
            Session session =SessionFactoryConfiguration.getInstance().openSession();
           Transaction transaction =session.beginTransaction();
             try {
                List<String> carTypes =session.createQuery("select distinct c.carType from CarCategoryEntity c").list();
                transaction.commit();
                return  carTypes;
                        
        } catch (Exception e) {
                 e.printStackTrace();
                 transaction.rollback();
            
        } finally {
                session.close();
        }
             return null;
        
        
          
    }

    @Override
    public CarCategoryEntity getByType(String CarType) throws Exception {
          Session session =SessionFactoryConfiguration.getInstance().openSession();
           Transaction transaction =session.beginTransaction();
             try {
                String hql ="select c.typeID from CarCategoryEntity c where c.carType =:CarType";
                Query<Integer> query =session.createQuery(hql, Integer.class);
                query.setParameter("CarType", CarType);
                 Integer  typeid =query.uniqueResult();
                 transaction.commit();

                return  get(typeid);
                
                        
        } catch (Exception e) {
                 e.printStackTrace();
                 transaction.rollback();
            
        } finally {
                session.close();
        }
             return null;
           
    }
    
    @Override
    public ArrayList<Object[]> getVNo_Model_Fuel_DailyRate_HourlyRateByCarType(String CarType) throws Exception {
        Session  session =SessionFactoryConfiguration.getInstance().openSession();
        Transaction transaction =session.beginTransaction();
        try {
            String sql ="select   c.v_No, c.model,c.fuelType, cc.dailyRate, cc.hourlyRate from  "+
                               "car c inner join "+
                                "car_category cc "+
                                 "on c.typeID = cc.typeID "+
                                  "where cc.carType =:carType";
            Query<Object[]> query =session.createSQLQuery(sql);
            query.setParameter("carType", CarType);
            List<Object[]> resultList =query.list();
             transaction.commit();
            return (ArrayList<Object[]>) resultList;
        } catch(Exception E){
           E.printStackTrace();
           transaction.rollback();

        } finally {
            session.close();
        }
        return null;
        
        
    }
    
 
//        public boolean userAuthentication(String userName, String type, String password) throws Exception {
//           Session session =SessionFactoryConfiguration.getInstance().openSession();
//           Transaction transaction =session.beginTransaction();
//           String sql = "select p.hasshedPassword from "+
//                               "account a inner join "+
//                                "password p "+
//                                 "on a.passID = p.passID "+
//                                 "where a.userName = :userName AND a.accountType = :accountType";
//           
//           Query<String> query =session.createSQLQuery(sql);
//           query.setParameter("userName", userName);
//           query.setParameter("accountType", type);
//           String hashedPassword =(String) query.uniqueResult();
//           transaction.commit();
//           return (BCrypt.checkpw(password, hashedPassword));
//           
//    }

    
    
    
    
    
    
    
    
    
    
    
}
