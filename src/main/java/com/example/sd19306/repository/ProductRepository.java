package com.example.sd19306.repository;

import com.example.sd19306.model.Product;
import com.example.sd19306.utils.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductRepository {
    DbConnection dbConnection;

    public ArrayList<Product> getListProduct() {
        String sql = "select  * from Product ";
        ArrayList<Product> list = new ArrayList<>();
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                Integer price = rs.getInt("price");
                Integer quantity = rs.getInt("quantity");
                list.add(new Product(id, name, price, quantity));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Boolean add(Product product) {
        String sql = " insert into Product (id, name, price, quantity)\n" +
                " values (?,?,?,?)";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setObject(1, product.getId());
            ps.setObject(2, product.getName());
            ps.setObject(3, product.getPrice());
            ps.setObject(4, product.getQuantity());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Product getProductDetail(String id) {
        String sql = "select  * from Product where id = ?";
        Product product = new Product();
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("id");
                String name = rs.getString("name");
                Integer price = rs.getInt("price");
                Integer quantity = rs.getInt("quantity");
                product = new Product(ma, name, price, quantity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public Boolean update(String id, Product productUpdate) {
        String sql = "update Product set name = ? ,\n" +
                "price = ?,\n" +
                "quantity = ?\n" +
                "where id = ?";
        try (Connection conn = dbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, productUpdate.getName());
            ps.setObject(2, productUpdate.getPrice());
            ps.setObject(3, productUpdate.getQuantity());
            ps.setObject(4, id);
            return ps.executeUpdate() >= 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
