package service.impl.service;

import model.service.RentType;
import repository.interfaceService.IRentType;
import repository.impl.service.RentTypeRepositoryImpl;
import service.interfaceService.IRentTypeService;

import java.util.List;

public class RentTypeServiceImpl implements IRentTypeService {
    IRentType rentType = new RentTypeRepositoryImpl();

    @Override
    public List<RentType> findAll() {
        return rentType.findAll();
    }
}
