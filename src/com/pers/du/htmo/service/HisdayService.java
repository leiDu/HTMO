package com.pers.du.htmo.service;

import java.util.List;

import com.pers.du.htmo.dao.HisdayDao;
import com.pers.du.htmo.model.Hisday;


/**
 * @ClassName:HisdayService 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��16�� ����3:20:02
 * @Modified By:
 */

public class HisdayService {
	
	private HisdayDao hisdao = new HisdayDao();
	
	//ȡ��Hisday�ķ���
	public Hisday getHisdayService(Hisday hisday){
		
		System.out.println("hisdayService");
		
		Hisday hday = hisdao.getHisday(hisday);
		return hday;
	}
	
	//���Hisday�ķ���
	public Hisday insert(Hisday hisday){
			
		System.out.println("addHisdayService");
		Hisday hisd = hisdao.addHisday(hisday);
		return hisd;
	}
	
	//�޸�Hisday�ķ���
	public Hisday upHisService(Hisday hisday){
		
		System.out.println("Upervice");
		Hisday day = hisdao.updateHisday(hisday);
		return day;
	}

	//����List���ϵķ���
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
