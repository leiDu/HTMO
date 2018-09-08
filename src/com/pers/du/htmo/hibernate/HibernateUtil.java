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
 * @Date:Create in 2018��3��13�� ����7:16:17
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
////���õ���ģʽ
//private HibernateUtil(){
//}
//
//public static SessionFactory getSessitonFactory(){
//	
//	if(sessionFactory == null){
//		//����Configuration����:��Ӧhibernate�Ļ�����Ϣ�Ͷ���ӳ���ϵ
//		Configuration config = new Configuration().configure();
//		//����һ������StandardServiceRegistry.configure(hibernate.cfg.xml)
//		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//		//�����ữ��������
//		sessionFactory = config.buildSessionFactory(registry);
//		return sessionFactory;
//	}else{
//		return sessionFactory;
//	}
//}