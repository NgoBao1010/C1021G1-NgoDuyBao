package repository.interfaceEmployee;

import model.customer.Customer;
import model.employee.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void create(Employee employee);
    void delete(int id);
    void updateEmployee (Employee employee);
    Employee selectEmployee(int id);
}
