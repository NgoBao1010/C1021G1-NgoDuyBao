package controller;

import model.Category;
import model.Product;
import service.impl.CategoryServiceImpl;
import service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductServiceImpl productService = new ProductServiceImpl();
    private CategoryServiceImpl categoryService = new CategoryServiceImpl();
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
                deleteForm(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void deleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.delete(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(HttpServletRequest request,HttpServletResponse response){
        List<Product> productList = productService.findAll();
        request.setAttribute("productList",productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void editForm(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = categoryService.findAll();
        request.setAttribute("categoryList", categoryList);
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.selectProduct(id);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = categoryService.findAll();
        request.setAttribute("categoryList", categoryList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
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
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "search":
                searchName(request, response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void searchName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Product> productList = productService.search(name);
        request.setAttribute("productList",productList);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameProduct = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int idCategory = Integer.parseInt(request.getParameter("category"));

        Product product = new Product(id,nameProduct, price, quantity, color,idCategory);
        productService.updateProduct(product);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createProduct(HttpServletRequest request, HttpServletResponse response){
        String nameProduct = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        int idCategory = Integer.parseInt(request.getParameter("idCategory"));

        Product product = new Product(nameProduct,price,quantity,color,idCategory);
        productService.create(product);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
