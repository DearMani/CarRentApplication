/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.repository.carcategory;

import carrentapplication.entity.CarCategoryEntity;
import carrentapplication.repository.CrudRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manidu
 */
public interface CarCategoryRepository extends CrudRepository<CarCategoryEntity, Integer> {
              List<String> getAllCarCategory()throws Exception ;
              CarCategoryEntity getByType(String CarType)throws Exception;
              ArrayList<Object[]> getVNo_Model_Fuel_DailyRate_HourlyRateByCarType(String CarType)throws Exception;
              
              
}
