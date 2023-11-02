/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.dto.RentDetailDto;
import carrentapplication.service.ServiceFactory;
import carrentapplication.service.carrentService.CarRentService;


/**
 *
 * @author Manidu
 */
public class CarRentController {
    CarRentService carRentService =(CarRentService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CARRENT);
    
    public String rentCar(String userName,RentDetailDto dto ) throws Exception{
           return carRentService.rentCar(userName, dto);
    }
 
    
    
}
