package com.pers.du.htmo.model;
/**
 * @ClassName:Position 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��14�� ����9:46:12
 * @Modified By:
 */
public class Position implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//ְλID
	private int positionId;
	//ְλ��
	private String positionName;
	
	public int getPositionId() {
		return positionId;
	}
	
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	
	public String getPositionName() {
		return positionName;
	}
	
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	public Position(){}
	
	public Position(int positionId , String positionName){
		
		this.positionId = positionId;
		this.positionName = positionName;
	}
} 
