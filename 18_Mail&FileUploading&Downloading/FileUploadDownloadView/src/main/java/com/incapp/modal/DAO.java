package com.incapp.modal;

import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;

public class DAO {
	private Connection c;

	public DAO() throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "incapp");
	}
	public void closeConnection() throws SQLException {
		c.close();
	}
	
	public void uploadFile(InputStream i,String fn) throws SQLException {
		PreparedStatement p=c.prepareStatement("insert into files (fname,file) values (?,?)");
		p.setString(1, fn);
		p.setBinaryStream(2, i);
		p.executeUpdate();
	}
	
	public HashMap<Integer,String> getAllFiles() throws SQLException {
		PreparedStatement p=c.prepareStatement("select * from files");
		ResultSet rs=p.executeQuery();
		HashMap<Integer,String> files=new HashMap<>();
		while(rs.next()) {
			int id=rs.getInt("id");
			String fname=rs.getString("fname");
			files.put(id, fname);
		}
		return files;
	}
	
	public byte[] getFileById(int id) throws SQLException {
		PreparedStatement p=c.prepareStatement("select file from files where id=?");
		p.setInt(1, id);
		ResultSet rs=p.executeQuery();
		if(rs.next()) 
			return rs.getBytes("file");
		else
			return null;
	}
	
}
