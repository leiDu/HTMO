package com.pers.du.htmo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

/**
 * @ClassName:JdbcDao 
 * @Description: 数据库的连接
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月9日 上午10:32:02
 * @Modified By:
 */

public class JdbcDao {
	
	//创建数据库连接
	protected Connection conn = null;  
	//定义PreparedStream的变量
	protected PreparedStatement psm = null;
	//定义结果集
	protected ResultSet rs = null;  
	//定义MySQL驱动
	private String driver="com.mysql.jdbc.Driver";  //把mysql和jdbc写反，出现ClassNotFoundException错误
	//定义MySQL数据类的url
	private String url="jdbc:mysql://localhost:3306/htmo?user=root&password=123456";  
	
	/*
	 * 默认构造器
	 */
	public JdbcDao(){}  
	
	/*
	 * 定义一个连接方法
	 */
	public void getConnection(){
		
		Connection conn = null;  //？
		
		try{
			Class.forName(driver);  //加载数据库驱动
			conn = DriverManager.getConnection(url);  //连接数据库
			this.conn = conn;  	
		}catch(SQLException ex){
			ex.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	/*
	 * 定义一个关闭连接的方法
	 */
	public void connClose(){
		
		/*
		 * 如果结果集不为空，则关闭结果集，反之
		 */
		if(rs != null){
			
			try{
				rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		/*
		 * 如果psm变量为空，则关闭，反之
		 */
		if(psm != null){
			
			try{
				psm.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		/*
		 * 如果连接不为空，则关闭，反之
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
