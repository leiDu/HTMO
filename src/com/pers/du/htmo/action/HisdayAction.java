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
 * @Date:Create in 2018年3月16日 下午3:30:31
 * @Modified By:
 */

public class HisdayAction implements Action{
	
	//创建两个对象
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
			//取得值栈
			ActionContext acontext = ActionContext.getContext();
			Map<String, Object> session = acontext.getSession();
			//把信息放入到sseion中
			session.put("hisday",hisday);

		}catch(Exception e){
			e.printStackTrace();
		}
		return "upPage";
		//return "info";
	}

	/*
	 * 该方法是将index.jsp页面的添加请假连接到请假页面
	 * 真正添加数据的是add方法
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
		//获取原生status
		//得到原生的request
//   		HttpServletRequest ht = ServletActionContext.getRequest();
//		String stu = ht.getParameter("status");
//		String h = stu.replace("outAssess", sta);
//		hisdayService.upSta(h);
//		hisdayService.upSta(status);
		try{
			hisday = hisdayService.upSta(hisday);
//			ActionContext ac = ActionContext.getContext();
//			Map<String, Object> session = ac.getSession();
//			//把信息放入到sseion中
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

////取得值栈
//ActionContext text = ActionContext.getContext();
//Map<String, Object> map = text.getSession();
//map.put("hisday", hisay);	