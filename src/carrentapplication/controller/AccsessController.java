/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.controller;

import carrentapplication.dto.AccountDto;             
import carrentapplication.dto.PasswordDto;
import carrentapplication.dto.CustomerDto;
import carrentapplication.service.accsess.AccessServiceImp;


/**
 *
 * @author Manidu
 */
public class AccsessController {
    AccessServiceImp accsessService =new AccessServiceImp();

    public String handleSignUP(CustomerDto customerDto, AccountDto accountDto, PasswordDto passwordDto)throws Exception{
       return accsessService.signUp(customerDto,accountDto,passwordDto);
     // return null;
     
    }
    public boolean handleLogIN(String userName, String accountType, String password) throws Exception{
       
        return accsessService.handleLogin(userName, accountType, password);
     
    
    }
    
}
