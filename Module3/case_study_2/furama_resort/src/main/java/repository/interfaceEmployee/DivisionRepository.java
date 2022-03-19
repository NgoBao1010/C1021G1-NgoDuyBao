package repository.interfaceEmployee;

import model.employee.Division;
import model.employee.Employee;

import java.util.List;

public interface DivisionRepository {
    List<Division> findAll();
}
