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
}
