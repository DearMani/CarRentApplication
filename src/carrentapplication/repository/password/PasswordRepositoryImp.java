/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.repository.password;

import carrentapplication.entity.AccountEntity;
import carrentapplication.entity.PasswordEntity;
import carrentapplication.utilsessionfactory.SessionFactoryConfiguration;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.hibernate.query.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Manidu
 */
public class PasswordRepositoryImp implements PasswordRepository {

    @Override
    public Integer addPassword(PasswordEntity password, Session session) throws Exception {
          Integer id =(Integer)session.save(password);
          return id;
    }

    @Override
    public Integer add(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean userAuthentication(String userName, String type, String password) throws Exception {
           Session session =SessionFactoryConfiguration.getInstance().openSession();
           Transaction transaction =session.beginTransaction();
           String sql = "select p.hasshedPassword from "+
                               "account a inner join "+
                                "password p "+
                                 "on a.passID = p.passID "+
                                 "where a.userName = :userName AND a.accountType = :accountType";
           
           Query<String> query =session.createSQLQuery(sql);
           query.setParameter("userName", userName);
           query.setParameter("accountType", type);
           String hashedPassword =(String) query.uniqueResult();
           transaction.commit();
           return (BCrypt.checkpw(password, hashedPassword));
           
    }
    
}
