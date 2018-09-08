package com.pers.du.htmo.service;
/**
 * @ClassName:ReimburseService 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月19日 下午9:59:40
 * @Modified By:
 */

import java.util.List;

import com.pers.du.htmo.dao.ReimburseDao;
import com.pers.du.htmo.model.Reimburse;

public class ReimburseService {
	
	private ReimburseDao reimDao = new ReimburseDao(); 
	
	public Reimburse getReimService(Reimburse reimburse){
		
//		System.out.println("reimburseService");
		Reimburse reimb = reimDao.getReimburse(reimburse);
		return reimb;
	}
	
	public Reimburse addReimburse(Reimburse reimburse){
		
		Reimburse reim = reimDao.addReimburse(reimburse);
		return reim;
	}
	
	public Reimburse upReimPage(Reimburse reimburse){
		
		Reimburse reimbu = reimDao.upReim(reimburse);
		return reimbu;
	}

	public List<Reimburse> loadReimSe() {
		
		// TODO Auto-generated method stub
		List<Reimburse> reimSe = reimDao.loadDao();
		return reimSe;
	}

//	public Reimburse deReimSe(Reimburse reimburse) {
	//删除记录
	public void deReimSe(int reimburseId){
		
		// TODO Auto-generated method stub
		System.out.println("deleService");
//		Reimburse deReim = reimDao.deReimDao(reimburse);
		reimDao.deReimDao(reimburseId);
//		return deReim;
	}
}
