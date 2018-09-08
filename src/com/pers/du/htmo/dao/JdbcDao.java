package com.pers.du.htmo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

/**
 * @ClassName:JdbcDao 
 * @Description: ���ݿ������
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��9�� ����10:32:02
 * @Modified By:
 */

public class JdbcDao {
	
	//�������ݿ�����
	protected Connection conn = null;  
	//����PreparedStream�ı���
	protected PreparedStatement psm = null;
	//��������
	protected ResultSet rs = null;  
	//����MySQL����
	private String driver="com.mysql.jdbc.Driver";  //��mysql��jdbcд��������ClassNotFoundException����
	//����MySQL�������url
	private String url="jdbc:mysql://localhost:3306/htmo?user=root&password=123456";  
	
	/*
	 * Ĭ�Ϲ�����
	 */
	public JdbcDao(){}  
	
	/*
	 * ����һ�����ӷ���
	 */
	public void getConnection(){
		
		Connection conn = null;  //��
		
		try{
			Class.forName(driver);  //�������ݿ�����
			conn = DriverManager.getConnection(url);  //�������ݿ�
			this.conn = conn;  	
		}catch(SQLException ex){
			ex.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	/*
	 * ����һ���ر����ӵķ���
	 */
	public void connClose(){
		
		/*
		 * ����������Ϊ�գ���رս��������֮
		 */
		if(rs != null){
			
			try{
				rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		/*
		 * ���psm����Ϊ�գ���رգ���֮
		 */
		if(psm != null){
			
			try{
				psm.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		/*
		 * ������Ӳ�Ϊ�գ���رգ���֮
		 */
		if(conn != null){
			
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
