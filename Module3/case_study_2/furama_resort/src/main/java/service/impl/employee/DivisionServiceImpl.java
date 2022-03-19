package service.impl.employee;

import model.employee.Division;
import repository.impl.employee.DivisionRepositoryImpl;
import repository.interfaceEmployee.DivisionRepository;
import service.interfaceEmployee.DivisionService;

import java.util.List;

public class DivisionServiceImpl implements DivisionService {
    DivisionRepository divisionRepository = new DivisionRepositoryImpl();
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
