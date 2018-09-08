package com.pers.du.htmo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pers.du.htmo.model.Reimburse;

/**
 * @ClassName:ReimburseDao 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月19日 下午9:49:55
 * @Modified By:
 */

public class ReimburseDao {
	
	//取得reimburse的数据的方法
	public Reimburse getReimburse(Reimburse reimburse){
		
		Reimburse reim = null;
		
		try{
//			System.out.println("reimburseDao");
			//创建Configuration对象,对hibernate的基本配置信息进行映射
			Configuration config = new Configuration().configure();
			//创建会话工厂
			SessionFactory sefa = config.buildSessionFactory();
			Session session = sefa.openSession();
			reim = (Reimburse)session.get(Reimburse.class,reimburse.getReimburseId());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reim;
	}
	
	//添加reimburse的数据的方法
	public Reimburse addReimburse(Reimburse reimburse){
		
		try{
			//创建confgtion对象，并于hibernate所映射
			Configuration confgtion = new Configuration().configure();
			//创建会话工厂
			SessionFactory sefac = confgtion.buildSessionFactory();
			//打开会话
			Session session = sefac.openSession();
			//创建事务,并开始事务
			Transaction tr = session.beginTransaction();
			session.save(reimburse);
			//提交事务
			tr.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reimburse;
	}
	
	//修改reimburse的数据的方法
	public Reimburse upReim(Reimburse reimburse){
		
		try{
			//创建configuration的对象，并与hibernate所对应
			Configuration configuration = new Configuration().configure();
			//创建会话工厂
			SessionFactory seFactory = configuration.buildSessionFactory();
			//创建会话，并打开会话
			Session session = seFactory.openSession();
			//创建事务，并打开事务
			Transaction transaction = session.beginTransaction();
			//更新语句
			session.update(reimburse);
			//提交事务
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reimburse;
	}

	//列举数据的方法
	public List<Reimburse> loadDao() {
		
		// TODO Auto-generated method stub
		//创建configuerator对象,并与hibernate对应
		Configuration configuration = new Configuration().configure();
		//创建会话工厂
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//创建会话，并打开会话
		Session session = sessionFactory.openSession();
		//创建事务,并开始事务
		Transaction transact= session.beginTransaction();
		//创建hql查询语句列
		Query<Reimburse> query = session.createQuery("from Reimburse reimburse");
		List<Reimburse> listReim = query.list();
		//提交事务
		transact.commit();
		return listReim;
	}

	//删除数据的方法
//	public Reimburse deReimDao(Reimburse reimburse) {
	public void deReimDao(int reimburseId){
		
		// TODO Auto-generated method stub
		try{
			System.out.println("deleDao");
			//创建configuractor对象，并与hibernate相映射
			Configuration configuration = new Configuration().configure();
			//修建一个工厂
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//创建一个会话，并打开会话
			Session session = sessionFactory.openSession();
			//创建一个事务，并开启事务
			Transaction transaction = session.beginTransaction();
//			Reimburse reimb = (Reimburse)session.get(Reimburse.class, reimburse.getReimburseId());
			//获得对象
			Reimburse reimb = (Reimburse)session.get(Reimburse.class, reimburseId);
			session.delete(reimb);
			//提交事务
			transaction.commit();	
			
		}catch(Exception e){
			e.printStackTrace();
		}
//		return reimburse;
	}
}
