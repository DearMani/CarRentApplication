/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.cancelrentdetail;

import carrentapplication.entity.CancelRentalDetailEntity;
import carrentapplication.repository.CrudRepository;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface CancelRentDetailRepository extends CrudRepository<CancelRentalDetailEntity, Integer> {
       Integer add(Session session, CancelRentalDetailEntity t)throws Exception;
    
}
