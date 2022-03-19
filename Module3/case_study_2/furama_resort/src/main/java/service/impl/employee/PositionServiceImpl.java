package service.impl.employee;

import model.employee.Position;
import repository.impl.employee.PositionRepositoryImpl;
import repository.interfaceEmployee.PositionRepository;
import service.interfaceEmployee.PositionService;

import java.util.List;

public class PositionServiceImpl implements PositionService {
    PositionRepository positionRepository = new PositionRepositoryImpl();
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
