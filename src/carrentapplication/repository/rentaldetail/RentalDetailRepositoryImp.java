/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.rentaldetail;

import carrentapplication.entity.RentalDetailEntity;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Manidu
 */
public class RentalDetailRepositoryImp implements RentalDetailRepository {

    @Override
    public Integer add(Session session, RentalDetailEntity t) throws Exception {
        Integer id =(Integer) session.save(t);
        return (id !=null)? id : -1;
                
    }

    @Override
    public Integer add(RentalDetailEntity t) throws Exception {
          Session session =SessionFactoryConfiguration.getInstance().openSession();
          Transaction transaction =session.beginTransaction();
          try {
            Integer id =(Integer) session.save(t);
            transaction.commit();
            return  id;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            throw  e;
        } finally {
              session.close();
        }
    }

    @Override
    public boolean update(RentalDetailEntity t) throws Exception {
                Session session =SessionFactoryConfiguration.getInstance().openSession();
          Transaction transaction =session.beginTransaction();
          try {
                session.update(t);
                System.out.println("save");
            transaction.commit();
            return  true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
     
        } finally {
              session.close();
        }
              return  false;
    }
    
    

    @Override
    public boolean delete(Integer id) throws Exception {
                 Session session =SessionFactoryConfiguration.getInstance().openSession();
          Transaction transaction =session.beginTransaction();
          try {
                session.delete(get(id));
            transaction.commit();
            return  true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
          
        } finally {
              session.close();
        }
            return  false;
          
    }

    @Override
    public RentalDetailEntity get(Integer id) throws Exception {
                        Session session =SessionFactoryConfiguration.getInstance().openSession();
          Transaction transaction =session.beginTransaction();
          try {
              RentalDetailEntity entity =session.get(RentalDetailEntity.class, id);
            transaction.commit();
            return  entity;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
         
        } finally {
              session.close();
        }
          return null;
    }
    
    

    @Override
    public ArrayList<RentalDetailEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean checkDurationAvailabilityOfRent(String userName,String v_No, LocalDateTime pickupDate, LocalDateTime returnDate) throws Exception {
         Session session =SessionFactoryConfiguration.getInstance().openSession();
         Transaction transaction =session.beginTransaction();
       
         try {
             String sql = "select rd.id from   "+
                                 "account a inner join customer cu on cu.customerID = a.customerID inner join rents r  on r.customerID = cu.customerID inner join "+
                                 "rentdetail rd   "+
                                  "on  rd.rentID = r.rentID inner join  "+
                                  "car c on  c.carID = rd.carID   "+
                                  "where   "+
                                            " c.v_No =:v_No  "+
                                             "AND (rd.isReturn =:return   OR a.userName = :userName )  "+
                                            "AND  "+
                                              "  ((rd. pickUpDateTime = :startdate    AND rd.returnDateTime = :enddate)  "+
                                            "  OR (rd. pickUpDateTime > :startdate AND   ( rd. pickUpDateTime < :enddate  AND rd.returnDateTime > :enddate )) "+
                                             "OR (rd. pickUpDateTime < :startdate    AND rd.returnDateTime > :enddate)  "+               
                                              "OR ((rd. pickUpDateTime < :startdate   AND rd.returnDateTime> :startdate )      AND rd.returnDateTime < :enddate)  "+    
                                               "OR (rd. pickUpDateTime > :startdate    AND rd.returnDateTime < :enddate)) ";   
                        
             
             Query<Integer>  query =session.createSQLQuery(sql);
         
              query.setParameter("v_No", v_No);
              query.setParameter("return", false);
                 query.setParameter("userName", userName);
             query.setParameter("startdate", pickupDate);
            query.setParameter("enddate", returnDate);
              
             List<Integer>  resultList =query.list();
              System.out.println(resultList);
              transaction.commit();
             return (resultList.isEmpty());
            
        } catch (Exception e) {
               transaction.rollback();
            e.printStackTrace();
            
            throw e;
        } finally {
             System.out.println("over");
             session.close();
        }
        
        
    }
    
