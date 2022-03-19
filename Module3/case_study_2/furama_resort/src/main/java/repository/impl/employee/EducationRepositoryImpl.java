package repository.impl.employee;

import model.employee.Division;
import model.employee.Education;
import model.employee.Employee;
import repository.DBConnection;
import repository.interfaceEmployee.EducationRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationRepositoryImpl implements EducationRepository {
    private static String SELECT_ALL_EDUCATION = "SELECT * FROM education_degree";
    @Override
    public List<Education> findAll() {
        List<Education> educationList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_EDUCATION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idEducation = resultSet.getInt("education_degree_id");
                String nameEducation = resultSet.getString("education_degree_name");
                educationList.add(new Education(idEducation, nameEducation));
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
        return educationList;
    }
}
