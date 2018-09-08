package com.pers.du.htmo.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.pers.du.htmo.model.Reimburse;
import com.pers.du.htmo.service.ReimburseService;

/**
 * @ClassName:ReimburseAction 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月19日 下午10:04:04
 * @Modified By:
 */

public class ReimburseAction implements Action{
	
	//创建两个对象
	private Reimburse reimburse;
	private ReimburseService reimburseService = new ReimburseService();
	//列举所有的数据
	private  List<Reimburse> listReim;
	
	
	
	public List<Reimburse> getListReim() {
		return listReim;
	}

	public void setListReim(List<Reimburse> listReim) {
		this.listReim = listReim;
	}

	public Reimburse getReimburse() {
		return reimburse;
	}
	
	public void setReimburse(Reimburse reimburse) {
		this.reimburse = reimburse;
	}
	
	public ReimburseService getReimburseService() {
		return reimburseService;
	}
	
	public void setReimburseService(ReimburseService reimburseService) {
		this.reimburseService = reimburseService;
	}
	
	public String info() throws Exception{
		System.out.println("info....");
		listReim = reimburseService.loadReimSe();
		return "page";
	}
	
	public String find() throws Exception{
		
		try{
//			System.out.println("reimburseAction");
			reimburse = reimburseService.getReimService(reimburse);
			//取得值栈
			ActionContext action = ActionContext.getContext();
			Map<String, Object> aMap = action.getSession();
			//把信息放入session中
			aMap.put("reimburse",reimburse);
		}catch(Exception e){
			e.printStackTrace();
		}
		return  "see";
		//return "newUp";
	}

	public String toIncreament() throws Exception{
		
		return "remInfo";
	}
	
	public String increament() throws Exception{
		
		reimburseService.addReimburse(reimburse);
		return "reimIncream";
	}
	
	public String upDte() throws Exception{
		
		return "newUp";
	}
	
	public String upPaIn() throws Exception{
		
		reimburseService.upReimPage(reimburse);
		return "date";
	}
	
	public String deleReim() throws Exception{
	
		try{
//			System.out.println("deleAction");
//			reimburseService.deReimSe(reimburse);  //reimburse为null
			//获取reimburseId;
            //得到原生的request
			HttpServletRequest hsr = ServletActionContext.getRequest();
			String reimId = hsr.getParameter("reimburseId");
			//执行删除
			reimburseService.deReimSe(Integer.parseInt(reimId));
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return "dele";
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