     @Override
    public List<Object[]> getCustID_RentID_OrderDetailID_fromDate_ToDate_total_remain_advance(String state, String userName) throws Exception {
          Session session =SessionFactoryConfiguration.getInstance().openSession();
         Transaction transaction =session.beginTransaction();
         try {
                
             boolean isReturn =state.equals("Rented");
             
              String sql ="select cu.customerID, r.rentID, rd.id,  ca.model, rd.pickUpDateTime, rd.returnDateTime, rd.total, rd.remain,rd.advance, "+
                                 " case when rd.returnDateTime < current_timestamp() AND rd.isReturn =false then true else false end as overdue  "+
                                "from  account a inner join  customer cu  on cu.customerID = a.customerID "+
                              "  inner join rents r on r.customerID = cu.customerID  "+
                               "inner join  rentdetail rd on rd.rentID = r.rentID "+
                               "inner join car ca on rd.carID = ca.carID "+
                      //           "inner join car_category cc  on cc.typeID = ca.typeID "+
                               "where a.userName = :userName "+
                                "AND "+
                                  "rd.isReturn = :isReturn";
              
             Query<Object[]> query =session.createSQLQuery(sql);
              query.setParameter("userName", userName);
              query.setParameter("isReturn", isReturn);
              
              List<Object[]> resultList =query.list();
              transaction.commit();
              return resultList;
             
             
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            throw  e;
        } finally {
             session.close();
        }
             
        
}

    @Override
    public List<Object[]> getCustID_RentID_OrderDetailID_fromDate_ToDate_total_remain_advanceAll(String state) throws Exception {
            Session session =SessionFactoryConfiguration.getInstance().openSession();
         Transaction transaction =session.beginTransaction();
         try {
                
             boolean isReturn =!state.equals("Current");
             System.out.println(state);
             
              String sql ="select cu.customerID, r.rentID, rd.id,  ca.model, rd.pickUpDateTime, rd.returnDateTime, rd.total, rd.advance, cc.dailyrate,cc.hourlyrate , "+
                                 " case when rd.returnDateTime < current_timestamp() AND rd.isReturn =false then 'Overdue' else 'notOverdue' end as overdue  "+
                                "from    customer cu   "+
                              "  inner join rents r on r.customerID = cu.customerID  "+
                               "inner join  rentdetail rd on rd.rentID = r.rentID "+
                               "inner join car ca on rd.carID = ca.carID "+
                                "inner join car_category cc on cc.typeID = ca.typeID "+
                                "where  "+
                                "rd.isReturn = :isReturn "+
                                " AND rd.pickUpDateTime < current_timestamp() ";
              
             Query<Object[]> query =session.createSQLQuery(sql);
              query.setParameter("isReturn", isReturn);
              
              List<Object[]> resultList =query.list();
              transaction.commit();
              return resultList;
             
             
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            throw  e;
        } finally {
             session.close();
        }
    }

    @Override
    public boolean delete(Session session, Integer orderID) throws Exception {
             try {
                     session.delete(get(orderID));
                     return true;
        } catch (Exception e) {
            e.printStackTrace();
             return false;
        }
            
    }

    @Override
    public List<Double> getIncomeWithInTimeRange(LocalDateTime t1, LocalDateTime t2) throws Exception {
        
        Session session =SessionFactoryConfiguration.getInstance().openSession();
        Transaction transaction =session.beginTransaction();
        try {
            String sql ="  select case  "
                    + "when ( :t1 <= r.rentDate AND r.rentDate <=  :t2 ) then  ( rd.advance ) "
                    +"when ( :t1 <= rd.borrowCarDate AND rd.borrowCarDate <= :t2 ) then ( rd.total + rd.overDue - rd.advance )  "
                    + " when ( :t1 <= crd.cancelDate AND crd.cancelDate <= :t2 ) then ( crd.advance )  "
                     +"else 0 "
                    + "END AS income  "
                 //      +" from cancelrentdetail crd ";
                   + "from rents r inner join rentdetail rd on rd.rentID = r.rentID "
                    + " , cancelrentdetail crd ";
            
            Query<Double> query =session.createSQLQuery(sql);
            query.setParameter("t1", t1);
            query.setParameter("t2", t2);
             
            List<Double> resultList =query.list();
            System.out.println(resultList);
            transaction.commit();
            return  resultList;
            
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            session.close();
        }
        
       
    }
    
    
}
