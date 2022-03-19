package controller;

import model.customer.Customer;
import model.employee.Division;
import model.employee.Education;
import model.employee.Employee;
import model.employee.Position;
import service.impl.employee.DivisionServiceImpl;
import service.impl.employee.EducationServiceImpl;
import service.impl.employee.EmployeeServiceImpl;
import service.impl.employee.PositionServiceImpl;
import service.interfaceEmployee.DivisionService;
import service.interfaceEmployee.EducationService;
import service.interfaceEmployee.EmployeeService;
import service.interfaceEmployee.PositionService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService = new EmployeeServiceImpl();
    PositionService positionService = new PositionServiceImpl();
    EducationService educationService = new EducationServiceImpl();
    DivisionService divisionService = new DivisionServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createForm(request, response);
                break;
            case "edit":
                editForm(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            default:
                listEmployee(request, response);
                break;
        }
    }

    private void editForm(HttpServletRequest request, HttpServletResponse response) {
        List<Division> divisionList = divisionService.findAll();
        request.setAttribute("divisionList", divisionList);
        List<Position> positionList = positionService.findAll();
        request.setAttribute("positionList", positionList);
        List<Education> educationList = educationService.findAll();
        request.setAttribute("educationList", educationList);

        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.selectEmployee(id);
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/edit.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.delete(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        List<Division> divisionList = divisionService.findAll();
        request.setAttribute("divisionList", divisionList);
        List<Position> positionList = positionService.findAll();
        request.setAttribute("positionList", positionList);
        List<Education> educationList = educationService.findAll();
        request.setAttribute("educationList", educationList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.findAll();
        request.setAttribute("employeeList",employeeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            case "edit":
                editEmployee(request, response);
                break;
            default:
                listEmployee(request, response);
                break;
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameEmployee = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("position"));
        int idEducation = Integer.parseInt(request.getParameter("education"));
        int idDivision = Integer.parseInt(request.getParameter("division"));

        Employee employee = new Employee(id,nameEmployee, birthday, idCard,salary,phone,email,address,idPosition,idEducation,idDivision);
        employeeService.updateEmployee(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String nameEmployee = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducation = Integer.parseInt(request.getParameter("idEducation"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));

        Employee employee = new Employee(nameEmployee,birthday,idCard,salary,phone,email,address,idPosition,idEducation,idDivision);
        employeeService.create(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
