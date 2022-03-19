package repository.interfaceEmployee;

import model.employee.Education;
import model.employee.Employee;

import java.util.List;

public interface EducationRepository {
    List<Education> findAll();
}
