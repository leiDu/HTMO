package com.pers.du.htmo.model;

/**
 * @ClassName:Reimburse 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��16�� ����11:20:07
 * @Modified By:
 */

import java.sql.Date;

public class Reimburse {
	
	//����id
	private int reimburseId;
	//Ա��id
	private int employeeId;
	//Ա����
	private String employeeName;
	//�ʱ��
	private Date fillTime;
	//����ԭ��
	private String reimReason;
	//�ܽ��
	private int allAmount;
	//״̬
	private String status;
	//�����
	private String assessName;
	
	
	
	public int getReimburseId() {
		return reimburseId;
	}

	public void setReimburseId(int reimburseId) {
		this.reimburseId = reimburseId;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Date getFillTime() {
		return fillTime;
	}
	
	public void setFillTime(Date fillTime) {
		this.fillTime = fillTime;
	}
	
	public String getReimReason() {
		return reimReason;
	}
	
	public void setReimReason(String reimReason) {
		this.reimReason = reimReason;
	}
	
	public int getAllAmount() {
		return allAmount;
	}
	
	public void setAllAmount(int allAmount) {
		this.allAmount = allAmount;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssessName() {
		return assessName;
	}

	public void setAssessName(String assessName) {
		this.assessName = assessName;
	}
	
	
}
