package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.interfaceCustomer.CustomerService;
import service.interfaceCustomer.CustomerTypeService;
import service.impl.customer.CustomerServiceImpl;
import service.impl.customer.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();
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
                deleteCustomer(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.delete(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        System.out.println(customerTypeList.size());
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editForm(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.selectCustomer(id);
        request.setAttribute("customer", customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try{
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
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameCustomer = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idCustomerType = Integer.parseInt(request.getParameter("customerType"));

        Customer customer = new Customer(id,nameCustomer, birthday, gender, idCard,phone,email,address,idCustomerType);
        customerService.updateCustomer(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idCustomerType = Integer.parseInt(request.getParameter("idCustomerType"));

        Customer customer = new Customer(nameCustomer,birthday,gender,idCard,phone,email,address,idCustomerType);
        customerService.create(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
