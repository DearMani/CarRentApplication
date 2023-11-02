/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentapplication.service.carcategory;

import carrentapplication.dto.CarCategoryDto;
import carrentapplication.entity.CarCategoryEntity;
import carrentapplication.repository.RepositoryFactory;
import carrentapplication.repository.carcategory.CarCategoryRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manidu
 */
public class CarCategoryServiceImp implements CarCategoryService {
        CarCategoryRepository carCategoryRepository =(CarCategoryRepository)RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CARCATEGORY);
             

    @Override
    public Integer addCarCategory(CarCategoryDto dto) throws Exception {
           CarCategoryEntity entity =new CarCategoryEntity();
           entity.setCarType(dto.getCarType());
           entity.setDailyrate(dto.getDailyRate());
           entity.setHourlyrate(dto.getHourlyRate());
                  return  carCategoryRepository.add(entity);
    }

    @Override
    public boolean updateCarCategory(CarCategoryDto dto) throws Exception {
         CarCategoryEntity entity =carCategoryRepository.get(dto.getId());
            entity.setCarType(dto.getCarType());
           entity.setDailyrate(dto.getDailyRate());
           entity.setHourlyrate(dto.getHourlyRate());
           return    carCategoryRepository.update(entity);
            
         
    }

    @Override
    public boolean deleteCarCategory(String Id) throws Exception {
           return carCategoryRepository.delete(Integer.valueOf(Id));
    }

    @Override
    public CarCategoryDto getCarCategory(String id) throws Exception {
              CarCategoryEntity entity =carCategoryRepository.get(Integer.valueOf(id));
              return  new CarCategoryDto(entity.getTypeID(),
                      entity.getCarType(),
                      entity.getDailyrate(),
                      entity.getHourlyrate());
    }

    @Override
    public ArrayList<CarCategoryDto> getAllCarCategorys() throws Exception {
          ArrayList<CarCategoryEntity> carEntities =carCategoryRepository.getAll();
          ArrayList<CarCategoryDto> carDtos =new ArrayList<>();
          for(CarCategoryEntity carEntity : carEntities){
                    carDtos.add(new CarCategoryDto(carEntity.getTypeID(),
                            carEntity.getCarType(),
                            carEntity.getDailyrate(),
                            carEntity.getHourlyrate()));
          }
          return carDtos;
    }

    @Override
    public List<String> getCategories() throws Exception {
         return carCategoryRepository.getAllCarCategory();
    }

    @Override
    public ArrayList<Object[]> getVNo_Model_Fuel_DailyRate_HourlyRateByCarCategory(String type) throws Exception {
             return carCategoryRepository.getVNo_Model_Fuel_DailyRate_HourlyRateByCarType(type);
    }
    
}
