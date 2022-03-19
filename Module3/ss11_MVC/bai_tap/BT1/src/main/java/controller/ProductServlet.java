package controller;

import model.Product;
import service.IProductService;
import service.Impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createForm(request,response);
                break;
            case "edit":
                editForm(request,response);
                break;
            case "delete":
                deleteForm(request,response);
                break;
            case "view":
                viewProduct(request,response);
                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            default:
                break;
        }
    }
    private void listProduct(HttpServletRequest request,HttpServletResponse response){
        List<Product> productList = this.productService.findAll();
        request.setAttribute("productList",productList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createForm(HttpServletRequest request,HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createProduct(HttpServletRequest request,HttpServletResponse response){

        String nameProduct = request.getParameter("productname");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");

        Product product = new Product(nameProduct,price,description,producer);
        this.productService.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message","Create new successful product");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editForm(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editProduct(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String productName = request.getParameter("productname");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String producer = request.getParameter("producer");

        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            product.setProductName(productName);
            product.setPrice(price);
            product.setDescription(description);
            product.setProducer(producer);
            this.productService.update(id,product);
            request.setAttribute("product",product);
            request.setAttribute("message","Product information update successfully");
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void deleteForm(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("product/delete.jsp");
        }
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteProduct(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            this.productService.remove(id);
        }
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void viewProduct(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if (product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("product/view.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchProduct(HttpServletRequest request,HttpServletResponse response){
        String productName = request.getParameter("search");
        List<Product> productList = new ArrayList<>();
        List<Product> list = this.productService.findAll();
        for (Product product: list){
            if(product.getProductName().toLowerCase().contains(productName.toLowerCase())){
                productList.add(product);
            }
        }
        if (productList.size() == 0){
            request.setAttribute("message","Not Found");
        }else {
            request.setAttribute("productList",productList);
        }
        try {
            request.getRequestDispatcher("product/search.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
