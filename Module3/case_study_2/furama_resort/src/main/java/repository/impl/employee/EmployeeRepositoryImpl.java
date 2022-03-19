package repository.impl.employee;

import model.customer.Customer;
import model.employee.Employee;
import repository.DBConnection;
import repository.interfaceEmployee.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static String SELECT_ALL_EMPLOYEE = "SELECT * FROM employee join position on employee.position_id = position.position_id join education_degree on employee.education_degree_id = education_degree.education_degree_id join division on employee.division_id = division.division_id;";
    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee (employee_name, employee_birthday, employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id) VALUES (?,?,?,?,?,?, ?, ?,?,?);";
    private static final String SELECT_EMPLOYEE_BY_ID = "select * from employee where employee_id =?";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where employee_id = ?";
    private static final String UPDATE_EMPLOYEE_SQL = "update employee set employee_name = ?,employee_birthday= ?, employee_id_card =?, employee_salary =?, employee_phone =?, employee_email =?, employee_address =?,position_id=?,education_degree_id=?,division_id=? where employee_id = ?;";

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int idPosition = resultSet.getInt("position_id");
                String namePosition = resultSet.getString("position_name");
                int idEducation = resultSet.getInt("education_degree_id");
                String nameEducation = resultSet.getString("education_degree_name");
                int idDivision = resultSet.getInt("division_id");
                String nameDivision = resultSet.getString("division_name");

                employeeList.add(new Employee(id,name,birthday,idCard,salary,phone,email,address,
                        idPosition,namePosition,idEducation,nameEducation,idDivision,nameDivision));
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
        return employeeList;
    }

    @Override
    public void create(Employee employee) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null){
            try {
                preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL);
                preparedStatement.setString(1,employee.getNameEmployee());
                preparedStatement.setString(2,employee.getBirthday());
                preparedStatement.setString(3,employee.getIdCardEmployee());
                preparedStatement.setDouble(4,employee.getSalary());
                preparedStatement.setString(5,employee.getPhoneEmployee());
                preparedStatement.setString(6,employee.getEmailEmployee());
                preparedStatement.setString(7,employee.getAddressEmployee());
                preparedStatement.setInt(8,employee.getIdPosition());
                preparedStatement.setInt(9,employee.getIdEducation());
                preparedStatement.setInt(10,employee.getIdDivision());

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

    @Override
    public void delete(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);
            preparedStatement.setString(1, employee.getNameEmployee());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setString(3, employee.getIdCardEmployee());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5, employee.getPhoneEmployee());
            preparedStatement.setString(6, employee.getEmailEmployee());
            preparedStatement.setString(7, employee.getAddressEmployee());
            preparedStatement.setInt(8,employee.getIdPosition());
            preparedStatement.setInt(9,employee.getIdEducation());
            preparedStatement.setInt(10,employee.getIdDivision());
            preparedStatement.setInt(11,employee.getIdEmployee());

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

    @Override
    public Employee selectEmployee(int id) {
        Employee employee = null;
        Connection connection = DBConnection.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int employeeID = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int idPosition = resultSet.getInt("position_id");
                int idEducation = resultSet.getInt("education_degree_id");
                int idDivision = resultSet.getInt("division_id");
                employee = new Employee(employeeID,name,birthday,idCard,salary,phone,email,address,idPosition,idEducation,idDivision);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }
}
