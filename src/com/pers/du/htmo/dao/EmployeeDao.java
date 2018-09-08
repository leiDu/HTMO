package com.pers.du.htmo.dao;

//import java.util.List;

import org.hibernate.Session;

//import java.sql.SQLException;
//import java.util.*;

import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import com.pers.du.htmo.model.*;


/**
 * @ClassName:EmployeeDao 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月9日 上午11:09:20
 * @Modified By:
 */

public class EmployeeDao{
	
	public Employee getEmployee(Employee employee){
		
//		System.out.println("daoLogin");
		Employee emp = null;
		
		try{
			// 创建Configuration对象:对应hibernate的基本配置信息和对象关系映射信息
			Configuration cfg = new Configuration().configure();
			Session session = null;
			//创建sessionFactory会话工厂	
			SessionFactory factory = cfg.buildSessionFactory();
			session = factory.openSession();
			//通过主键获取信息			
			emp = (Employee)session.get(Employee.class, employee.getEmployeeId());
		}catch(Exception e){
			e.printStackTrace();
		}
		return emp;
	}
	
}
	




















//public interface EmployeeDao{
//	
//	//登陆
//	boolean login(Employee employee);
//}


//String hql = "from Employee";
//Query query = session.createQuery(hql);
//List<Employee> employeeList = query.list();


//public class EmployeeDao extends JdbcDao{
//	
//	//定义自身的一个变量
//	private static EmployeeDao employeeDao = null;
//	
//	/*
//	 * 默认构造器
//	 */
//	public EmployeeDao(){}
//	
//	/*
//	 * 通过一个简单的单利模式将EmployeeDao返回客户端
//	 * 原理？
//	 */
//	public static synchronized EmployeeDao getEmployeeDao(){
//		
//		if(employeeDao != null){
//			return employeeDao;
//		}
//		
//		employeeDao = new EmployeeDao();
//		return employeeDao;
//	}
//	
//	/*
//	 * 取得员工列表
//	 */
//	public List<Employee> getEmployee(Employee employee){
//		
//		List<Employee> employeeList = new ArrayList<>(); 
//		
//		super.getConnection();  //建立连接
//		
//		//定义一个查询语句
//		String sql = "select * from employee where employeeId = ? and passWord = ? and employeeName = ?";
//		
//		try{
//			//预计编译一个sql返回PreparedStream对象
//			psm = conn.prepareStatement(sql);
//			psm.setInt(1, employee.getEmployeeId());  //?
//			psm.setString(2, employee.getPassword());
//			rs = psm.executeQuery();  //创建一个对象数据来获取查询数据
//			
//			if(rs.next()){
//				
//				Employee emy = new Employee();
//				emy.setEmployeeId(rs.getInt(1));
//				emy.setPassword(rs.getString(2));
//				emy.setEmployeeName(rs.getString(3));
//				employeeList.add(emy);
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}finally{
//			super.connClose();  //返回JdbcDao里的connClose()方法
//		}
//		return employeeList;
//	}
//}

// rs.next()遍历查询结果时，下标是从“1”开始

/*
 * java.sql.SQLException:Parameter index out of range (0 < 1 )
 * 解决:在查询语句中的"from"写成了"form"
 */
/*
 * try{
 * Configuration cfg = new Configuration().configure();
	Session session = null;
	Transaction tx = null
	}
 */
//session.get(Employee.class,employee.getSn());//通过主键获得员工工号
