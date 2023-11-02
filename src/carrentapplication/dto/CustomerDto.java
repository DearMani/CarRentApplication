/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Manidu
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class CustomerDto {

    private Integer Id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private String phoneNumber;
    private String email;
    private String genderType;

    public CustomerDto( String firstName, String lastName, Integer age, String address, String phoneNumber, String email, String genderType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.genderType = genderType;
    }
    
    

}
