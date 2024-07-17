package com.incapp.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.incapp.modal.DAO;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/FileUpload")
@MultipartConfig
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Part p=request.getPart("ufile");
			InputStream i=p.getInputStream();
			String fname=p.getSubmittedFileName();
			
			HttpSession session=request.getSession();
			
//			if(fname.contains("[") || fname.contains("]")) {
//				session.setAttribute("msg", "File Name is incorrect!");
//				response.sendRedirect("index.jsp");
//			}
			
			DAO db=new DAO();
			db.uploadFile(i, fname);
			db.closeConnection();
			session.setAttribute("msg", "File Uploaded Successfully!");
			response.sendRedirect("index.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
