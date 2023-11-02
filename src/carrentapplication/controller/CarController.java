/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.dto.CarDto;

import carrentapplication.service.ServiceFactory;
import carrentapplication.service.car.CarService;
import java.util.ArrayList;


/**
 *
 * @author Manidu
 */
public class CarController {
       CarService carService =(CarService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);
       
       public   Integer  addCar(CarDto dto, String carType) throws Exception{
                       return carService.addCar(dto, carType);
       }
       
       public ArrayList<CarDto> getAllCars() throws Exception{
            return carService.getAllCar();
       }
       public CarDto getCar(String id) throws Exception{
               return  carService.getCar(id);
       }
       
       public boolean updateCar(CarDto dto) throws Exception{
              return carService.updateCar(dto);
       }
       
       public boolean deleteCar(String id)throws Exception{
             return carService.deleteCar(id);
       }
}
