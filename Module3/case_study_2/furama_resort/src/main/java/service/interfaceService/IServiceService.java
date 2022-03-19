package service.interfaceService;

import model.service.Service;

import java.util.List;

public interface IServiceService {
    List<Service> findAll();
    void create(Service service);

}
