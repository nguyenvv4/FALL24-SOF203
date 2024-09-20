package com.example.sd19306.servlet;

import com.example.sd19306.model.Product;
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

    public ProductServlet() {
        listProduct.add(new Product("P1", "San pham 1", 3, 2));
        listProduct.add(new Product("P2", "San pham 2", 3, 2));
        listProduct.add(new Product("P3", "San pham 3", 3, 2));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("/hien-thi")) {
            request.setAttribute("listProduct", listProduct);
            request.getRequestDispatcher("/product.jsp").forward(request, response);
        }
        // in thong tin cua ban than len web
        else if (uri.contains("/chi-tiet")) {
            String id = request.getParameter("id");
            Product productDetail = new Product();
            for (Product pro : listProduct){
                if (pro.getId().equals(id)){
                    productDetail = pro;
                }
            }
            request.setAttribute("productDetail", productDetail);
            request.getRequestDispatcher("/detail.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/them")) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            Integer price = Integer.parseInt(request.getParameter("price"));
            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
            Product product = new Product(id, name, price, quantity);
            listProduct.add(product);
            response.sendRedirect(("/hien-thi"));

        }
    }
}
