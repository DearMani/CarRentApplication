/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.car;

import carrentapplication.dto.CarDto;
import carrentapplication.entity.CarCategoryEntity;
import carrentapplication.entity.CarEntity;
import carrentapplication.repository.RepositoryFactory;
import carrentapplication.repository.car.CarRepository;
import carrentapplication.repository.carcategory.CarCategoryRepository;
import java.util.ArrayList;

/**
 *
 * @author Manidu
 */
public class CarServiceImp  implements CarService{
    CarRepository carRepository =(CarRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CAR);
    CarCategoryRepository CarCategoryRepository =(CarCategoryRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CARCATEGORY);

    @Override
    public Integer addCar(CarDto dto, String carType) throws Exception {
                     CarCategoryEntity carCategoryEntity =CarCategoryRepository.getByType(carType);
              CarEntity ent =new CarEntity();
              ent.setV_No(dto.getV_No());
              ent.setBrand(dto.getBrand());
              ent.setModel(dto.getModel());
              ent.setColor(dto.getColor());
              ent.setNumOfSheets(dto.getNum_ofsheets());
              ent.setAirBags(dto.isAirBags());
              ent.setFuelType(CarEntity.FuelType.AsEnum(dto.getFuelType()));
              ent.setYear(dto.getYear());
              ent.setCarCategoryEntity(carCategoryEntity);
              
              return  carRepository.add(ent);
              
              
             
    }

    @Override
    public boolean updateCar(CarDto dto) throws Exception {
             CarEntity ent =carRepository.get(dto.getId());
             CarCategoryEntity carCategoryEntity =CarCategoryRepository.getByType(dto.getCarType());
               ent.setV_No(dto.getV_No());
              ent.setBrand(dto.getBrand());
              ent.setModel(dto.getModel());
              ent.setColor(dto.getColor());
              ent.setNumOfSheets(dto.getNum_ofsheets());
              ent.setAirBags(dto.isAirBags());
              ent.setFuelType(CarEntity.FuelType.AsEnum(dto.getFuelType()));
              ent.setYear(dto.getYear());
              ent.setCarCategoryEntity(carCategoryEntity);
             
                return carRepository.update(ent);
    }

    @Override
    public boolean deleteCar(String Id) throws Exception {
          return carRepository.delete(Integer.valueOf(Id));
    }

    @Override
    public CarDto getCar(String id) throws Exception {
         CarEntity carEnt =carRepository.get(Integer.valueOf(id));
          return new CarDto(carEnt.getCarID(),
                  carEnt.getV_No(),
                  carEnt.getModel(),
                  carEnt.getBrand(),
                  carEnt.getColor(),
                  carEnt.getNumOfSheets(),
                  CarEntity.FuelType.AsString(carEnt.getFuelType()),
                  carEnt.isAirBags(),
                  carEnt.getYear(),
                  carEnt.getCarCategoryEntity().getCarType());
    }

    @Override
    public ArrayList<CarDto> getAllCar() throws Exception {
          ArrayList<CarEntity> entList =carRepository.getAll();
          ArrayList<CarDto> dtoList =new ArrayList<>();
          for(CarEntity entity : entList){
                  dtoList.add(new CarDto(entity.getCarID(),
                          entity.getV_No(),
                          entity.getModel(),
                          entity.getBrand(),
                          entity.getColor(),
                          entity.getNumOfSheets(),
                          CarEntity.FuelType.AsString(entity.getFuelType()),
                          entity.isAirBags(),
                          entity.getYear()));
          }
          return dtoList;
    }
    
}
