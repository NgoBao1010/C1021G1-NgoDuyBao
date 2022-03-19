package service.impl.employee;

import model.employee.Education;
import repository.impl.employee.EducationRepositoryImpl;
import repository.interfaceEmployee.EducationRepository;
import service.interfaceEmployee.EducationService;

import java.util.List;

public class EducationServiceImpl implements EducationService {
    EducationRepository educationRepository = new EducationRepositoryImpl();
    @Override
    public List<Education> findAll() {
        return educationRepository.findAll();
    }
}
