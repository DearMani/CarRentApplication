/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.rents;

import carrentapplication.entity.RentsEntity;
import carrentapplication.repository.CrudRepository;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface RentsRepository extends CrudRepository<RentsEntity, Integer> {

    /**
     *
     * @param session
     * @param t
     * @return
     * @throws Exception
     */
    Integer add(Session session, RentsEntity t)throws Exception;
    
    
    
    
}
