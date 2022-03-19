package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Cristiano Ronaldo","1985/02/05","Portugal","https://eu-images.contentstack.com/v3/assets/bltcc7a7ffd2fbf71f5/bltc5bb7c12d180d32e/60db401c993b0438464195d6/0d5815259ae6a395605fe51fb0bad3a8fe928351.jpg?auto=webp&fit=crop&format=jpg&quality=100");
        Customer customer1 = new Customer("Wayne Rooney","1985/10/24","England","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRntlpAv43dBeggC205XeMn6mNvgkhtNYzm3tfvA_5A_JHj4jj7");
        Customer customer2 = new Customer("Edwin Van Der Sar","1970/10/29","Holland","https://d5xydlzdo08s0.cloudfront.net/media/celebrities/15464/priceless_com_ambassador_edwin_300x300px2__L.jpg");
        Customer customer3 = new Customer("Nemanja Vidić","1981/10/21","Serbia","https://upload.wikimedia.org/wikipedia/commons/f/f3/Nemanja_Vidic.png");
        Customer customer4 = new Customer("Rio Ferdinand","1978/11/07","England","https://vcdn1-thethao.vnecdn.net/2014/06/24/fer2-3804-1403573702.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=ee-QMyZe5xwQofVlfEc7Ag");
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        request.setAttribute("action" ,customerList);
        request.getRequestDispatcher("displayCustomer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
