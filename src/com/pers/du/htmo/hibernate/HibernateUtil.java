package com.pers.du.htmo.hibernate;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pers.du.htmo.model.Employee;

/**
 * @ClassName:HibernateUtil
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月13日 下午7:16:17
 * @Modified By:
 */
public class HibernateUtil {
	
	public static void main(String[] args){
		
		Configuration cfg = null;
		Session session = null;
		Transaction ts = null;
		
		try{
			cfg = new Configuration().configure();
			SessionFactory factory = cfg.buildSessionFactory();
			session = factory.openSession();
			String hql = "from Employee";
			Query query = session.createQuery(hql);
			List<Employee> employeeList = query.list();
			System.out.println("employee size" + employeeList.size());
		}catch(HibernateException he){
			he.printStackTrace();
		}finally{
			session.close();
		}
	}
}















































//private static SessionFactory sessionFactory = null;
//
////采用单利模式
//private HibernateUtil(){
//}
//
//public static SessionFactory getSessitonFactory(){
//	
//	if(sessionFactory == null){
//		//创建Configuration对象:对应hibernate的基本信息和对象映射关系
//		Configuration config = new Configuration().configure();
//		//创建一个对象StandardServiceRegistry.configure(hibernate.cfg.xml)
//		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//		//创建会化工厂对象
//		sessionFactory = config.buildSessionFactory(registry);
//		return sessionFactory;
//	}else{
//		return sessionFactory;
//	}
//}