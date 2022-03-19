package repository.interfaceEmployee;

import model.employee.Employee;
import model.employee.Position;

import java.util.List;

public interface PositionRepository {
    List<Position> findAll();
}
