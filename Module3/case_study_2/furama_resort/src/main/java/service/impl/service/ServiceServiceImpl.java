package service.impl.service;

import model.service.Service;
import repository.interfaceService.IService;
import repository.impl.service.ServiceRepositoryImpl;
import service.interfaceService.IServiceService;

import java.util.List;

public class ServiceServiceImpl implements IServiceService {
    IService services = new ServiceRepositoryImpl();

    @Override
    public List<Service> findAll() {
        return services.findAll();
    }

    @Override
    public void create(Service service) {
        services.create(service);
    }
}
