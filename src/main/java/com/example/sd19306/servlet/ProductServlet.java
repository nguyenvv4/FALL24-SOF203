package com.example.sd19306.servlet;

import com.example.sd19306.model.Product;
import com.example.sd19306.repository.ProductRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ProductServlet", value = {"/hien-thi",
        "/them",
        "/xoa",
        "/cap-nhat",
        "/chi-tiet"
})
public class ProductServlet extends HttpServlet {

    ArrayList<Product> listProduct = new ArrayList<>();
    ProductRepository productRepository = new ProductRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("/hien-thi")) {
            listProduct = productRepository.getListProduct();
            request.setAttribute("listProduct", listProduct);
            request.getRequestDispatcher("/product.jsp").forward(request, response);
        }
        // in thong tin cua ban than len web
//        else if (uri.contains("/chi-tiet")) {
//            String id = request.getParameter("id");
//            Product productDetail = new Product();
//            for (Product pro : listProduct) {
//                if (pro.getId().equals(id)) {
//                    productDetail = pro;
//                }
//            }
//            request.setAttribute("productDetail", productDetail);
//            request.getRequestDispatcher("/detail.jsp").forward(request, response);
//        } else if (uri.contains("/xoa")) {
//            String id = request.getParameter("id");
//            Product product = new Product();
//            for (Product pro : listProduct) {
//                if (pro.getId().equals(id)) {
//                    product = pro;
//                }
//            }
//            listProduct.remove(product);
//            response.sendRedirect(("/hien-thi"));
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String uri = request.getRequestURI();
//        if (uri.contains("/them")) {
//            String id = request.getParameter("id");
//            String name = request.getParameter("name");
//            Integer price = Integer.parseInt(request.getParameter("price"));
//            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
//            Product product = new Product(id, name, price, quantity);
//            listProduct.add(product);
//            response.sendRedirect(("/hien-thi"));
//        } else if (uri.contains("/cap-nhat")) {
//            String id = request.getParameter("id");
//            String name = request.getParameter("name");
//            Integer price = Integer.parseInt(request.getParameter("price"));
//            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
//            for (Product pro : listProduct) {
//                if (pro.getId().equals(id)) {
//                    pro.setName(name);
//                    pro.setPrice(price);
//                    pro.setQuantity(quantity);
//                }
//            }
//            response.sendRedirect(("/hien-thi"));
//        }
    }
}
