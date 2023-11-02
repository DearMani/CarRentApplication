/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.dto.CarCategoryDto;
import carrentapplication.service.ServiceFactory;
import carrentapplication.service.carcategory.CarCategoryService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manidu
 */
public class CarTypeController {
        
    CarCategoryService carCategoryService =(CarCategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CARCATEGORY);
    
    
        public Integer addCarCategory(CarCategoryDto  dto )throws Exception{
               return carCategoryService.addCarCategory(dto);
        }
        
        public boolean updateCarCategory(CarCategoryDto dto)throws Exception{
                return carCategoryService.updateCarCategory(dto);
        }
        
        public boolean deleteCarCategory(String id)throws Exception{
               return carCategoryService.deleteCarCategory(id);
        }
        
        public CarCategoryDto getCarCategory(String id)throws Exception{
               return carCategoryService.getCarCategory(id);
        }
        
        public ArrayList<CarCategoryDto> getAllCarCategories() throws Exception{
                   return carCategoryService.getAllCarCategorys();
        }
        
        public List<String> getCategories() throws Exception{
              return carCategoryService.getCategories();
        }
        
        public ArrayList<Object[]>getTableData(String type)throws Exception{
                  return carCategoryService.getVNo_Model_Fuel_DailyRate_HourlyRateByCarCategory(type);
                  
        }
       
}