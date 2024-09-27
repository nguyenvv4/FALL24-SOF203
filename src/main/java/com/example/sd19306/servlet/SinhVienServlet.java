package com.example.sd19306.servlet;

import com.example.sd19306.model.SinhVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SinhVienServlet", value = {"/sinh-vien/hien-thi",
        "/sinh-vien/add",
        "/sinh-vien/update",
        "/sinh-vien/detail"
})
public class SinhVienServlet extends HttpServlet {

    ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienServlet() {
        list.add(new SinhVien("SV1", "Nguyen Van A", "HA Noi", "SD1801", "active"));
        list.add(new SinhVien("SV3", "Nguyen Van A", "HA Noi", "SD1801", "active"));
        list.add(new SinhVien("SV2", "Nguyen Van A", "HA Noi", "SD1801", "active"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/sinh-vien/hien-thi")) {
            request.setAttribute("list", list);
            request.getRequestDispatcher("/sinh-vien.jsp").forward(request, response);
        } else if (uri.contains("/sinh-vien/detail")) {
            String id = request.getParameter("id");
            SinhVien sinhVienDetail = new SinhVien();
            for (SinhVien sinhVien : list) {
                if (sinhVien.getId().equals(id)) {
                    sinhVienDetail = sinhVien;
                }
            }

            request.setAttribute("sinhVien", sinhVienDetail);
            request.getRequestDispatcher("/sinh-vien-detail.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/sinh-vien/add")) {
            String id = request.getParameter("id");
            String hoTen = request.getParameter("hoTen");
            String diaChi = request.getParameter("diaChi");
            String lop = request.getParameter("lop");
            String trangThai = request.getParameter("trangThai");
            SinhVien sinhVien = new SinhVien(id, hoTen, diaChi, lop, trangThai);
            list.add(sinhVien);
            response.sendRedirect("/sinh-vien/hien-thi");
        }
    }
}
