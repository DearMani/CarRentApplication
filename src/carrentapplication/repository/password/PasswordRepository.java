/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.password;

import carrentapplication.entity.AccountEntity;
import carrentapplication.entity.PasswordEntity;
import carrentapplication.repository.CrudRepository;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface PasswordRepository extends CrudRepository<Object, Object> {
       Integer addPassword(PasswordEntity password, Session session) throws Exception;
       boolean userAuthentication(String userName, String type, String password) throws Exception;
       
}
