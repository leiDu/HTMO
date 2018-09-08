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
 * @Date:Create in 2018��3��16�� ����2:53:25
 * @Modified By:
 */



/**
 * 
 * ˼·��
 * 1.����configurator���󣬲�����configuta()������ʹ����hibernate��ӳ��
 * 2.�޽��Ự����
 * 3.�����Ự�����򿪻Ự����
 * 4.�������񣬲���������
 * 5.ͨ��get()����������idֵ
 * 6.�ύ����
 * 
 */

public class HisdayDao {
		
	public Hisday getHisday(Hisday hisday){
		
	    Hisday his= new Hisday();
		
		try{
			System.out.println("hisdayDao");
			//����Configuration���󣬶�hibernate�Ļ���������Ϣ�Ͷ���ӳ����Ϣ
			Configuration configuration = new Configuration().configure();
			Session session = null;
			//����SessionFactiry����
			SessionFactory sessionFac = configuration.buildSessionFactory();
			//�����Ự
			session = sessionFac.openSession();
			//���ָ����ٵ�id
			his = (Hisday)session.get(Hisday.class, hisday.getLeaveId());
		}catch(Exception e){
			e.printStackTrace();
		}
		return his;
	}
	
	//��ȡ���о����е�hisday��Ϣ
	public List<Hisday> loadHisday(){
		
		//����configurator���󣬲���hibernateӳ��
		Configuration configuration = new Configuration().configure();
		//����һ��������
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//�����Ự�����򿪻Ự
		Session session = sessionFactory.openSession();
		//�������񣬲���������
		Transaction transaction = session.beginTransaction();
		//������ѯ���
		Query query = session.createQuery("from Hisday hisday");
		//�Բ�ѯ�������о�
		List<Hisday> hisList = query.list();
		//�ύ����
		transaction.commit();
		return hisList;
	}
	
	//�������б�
	public Hisday addHisday(Hisday hisday){
		
//		Hisday addHis = new Hisday();
				
		try{
			System.out.println("addHisdayDao");
			//����configurstion���󣬶�hibernate�����ý���ӳ��
			Configuration configuration = new Configuration().configure();
			//�޽��Ự����
			SessionFactory factory = configuration.buildSessionFactory();
			//�򿪻Ự����
			Session session = factory.openSession();
			//��������
			Transaction st = session.beginTransaction();
			
//			addHis.setEmployeeId(hisday.getEmployeeId());
//			addHis.setEmployeeName(hisday.getEmployeeName());
//			addHis.setStartTime(hisday.getStartTime());
//			addHis.setEndTime(hisday.getEndTime());
//			addHis.setStatus(hisday.getStatus());
//			addHis.setLeaveReason(hisday.getLeaveReason());
//			addHis.setAssessName(hisday.getAssessName());  �ö���ͨ��hisday�����Ѵ������ݣ�����Ҫ��ʵ������������
			session.save(hisday);
			//�ύ����
			st.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return hisday;
	}
	
	//���������Ϣ�ķ���
	public Hisday updateHisday(Hisday hisday){
		
		try{
			System.out.println("upDao");
			//����configurator���󣬲�ʹ��hibernate����ӳ��
			Configuration configuration = new Configuration().configure();
			//��������
			SessionFactory sefactory = configuration.buildSessionFactory();
			//�����Ự���������Ự
			Session session = sefactory.openSession();
			//��������,����������
			Transaction transaction = session.beginTransaction();
//			//��ȡid
//			 hisday =session.get(Hisday.class, hisday.getLeaveId());
			session.update(hisday);
			//�ύ����
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return hisday;
	}
	
	//ɾ����¼�ķ���
	public void deleHis(int leaveId){
		
		try{
			//����configrutor���󣬲���hibernate��ӳ��
			Configuration configuration = new Configuration().configure();
			//�����Ự����
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//�����Ự�����򿪻Ự
			Session session = sessionFactory.openSession();
			//��������,����������
			Transaction transaction = session.beginTransaction();
			//ɾ��ָ����Id
			Hisday hs = (Hisday)session.get(Hisday.class, leaveId);
			session.delete(hs);
			//�ύ����
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//�޸�һ����¼�ķ���
	//public void upStatus(String status){
	public Hisday upStatus(Hisday hisday){
		
		try{
			System.out.println("statusDao");
			//����configurator���󣬲���hibernate����Ӧ
			Configuration configuration = new Configuration().configure();
			//�޽��Ự����
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//�����Ự���������Ự
			Session session = sessionFactory.openSession();
			//�������񣬲���������
			Transaction transaction = session.beginTransaction();
			//����ʵ���࣬�������
			//Hisday  hid = (Hisday)session.get(Hisday.class,leaveId);
			session.update(hisday);
			//�ύ����
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
