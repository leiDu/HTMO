package com.pers.du.htmo.service;

import java.util.List;

import com.pers.du.htmo.dao.HisdayDao;
import com.pers.du.htmo.model.Hisday;


/**
 * @ClassName:HisdayService 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月16日 下午3:20:02
 * @Modified By:
 */

public class HisdayService {
	
	private HisdayDao hisdao = new HisdayDao();
	
	//取得Hisday的方法
	public Hisday getHisdayService(Hisday hisday){
		
		System.out.println("hisdayService");
		
		Hisday hday = hisdao.getHisday(hisday);
		return hday;
	}
	
	//添加Hisday的方法
	public Hisday insert(Hisday hisday){
			
		System.out.println("addHisdayService");
		Hisday hisd = hisdao.addHisday(hisday);
		return hisd;
	}
	
	//修改Hisday的方法
	public Hisday upHisService(Hisday hisday){
		
		System.out.println("Upervice");
		Hisday day = hisdao.updateHisday(hisday);
		return day;
	}

	//加载List集合的方法
	public List<Hisday> getListHis() {
		
		// TODO Auto-generated method stub
		List<Hisday> hd = hisdao.loadHisday();
		return hd;
	}
	
	public void dele(int leaveId){
		
		hisdao.deleHis(leaveId);
	}
	
//	public void upSta(String  status){
	public Hisday upSta(Hisday hisday){
//		
		Hisday sta = hisdao.upStatus(hisday);
		System.out.println("statusService");
//		hisdao.upStatus(hisday);
		return sta;
	}
}






//hisday.setLeaveId(hisday.getLeaveId()+1);
