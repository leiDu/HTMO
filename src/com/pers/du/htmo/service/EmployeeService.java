package com.pers.du.htmo.service;

//import java.util.List;
//
//import javax.transaction.Transaction;
//import org.hibernate.Session;
//import org.hibernate.query.Query;

//import java.util.*;

import com.pers.du.htmo.dao.EmployeeDao;
import com.pers.du.htmo.model.*;
//import com.pers.du.htmo.hibernate.HibernateUtil;

/**
 * @ClassName:EmployeeService 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月9日 上午11:47:45
 * @Modified By:
 */

public class EmployeeService {
	
	//定义一个实体对象
    private EmployeeDao employeeDao = new EmployeeDao();
	
	public Employee login(Employee employee) throws Exception{
		
//		System.out.println("serviceLogin");
		Employee emp = employeeDao.getEmployee(employee);
		
		if(emp != null && emp.getPassWord().equals(employee.getPassWord())){
            return emp;			
		}else{
			throw new Exception("employee and password err");
		}
   }
}




























//public class EmployeeService implements EmployeeDao{
//	
//	private org.hibernate.Transaction ts = null;
//	private String sql = "";
//	private Session session = null;
//	
//	@Override
//	public boolean login(Employee employee){
//		
//		try{
//			getSession();
//			sql = "select employeeId,password from employee employeeId = ? and password =?";
//			Query query = session.createQuery(sql);
//			query.setParameter(0, employee.getEmployeeId());
//			query.setParameter(1, employee.getPassWord());
//			List list = query.list();
//			ts.commit();
//			if(!list.isEmpty()){
//				return true;
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			session.close();
//		}
//		return false;
//	}
//
//	private void getSession() {
//		// TODO Auto-generated method stub
//		session = HibernateUtil.getSessitonFactory().openSession();
//		ts = session.beginTransaction();
//	}
//}
//
//



//	private EmployeeDao employeeDao = EmployeeDao.getEmployeeDao();
//	
//	public boolean employeeLogin(Employee employee){
//		
//		boolean isLogin = false;  //?
//		List list = employeeDao.getEmployee(employee);  //?
//		Iterator it = list.iterator();  //?
//		
//		if(it.hasNext()){
//			isLogin = true;
//		}
//		return isLogin;
//	}
//}	

/*
*
*/