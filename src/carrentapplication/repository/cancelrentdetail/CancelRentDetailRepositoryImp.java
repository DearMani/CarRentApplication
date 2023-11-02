/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.cancelrentdetail;

import carrentapplication.entity.CancelRentalDetailEntity;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Manidu
 */
public class CancelRentDetailRepositoryImp implements CancelRentDetailRepository {

    @Override
    public Integer add(CancelRentalDetailEntity t) throws Exception {
            Session session =SessionFactoryConfiguration.getInstance().openSession();
            Transaction transaction =session.beginTransaction();
            try {
                Integer id =(Integer) session.save(t);
                transaction.commit();
                return  id;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
                 return -1;
            
        } finally {
                session.close();
        }
       
            
    }

    @Override
    public boolean update(CancelRentalDetailEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CancelRentalDetailEntity get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CancelRentalDetailEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer add(Session session, CancelRentalDetailEntity t) throws Exception {
        Integer id =(Integer) session.save(t);
        return  id;
    }
    
}
