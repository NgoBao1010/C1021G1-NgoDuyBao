package service.impl.employee;

import model.employee.Employee;
import repository.impl.employee.EmployeeRepositoryImpl;
import repository.interfaceEmployee.EmployeeRepository;
import service.interfaceEmployee.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void create(Employee employee) {
        employeeRepository.create(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.delete(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
    }

    @Override
    public Employee selectEmployee(int id) {
        return employeeRepository.selectEmployee(id);
    }
}
