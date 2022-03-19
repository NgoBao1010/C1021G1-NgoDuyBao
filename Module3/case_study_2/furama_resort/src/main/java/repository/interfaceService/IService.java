package repository.interfaceService;

import model.service.Service;

import java.util.List;

public interface IService {
    List<Service> findAll();
    void create(Service service);

}
