package repository.impl.service;

import model.service.RentType;
import repository.DBConnection;
import repository.interfaceService.IRentType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentTypeRepositoryImpl implements IRentType {
    private static String SELECT_ALL_RENT_TYPE = "SELECT * FROM rent_type;";
    @Override
    public List<RentType> findAll() {
        Connection connection = DBConnection.getConnection();
        List<RentType> rentTypeList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_RENT_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idRentType = resultSet.getInt("rent_type_id");
                    String nameRentType = resultSet.getString("rent_type_name");
                    double costRentType = resultSet.getDouble("rent_type_cost");

                    rentTypeList.add(new RentType(idRentType, nameRentType,costRentType));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return rentTypeList;
    }
}
