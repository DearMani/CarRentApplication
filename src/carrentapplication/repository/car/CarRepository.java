/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.car;

import carrentapplication.entity.CarEntity;
import carrentapplication.repository.CrudRepository;
import org.hibernate.Session;

/**
 *
 * @author Manidu
 */
public interface CarRepository extends CrudRepository<CarEntity, Integer> {
        CarEntity getCarByV_No(Session session,String v_N0)throws Exception;
}
