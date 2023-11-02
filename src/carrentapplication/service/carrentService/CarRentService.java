/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrentapplication.service.carrentService;

import carrentapplication.dto.RentDetailDto;
import carrentapplication.service.SuperService;
import java.util.List;

/**
 *
 * @author Manidu
 */
public interface CarRentService extends SuperService{
       String rentCar(String userName,RentDetailDto dto) throws Exception;

}
