package com.pers.du.htmo.model;

/**
 * @ClassName:Hisday 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��16�� ����11:09:28
 * @Modified By:
 */

import java.sql.Date;

public class Hisday {
	
	//���id
	private int leaveId;
	//Ա��id
	private int employeeId;
	//Ա����
	private String employeeName;
	//��ʼʱ��
	private Date startTime;
	//����ʱ��
	private Date endTime;
	//״̬
	private String status;
	//���ԭ��
	private String leaveReason;
	//�����
	private String assessName;
	//����һ��Employee��Ķ���
	//private Employee employee;
	
	public int getLeaveId() {
		return leaveId;
	}
	
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
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

	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getAssessName() {
		return assessName;
	}

	public void setAssessName(String assessName) {
		this.assessName = assessName;
	}
	
//	public Employee getEmployee(){
//		return employee;
//	}
//	
//	public void setEmployee(Employee employee){
//		this.employee = employee;
//	}
//	
	public Hisday(){}
	
	public Hisday(int leaveId , int employeeId , String employeeName 
			, Date startTime , Date endTime , String status , String leaveReason
			, String assessName /*, Employee employee*/
			){
		
		this.leaveId = leaveId;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.leaveReason = leaveReason;
		//this.employee = employee;
	}
}
