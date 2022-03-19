package service.impl.service;

import model.service.ServiceType;
import repository.interfaceService.IServiceType;
import repository.impl.service.ServiceTypeRepositoryImpl;
import service.interfaceService.IServiceTypeService;

import java.util.List;

public class ServiceTypeServiceImpl implements IServiceTypeService {
    IServiceType serviceType = new ServiceTypeRepositoryImpl();
    @Override
    public List<ServiceType> findAll() {
        return serviceType.findAll();
    }
}
