package repository.impl.employee;

import model.customer.CustomerType;
import model.employee.Division;
import model.employee.Employee;
import repository.DBConnection;
import repository.interfaceEmployee.DivisionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepositoryImpl implements DivisionRepository {
    private static String SELECT_ALL_DIVISION = "SELECT * FROM division";
    @Override
    public List<Division> findAll() {
        List<Division> divisionList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_DIVISION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idDivision = resultSet.getInt("division_id");
                String nameDivision = resultSet.getString("division_name");
                divisionList.add(new Division(idDivision, nameDivision));
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
        return divisionList;
    }
}
