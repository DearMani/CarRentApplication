/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.rents;

import carrentapplication.entity.RentsEntity;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public class RentsRepositoryImp implements RentsRepository {

    @Override
    public Integer add(RentsEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean update(RentsEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentsEntity get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RentsEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer add(Session session, RentsEntity t) throws Exception {
           
         Integer id =(Integer)session.save(t);
         return (id !=null)? id: -1;
    }

    
}
