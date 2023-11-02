/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.carcategory;

import carrentapplication.dto.CarCategoryDto;
import carrentapplication.service.SuperService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manidu
 */
public interface CarCategoryService  extends SuperService{
        Integer addCarCategory(CarCategoryDto dto) throws Exception;
           boolean updateCarCategory(CarCategoryDto dto) throws Exception;
           boolean deleteCarCategory(String Id) throws Exception;
           CarCategoryDto getCarCategory(String id) throws Exception;
           ArrayList<CarCategoryDto> getAllCarCategorys() throws Exception;
           List<String>getCategories() throws Exception;
           ArrayList<Object[]>getVNo_Model_Fuel_DailyRate_HourlyRateByCarCategory(String type)throws Exception;
           
}
