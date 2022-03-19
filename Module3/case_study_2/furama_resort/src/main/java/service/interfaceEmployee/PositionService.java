package service.interfaceEmployee;

import model.employee.Employee;
import model.employee.Position;

import java.util.List;

public interface PositionService {
    List<Position> findAll();
}
