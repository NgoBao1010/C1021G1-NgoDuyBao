package controller;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import service.impl.service.RentTypeServiceImpl;
import service.impl.service.ServiceServiceImpl;
import service.impl.service.ServiceTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", value = "/service")
public class ServiceServlet extends HttpServlet {
    ServiceServiceImpl serviceService = new ServiceServiceImpl();
    ServiceTypeServiceImpl serviceTypeService = new ServiceTypeServiceImpl();
    RentTypeServiceImpl rentTypeService = new RentTypeServiceImpl();
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
            default:
                listService(request, response);
                break;
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        List<ServiceType> serviceTypeList = serviceTypeService.findAll();
        request.setAttribute("serviceTypeList",serviceTypeList);
        List<RentType> rentTypeList = rentTypeService.findAll();
        request.setAttribute("rentTypeList",rentTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = serviceService.findAll();
        request.setAttribute("serviceList",serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/list.jsp");
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
                createService(request, response);
                break;
            default:
                listService(request, response);
                break;
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) {
        String nameService = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        String roomStandard = request.getParameter("room");
        String description = request.getParameter("description");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberOfFloor = Integer.parseInt(request.getParameter("floor"));
        int idRentType = Integer.parseInt(request.getParameter("idRentType"));
        int idServiceType = Integer.parseInt(request.getParameter("idServiceType"));

        Service service = new Service(nameService,area,cost,maxPeople,roomStandard,description,poolArea,numberOfFloor,idRentType,idServiceType);
        serviceService.create(service);
        try {
            response.sendRedirect("/service");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
