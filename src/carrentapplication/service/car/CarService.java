/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.car;

import carrentapplication.dto.CarDto;
import carrentapplication.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Manidu
 */
public interface CarService extends SuperService {
         Integer addCar(CarDto dto, String carType) throws Exception;
           boolean updateCar(CarDto dto) throws Exception;
           boolean deleteCar(String Id) throws Exception;
           CarDto getCar(String id) throws Exception;
           ArrayList<CarDto> getAllCar() throws Exception;
    
}
