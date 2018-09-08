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
 * @Date:Create in 2018��3��9�� ����11:09:20
 * @Modified By:
 */

public class EmployeeDao{
	
	public Employee getEmployee(Employee employee){
		
//		System.out.println("daoLogin");
		Employee emp = null;
		
		try{
			// ����Configuration����:��Ӧhibernate�Ļ���������Ϣ�Ͷ����ϵӳ����Ϣ
			Configuration cfg = new Configuration().configure();
			Session session = null;
			//����sessionFactory�Ự����	
			SessionFactory factory = cfg.buildSessionFactory();
			session = factory.openSession();
			//ͨ��������ȡ��Ϣ			
			emp = (Employee)session.get(Employee.class, employee.getEmployeeId());
		}catch(Exception e){
			e.printStackTrace();
		}
		return emp;
	}
	
}
	




















//public interface EmployeeDao{
//	
//	//��½
//	boolean login(Employee employee);
//}


//String hql = "from Employee";
//Query query = session.createQuery(hql);
//List<Employee> employeeList = query.list();


//public class EmployeeDao extends JdbcDao{
//	
//	//���������һ������
//	private static EmployeeDao employeeDao = null;
//	
//	/*
//	 * Ĭ�Ϲ�����
//	 */
//	public EmployeeDao(){}
//	
//	/*
//	 * ͨ��һ���򵥵ĵ���ģʽ��EmployeeDao���ؿͻ���
//	 * ԭ��
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
//	 * ȡ��Ա���б�
//	 */
//	public List<Employee> getEmployee(Employee employee){
//		
//		List<Employee> employeeList = new ArrayList<>(); 
//		
//		super.getConnection();  //��������
//		
//		//����һ����ѯ���
//		String sql = "select * from employee where employeeId = ? and passWord = ? and employeeName = ?";
//		
//		try{
//			//Ԥ�Ʊ���һ��sql����PreparedStream����
//			psm = conn.prepareStatement(sql);
//			psm.setInt(1, employee.getEmployeeId());  //?
//			psm.setString(2, employee.getPassword());
//			rs = psm.executeQuery();  //����һ��������������ȡ��ѯ����
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
//			super.connClose();  //����JdbcDao���connClose()����
//		}
//		return employeeList;
//	}
//}

// rs.next()������ѯ���ʱ���±��Ǵӡ�1����ʼ

/*
 * java.sql.SQLException:Parameter index out of range (0 < 1 )
 * ���:�ڲ�ѯ����е�"from"д����"form"
 */
/*
 * try{
 * Configuration cfg = new Configuration().configure();
	Session session = null;
	Transaction tx = null
	}
 */
//session.get(Employee.class,employee.getSn());//ͨ���������Ա������
