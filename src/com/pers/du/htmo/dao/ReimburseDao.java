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
 * @Date:Create in 2018��3��19�� ����9:49:55
 * @Modified By:
 */

public class ReimburseDao {
	
	//ȡ��reimburse�����ݵķ���
	public Reimburse getReimburse(Reimburse reimburse){
		
		Reimburse reim = null;
		
		try{
//			System.out.println("reimburseDao");
			//����Configuration����,��hibernate�Ļ���������Ϣ����ӳ��
			Configuration config = new Configuration().configure();
			//�����Ự����
			SessionFactory sefa = config.buildSessionFactory();
			Session session = sefa.openSession();
			reim = (Reimburse)session.get(Reimburse.class,reimburse.getReimburseId());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reim;
	}
	
	//���reimburse�����ݵķ���
	public Reimburse addReimburse(Reimburse reimburse){
		
		try{
			//����confgtion���󣬲���hibernate��ӳ��
			Configuration confgtion = new Configuration().configure();
			//�����Ự����
			SessionFactory sefac = confgtion.buildSessionFactory();
			//�򿪻Ự
			Session session = sefac.openSession();
			//��������,����ʼ����
			Transaction tr = session.beginTransaction();
			session.save(reimburse);
			//�ύ����
			tr.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reimburse;
	}
	
	//�޸�reimburse�����ݵķ���
	public Reimburse upReim(Reimburse reimburse){
		
		try{
			//����configuration�Ķ��󣬲���hibernate����Ӧ
			Configuration configuration = new Configuration().configure();
			//�����Ự����
			SessionFactory seFactory = configuration.buildSessionFactory();
			//�����Ự�����򿪻Ự
			Session session = seFactory.openSession();
			//�������񣬲�������
			Transaction transaction = session.beginTransaction();
			//�������
			session.update(reimburse);
			//�ύ����
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return reimburse;
	}

	//�о����ݵķ���
	public List<Reimburse> loadDao() {
		
		// TODO Auto-generated method stub
		//����configuerator����,����hibernate��Ӧ
		Configuration configuration = new Configuration().configure();
		//�����Ự����
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//�����Ự�����򿪻Ự
		Session session = sessionFactory.openSession();
		//��������,����ʼ����
		Transaction transact= session.beginTransaction();
		//����hql��ѯ�����
		Query<Reimburse> query = session.createQuery("from Reimburse reimburse");
		List<Reimburse> listReim = query.list();
		//�ύ����
		transact.commit();
		return listReim;
	}

	//ɾ�����ݵķ���
//	public Reimburse deReimDao(Reimburse reimburse) {
	public void deReimDao(int reimburseId){
		
		// TODO Auto-generated method stub
		try{
			System.out.println("deleDao");
			//����configuractor���󣬲���hibernate��ӳ��
			Configuration configuration = new Configuration().configure();
			//�޽�һ������
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//����һ���Ự�����򿪻Ự
			Session session = sessionFactory.openSession();
			//����һ�����񣬲���������
			Transaction transaction = session.beginTransaction();
//			Reimburse reimb = (Reimburse)session.get(Reimburse.class, reimburse.getReimburseId());
			//��ö���
			Reimburse reimb = (Reimburse)session.get(Reimburse.class, reimburseId);
			session.delete(reimb);
			//�ύ����
			transaction.commit();	
			
		}catch(Exception e){
			e.printStackTrace();
		}
//		return reimburse;
	}
}
