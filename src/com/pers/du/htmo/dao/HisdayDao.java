package com.pers.du.htmo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pers.du.htmo.model.Hisday;

/**
 * @ClassName:HisdayDao 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月16日 下午2:53:25
 * @Modified By:
 */



/**
 * 
 * 思路：
 * 1.创建configurator对象，并调用configuta()方法，使它与hibernate相映射
 * 2.修建会话工厂
 * 3.创建会话，并打开会话工厂
 * 4.创建事务，并开启事务
 * 5.通过get()方法获得类的id值
 * 6.提交事务
 * 
 */

public class HisdayDao {
		
	public Hisday getHisday(Hisday hisday){
		
	    Hisday his= new Hisday();
		
		try{
			System.out.println("hisdayDao");
			//创建Configuration对象，对hibernate的基本配置信息和对象映射信息
			Configuration configuration = new Configuration().configure();
			Session session = null;
			//创建SessionFactiry工厂
			SessionFactory sessionFac = configuration.buildSessionFactory();
			//开启会话
			session = sessionFac.openSession();
			//获得指定请假的id
			his = (Hisday)session.get(Hisday.class, hisday.getLeaveId());
		}catch(Exception e){
			e.printStackTrace();
		}
		return his;
	}
	
	//获取并列举所有的hisday信息
	public List<Hisday> loadHisday(){
		
		//创建configurator对象，并于hibernate映射
		Configuration configuration = new Configuration().configure();
		//创建一个工厂，
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//创建会话，并打开会话
		Session session = sessionFactory.openSession();
		//创建事务，并开启事务
		Transaction transaction = session.beginTransaction();
		//创建查询语句
		Query query = session.createQuery("from Hisday hisday");
		//对查询语句进行列举
		List<Hisday> hisList = query.list();
		//提交事务
		transaction.commit();
		return hisList;
	}
	
	//添加请假列表
	public Hisday addHisday(Hisday hisday){
		
//		Hisday addHis = new Hisday();
				
		try{
			System.out.println("addHisdayDao");
			//创建configurstion对象，对hibernate的配置进行映射
			Configuration configuration = new Configuration().configure();
			//修建会话工厂
			SessionFactory factory = configuration.buildSessionFactory();
			//打开会话工厂
			Session session = factory.openSession();
			//开启事务
			Transaction st = session.beginTransaction();
			
//			addHis.setEmployeeId(hisday.getEmployeeId());
//			addHis.setEmployeeName(hisday.getEmployeeName());
//			addHis.setStartTime(hisday.getStartTime());
//			addHis.setEndTime(hisday.getEndTime());
//			addHis.setStatus(hisday.getStatus());
//			addHis.setLeaveReason(hisday.getLeaveReason());
//			addHis.setAssessName(hisday.getAssessName());  该对象通过hisday对象已传入数据，不需要在实例化创建对象
			session.save(hisday);
			//提交事务
			st.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return hisday;
	}
	
	//更新请假信息的方法
	public Hisday updateHisday(Hisday hisday){
		
		try{
			System.out.println("upDao");
			//创建configurator对象，并使用hibernate进行映射
			Configuration configuration = new Configuration().configure();
			//创建工厂
			SessionFactory sefactory = configuration.buildSessionFactory();
			//创建会话，并开启会话
			Session session = sefactory.openSession();
			//创建事务,并开启事务
			Transaction transaction = session.beginTransaction();
//			//获取id
//			 hisday =session.get(Hisday.class, hisday.getLeaveId());
			session.update(hisday);
			//提交事务
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return hisday;
	}
	
	//删除记录的方法
	public void deleHis(int leaveId){
		
		try{
			//创建configrutor对象，并与hibernate相映射
			Configuration configuration = new Configuration().configure();
			//创建会话工厂
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//创建会话，并打开会话
			Session session = sessionFactory.openSession();
			//创建事务,并开启事务
			Transaction transaction = session.beginTransaction();
			//删除指定的Id
			Hisday hs = (Hisday)session.get(Hisday.class, leaveId);
			session.delete(hs);
			//提交事务
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//修改一条记录的方法
	//public void upStatus(String status){
	public Hisday upStatus(Hisday hisday){
		
		try{
			System.out.println("statusDao");
			//创建configurator对象，并与hibernate所对应
			Configuration configuration = new Configuration().configure();
			//修建会话工厂
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//创建会话，并开启会话
			Session session = sessionFactory.openSession();
			//创建事务，并开启事务
			Transaction transaction = session.beginTransaction();
			//根据实体类，获得属性
			//Hisday  hid = (Hisday)session.get(Hisday.class,leaveId);
			session.update(hisday);
			//提交事务
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return hisday;
	}
}






//Hisday hisda = new Hisday();
//hisda.setEmployeeId(hisday.getEmployeeId());
//hisda.setEmployeeName(hisday.getEmployeeName());
//hisda.setStartTime(hisday.getStartTime());
//hisda.setEndTime(hisday.getEndTime());
//hisda.setLeaveReason(hisday.getLeaveReason());
//hisda.setLeaveReason(hisday.getAssessName());
//ServiceRegistry sr = new StandardServiceRegistryBuilder().
//applySettings(configuration.getProperties()).build();

//addHis.setLeaveId(hisday.getLeaveId()+1);
