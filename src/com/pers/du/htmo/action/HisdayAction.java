package com.pers.du.htmo.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.pers.du.htmo.model.Hisday;
import com.pers.du.htmo.service.HisdayService;


/**
 * @ClassName:HisdayAction 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��16�� ����3:30:31
 * @Modified By:
 */

public class HisdayAction implements Action{
	
	//������������
	private Hisday hisday;
	private HisdayService hisdayService = new HisdayService();
	private List<Hisday> listHisd;
	
	
	public List<Hisday> getListHisd() {
		return listHisd;
	}

	public void setListHisd(List<Hisday> listHisd) {
		this.listHisd = listHisd;
	}

	public Hisday getHisday() {
		return hisday;
	}
	
	public void setHisday(Hisday hisday) {
		this.hisday = hisday;
	}
	
	public HisdayService getHisdayService() {
		return hisdayService;
	}
	
	public void setHisdayService(HisdayService hisdayService) {
		this.hisdayService = hisdayService;
	}
	
	public String sele() throws Exception{
		
		listHisd = hisdayService.getListHis();	
		return "sel";
	}
	
	public String look() throws Exception{
		
		try{
			System.out.println("HisdayAction");
			hisday = hisdayService.getHisdayService(hisday);
			//ȡ��ֵջ
			ActionContext acontext = ActionContext.getContext();
			Map<String, Object> session = acontext.getSession();
			//����Ϣ���뵽sseion��
			session.put("hisday",hisday);

		}catch(Exception e){
			e.printStackTrace();
		}
		return "upPage";
		//return "info";
	}

	/*
	 * �÷����ǽ�index.jspҳ������������ӵ����ҳ��
	 * ����������ݵ���add����
	 */
	public String toAdd() throws Exception{
		return "addInfo";
	}
	
	public String add() throws Exception{
		System.out.println("addAction");
		 hisdayService.insert(hisday);
		return "toAddInfo";
	}

	public String up() throws Exception{
		
		return "upPage";
	}
	
	public String upPage() throws Exception{
		
		System.out.println("upAction");
		 hisdayService.upHisService(hisday);

		return "upSeccess";
	}
	
	public String deHis() throws Exception{
		
		try{
			
			HttpServletRequest hrs = ServletActionContext.getRequest();
			String hisId = hrs.getParameter("leaveId");
			hisdayService.dele(Integer.parseInt(hisId));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "deleHis";
	}
	
	public String sta() throws Exception{
		
		System.out.println("statusAction");
		//��ȡԭ��status
		//�õ�ԭ����request
//   		HttpServletRequest ht = ServletActionContext.getRequest();
//		String stu = ht.getParameter("status");
//		String h = stu.replace("outAssess", sta);
//		hisdayService.upSta(h);
//		hisdayService.upSta(status);
		try{
			hisday = hisdayService.upSta(hisday);
//			ActionContext ac = ActionContext.getContext();
//			Map<String, Object> session = ac.getSession();
//			//����Ϣ���뵽sseion��
//			session.replace("hisday", "hisday.status", sta);
//			session.put("hisday", ac);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}






















//int id = hisay.getLeaveId();
//session.put("hisday", id);
//Date start = hisay.getStarTime();
//session.put("hisday", start);
//Date end = hisay.getEndTime();
//session.put("hisday", end);
//String stutas = hisay.getStatus();
//session.put("hisday", stutas);
//String reason = hisay.getLeaveReason();
//session.put("hisday", reason);
//String stu = hisay.getStatus();
//session.put("hisday", stu);


//Hisday his = new Hisday();

////ȡ��ֵջ
//ActionContext text = ActionContext.getContext();
//Map<String, Object> map = text.getSession();
//map.put("hisday", hisay);	