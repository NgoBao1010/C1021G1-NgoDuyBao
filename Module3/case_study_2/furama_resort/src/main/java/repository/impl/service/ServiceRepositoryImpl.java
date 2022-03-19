package repository.impl.service;

import model.service.Service;
import repository.DBConnection;
import repository.interfaceService.IService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IService {
    private static String SELECT_ALL_SERVICE = "SELECT * FROM service \n" +
            "join service_type on service.service_type_id = service_type.service_type_id" +
            " join rent_type on service.rent_type_id = service.rent_type_id;";
    private static final String INSERT_SERVICE_SQL = "INSERT INTO service (service_name, service_area, service_cost,service_max_people," +
            "standard_room,description_other_convenience,pool_area,number_of_floors,rent_type_id,service_type_id) VALUES (?,?,?,?,?,?,?,?, ?, ?);";
    @Override
    public List<Service> findAll() {
        List<Service> services = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idService = resultSet.getInt("service_id");
                String nameService = resultSet.getString("service_name");
                int area = resultSet.getInt("service_area");
                double costService = resultSet.getDouble("service_cost");
                int maxPeople = resultSet.getInt("service_max_people");
                String standardRoom = resultSet.getString("standard_room");
                String description = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int floor = resultSet.getInt("number_of_floors");
                int idRentType = resultSet.getInt("rent_type_id");
                String nameRentType = resultSet.getString("rent_type_name");
                double costRentType = resultSet.getDouble("rent_type_cost");
                int idServiceType = resultSet.getInt("service_type_id");
                String nameServiceType = resultSet.getString("service_type_name");

                services.add(new Service(idService,nameService,area,costService,maxPeople,standardRoom,description,
                        poolArea,floor,idRentType,nameRentType,costRentType,idServiceType,nameServiceType));
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
        return services;
    }

    @Override
    public void create(Service service) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null){
            try {
                preparedStatement = connection.prepareStatement(INSERT_SERVICE_SQL);
                preparedStatement.setString(1,service.getNameService());
                preparedStatement.setInt(2,service.getAreaService());
                preparedStatement.setDouble(3,service.getCostService());
                preparedStatement.setInt(4,service.getMaxPeople());
                preparedStatement.setString(5,service.getRoomStandard());
                preparedStatement.setString(6,service.getDescription());
                preparedStatement.setDouble(7,service.getPoolArea());
                preparedStatement.setInt(8,service.getNumberOfFloors());
                preparedStatement.setInt(9,service.getIdRentType());
                preparedStatement.setInt(10,service.getIdServiceType());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
