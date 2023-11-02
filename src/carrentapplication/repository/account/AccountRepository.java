/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.account;

import carrentapplication.entity.AccountEntity;
import carrentapplication.repository.CrudRepository;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface AccountRepository extends CrudRepository<Object, Object>{
          Integer addAccount(AccountEntity account, Session session) throws Exception;
}
