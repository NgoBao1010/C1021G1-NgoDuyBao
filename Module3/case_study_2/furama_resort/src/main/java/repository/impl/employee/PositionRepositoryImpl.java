package repository.impl.employee;

import model.employee.Education;
import model.employee.Position;
import repository.DBConnection;
import repository.interfaceEmployee.PositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements PositionRepository {
    private static String SELECT_ALL_POSITION = "SELECT * FROM position";

    @Override
    public List<Position> findAll() {
        List<Position> positionList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_POSITION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idPosition = resultSet.getInt("position_id");
                String namePosition = resultSet.getString("position_name");
                positionList.add(new Position(idPosition, namePosition));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return positionList;    }
}
